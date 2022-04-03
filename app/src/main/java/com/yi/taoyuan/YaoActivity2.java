package com.yi.taoyuan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class YaoActivity2 extends AppCompatActivity {
    static int a1 = 1,b1 = 1,c1 = 1,d1 = 1,e1 =1,f1 =1,g = 1;
    private LinearLayout a,b,c,d,e,f;
    private Button cha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yao2);

        //变量
        a1 = 1;b1 = 1;c1 = 1;d1 = 1;e1 =1;f1 =1;g = 1;
        //获取
        a = findViewById(R.id.yao_1);
        b = findViewById(R.id.yao_2);
        c = findViewById(R.id.yao_3);
        d = findViewById(R.id.yao_4);
        e = findViewById(R.id.yao_5);
        f = findViewById(R.id.yao_6);
        cha = findViewById(R.id.cha_1);
        //事件
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(a1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    a1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    a1 = 1;
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(b1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    b1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    b1 = 1;
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(c1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    c1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    c1 = 1;
                }
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(d1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    d1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    d1 = 1;
                }
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(e1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    e1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    e1 = 1;
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("az",v.getBackground().toString());
                if(f1 == 1){
                    v.setBackground(new ColorDrawable(Color.parseColor("#00000000")));
                    f1 = 2;
                }
                else{
                    v.setBackground(new ColorDrawable(Color.parseColor("#000000")));
                    f1 = 1;
                }
            }
        });

        cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 1;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 2;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 3;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 4;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 5;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 6;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 7;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 8;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 9;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 10;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 11;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 12;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 13;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 14;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 15;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 16;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 17;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 18;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 19;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 20;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 21;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 22;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 23;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 24;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 25;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 26;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 27;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 28;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 29;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 30;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 31;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 32;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 33;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 34;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 35;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 36;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 37;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 38;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 39;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 40;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 41;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 42;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 1)
                    g = 43;
                if(a1 == 1 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 44;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 2)
                    g = 45;
                if(a1 == 2 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 46;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 47;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 48;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 49;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 50;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 2 &&f1 == 1)
                    g = 51;
                if(a1 == 1 &&b1 == 2 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 52;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 53;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 54;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 55;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 56;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 1 &&f1 == 2)
                    g = 57;
                if(a1 == 2 &&b1 == 1 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 58;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 59;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 60;
                if(a1 == 1 &&b1 == 1 &&c1 == 2&&d1 == 2 &&e1 == 1 &&f1 == 1)
                    g = 61;
                if(a1 == 2 &&b1 == 2 &&c1 == 1&&d1 == 1 &&e1 == 2 &&f1 == 2)
                    g = 62;
                if(a1 == 2 &&b1 == 1 &&c1 == 2&&d1 == 1 &&e1 == 2 &&f1 == 1)
                    g = 63;
                if(a1 == 1 &&b1 == 2 &&c1 == 1&&d1 == 2 &&e1 == 1 &&f1 == 2)
                    g = 64;
                Intent go = new Intent(YaoActivity2.this,AnyaoActivity2.class);
                startActivity(go);
            }
        });
        //类

    }
}