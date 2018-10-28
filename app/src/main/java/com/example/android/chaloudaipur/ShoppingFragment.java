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

public class ShoppingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.cateogry_fragment, container, false);

        List<Shopping> shoppingList = new ArrayList<>();

        shoppingList.add(new Shopping(R.drawable.rkaymall, getString(R.string.r_kay_mall), getString(R.string.rkaymall_description), getString(R.string.rkay_direction)));
        shoppingList.add(new Shopping(R.drawable.celebrationmall, getString(R.string.celebration_mall), getString(R.string.celebrationmall_description), getString(R.string.celebrationmall_direction)));
        shoppingList.add(new Shopping(R.drawable.lakecitymall, getString(R.string.lake_city_mall), getString(R.string.lakecitymall_description), getString(R.string.lakecitymall_direction)));
        shoppingList.add(new Shopping(R.drawable.bapubazar, getString(R.string.bapu_bazar), getString(R.string.bapubazar_description), getString(R.string.bapubazar_direction)));
        shoppingList.add(new Shopping(R.drawable.badabazar, getString(R.string.bada_bazar), getString(R.string.badabazar_description), getString(R.string.badabazar_direction)));
        shoppingList.add(new Shopping(R.drawable.jagdishchowk, getString(R.string.jagdish_chowk), getString(R.string.jagdishchowk_description), getString(R.string.jagdishchowk_direction)));
        shoppingList.add(new Shopping(R.drawable.arvana, getString(R.string.arvana), getString(R.string.arvana_description), getString(R.string.arvana_direction)));
        shoppingList.add(new Shopping(R.drawable.rajasthali, getString(R.string.rajasthali), getString(R.string.rajasthali_description), getString(R.string.rajasthali_direction)));
        shoppingList.add(new Shopping(R.drawable.shilpgram, getString(R.string.shilpgram), getString(R.string.shilpgram_description), getString(R.string.shilpgram_direction)));
        shoppingList.add(new Shopping(R.drawable.sindhibazar, getString(R.string.sindhi_bazar), getString(R.string.sindhibazar_description), getString(R.string.sindhibazar_direction)));

        RecyclerView shoppingRV = rootView.findViewById(R.id.my_recycleView);
        ShoppingAdapter adapter = new ShoppingAdapter(getActivity(), shoppingList);
        shoppingRV.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        shoppingRV.setAdapter(adapter);
        return rootView;
    }
}
