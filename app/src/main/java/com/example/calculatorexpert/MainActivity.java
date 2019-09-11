package com.example.calculatorexpert;
import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculatorexpert.R;

public class MainActivity extends AppCompatActivity {
    private TextView layar,layarkecil;
    private Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_plusmin,button_dot,button_equal,button_plus,button_min,button_multiply,button_div;
    private Button button_percent,button_sqrt,button_pow,button_fraction,button_CE,button_C,button_back;
    int cek=0,cek1=0;
    double hasil=0;
    String tempchar="";
    double glob = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layar = (TextView) findViewById(R.id.Layar);
        layarkecil = (TextView) findViewById(R.id.Layarkecil);
        button_0 = (Button) findViewById(R.id.button0);
        button_1 = (Button) findViewById(R.id.button1);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
        button_4 = (Button) findViewById(R.id.button4);
        button_5 = (Button) findViewById(R.id.button5);
        button_6 = (Button) findViewById(R.id.button6);
        button_7 = (Button) findViewById(R.id.button7);
        button_8 = (Button) findViewById(R.id.button8);
        button_9 = (Button) findViewById(R.id.button9);
        button_plusmin = (Button) findViewById(R.id.buttonplusmin);
        button_dot = (Button) findViewById(R.id.buttondot);
        button_equal = (Button) findViewById(R.id.buttonequal);
        button_plus = (Button) findViewById(R.id.buttonplus);
        button_min = (Button) findViewById(R.id.buttonmin);
        button_multiply = (Button) findViewById(R.id.buttonmultiply);
        button_div = (Button) findViewById(R.id.buttondiv);
        button_percent = (Button) findViewById(R.id.buttonpercent);
        button_sqrt = (Button) findViewById(R.id.buttonsqrt);
        button_pow = (Button) findViewById(R.id.buttonpow);
        button_fraction = (Button) findViewById(R.id.buttonfraction);
        button_CE = (Button) findViewById(R.id.buttonCE);
        button_C = (Button) findViewById(R.id.buttonC);
        button_2 = (Button) findViewById(R.id.button2);
        button_back = (Button) findViewById(R.id.buttonback);

