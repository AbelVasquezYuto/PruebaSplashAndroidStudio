package com.example.paola.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBt_sign_in;
    private TextView mTv_registrese;
    private EditText mEt_usuario;
    private EditText mEt_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBt_sign_in = (Button) findViewById(R.id.bt_sign_in);
        mTv_registrese = (TextView) findViewById(R.id.tv_registrese);
        mEt_usuario = (EditText) findViewById(R.id.et_usuario);
        mEt_contraseña = (EditText) findViewById(R.id.et_contraseña);

        mBt_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mEt_usuario.getText().toString().equalsIgnoreCase("admin")){
                    Intent intent = new Intent(MainActivity.this,MainActivity_NavigationDrawer.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }
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
