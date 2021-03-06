name := "Scala05Assignment"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.19.3"

libraryDependencies += "com.opencsv" % "opencsv" % "3.7"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.0" % "test")