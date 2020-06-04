package com.example.quanlyquancf.Adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quanlyquancf.DoiTuong.Food;
import com.example.quanlyquancf.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    ArrayList<Food> datashops;
    Context context;

    public FoodAdapter(ArrayList<Food> datashops, Context context) {
        this.datashops = datashops;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);

        return new FoodAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(datashops.get(position).getImage());
        holder.textView.setText(datashops.get(position).getName());
        holder.textView2.setText(datashops.get(position).getPrice());
        holder.textView.setMaxLines(2);
        holder.textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override
    public int getItemCount() {
        return datashops.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView,textView2;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.hinh);
            textView= (TextView)itemView.findViewById(R.id.txtname);
            textView2= (TextView)itemView.findViewById(R.id.txtprice);
            final TextView sl=(TextView)itemView.findViewById(R.id.soluong);
            Button tang=(Button)itemView.findViewById(R.id.btntang);
            final int[] a = {Integer.parseInt(sl.getText() + "")};
            tang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a[0]++;
                    sl.setText(a[0] +"");
                }
            });

            Button giam=(Button)itemView.findViewById(R.id.btngiam);
            giam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a[0] > 0)
                    {
                        a[0]--;
                        sl.setText(a[0] +"");
                    }
                }
            });

        }
    }
}
