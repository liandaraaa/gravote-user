package com.example.wiantoro.myapplication.view.change_password;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.wiantoro.myapplication.R;
import com.example.wiantoro.myapplication.view.main.MainActivity;

public class ChangePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        Button button1=(Button)findViewById(R.id.btn_next2);



        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),MainActivity.class);

                startActivity(i);



            }

        });
    }
}
