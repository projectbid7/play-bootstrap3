name := """play-bootstrap3-sample"""

version := "0.1.1"

scalaVersion := "2.11.1"


lazy val root = (project in file(".")).enablePlugins(PlayScala)


resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
	"com.adrianhurt" %% "play-bootstrap3" % "0.1.1",
	"org.webjars" % "font-awesome" % "4.1.0"
)


scalariformSettings
