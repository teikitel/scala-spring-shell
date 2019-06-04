name := "demo-shell-scala"

version := "0.1"

scalaVersion := "2.12.8"

def springBootVersion = "2.0.0.RELEASE"

/*
  Project dependencies
 */
libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % s"$springBootVersion",
  "org.springframework.boot" % "spring-boot-configuration-processor" % s"$springBootVersion",
  "org.springframework.shell" % "spring-shell-starter" % s"$springBootVersion"
)

// set the main entrypoint to the application that is used in startup scripts
mainClass in Compile := Some("com.example.commands.DemoShellApplication")
