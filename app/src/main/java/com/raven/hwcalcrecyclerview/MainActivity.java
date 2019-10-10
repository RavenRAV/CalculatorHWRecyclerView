package com.raven.hwcalcrecyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static final int KEY = 3;

    RecyclerView recyclerView;
    CalculatorAdapter calculatorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        calculatorAdapter = new CalculatorAdapter();
        recyclerView.setAdapter(calculatorAdapter);
    }
    public void res(View v){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivityForResult(intent, KEY);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == KEY){
            if(resultCode == RESULT_OK){
                String text = data.getStringExtra(Main2Activity.RESULT_KEY);
                calculatorAdapter.addRes(text);


            }
        }
    }
}
