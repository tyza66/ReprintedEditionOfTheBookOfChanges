package com.yi.taoyuan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ZhiActivity2 extends AppCompatActivity {

    private Button cha;
    private TextView gua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi2);
    //控件
        cha = findViewById(R.id.cha_2);
        gua = findViewById(R.id.gua_shu);
     //点击事件
        cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = gua.getText().toString();
                switch (in){
                    case "乾":YaoActivity2.g = 1;break;
                    case "坤":YaoActivity2.g = 2;break;
                    case "屯":YaoActivity2.g = 3;break;
                    case "蒙":YaoActivity2.g = 4;break;
                    case "需":YaoActivity2.g = 5;break;
                    case "讼":YaoActivity2.g = 6;break;
                    case "师":YaoActivity2.g = 7;break;
                    case "比":YaoActivity2.g = 8;break;
                    case "小畜":YaoActivity2.g = 9;break;
                    case "履":YaoActivity2.g = 10;break;
                    case "泰":YaoActivity2.g = 11;break;
                    case "否":YaoActivity2.g = 12;break;
                    case "同人":YaoActivity2.g = 13;break;
                    case "大有":YaoActivity2.g = 14;break;
                    case "谦":YaoActivity2.g = 15;break;
                    case "豫":YaoActivity2.g = 16;break;
                    case "随":YaoActivity2.g = 17;break;
                    case "蛊":YaoActivity2.g = 18;break;
                    case "临":YaoActivity2.g = 19;break;
                    case "观":YaoActivity2.g = 20;break;
                    case "噬嗑":YaoActivity2.g = 21;break;
                    case "贲":YaoActivity2.g = 22;break;
                    case "剥":YaoActivity2.g = 23;break;
                    case "复":YaoActivity2.g = 24;break;
                    case "无妄":YaoActivity2.g = 25;break;
                    case "大畜":YaoActivity2.g = 26;break;
                    case "颐":YaoActivity2.g = 27;break;
                    case "大过":YaoActivity2.g = 28;break;
                    case "坎":YaoActivity2.g = 29;break;
                    case "离":YaoActivity2.g = 30;break;
                    case "咸":YaoActivity2.g = 31;break;
                    case "恒":YaoActivity2.g = 32;break;
                    case "遁":YaoActivity2.g = 33;break;
                    case "大壮":YaoActivity2.g = 34;break;
                    case "晋":YaoActivity2.g = 35;break;
                    case "明夷":YaoActivity2.g = 36;break;
                    case "家人":YaoActivity2.g = 37;break;
                    case "睽":YaoActivity2.g = 38;break;
                    case "蹇":YaoActivity2.g = 39;break;
                    case "解":YaoActivity2.g = 40;break;
                    case "损":YaoActivity2.g = 41;break;
                    case "益":YaoActivity2.g = 42;break;
                    case "夬":YaoActivity2.g = 43;break;
                    case "姤":YaoActivity2.g = 44;break;
                    case "萃":YaoActivity2.g = 45;break;
                    case "升":YaoActivity2.g = 46;break;
                    case "困":YaoActivity2.g = 47;break;
                    case "井":YaoActivity2.g = 48;break;
                    case "革":YaoActivity2.g = 49;break;
                    case "鼎":YaoActivity2.g = 50;break;
                    case "震":YaoActivity2.g = 51;break;
                    case "艮":YaoActivity2.g = 52;break;
                    case "渐":YaoActivity2.g = 53;break;
                    case "归妹":YaoActivity2.g = 54;break;
                    case "丰":YaoActivity2.g = 55;break;
                    case "旅":YaoActivity2.g = 56;break;
                    case "巽":YaoActivity2.g = 57;break;
                    case "兑":YaoActivity2.g = 58;break;
                    case "涣":YaoActivity2.g = 59;break;
                    case "节":YaoActivity2.g = 60;break;
                    case "中孚":YaoActivity2.g = 61;break;
                    case "小过":YaoActivity2.g = 62;break;
                    case "既济":YaoActivity2.g = 63;break;
                    case "未济":YaoActivity2.g = 64;break;
                    case "":YaoActivity2.g = 1;break;
                    default:Toast.makeText(ZhiActivity2.this,"无此卦名！",Toast.LENGTH_SHORT).show();YaoActivity2.g = -1;break;
                }
                if (YaoActivity2.g != -1) {
                    Intent go = new Intent(ZhiActivity2.this, AnyaoActivity2.class);
                    startActivity(go);
                }
            }
        });
    }
}