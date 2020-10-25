package com.example.occupancyleveltracker;

import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

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

        myViewHolder.businessName.setText("Hospital Name: "+data.get(i).gethospitalName());
        myViewHolder.OpenClose.setText("Free Covid-19 Testing: " +data.get(i).getfreeTesting());
        myViewHolder.OccupancyLevel.setText("Available ventilators: "+data.get(i).getnumberOfBeds());
        myViewHolder.notes.setText("Address: "+data.get(i).getaddress());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView businessName, OpenClose, OccupancyLevel,notes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            businessName = (TextView)itemView.findViewById(R.id.hospitalName);
            OpenClose = (TextView)itemView.findViewById(R.id.OpenClose);
            OccupancyLevel = (TextView)itemView.findViewById(R.id.numberOfBeds);
            notes = (TextView) itemView.findViewById(R.id.notes);

        }
    }
}
