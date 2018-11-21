package com.iws.snackbarutils

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

/**
 * @param message uses for show snackbar. Snackbar is widget for purpose and purpose and purpose and purpose and purpose and purpose and purpose and purpose and purpose and purpose and purpose and purpose
 */
fun Activity.showSnackbar(message: String?) = message?.let { message ->
    if (message.isEmpty() || findViewById<TextView>(com.google.android.material.R.id.snackbar_text)?.text == message)
        return@let

    val target: View? = findViewById(R.id.coordinator) ?: findViewById(android.R.id.content)
    if (target != null)
        Snackbar.make(target, message, Snackbar.LENGTH_LONG).show()
} ?: Unit

object SnackbarUtils {
    /**
     * use this method wherever
     * @param context for create
     * @param message for seeing
     */
    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
