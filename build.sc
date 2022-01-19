import mill._, scalalib._, scalanativelib._, scalanativelib.api._
import mill.scalanativelib.api.ReleaseMode

object ostest extends ScalaModule {
  def scalaVersion = "2.13.4"
  //def logLevel = NativeLogLevel.Info // optional
  def releaseMode = ReleaseMode.ReleaseFull // optional
  def ivyDeps = Agg(
    ivy"com.lihaoyi::os-lib::0.8.0"
  )
}

object ostest_native extends ScalaNativeModule {
  def scalaNativeVersion = "0.4.2"
  def scalaVersion = "2.13.4"
  //def logLevel = NativeLogLevel.Info // optional
  def releaseMode = ReleaseMode.ReleaseFull // optional
  def ivyDeps = Agg(
    ivy"com.lihaoyi::os-lib::0.8.0"
  )
}