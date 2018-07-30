import sbt._
import sbt.Keys._

object Helper {
  def runIn(c: sbt.ConfigKey) =
    sbt.Defaults.runTask(fullClasspath in Runtime, mainClass in c, runner in c)
}
