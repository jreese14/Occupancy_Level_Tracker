package com.example.occupancyleveltracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView MarketList;
    TextView Endpage;
    ArrayList<OccupancyInfo> list;
    OccupancyAdapter occupancyAdapter;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarketList = findViewById(R.id.rv);
        MarketList.setLayoutManager(new LinearLayoutManager(this));
        Endpage = findViewById(R.id.endpage);
        list = new ArrayList<OccupancyInfo>();
        occupancyAdapter = new OccupancyAdapter(MainActivity.this, list);
        MarketList.setAdapter(occupancyAdapter);

        // getting data from forebase
        reference= FirebaseDatabase.getInstance().getReference().child("Login");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                Log.e("Count " ,""+snapshot.getChildrenCount());
                for (DataSnapshot postSnapshot: snapshot.getChildren()) {
                    OccupancyInfo post = postSnapshot.getValue(OccupancyInfo.class);
                    list.add(post);
                }
                MarketList.setAdapter(occupancyAdapter);
                occupancyAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled( DatabaseError error) {
                //set code to show an error
                Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_SHORT).show();
            }
        });

    }
}