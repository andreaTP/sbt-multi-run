
lazy val Config1 = config("config1").extend(Compile).describedAs("1")
lazy val Config2 = config("config2").extend(Compile).describedAs("2")

mainClass in Config1 := Some("Main1")
mainClass in Config2 := Some("Main2")

run in Config1 :=
  Helper.runIn(Config1).evaluated

run in Config2 :=
  Helper.runIn(Config2).evaluated

configs(Config1, Config2)
