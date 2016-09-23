name := "spark-hyperloglog"

version := "1.1.1"

scalaVersion := "2.11.8"

spName := "saptarshiguha/spark-hyperloglog"

spIncludeMaven := false

sparkVersion := "2.0.0"

sparkComponents ++= Seq("core", "sql")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "com.twitter" %% "algebird-core" % "0.12.0",
  "org.apache.hive" % "hive-exec" % "1.2.1" % "provided",     
  "org.apache.hadoop" % "hadoop-core" % "1.2.1" % "provided"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

resolvers += "conjars" at "http://conjars.org/repo"
