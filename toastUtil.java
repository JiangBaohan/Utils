package com.example.demo16__.Utils;

import android.content.Context;
import android.widget.Toast;

/**
 * data:2017/8/14
 * author:汉堡(Administrator)
 * function:吐司工具类
 */

public class toastUtil {
    private  static Toast toast;
    private Toast toast1;
    public static void  showToast(Context context,String msg){
        if (toast==null){
            toast =  Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.show();
    }
}
