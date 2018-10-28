package com.example.android.chaloudaipur;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShoppingAdapter extends RecyclerView.Adapter<ShoppingAdapter.MyViewHolder> {

    private Context mContext;
    private List<Shopping> mData;

    ShoppingAdapter(@NonNull Context context, List<Shopping> data) {
        this.mContext = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ShoppingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.shopping_list, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ShoppingAdapter.MyViewHolder holder, final int position) {
        holder.shoppingImageView.setImageResource(mData.get(position).getImageResourceId());
        holder.shoppingName.setText(mData.get(position).getShoppingName());
        holder.shoppingDescription.setText(mData.get(position).getShoppingDescription());
        holder.shoppingDirectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri locationIntentUri = Uri.parse(mData.get(position).getShoppingDirections());

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(mContext.getPackageManager()) != null) {
                    mContext.startActivity(mapIntent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView shoppingImageView;

        TextView shoppingName;

        TextView shoppingDescription;

        Button shoppingDirectionButton;

        MyViewHolder(View itemView) {
            super(itemView);

            shoppingImageView = itemView.findViewById(R.id.shopping_img_id);
            shoppingName = itemView.findViewById(R.id.shopping_name_id);
            shoppingDescription = itemView.findViewById(R.id.shopping_description);
            shoppingDirectionButton = itemView.findViewById(R.id.shopping_directions);
        }
    }
}
