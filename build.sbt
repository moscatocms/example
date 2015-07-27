organization := "org.moscatocms"

name := "example"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.moscatocms" %% "moscato" % "1.0.0-SNAPSHOT",
  "org.moscatocms" %% "blog-plugin" % "1.0.0-SNAPSHOT",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41" % Runtime
)

moscatoDbUrl := "jdbc:postgresql:moscato"

moscatoDbDriver := "org.postgresql.Driver"

moscatoDbUsername := "moscato"

moscatoDbPassword := "moscato"

Revolver.settings

mainClass in Revolver.reStart := Some("org.moscatocms.Boot")

lazy val root = (project in file(".")).enablePlugins(MoscatoDatabasePlugin)
