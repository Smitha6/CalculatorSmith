package com.example.alex.calculator_smith;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answerView;

    private Button c;
    private Button ce;
    private Button posNeg;
    private Button divide;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button plus;
    private Button four;
    private Button five;
    private Button six;
    private Button minus;
    private Button one;
    private Button two;
    private Button three;
    private Button multiply;
    private Button zero;
    private Button point;
    private Button equals;

    private double calculation = 0;
    private double numA = 0;
    private double numB = 0;
    private double buttonNum;

    //divide = d, multiply = m, subtract = s, add = a
    private String type = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerView = findViewById(R.id.textView);
        print();

        c = findViewById(R.id.C);
        ce = findViewById(R.id.CE);
        posNeg = findViewById(R.id.posNeg);
        divide = findViewById(R.id.divide);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        minus = findViewById(R.id.minus);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        multiply = findViewById(R.id.multiply);
        zero = findViewById(R.id.zero);
        point = findViewById(R.id.point);
        equals = findViewById(R.id.equals);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculation = 0;
                numA = 0;
                numB = 0;
            }});
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        posNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "d";
                //.setBackgroundTintList(Context.getResources().getColorStateList(R.color.your_xml_name));
            }});
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "p";
            }});
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNum = 5;
                if(numA == 0) {
                    numA = buttonNum;}
                else
                    numB = buttonNum;
                print(buttonNum);
            }});
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNum = 6;
                if(numA == 0) {
                    numA = buttonNum;}
                else
                    numB = buttonNum;
                print(buttonNum);
            }});
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "m";
            }});
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonNum = 1;
                if(numA == 0) {
                    numA = buttonNum;}
                else
                    numB = buttonNum;
                print(buttonNum);
            }});
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "m";
            }});
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }});
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(numA, numB, type);
            }});
    }

    private void print() {
        if (calculation == (int)calculation){
            answerView.setText((int)calculation + "");
        }
        else
            answerView.setText(calculation + "");
    }
    private void print(double num){
        answerView.setText((int)num + "");
    }

    private void calculate(double A, double B, String type){
        if(type.equals("d")){
            calculation = A / B;
            print();
        }
    }

}
