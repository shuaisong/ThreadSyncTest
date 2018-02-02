package com.example.lianxiang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int i= 1;
   private  TicketRunnable mR = new TicketRunnable(5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Thread thread1;
        Thread thread2;
        thread1 = new Thread(mR,"业务员"+ i);
        i++;
        thread2 = new Thread(mR,"业务员"+ i);
        i++;
        thread1.start();
        thread2.start();
    }
}
