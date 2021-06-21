package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WrittingAdapter extends RecyclerView.Adapter<WrittingAdapter.MyViewholder> {

    private Activity activity;
    private ArrayList<ItemFrom> datalist;

    @Override
    public WrittingAdapter.MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewholder viewholder1 = new MyViewholder(view);


        return viewholder1;
    }

    @Override
    public void onBindViewHolder(WrittingAdapter.MyViewholder holder, int position) {
        ItemFrom data = datalist.get(position);
        holder.personalId.setText(data.getId());
        holder.profile.setImageResource(data.getImageNumber());
        holder.writtingTxt.setText(data.getTxt());

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
    public class MyViewholder extends RecyclerView.ViewHolder
    {
        ImageView profile;
        TextView writtingTxt;
        TextView personalId;

        public MyViewholder(View itemview){
            super(itemview);

            profile = (ImageView) itemview.findViewById(R.id.image_jjang);
            writtingTxt = (TextView) itemview.findViewById(R.id.person_id1);
            personalId = (TextView) itemview.findViewById(R.id.person_id);
            itemview.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(activity, "c",Toast.LENGTH_LONG).show();;
                }
            });

        }

    }
    public WrittingAdapter(Activity activity, ArrayList<ItemFrom> datalist){
        this.activity = activity;
        this.datalist = datalist;

    }
}