        button_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String temp = layar.getText().toString();
                if(!temp.equals("0")&& cek==1) {
                    temp += "0";
                    layar.setText(temp);
                    cek = 1;
                }


            }
        });
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(temp.equals("0") && cek!=0) {
                    temp += "1";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "1";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "2";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "2";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "3";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "3";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "4";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "4";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "5";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "5";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "6";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "6";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "7";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "7";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "8";
                    layar.setText(temp);
                    cek = 1;
                }
                else {
                    temp = "8";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                if(!temp.equals("0") && cek!=0) {
                    temp += "9";
                    layar.setText(temp);
                    cek = 1;
                }
                else{
                    temp = "9";
                    layar.setText(temp);
                    cek = 1;
                }
            }
        });
        button_plusmin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                number=number*-1;
                if(number%1==0){
                    int number1= (int)number;
                    layar.setText(String.valueOf(number1));
                }
                else{
                    layar.setText(String.valueOf(number));
                }
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                temp += ".";
                layar.setText(temp);
                cek=1;
            }
        });
        button_equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number;
                number= Double.parseDouble(temp);
                if(glob != 0){
                    if(tempchar=="+"){
                        glob += number;
                    }
                    else if(tempchar=="-"){
                        glob -= number;
                    }
                    else if(tempchar=="*"){
                        glob *= number;
                    }
                    else if(tempchar=="/"){
                        glob /= number;
                    }
                    if(glob%1==0){
                        int glob1= (int)glob;
                        layar.setText(String.valueOf(glob1));
                    }
                    else{
                        layar.setText(String.valueOf(glob));
                    }
                }else{
                    glob = number;
                }
                layarkecil.setText("");
                glob=0;
                tempchar="";
                cek=0;

            }
        });
        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                if(glob != 0){
                    if(tempchar=="+"){
                        glob += number;
                    }
                    else if(tempchar=="-"){
                        glob -= number;
                    }
                    else if(tempchar=="*"){
                        glob *= number;
                    }
                    else if(tempchar=="/"){
                        glob /= number;
                    }
                    if(glob%1==0){
                        int glob1= (int)glob;
                        layar.setText(String.valueOf(glob1));
                    }
                    else{
                        layar.setText(String.valueOf(glob));
                    }
                }else{
                    glob = number;
                }
                tempchar="+";
                String temp1 = layarkecil.getText().toString();
                temp1= temp1 + temp + " + ";
                layarkecil.setText(temp1);
                cek=0;
            }
        });
        button_min.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                if(glob != 0){
                    if(tempchar=="+"){
                        glob += number;
                    }
                    else if(tempchar=="-"){
                        glob -= number;
                    }
                    else if(tempchar=="*"){
                        glob *= number;
                    }
                    else if(tempchar=="/"){
                        glob /= number;
                    }
                    if(glob%1==0){
                        int glob1= (int)glob;
                        layar.setText(String.valueOf(glob1));
                    }
                    else{
                        layar.setText(String.valueOf(glob));
                    }
                }else{
                    glob = number;
                }
                tempchar="-";
                String temp1 = layarkecil.getText().toString();
                temp1= temp1 + temp + " - ";
                layarkecil.setText(temp1);
                cek=0;
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number;
                number= Double.parseDouble(temp);
                if(glob != 0){
                    if(tempchar=="+"){
                        glob += number;
                    }
                    else if(tempchar=="-"){
                        glob -= number;
                    }
                    else if(tempchar=="*"){
                        glob *= number;
                    }
                    else if(tempchar=="/"){
                        glob /= number;
                    }
                    if(glob%1==0){
                        int glob1= (int)glob;
                        layar.setText(String.valueOf(glob1));
                    }
                    else{
                        layar.setText(String.valueOf(glob));
                    }
                }else{
                    glob = number;
                }
                tempchar="*";
                String temp1 = layarkecil.getText().toString();
                temp1= temp1 + temp + " * ";
                layarkecil.setText(temp1);
                cek=0;
            }
        });
        button_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number;
                number= Double.parseDouble(temp);
                if(glob != 0){
                    if(tempchar=="+"){
                        glob += number;
                    }
                    else if(tempchar=="-"){
                        glob -= number;
                    }
                    else if(tempchar=="*"){
                        glob *= number;
                    }
                    else if(tempchar=="/"){
                        glob /= number;
                    }
                    if(glob%1==0){
                        int glob1= (int)glob;
                        layar.setText(String.valueOf(glob1));
                    }
                    else{
                        layar.setText(String.valueOf(glob));
                    }
                }else{
                    glob = number;
                }
                tempchar="/";
                String temp1 = layarkecil.getText().toString();
                temp1= temp1 + temp + " / ";
                layarkecil.setText(temp1);
                cek=0;
            }
        });
        button_percent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                number=number/100.0;
                layar.setText(String.valueOf(number));

            }
        });
        button_sqrt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                if(number%1==0) {
                    int number2;
                    number2= (int) number;
                    layarkecil.setText("Sqrt("+number2+")");
                }
                else{
                    layarkecil.setText("Sqrt("+number+")");
                }

                number=Math.sqrt(number);
                if(number%1==0) {
                    int number1;
                    number1= (int) number;
                    layar.setText(String.valueOf(number1));
                }
                else{
                    layar.setText(String.valueOf(number));
                }

            }
        });
        button_pow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                if(number%1==0) {
                    int number2;
                    number2= (int) number;
                    layarkecil.setText("Sqrt("+number2+")");
                }
                else{
                    layarkecil.setText("Sqrt("+number+")");
                }

                number=Math.sqrt(number);
                if(number%1==0) {
                    int number1;
                    number1= (int) number;
                    layar.setText(String.valueOf(number1));
                }
                else{
                    layar.setText(String.valueOf(number));
                }

            }
        });
        button_fraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String temp = layar.getText().toString();
                double number= Double.parseDouble(temp);
                if(number%1==0) {
                    int number2;
                    number2= (int) number;
                    layarkecil.setText("1 /"+number2);
                }
                else{
                    layarkecil.setText("1 /"+number);
                }

                number=1/number;
                if(number%1==0) {
                    int number1;
                    number1= (int) number;
                    layar.setText(String.valueOf(number1));
                }
                else{
                    layar.setText(String.valueOf(number));
                }
            }
        });
        button_CE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                layar.setText("0");
            }
        });
        button_C.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                layar.setText("0");
                layarkecil.setText("");
                glob=0;
                tempchar="";
                cek=0;
            }
        });
        button_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String str=layar.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    layar.setText(str);
                }
                else if (str.length() <=1 ) {
                    layar.setText("0");
                }
            }
        });
    }
}
