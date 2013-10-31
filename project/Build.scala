import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "composite"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )

  val easy = Project(
    id = "easy-module", 
    base = file("modules/easy")
    // , libraryDependencies ++= all needed akka deps
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
   
  ).dependsOn(easy).aggregate(easy)

}
