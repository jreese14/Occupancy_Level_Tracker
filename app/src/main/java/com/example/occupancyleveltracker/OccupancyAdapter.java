package com.example.occupancyleveltracker;

import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class OccupancyAdapter extends RecyclerView.Adapter<OccupancyAdapter.MyViewHolder> {
    Context context;
    ArrayList<OccupancyInfo> data;

    public OccupancyAdapter(Context context, ArrayList<OccupancyInfo> data) {
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item,viewGroup, false));
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.businessName.setText(data.get(i).getBusinessName());
        myViewHolder.OpenClose.setText(data.get(i).getOpenClose());
        myViewHolder.OccupancyLevel.setText(data.get(i).getOccupancyLevel());
        myViewHolder.notes.setText(data.get(i).getNotes());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView businessName, OpenClose, OccupancyLevel,notes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            businessName = (TextView)itemView.findViewById(R.id.businessName);
            OpenClose = (TextView)itemView.findViewById(R.id.OpenClose);
            OccupancyLevel = (TextView)itemView.findViewById(R.id.OccupancyLevel);
            notes = (TextView) itemView.findViewById(R.id.notes);

        }
    }
}
