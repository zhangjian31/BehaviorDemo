package com.example.jery.behaviordemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomAdapterViewHolder> {

    @NonNull
    @Override
    public CustomAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomAdapterViewHolder(View.inflate(parent.getContext(), R.layout.item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class CustomAdapterViewHolder extends RecyclerView.ViewHolder {

        public CustomAdapterViewHolder(View itemView) {
            super(itemView);
        }
    }
}