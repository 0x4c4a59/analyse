name := """analyse"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc
)

libraryDependencies += "com.google.code.gson" % "gson" % "2.7"
libraryDependencies += "org.mybatis" % "mybatis" % "3.4.1"

