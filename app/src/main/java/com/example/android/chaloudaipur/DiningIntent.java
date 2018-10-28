package com.example.android.chaloudaipur;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import de.hdodenhof.circleimageview.CircleImageView;

public class DiningIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dining_intent);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CircleImageView dining_main_image = findViewById(R.id.dining_circleImageView);
        ImageView dining_back_image = findViewById(R.id.dining_back_image_view);
        Button diningLocation = findViewById(R.id.dining_directions_button);
        Button diningWebsite = findViewById(R.id.website_button);
        TextView phoneNumber = findViewById(R.id.phone_number);
        TextView timings = findViewById(R.id.open_and_close_hours);
        TextView ratings = findViewById(R.id.rating_point);


        final Intent intent = getIntent();
        int dining_image = intent.getExtras().getInt("Image");
        String dining_phone = intent.getExtras().getString("Phone");
        String dining_timings = intent.getExtras().getString("Timings");
        String dining_ratings = intent.getExtras().getString("Ratings");
        diningLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dining_loc = intent.getExtras().getString("Directions");
                Uri locationIntentUri = Uri.parse(dining_loc);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        diningWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dining_web = intent.getExtras().getString("Website");
                Uri webIntentUri = Uri.parse(dining_web);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, webIntentUri);
                startActivity(mapIntent);
            }
        });
        dining_main_image.setImageResource(dining_image);
        dining_back_image.setImageResource(dining_image);
        phoneNumber.setText(dining_phone);
        timings.setText(dining_timings);
        ratings.setText(dining_ratings);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
