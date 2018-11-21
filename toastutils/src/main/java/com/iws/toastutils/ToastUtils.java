package com.iws.toastutils;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.iws.snackbarutils.SnackbarUtilsKt;

/**
 * utils for toasts for any purposes
 */
public class ToastUtils {
    /**
     * use this method wherever
     * @param context for create
     * @param message for seeing
     */
    public static void showToast(Context context, String message) {
        SnackbarUtilsKt.showSnackbar((Activity) context, message);
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
