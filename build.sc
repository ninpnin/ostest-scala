import mill._, scalalib._, scalanativelib._
import mill.scalanativelib.api.ReleaseMode

object ostest extends ScalaModule {
  def scalaVersion = "2.13.4"
  //def logLevel = NativeLogLevel.Info // optional
  def releaseMode = ReleaseMode.ReleaseFull // optional
  def ivyDeps = Agg(
    ivy"com.lihaoyi::os-lib:0.8.0"
  )
}