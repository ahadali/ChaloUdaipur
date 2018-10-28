package com.example.android.chaloudaipur;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class VenuesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cateogry_fragment, container, false);

        ArrayList<Venues> venuesList = new ArrayList<>();

        venuesList.add(new Venues(R.drawable.fatehsagar, getString(R.string.fatehsagar), getString(R.string.fatehsagar_description), getString(R.string.fatehsagar_location)));
        venuesList.add(new Venues(R.drawable.badilake, getString(R.string.badi_lake), getString(R.string.badi_description), getString(R.string.badi_location)));
        venuesList.add(new Venues(R.drawable.ambraighat, getString(R.string.ambrai_ghat), getString(R.string.ambrai_ghat_desctiption), getString(R.string.ambrai_location)));
        venuesList.add(new Venues(R.drawable.sajjangarh, getString(R.string.sajjangarh), getString(R.string.sajjangarh_description), getString(R.string.sajjangarh_location)));
        venuesList.add(new Venues(R.drawable.citypalace, getString(R.string.city_palace), getString(R.string.citypalace_description), getString(R.string.citypalace_location)));
        venuesList.add(new Venues(R.drawable.lakepichola, getString(R.string.lake_pichola), getString(R.string.lakepichola_description), getString(R.string.pichola_location)));
        venuesList.add(new Venues(R.drawable.jaisamandlake, getString(R.string.jaisamand), getString(R.string.jaisamand_description), getString(R.string.jaisamand_location)));
        venuesList.add(new Venues(R.drawable.gangaurghat, getString(R.string.gangaur_ghat), getString(R.string.gangaurghat_description), getString(R.string.gangaurghat_location)));
        venuesList.add(new Venues(R.drawable.govardhansagar, getString(R.string.govardhan_sagar), getString(R.string.govardhansagar_description), getString(R.string.govardhansagar_location)));
        venuesList.add(new Venues(R.drawable.ropeway, getString(R.string.ropeway_udaipur), getString(R.string.ropeway_description), getString(R.string.ropeway_location)));

        RecyclerView placeRV = rootView.findViewById(R.id.my_recycleView);
        VenuesAdapter adapter = new VenuesAdapter(getActivity(), venuesList);
        placeRV.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        placeRV.setAdapter(adapter);

        return rootView;
    }
}
