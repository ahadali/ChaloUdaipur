package com.example.android.chaloudaipur;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DiningAdapter extends RecyclerView.Adapter<DiningAdapter.MyViewHolder> {

    private Context mContext;
    private List<Dining> mData;

    DiningAdapter(@NonNull Context context, List<Dining> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public DiningAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.dining_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiningAdapter.MyViewHolder holder, final int position) {
        holder.diningImageView.setImageResource(mData.get(position).getImageResourceId());
        holder.diningName.setText(mData.get(position).getDiningName());
        holder.diningInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diningIntent = new Intent(mContext, DiningIntent.class);
                diningIntent.putExtra("Image", mData.get(position).getImageResourceId());
                diningIntent.putExtra("Directions", mData.get(position).getDiningLocation());
                diningIntent.putExtra("Website", mData.get(position).getDiningWebsite());
                diningIntent.putExtra("Phone", mData.get(position).getDiningPhoneNumber());
                diningIntent.putExtra("Timings", mData.get(position).getDiningTimings());
                diningIntent.putExtra("Ratings", mData.get(position).getDiningRatings());
                mContext.startActivity(diningIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView diningImageView;

        TextView diningName;

        Button diningInfoButton;

        MyViewHolder(View itemView) {
            super(itemView);

            diningImageView = itemView.findViewById(R.id.dining_img_id);
            diningName = itemView.findViewById(R.id.dining_name_id);
            diningInfoButton = itemView.findViewById(R.id.dining_info_button);
        }
    }
}
