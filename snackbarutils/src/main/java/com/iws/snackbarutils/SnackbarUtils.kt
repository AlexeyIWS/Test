package com.iws.snackbarutils

import android.app.Activity
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

fun Activity.showSnackbar(message: String?) = message?.let { message ->
    if (message.isEmpty() || findViewById<TextView>(com.google.android.material.R.id.snackbar_text)?.text == message)
        return@let

    val target: View? = findViewById(R.id.coordinator) ?: findViewById(android.R.id.content)
    if (target != null)
        Snackbar.make(target, message, Snackbar.LENGTH_LONG).show()
} ?: Unit
