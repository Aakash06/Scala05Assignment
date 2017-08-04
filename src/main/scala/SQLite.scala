
import java.sql.{Connection, DriverManager}

object SQLite extends Database {

  val url = "jdbc:sqlite:/home/knoldus/test.db"
  val driver = "org.sqlite.JDBC"
  val username = "root"
  val password = "knoldus"
  //val fileName: String = "SQLite_Result"
  val connection: Connection = MySQL.connectToDatabase

}
