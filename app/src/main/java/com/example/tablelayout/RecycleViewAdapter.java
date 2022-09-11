package com.example.tablelayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    Context context;
    ArrayList<Model> list;

    public RecycleViewAdapter(Context context, ArrayList<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder holder, int position) {
        if(list != null && list.size() > 0) {
            Model model = list.get(position);
            holder.id_tv.setText(model.getId());
            holder.name_tv.setText(model.getName());
            holder.payment_tv.setText(model.getPayment());
        }else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id_tv,name_tv,payment_tv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            id_tv= itemView.findViewById(R.id.id);
            name_tv =itemView.findViewById(R.id.name);
            payment_tv = itemView.findViewById(R.id.payment);

        }
    }
}
