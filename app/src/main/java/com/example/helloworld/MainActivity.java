package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.hoge).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //hogeChickEvent(v);
                text = findViewById(R.id.textView);
                text.append("あ");
            }
        });

        /*
        private void hogeChickEvent(View v)
        {

        }
         */
    }
}
