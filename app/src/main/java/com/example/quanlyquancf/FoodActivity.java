package com.example.quanlyquancf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyquancf.DoiTuong.FoodName;
import com.example.quanlyquancf.Lop.Food;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
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
        ArrayList<FoodName> arrayList=new ArrayList<>();
        arrayList.add(new FoodName(R.drawable.as,"asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        arrayList.add(new FoodName(R.drawable.as,"asd","2000"));
        Food shopAdapter= new Food(arrayList,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);



    }
}