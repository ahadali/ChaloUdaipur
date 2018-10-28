package com.example.android.chaloudaipur;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private Context mContext;
    private List<Events> mData;

    EventAdapter(@NonNull Context context, List<Events> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public EventAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.event_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.MyViewHolder holder, final int position) {
        holder.eventImageView.setImageResource(mData.get(position).getImageResourceId());
        holder.eventName.setText(mData.get(position).getEventName());
        holder.eventPaidOrFree.setText(mData.get(position).getEventPaidOrFree());
        holder.regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.event_registration, Toast.LENGTH_SHORT).show();
            }
        });
        holder.likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.event_liking, Toast.LENGTH_SHORT).show();
            }
        });
        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.event_sharing, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        CircleImageView eventImageView;

        TextView eventName;

        TextView eventPaidOrFree;

        Button regButton, likeButton, shareButton;

        MyViewHolder(View itemView) {
            super(itemView);

            eventImageView = itemView.findViewById(R.id.event_image);
            eventName = itemView.findViewById(R.id.event_name);
            eventPaidOrFree = itemView.findViewById(R.id.paid_and_free);
            regButton = itemView.findViewById(R.id.register_btn);
            likeButton = itemView.findViewById(R.id.like_button);
            shareButton = itemView.findViewById(R.id.share_button);
        }
    }
}
