package com.ybennun.advancekotlin

import android.util.Log

open class Bicycle {
    var speed: Int = 0
    var gear: Int = 0
    var wheels: Int = 0

    open fun speedUp() {
        speed += 10

        Log.d("bicycle", "speed: $speed")
    }

    fun changeGear() {
        Log.d("bicycle", "gear")
    }

}

class BicycleBrandX : Bicycle() {
    override fun speedUp() {
        //super.speedUp()

        speed += 20

        Log.d("bicycle", "speed: $speed")
    }
}