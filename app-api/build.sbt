name := "wookie-app"

description := "basic framework constructs for running micro service"

libraryDependencies ++= logging ++ Seq(scallop, http4sCore, http4sDsl)
