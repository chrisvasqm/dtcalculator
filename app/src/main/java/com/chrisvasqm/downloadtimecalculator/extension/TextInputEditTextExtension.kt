package com.chrisvasqm.downloadtimecalculator.extension

import com.google.android.material.textfield.TextInputEditText

fun TextInputEditText.getDoubleOrZero(): Double {
    if (this.text.toString().isBlank() || this.text.toString() == ".")
        return 0.0

    return this.text.toString().toDouble()
}

fun TextInputEditText.getIntOrZero(): Int {
    if (this.text.toString().isBlank() || this.text.toString() == ".")
        return 0

    return this.text.toString().toInt()
}