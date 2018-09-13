package com.example.jery.behaviordemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomAdapterViewHolder> {
    private List<String> list = new ArrayList<>();

    public CustomAdapter() {
        for (int i = 0; i < 20; i++) {
            list.add("item" + i);
        }
    }

    @NonNull
    @Override
    public CustomAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomAdapterViewHolder(View.inflate(parent.getContext(), R.layout.item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapterViewHolder holder, int position) {
        holder.tv.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CustomAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public CustomAdapterViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}