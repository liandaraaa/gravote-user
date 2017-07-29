package com.example.wiantoro.myapplication.view.forgot_password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wiantoro.myapplication.R;
import com.example.wiantoro.myapplication.view.login.LoginActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Button button1=(Button)findViewById(R.id.btn_signInHere);

        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),LoginActivity.class);

                startActivity(i);



            }

        });
    }
}
