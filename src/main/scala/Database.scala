import java.sql.{Connection, DriverManager}
import com.opencsv.CSVParser


trait Database {

  val url: String
  val driver: String
  val username: String
  val password: String
  val fileName : String
  val connection : Connection

  def connectToDatabase: Connection = {

    val connection: Connection = try {
      Class.forName(driver)
      DriverManager.getConnection(url, username, password)
    } catch {
      case e: Exception => throw new Exception(s"$e : Connection was not successfull")
    }
    connection
  }

  def query(dir : String,fileName :String):Boolean = {

    val content = ReadWriteFromFile.read(dir + "/" + fileName)
    val fileContentList = content.split("\n").toList

    val reader = new CSVParser()
    val testcaseList = fileContentList.map(testcase => reader.parseLine(testcase).toList)
    val executionTimeList = testcaseList.map {
      testCase  => queryTime(testCase,connection)
    }
   val zipped = testcaseList zip executionTimeList
    val testcaseWithTime = zipped.map(test => test._1 ::: List(test._2) )
    val output = ReadWriteFromFile.write(fileName,testcaseWithTime,"/home/knoldus/IdeaProjects/Scala05Assignment")
    MySQL.closeConnection(connection)
    output
  }

  def queryTime(testCase : List[String],connection: Connection ):String={

    try{
    val statement = connection.createStatement
    statement.execute(testCase(2))
    val t4 = System.nanoTime()
    statement.execute(testCase(3))
    val t5 = System.nanoTime()
    statement.execute(testCase(4))
    (t5 - t4).toString
    }
    catch
      {
        case e: Exception => s" Error is Coming : $e"
      }
  }

  def closeConnection(connection: Connection): Unit = {
    connection.close
  }

}
