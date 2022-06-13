package com.example.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView b=findViewById(R.id.b);
    }


    public void gooo(View v){
        Intent intent=new Intent(secondAct.this,thirdAct.class);
        startActivity(intent);
    }

}