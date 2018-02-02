package com.example.lianxiang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Thread thread1;
    private Thread thread2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        final TicketRunnable R = new TicketRunnable();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thread1 = new Thread(R,"业务员1");
                thread2 = new Thread(R,"业务员2");
                thread1.start();
                thread2.start();
            }
        });
    }

}
