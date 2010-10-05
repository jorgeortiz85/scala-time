import sbt._
 
class ScalaTimeProject(info: ProjectInfo) extends DefaultProject(info) with posterous.Publish {
  override def compileOptions = Seq(Deprecation, Unchecked)

  // Dependencies
  val jodaTime = "joda-time" % "joda-time" % "1.6"

  // Publishing
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
  override def publishAction = super.publishAction && publishCurrentNotes
  override def extraTags = "scalaj" :: super.extraTags
}
