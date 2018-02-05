package com.example.lianxiang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyTag";
    int i = 5;
    int sum=5;
    Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        int num = allStackTraces.size();
        int activeCount = Thread.activeCount();
        Log.d(TAG, "click: "+num+"activeCount:"+activeCount);
        Thread thread1;
        ticket = new Ticket(sum--);
        synchronized (ticket) {
            thread1 = new TicketThread("业务员" + this.i, ticket);
            this.i++;
            thread1.start();
        }
    }
}
