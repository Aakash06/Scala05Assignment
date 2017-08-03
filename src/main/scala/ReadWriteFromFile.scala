import java.io.{File, PrintWriter}
import scala.io.Source

object ReadWriteFromFile extends ReadWrite {

  def read(fileLocation: String): String = {

    val file = new File(fileLocation)

    try {
      val content = Source.fromFile(file).getLines().mkString("\n")
      content
    }
    catch {
      case error: Exception => throw new Exception(s"$error : This Error is coming while reading the file")
    }

  }

  def write(fileName: String, content: List[List[String]], dirPath: String): Boolean = {

    val content1 = content.map(_ mkString " ") mkString "\n"
    new File(dirPath).mkdir()
    val writeToFile = new PrintWriter(dirPath + "/" + fileName)
    try {
      writeToFile.write(content1)
      writeToFile.close()
      true
    }
    catch {
      case e: Exception => false
    }
  }

}
