package com.raven.hwcalcrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CalculatorAdapter extends RecyclerView.Adapter<CalculatorViewHolder> {

    ArrayList<String> result;

    public CalculatorAdapter(){
        result = new ArrayList<>();
    }
    public void addRes(String text){
        result.add(text);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CalculatorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.view_holder_calculator, parent, false);
        return new CalculatorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CalculatorViewHolder holder, int position) {
        String text = result.get(position);
        holder.onBind(text);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }
}
