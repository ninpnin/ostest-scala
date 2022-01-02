package ostest

import os._

object Application extends App {
  val wd = os.pwd / "ostest" / "src" / "ostest"
  val paths = os.list(wd)
  val files = paths.map(path => (read(path), path))
  for (file <- files) {
    val (text, filename) = file
    println(s"Filename: $filename")
    println()
    println(s"File contents:")
    println(text.take(100))
    println()
  }
}