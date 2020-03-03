package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ボタンをクリックした時に呼ばれる
    public void AddTextClick(View view)
    {
        text = findViewById(R.id.AddTextView);
        text.append("あ");
        Log.d("test","「あ」が追加されました");
    }
}
