package com.example.android.delhitourguiid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends Fragment {

    public Food() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.location_list,container,false);


        ArrayList<Location> list=new ArrayList<>();
        list.add(new Location(getString(R.string.cholebture),getString(R.string.chollebhturdetail),R.drawable.bestcholebhture));
        list.add(new Location(getString(R.string.bhleepapri),getString(R.string.chaatdetail),R.drawable.bhalla_papri_chaat));
        list.add(new Location(getString(R.string.momo),getString(R.string.momodetail),R.drawable.momos));
        list.add(new Location(getString(R.string.rolls),getString(R.string.rollsdetail),R.drawable.rollsnewdelhi));
        list.add(new Location(getString(R.string.butterchikn),getString(R.string.buttrchikdetail),R.drawable.butterchicken));
        list.add(new Location(getString(R.string.dessrts),getString(R.string.dessertdetsil),R.drawable.desserts));

        LocationAdapter foodAdapter = new LocationAdapter(getActivity(),list);
        ListView listView=view.findViewById(R.id.list);
        listView.setAdapter(foodAdapter);

        return view;
    }
}
