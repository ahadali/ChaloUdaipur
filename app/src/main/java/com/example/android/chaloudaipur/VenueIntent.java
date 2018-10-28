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

public class VenueIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.venue_intent);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CircleImageView venue_main_image = findViewById(R.id.circleImageView);
        ImageView venue_back_image = findViewById(R.id.back_image_view);
        TextView venueDesc = findViewById(R.id.scroll_text_view);
        Button venueLocation = findViewById(R.id.directions_button);


        final Intent intent = getIntent();
        int venue_image = intent.getExtras().getInt("Image");
        String venue_desc = intent.getExtras().getString("Description");
        venueLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String venue_loc = intent.getExtras().getString("Directions");
                Uri locationIntentUri = Uri.parse(venue_loc);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
        venue_main_image.setImageResource(venue_image);
        venue_back_image.setImageResource(venue_image);
        venueDesc.setText(venue_desc);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
