package com.example.quanlyquancf.Lop;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyquancf.Adapter.FoodAdapter;
import com.example.quanlyquancf.DoiTuong.Food;
import com.example.quanlyquancf.R;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_food);
//        Intent s = new Intent(FoodActivity.this, FoodAdapter.class);
//        startActivity(s);
        initView();
    }
    public void initView()
    {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<Food> arrayList=new ArrayList<>();
        arrayList.add(new Food("https://i.imgur.com/Prn3FgP.png","asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","2000","Rỗng","0","1","-1"));
        arrayList.add(new Food("https://www.tokkoro.com/picsup/2633016-spiderman-4k-high-resolution-picture.jpg","asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","2000","Rỗng","0","1","-1"));

        FoodAdapter shopAdapter= new FoodAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);



    }
}