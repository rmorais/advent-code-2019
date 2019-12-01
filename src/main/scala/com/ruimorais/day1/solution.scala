package com.ruimorais.day1

import com.ruimorais.day1.Input._

object Main extends App {
    
    def f(i: Int) = (i / 3).toDouble.floor.toInt - 2

    def fuel(mass: Int): Int = {
        val d = f(mass)
        if (d <=0)
            0
        else
            d + fuel(d)
    }
    println(values.map(fuel).sum)
}