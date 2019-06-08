package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,clear,div,mul,min,plus,res,dot,con,per;
    TextView tv1,tv2;
    String how;
    double firstnum, secondnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num0=findViewById(R.id.num0);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        dot=findViewById(R.id.dot);
        clear=findViewById(R.id.clear);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.mul);
        min=findViewById(R.id.min);
        plus=findViewById(R.id.plus);
        res=findViewById(R.id.res);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        con=findViewById(R.id.con);
        per=findViewById(R.id.per);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText(before + "9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String before = tv2.getText().toString();
                tv2.setText(before+".");
                firstnum = Double.parseDouble(before);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                tv2.setText("");
            }
        });

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double before = Double.parseDouble(tv2.getText().toString())*-1;
                if(before - (int)before == 0) tv2.setText(String.valueOf((int)before));
                else tv2.setText(String.valueOf(before));
            }
        });

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double before = Double.parseDouble(tv2.getText().toString())*0.01;
                tv2.setText(String.valueOf(before));

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                firstnum = Double.parseDouble(before);
                how="+";
                tv1.setText(before + how);
                tv2.setText("");
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                firstnum=Double.parseDouble(before);
                how="-";
                tv1.setText(before+how);
                tv2.setText("");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                firstnum=Double.parseDouble(before);
                how="×";
                tv1.setText(before + how);
                tv2.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                firstnum=Double.parseDouble(before);
                how="÷";
                tv1.setText(before + how);
                tv2.setText("");
            }
        });


        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String before = tv2.getText().toString();
                secondnum=Double.parseDouble(before);
                double result=0;
                switch (how){
                    case "+" : result=firstnum+secondnum; break;
                    case "-" : result=firstnum-secondnum; break;
                    case "÷" : result=firstnum/secondnum; break;
                    case "×" : result=firstnum*secondnum; break;
                }
                if (result-(int)result==0) tv2.setText(String.valueOf((int)result));
                else tv2.setText(String.valueOf(result));
                tv1.setText("");
            }
        });
    }
}
