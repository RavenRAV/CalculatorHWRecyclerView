package com.raven.hwcalcrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CalculatorViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public CalculatorViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.vh_text_view);
    }
    public void onBind(String text){
        textView.setText(text);
    }
}

