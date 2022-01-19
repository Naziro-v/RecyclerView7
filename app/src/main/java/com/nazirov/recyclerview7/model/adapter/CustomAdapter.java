package com.nazirov.recyclerview7.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nazirov.recyclerview7.R;
import com.nazirov.recyclerview7.model.Member;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<Member> members;
    public CustomAdapter(Context context, List<Member> members) {
        this.context=context;
        this.members=members;


    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_custom_layout,viewGroup,false);
        return new CustomViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member= members.get(position);

        if (holder instanceof CustomViewHolder) {
            TextView first_name = ((CustomViewHolder) holder).first_name;
            TextView last_name = ((CustomViewHolder) holder).last_name;
        }


    }

    @Override
    public int getItemCount() {
        return members.size();
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView first_name, last_name;

        public CustomViewHolder(@NonNull View v) {
            super(v);
            view=v;

            first_name= view.findViewById(R.id.first_name);
            last_name= view.findViewById(R.id.last_name);
        }
    }

}
