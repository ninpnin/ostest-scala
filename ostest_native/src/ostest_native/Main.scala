package ostest_native

import os._

object Main {
  def main(args: Array[String]): Unit = {
    val wd = os.pwd / "ostest" / "src" / "ostest"
    println("Path " + wd)
  }
}