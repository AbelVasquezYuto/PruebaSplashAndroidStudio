package com.example.paola.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBt_sign_in;
    private TextView mTv_registrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBt_sign_in = (Button) findViewById(R.id.bt_sign_in);
        mTv_registrese = (TextView) findViewById(R.id.tv_registrese);

        mBt_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mTv_registrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity_Register.class);
                startActivity(intent);
            }
        });
    }
}
