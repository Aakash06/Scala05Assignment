import org.scalatest.FunSuite

class ReadWriteFromFileTest extends FunSuite {

  val obj = ReadWriteFromFile

  test("Testing reading from file "){
  assert(obj.read("/home/knoldus/IdeaProjects/Scala05Assignment/src/res/MySqlDDL.csv")=="1, Creating Employee table, \"DROP TABLE IF EXISTS Employee;\", \"CREATE TABLE Employee(name VARCHAR(20), EmployeeID INT, zipcode INT, PhoneNo BIGINT);\", \"DROP TABLE Employee;\"\n2, Altering Employee table by adding EmployeeAge column, \"CREATE TABLE IF NOT EXISTS Employee(name VARCHAR(20), EmployeeID INT, zipcode INT, PhoneNo BIGINT);\", \"ALTER TABLE Employee ADD COLUMN EmployeeAge INT;\", \"DROP TABLE Employee;\"")
  }

  test("Testing Reading Negative Case"){
    intercept[Exception] {
      obj.read("/home/knoldus/IdeaProjects/Scala05Assignment/") }
  }

  val content = List(List("1",  "Creating Employee table", "DROP TABLE IF EXISTS Employee;","CREATE TABLE Employee(name VARCHAR(20), EmployeeID INT, zipcode INT, PhoneNo BIGINT);","DROP TABLE Employee;"), List("2", " Altering Employee table by adding EmployeeAge column", "CREATE TABLE IF NOT EXISTS Employee(name VARCHAR(20), EmployeeID INT, zipcode INT, PhoneNo BIGINT);", "ALTER TABLE Employee ADD COLUMN EmployeeAge INT;", "DROP TABLE Employee;"))

  test("write data"){
    assert(obj.write("abc.csv",content,"/home/knoldus/IdeaProjects/Scala05Assignment/src/res/")=== true)
  }

}
