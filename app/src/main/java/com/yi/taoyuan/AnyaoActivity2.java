package com.yi.taoyuan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedImageDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnyaoActivity2 extends AppCompatActivity {
    private ImageView im;
    private TextView gua,jie;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anyao2);

        //变量
        int a = YaoActivity2.g;
        //控件
        im = findViewById(R.id.img_gua1);
        gua = findViewById(R.id.zhi_1);
        jie = findViewById(R.id.jie_1);
        //卦
        switch(a){
            case 1:{ im.setImageResource(R.drawable.g1);gua.setText("乾为天");jie.setText(R.string._1);break;}
            case 2:{ im.setImageResource(R.drawable.g2);gua.setText("坤为地");jie.setText(R.string._2);break;}
            case 3:{im.setImageResource(R.drawable.g3);gua.setText("水雷屯");jie.setText(R.string._3);break;}
            case 4:{im.setImageResource(R.drawable.g4);gua.setText("山水蒙");jie.setText(R.string._4);break;}
            case 5:{im.setImageResource(R.drawable.g5);gua.setText("水天需");jie.setText(R.string._5);break;}
            case 6:{im.setImageResource(R.drawable.g6);gua.setText("天水讼");jie.setText(R.string._6);break;}
            case 7:{im.setImageResource(R.drawable.g7);gua.setText("地水师");jie.setText(R.string._7);break;}
            case 8:{im.setImageResource(R.drawable.g8);gua.setText("水地比");jie.setText(R.string._8);break;}
            case 9:{im.setImageResource(R.drawable.g9);gua.setText("风天小畜");jie.setText(R.string._9);break;}
            case 10:{im.setImageResource(R.drawable.g10);gua.setText("天泽履");jie.setText(R.string._10);break;}
            case 11:{im.setImageResource(R.drawable.g11);gua.setText("地天泰");jie.setText(R.string._11);break;}
            case 12:{im.setImageResource(R.drawable.g12);gua.setText("天地否");jie.setText(R.string._12);break;}
            case 13:{im.setImageResource(R.drawable.g13);gua.setText("天火同人");jie.setText(R.string._13);break;}
            case 14:{im.setImageResource(R.drawable.g14);gua.setText("火天大有");jie.setText(R.string._14);break;}
            case 15:{im.setImageResource(R.drawable.g15);gua.setText("地山谦");jie.setText(R.string._15);break;}
            case 16:{im.setImageResource(R.drawable.g16);gua.setText("雷地豫");jie.setText(R.string._16);break;}
            case 17:{im.setImageResource(R.drawable.g17);gua.setText("泽雷随");jie.setText(R.string._17);break;}
            case 18:{im.setImageResource(R.drawable.g18);gua.setText("山风蛊");jie.setText(R.string._18);break;}
            case 19:{im.setImageResource(R.drawable.g19);gua.setText("地泽临");jie.setText(R.string._19);break;}
            case 20:{im.setImageResource(R.drawable.g20);gua.setText("风地观");jie.setText(R.string._20);break;}
            case 21:{im.setImageResource(R.drawable.g21);gua.setText("火雷噬嗑");jie.setText(R.string._21);break;}
            case 22:{im.setImageResource(R.drawable.g22);gua.setText("山火贲");jie.setText(R.string._22);break;}
            case 23:{im.setImageResource(R.drawable.g23);gua.setText("山地剥");jie.setText(R.string._23);break;}
            case 24:{im.setImageResource(R.drawable.g24);gua.setText("地雷复");jie.setText(R.string._24);break;}
            case 25:{im.setImageResource(R.drawable.g25);gua.setText("天雷无妄");jie.setText(R.string._25);break;}
            case 26:{im.setImageResource(R.drawable.g26);gua.setText("山天大畜");jie.setText(R.string._26);break;}
            case 27:{im.setImageResource(R.drawable.g27);gua.setText("山雷颐");jie.setText(R.string._27);break;}
            case 28:{im.setImageResource(R.drawable.g28);gua.setText("泽风大过");jie.setText(R.string._28);break;}
            case 29:{im.setImageResource(R.drawable.g29);gua.setText("坎为水");jie.setText(R.string._29);break;}
            case 30:{im.setImageResource(R.drawable.g30);gua.setText("离为火");jie.setText(R.string._30);break;}
            case 31:{im.setImageResource(R.drawable.g31);gua.setText("泽山咸");jie.setText(R.string._31);break;}
            case 32:{im.setImageResource(R.drawable.g32);gua.setText("雷风恒");jie.setText(R.string._32);break;}
            case 33:{im.setImageResource(R.drawable.g33);gua.setText("天山遁");jie.setText(R.string._33);break;}
            case 34:{im.setImageResource(R.drawable.g34);gua.setText("雷天大壮");jie.setText(R.string._34);break;}
            case 35:{im.setImageResource(R.drawable.g35);gua.setText("火地晋");jie.setText(R.string._35);break;}
            case 36:{im.setImageResource(R.drawable.g36);gua.setText("地火明夷");jie.setText(R.string._36);break;}
            case 37:{im.setImageResource(R.drawable.g37);gua.setText("风火家人");jie.setText(R.string._37);break;}
            case 38:{im.setImageResource(R.drawable.g38);gua.setText("火泽睽");jie.setText(R.string._38);break;}
            case 39:{im.setImageResource(R.drawable.g39);gua.setText("水山蹇");jie.setText(R.string._39);break;}
            case 40:{im.setImageResource(R.drawable.g40);gua.setText("雷水解");jie.setText(R.string._40);break;}
            case 41:{im.setImageResource(R.drawable.g41);gua.setText("山泽损");jie.setText(R.string._41);break;}
            case 42:{im.setImageResource(R.drawable.g42);gua.setText("风雷益");jie.setText(R.string._42);break;}
            case 43:{im.setImageResource(R.drawable.g43);gua.setText("泽天夬");jie.setText(R.string._43);break;}
            case 44:{im.setImageResource(R.drawable.g44);gua.setText("天风姤");jie.setText(R.string._44);break;}
            case 45:{im.setImageResource(R.drawable.g45);gua.setText("泽地萃");jie.setText(R.string._45);break;}
            case 46:{im.setImageResource(R.drawable.g46);gua.setText("地风升");jie.setText(R.string._46);break;}
            case 47:{im.setImageResource(R.drawable.g47);gua.setText("泽水困");jie.setText(R.string._47);break;}
            case 48:{im.setImageResource(R.drawable.g48);gua.setText("水风井");jie.setText(R.string._48);break;}
            case 49:{im.setImageResource(R.drawable.g49);gua.setText("泽火革");jie.setText(R.string._49);break;}
            case 50:{im.setImageResource(R.drawable.g50);gua.setText("火风鼎");jie.setText(R.string._50);break;}
            case 51:{im.setImageResource(R.drawable.g51);gua.setText("震为雷");jie.setText(R.string._51);break;}
            case 52:{im.setImageResource(R.drawable.g52);gua.setText("艮为山");jie.setText(R.string._52);break;}
            case 53:{im.setImageResource(R.drawable.g53);gua.setText("风山渐");jie.setText(R.string._53);break;}
            case 54:{im.setImageResource(R.drawable.g54);gua.setText("雷泽归妹");jie.setText(R.string._54);break;}
            case 55:{im.setImageResource(R.drawable.g55);gua.setText("雷火丰");jie.setText(R.string._55);break;}
            case 56:{im.setImageResource(R.drawable.g56);gua.setText("火山旅");jie.setText(R.string._56);break;}
            case 57:{im.setImageResource(R.drawable.g57);gua.setText("巽为风");jie.setText(R.string._57);break;}
            case 58:{im.setImageResource(R.drawable.g58);gua.setText("兑为泽");jie.setText(R.string._58);break;}
            case 59:{im.setImageResource(R.drawable.g59);gua.setText("风水涣");jie.setText(R.string._59);break;}
            case 60:{im.setImageResource(R.drawable.g60);gua.setText("水泽节");jie.setText(R.string._60);break;}
            case 61:{im.setImageResource(R.drawable.g61);gua.setText("风泽中孚");jie.setText(R.string._61);break;}
            case 62:{im.setImageResource(R.drawable.g62);gua.setText("雷山小过");jie.setText(R.string._62);break;}
            case 63:{im.setImageResource(R.drawable.g63);gua.setText("水火既济");jie.setText(R.string._63);break;}
            case 64:{im.setImageResource(R.drawable.g64);gua.setText("火水未济");jie.setText(R.string._64);break;}
        }
    }

}