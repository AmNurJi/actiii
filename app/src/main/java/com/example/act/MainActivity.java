package com.example.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView a=findViewById(R.id.a);

    }

    public void goo(View v){
        Intent intent=new Intent(MainActivity.this,secondAct.class);
        startActivity(intent);
        finish();
    }

}
