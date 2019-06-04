package com.example.commands

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.shell.standard.{ShellComponent, ShellMethod}

@SpringBootApplication
class DemoShellApplication

object DemoApplication {
  def main(args: Array[String]): Unit = SpringApplication.run(classOf[DemoShellApplication], args: _ *)
}

@ShellComponent class MyCommands {
  @ShellMethod("Add two integers together.") def add(a: Int, b: Int): Int = a + b
}