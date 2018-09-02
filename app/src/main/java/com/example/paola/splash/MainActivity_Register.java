package com.example.paola.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_Register extends AppCompatActivity {

    private Button mBt_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__register);

        mBt_sign_up = (Button) findViewById(R.id.bt_sign_up);

        mBt_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity_Register.this, "Registrado correctamente", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
