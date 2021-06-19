organization := "org.DAutomate"
name := "SparkETLFramework"

version := "0.1"

scalaVersion := "2.12.8" 

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1" % "provided"
libraryDependencies += "io.delta" %% "delta-core" % "1.0.0" % "provided"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" %Test





