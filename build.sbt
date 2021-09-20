name := "sandbox-surge"

version := "0.1"

scalaVersion := "2.13.6"

val SurgeVersion = "0.5.30-SNAPSHOT"
val AkkaHttpVersion = "10.2.6"

libraryDependencies ++= Seq(
  "com.ukg" %% "surge-engine-command-scaladsl" % SurgeVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)
