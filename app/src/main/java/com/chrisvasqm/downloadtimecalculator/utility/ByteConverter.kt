package com.chrisvasqm.downloadtimecalculator.utility

import kotlin.math.pow

class ByteConverter {

    fun toKB(number: Double): Double {
        return number * 2.0.pow(13.0)
    }

    fun toMB(number: Double): Double {
        return number * 2.0.pow(23.0)
    }

    fun toGB(number: Double): Double {
        return number * 2.0.pow(33.0)
    }

    fun toTB(number: Double): Double {
        return number * 2.0.pow(43.0)
    }

}