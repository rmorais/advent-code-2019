import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.ruimorais"
ThisBuild / organizationName := "ruimorais"

lazy val root = (project in file("."))
  .settings(
    name := "advent-code-2019",
    libraryDependencies += scalaTest % Test
  )

