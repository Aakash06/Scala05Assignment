
import java.sql.{Connection, DriverManager}


object PostgreSQL extends Database {

  val url = "jdbc:postgresql://localhost:5432/knoldus_db"
  val driver = "org.postgresql.Driver"
  val username = "postgres"
  val password = "aakash06"
  val fileName: String = "Postgres_Result"
  val connection: Connection = MySQL.connectToDatabase


}
