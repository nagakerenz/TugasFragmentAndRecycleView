package com.example.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.itemViewHolder>{

    List<String> arr;

    public AdapterItem(List<String> arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        holder.txt.setText(arr.get(position));

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    class itemViewHolder extends RecyclerView.ViewHolder{

        TextView txt;
        public itemViewHolder(@NonNull View itemView){
            super(itemView);
            txt = itemView.findViewById(R.id.textView);
        }
    }
}
