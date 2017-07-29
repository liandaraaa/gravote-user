package com.example.wiantoro.myapplication.view.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.wiantoro.myapplication.R;
import com.example.wiantoro.myapplication.view.change_password.ChangePasswordActivity;
import com.example.wiantoro.myapplication.view.forgot_password.ForgotPasswordActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1=(Button)findViewById(R.id.btn_login);
        Button button2=(Button)findViewById(R.id.btn_forgotYourPassword);




        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),ChangePasswordActivity.class);

                startActivity(i);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent j =new Intent(getApplicationContext(),ForgotPasswordActivity.class);

                startActivity(j);

            }

        });




    }
}