package com.example.xmlparse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener   {
 Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.equals(btn2))
        {
            Intent it=new Intent(this,MainActivity2.class);
            it.putExtra("mode",1);
            startActivity(it);
        }
        else if(v.equals(btn1))
        {
            Intent it=new Intent(this,MainActivity2.class);
            it.putExtra("mode",2);
            startActivity(it);
        }
    }

}
