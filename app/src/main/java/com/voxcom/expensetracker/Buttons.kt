package com.voxcom.expensetracker

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class Button @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.buttonStyle
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        setupButton()
    }

    private fun setupButton() {
        textSize = 18f
        setTextColor(ContextCompat.getColor(context, android.R.color.white))
        isAllCaps = false
    }
}
