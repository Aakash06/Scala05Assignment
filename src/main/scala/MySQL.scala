import java.sql.Connection

object MySQL extends Database {

  val url = "jdbc:mysql://localhost:3306/knoldus_db"
  val driver = "com.mysql.cj.jdbc.Driver"
  val username = "root"
  val password = "aakash06"
 // val fileName: String = "MySql_Result"
  val connection: Connection = MySQL.connectToDatabase

}
