import sbt._

trait MMXPublishing extends BasicDependencyProject {
  val mmxRepo = "http://metamx.artifactoryonline.com/metamx/libs-releases"
  val mmxRepoLocal = mmxRepo + "-local"
  //override def disableCrossPaths = true
  override def repositories = Set("Central" at mmxRepo)
  override def managedStyle = ManagedStyle.Maven
  lazy val publishTo = "central-local" at mmxRepoLocal
  Credentials(Path.userHome / ".ivy2" / "credentials", log)
}
 
class ScalaTimeProject(info: ProjectInfo) extends DefaultProject(info)
with posterous.Publish with MMXPublishing {
  override def compileOptions = Seq(Deprecation, Unchecked)

  // Dependencies
  val jodaTime = "joda-time" % "joda-time" % "1.6"

  /*
  // Publishing
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
  override def publishAction = super.publishAction && publishCurrentNotes
  override def extraTags = "scalaj" :: super.extraTags
  */
}
