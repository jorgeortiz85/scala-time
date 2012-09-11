organization := "org.scala-tools.time"

name := "time"

version := "0.6-SNAPSHOT"

crossScalaVersions := Seq("2.8.0", "2.8.1", "2.9.0", "2.9.0-1", "2.9.1", "2.9.2", "2.10.0-M7")

crossVersion := CrossVersion.full

scalaBinaryVersion <<= scalaBinaryVersion { v =>
  if (v.startsWith("2.10"))
    "2.10.0-M7"
  else
    v
}

scalacOptions <++= scalaVersion map { v =>
  if (v.startsWith("2.10"))
    Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")
  else
    Seq("-unchecked", "-deprecation")
}

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2" % "compile"
)

publishTo <<= version { v =>
  val nexus = "http://oss.sonatype.org/"
  if (v.endsWith("-SNAPSHOT"))
    Some("snapshots" at nexus+"content/repositories/snapshots")
  else
    Some("releases" at nexus+"service/local/staging/deploy/maven2")
}
