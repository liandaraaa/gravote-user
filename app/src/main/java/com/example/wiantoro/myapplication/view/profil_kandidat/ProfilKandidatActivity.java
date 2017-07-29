package com.example.wiantoro.myapplication.view.profil_kandidat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.wiantoro.myapplication.R;

public class ProfilKandidatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_kandidat);
        Button button1=(Button)findViewById(R.id.btn_candidate);



        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i =new Intent(getApplicationContext(),IsiProfilKadidatActivity.class);

                startActivity(i);



            }

        });


    }
}
