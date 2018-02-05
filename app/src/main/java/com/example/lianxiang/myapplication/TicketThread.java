package com.example.lianxiang.myapplication;

import android.util.Log;

/**
 * Created by ysh on 2018/1/29.
 */

public class TicketThread extends Thread {
    private static String TAG = "MyTag";
    private Ticket ticket;
    private String name;

    public TicketThread(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public void run() {

        if (ticket.id > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d(TAG, "run:" + Thread.currentThread() + ":售票:" + ticket.id);
        } else {
            Log.d(TAG, "run: 票售完了");
        }
    }
}
