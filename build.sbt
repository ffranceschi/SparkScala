name := "MovieSimilarities1M"

version := "1.0"

organization := "com.sundogsoftware"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "2.4.0" % "compile",
"org.apache.spark" %% "spark-graphx" % "2.4.0" % "compile",
"org.apache.spark" %% "spark-sql" % "2.4.0" % "compile",
"org.apache.spark" %% "spark-mllib" % "2.4.0" % "compile",
"org.apache.spark" %% "spark-streaming" % "2.4.0" % "compile"
)
