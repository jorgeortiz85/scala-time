import sbt._
 
class ScalaTimeProject(info: ProjectInfo) extends DefaultProject(info) with posterous.Publish {
  override def compileOptions = Seq(Deprecation, Unchecked)

  // Dependencies
  val jodaTime = "joda-time" % "joda-time" % "1.6.2"

  // Publishing
  override def managedStyle = ManagedStyle.Maven
  val snapshot = version.toString.endsWith("-SNAPSHOT")
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
  val publishTo = 
    if (snapshot)
      "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
    else
      "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"

  // 
  // `publishCurrentNotes` will post to implicit.ly
  override def extraTags = "scalaj" :: super.extraTags
}
