import java.io.File
import scala.io.Source

val file = new File("/home/knoldus/IdeaProjects/Scala05Assignment/MySQLDDL.csv")
val content = Source.fromFile(file).getLines().mkString("\n")
val content1= content.split("\n").toList
import com.opencsv.{CSVParser}



val reader2 = new CSVParser()
val a1= reader2.parseLine(content1(0))
a1.size
a1.trim
 val a2= a1.toList
a2.foreach(n=>println(n))
