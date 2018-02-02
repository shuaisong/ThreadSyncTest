package com.example.lianxiang.myapplication;

import android.util.Log;

/**
 * Created by lianxiang on 2018/1/29.
 */

public class TicketRunnable implements Runnable {
    private static String TAG = "MyTag";
    private int ticket;
    public TicketRunnable(int ticket){
        this.ticket=ticket;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
     if (ticket>0){
             Log.d(TAG, "run:" + Thread.currentThread() + ":售票:" + ticket);
        ticket--;
    }else {
         Log.d(TAG, "run: 票售完了");
     }
    }
}
