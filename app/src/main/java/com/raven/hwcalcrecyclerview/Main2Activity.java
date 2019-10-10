package com.raven.hwcalcrecyclerview;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    static final String RESULT_KEY = "res_key";

    EditText editText;
    EditText editText2;
    TextView textView;
    Button buttonSum, buttonMin, buttonMul, buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.resultat);
        buttonSum = findViewById(R.id.sum);
        buttonMin = findViewById(R.id.min);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.div);

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1-n2;
                textView.setText(n1+"-"+n2+"="+n3);


            }
        });buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1+n2;
                textView.setText(n1+"+"+n2+"="+(n3));



            }
        });buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1*n2;
                textView.setText(n1+"*"+n2+"="+(n3));

            }
        });buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().toString();
                editText2.getText().toString();
                double n1 = Double.valueOf(editText.getText().toString());
                double n2 = Double.valueOf(editText2.getText().toString());
                double n3;
                n3 = n1/n2;
                textView.setText(n1+"/"+n2+"="+(n3));

            }
        });

    }
    public void save (View v){
        Intent intent = new Intent();
        intent.putExtra(RESULT_KEY, textView.getText());
        setResult(RESULT_OK, intent);
        finish();

    }
}
