package ostest_native

import os._

object Main {
  def main(args: Array[String]): Unit = {
    val wd = os.pwd / "ostest_native" / "src" / "ostest_native"
    println(s"Path: $wd")
    val ls = os.list(wd).map(_.toString.split("/").last)reduceLeft(_ + ", " + _)
    println(s"Contents: $ls")
    val fpath = wd/ "Main.scala"
    val fname = fpath.toString.split("/").last
    println(s"File '$fname' content:")
    val txt = os.read(fpath)
    println(txt)
    val newFilePath = wd / "MainCopy.scala"
    os.write(newFilePath, txt)
  }
}