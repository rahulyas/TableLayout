package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> model= new ArrayList<>();
    RecyclerView recyclerView;
    RecycleViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        model.add(new Model("1","Rahul","50"));
        model.add(new Model("2","Anuj","150"));
        model.add(new Model("3","Yash","350"));
        model.add(new Model("4","Ramu","100"));
        model.add(new Model("5","Rohit","60"));
        adapter =new RecycleViewAdapter(this,model);
        recyclerView.setAdapter(adapter);

    }
}