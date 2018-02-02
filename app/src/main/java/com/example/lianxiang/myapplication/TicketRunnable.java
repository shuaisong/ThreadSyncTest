package com.example.lianxiang.myapplication;

import android.util.Log;



/**
 * Created by lianxiang on 2018/1/29.
 */

public class TicketRunnable implements Runnable {
    private static String TAG = "MyTag";
    private int ticket = 5;
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
     for (int i=0;i<ticket;i++)
         if (i>0)
            Log.d(TAG, "run:"+Thread.currentThread()+":售票:"+ --ticket);
    }
}
