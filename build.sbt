// Project Properties
name := "Graphene"
scalaVersion := "2.11.12"

// Dependencies
libraryDependencies ++= Seq(
  "org.neo4j" % "neo4j" % "3.5.5"
)

// Test Dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "com.github.fulrich" %% "test-charged" % "0.1.12" % "test",
)
