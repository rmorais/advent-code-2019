package com.ruimorais.day1

import org.scalatest._
import com.ruimorais.day1._

class SolutionSpec extends FlatSpec with Matchers {
  
    "fuel for module" should "calculate module fuel" in {
     Main.fuel(12) shouldBe 2
     Main.fuel(14) shouldBe 2
     Main.fuel(1969) shouldBe 966
     Main.fuel(100756) shouldBe 50346
  }
}
