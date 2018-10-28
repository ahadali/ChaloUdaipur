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

public class DiningFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cateogry_fragment, container, false);

        ArrayList<Dining> diningList = new ArrayList<>();

        diningList.add(new Dining(R.drawable.upre, getString(R.string.upre_restaurant), getString(R.string.upre_location), getString(R.string.upre_website), getString(R.string.upre_contact), getString(R.string.upre_timings), getString(R.string.upre_ratings)));
        diningList.add(new Dining(R.drawable.hotelambrai, getString(R.string.hotel_ambrai), getString(R.string.ambraihotel_location), getString(R.string.ambrai_website), getString(R.string.ambrai_contact), getString(R.string.ambrai_timings), getString(R.string.ambrai_ratings)));
        diningList.add(new Dining(R.drawable.lakendhotel, getString(R.string.lake_end_hotel), getString(R.string.lakeend_location), getString(R.string.lake_end_website), getString(R.string.lakeend_contact), getString(R.string.lakeend_timings), getString(R.string.lakeend_ratings)));
        diningList.add(new Dining(R.drawable.udayvilas, getString(R.string.uday_vilas), getString(R.string.udayvilas_location), getString(R.string.udayvilas_website), getString(R.string.udayvilas_contact), getString(R.string.udayvilas_timings), getString(R.string.udayvilas_ratings)));
        diningList.add(new Dining(R.drawable.tajlakepalace, getString(R.string.taj_lake_palace), getString(R.string.tajlakepalace_location), getString(R.string.tajlake_website), getString(R.string.tajlakepalace_contact), getString(R.string.tajlakepalace_timings), getString(R.string.tajlakepalace_ratings)));
        diningList.add(new Dining(R.drawable.bluemooncafe, getString(R.string.blue_moon_cafe), getString(R.string.bluemoon_location), getString(R.string.bluemoon_website), getString(R.string.bluemoon_contact), getString(R.string.bluemoon_timings), getString(R.string.bluemoon_ratings)));
        diningList.add(new Dining(R.drawable.jheelcafe, getString(R.string.jheel_cafe), getString(R.string.jheelcafe_location), getString(R.string.jheelcafe_website), getString(R.string.jheelcafe_contact), getString(R.string.jheelcafe_timings), getString(R.string.jheelcafe_ratings)));
        diningList.add(new Dining(R.drawable.kababmistri, getString(R.string.kabab_mistri), getString(R.string.kababmistri_location), getString(R.string.kababmistri_website), getString(R.string.kababmistri_contact), getString(R.string.kababmistri_timings), getString(R.string.kababmistri_ratings)));
        diningList.add(new Dining(R.drawable.jagmandirpalace, getString(R.string.jag_mandir_palace), getString(R.string.jagmandir_location), getString(R.string.jagmandir_website), getString(R.string.jagmandir_contact), getString(R.string.jagmandir_timings), getString(R.string.jagmandir_ratings)));
        diningList.add(new Dining(R.drawable.radissonblu, getString(R.string.radisson_blu), getString(R.string.radissonblu_location), getString(R.string.radissoblue_website), getString(R.string.radissonblu_contact), getString(R.string.radissonblu_timings), getString(R.string.radissonblu_ratings)));

        RecyclerView restaurantsRV = rootView.findViewById(R.id.my_recycleView);
        DiningAdapter adapter = new DiningAdapter(getActivity(), diningList);
        restaurantsRV.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        restaurantsRV.setAdapter(adapter);

        return rootView;
    }
}
