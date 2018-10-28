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

public class VenuesAdapter extends RecyclerView.Adapter<VenuesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Venues> mData;

    VenuesAdapter(@NonNull Context context, List<Venues> data) {
        this.mContext = context;
        this.mData = data;
    }


    @NonNull
    @Override
    public VenuesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.venues_list, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VenuesAdapter.MyViewHolder holder, final int position) {
        holder.venueImageView.setImageResource(mData.get(position).getImageResourceId());
        holder.venueName.setText(mData.get(position).getVenueName());
        holder.venueInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent venueIntent = new Intent(mContext, VenueIntent.class);
                venueIntent.putExtra("Image", mData.get(position).getImageResourceId());
                venueIntent.putExtra("Description", mData.get(position).getVenueDescription());
                venueIntent.putExtra("Directions", mData.get(position).getVenueLocation());
                mContext.startActivity(venueIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView venueImageView;

        TextView venueName;

        Button venueLocation;

        Button venueInfoButton;

        MyViewHolder(View itemView) {
            super(itemView);

            venueImageView = itemView.findViewById(R.id.venue_img_id);
            venueName = itemView.findViewById(R.id.venue_name_id);
            venueLocation = itemView.findViewById(R.id.directions_button);
            venueInfoButton = itemView.findViewById(R.id.venue_info_button);
        }
    }
}
