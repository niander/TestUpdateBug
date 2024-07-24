ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

ThisBuild / useCoursier := false

lazy val root = (project in file("."))
  .settings(
    name := "TestUpdateBug",
    libraryDependencies += "com.twitter" %% "finagle-http" % "24.2.0"
  )
