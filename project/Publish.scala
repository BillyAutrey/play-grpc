package build.play.grpc

import sbt._
import Keys._

/**
 * For projects that are not to be published.
 */
object NoPublish extends AutoPlugin {
  override def requires = plugins.JvmPlugin

  override def projectSettings = Seq(
    (publish / skip) := true,
  )
}

object Publish extends AutoPlugin {

  override def trigger = allRequirements

  override def projectSettings = Seq(
    homepage := Some(url("https://developer.lightbend.com/docs/play-grpc/current/")),
    scmInfo := Some(
      ScmInfo(url("https://github.com/playframework/play-grpc"), "git@github.com:playframework/play-grpc"),
    ),
    licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers += Developer(
      "contributors",
      "Contributors",
      "https://gitter.im/playframework/contributors",
      url("https://github.com/playframework/play-grpc/graphs/contributors"),
    ),
  )
}
