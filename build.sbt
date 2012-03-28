
name := "time"

version := "0.6-SNAPSHOT"

organization := "org.scala-tools.time"

scalaVersion := "2.9.1-1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= Seq (
  "joda-time" % "joda-time" % "1.6.2"
)

crossScalaVersions := Seq (
  "2.8.0", "2.8.1", "2.8.2",
  "2.9.0", "2.9.0-1", "2.9.1", "2.9.1-1", "2.9.2-RC2"
)

