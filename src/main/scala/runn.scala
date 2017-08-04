
object runn extends App {

  MySQL.query("/home/knoldus/IdeaProjects/Scala05Assignment","MySqlDDL.csv")
  SQLite.query("/home/knoldus/IdeaProjects/Scala05Assignment","SQLiteDDL.csv")
  PostgreSQL.query("/home/knoldus/IdeaProjects/Scala05Assignment","postDDL.csv")

}