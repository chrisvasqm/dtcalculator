package com.chrisvasqm.downloadtimecalculator.utility

data class Download(
        val size: Double,
        val speed: Double,
        val progress: Double = 0.0
)