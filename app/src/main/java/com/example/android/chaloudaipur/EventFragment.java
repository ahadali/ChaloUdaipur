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
import java.util.List;

public class EventFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cateogry_fragment, container, false);

        List<Events> events = new ArrayList<>();

        events.add(new Events(R.drawable.lanternfest, getString(R.string.lantern_festival), getString(R.string.paid)));
        events.add(new Events(R.drawable.shilpgramfest, getString(R.string.shilpgram_festival), getString(R.string.free)));
        events.add(new Events(R.drawable.aharheritagewalk, getString(R.string.ahar_heritage_walk), getString(R.string.free)));
        events.add(new Events(R.drawable.purplerun, getString(R.string.purple_run_udaipur), getString(R.string.free)));
        events.add(new Events(R.drawable.dhasheradiwalimela, getString(R.string.dhashera_diwali_mela), getString(R.string.paid)));
        events.add(new Events(R.drawable.haryalimela, getString(R.string.hariyali_amavasya_mela), getString(R.string.paid)));
        events.add(new Events(R.drawable.musicfestival, getString(R.string.music_festival), getString(R.string.free)));

        RecyclerView eventRV = rootView.findViewById(R.id.my_recycleView);
        EventAdapter adapter = new EventAdapter(getActivity(), events);
        eventRV.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        eventRV.setAdapter(adapter);

        return rootView;
    }
}
