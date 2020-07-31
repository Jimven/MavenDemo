package com.iotimc.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * author :  Jimven
 * date   :  2020/7/30/0030  17:56
 */
public class ToastUtils {
    public ToastUtils() {
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
