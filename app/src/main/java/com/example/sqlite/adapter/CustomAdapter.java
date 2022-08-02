package com.example.sqlite.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sqlite.Models.PayInForm;
import com.example.sqlite.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    ArrayList<PayInForm> list;
    Context context;
    public CustomAdapter(Context context,ArrayList list){
        this.context =context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.rowID.setText(list.get(position).getID());
        holder.rowName.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView rowID;
        TextView rowName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rowID = itemView.findViewById(R.id.id);
            rowName = itemView.findViewById(R.id.name);

        }
    }

}

