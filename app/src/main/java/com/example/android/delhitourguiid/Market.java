package com.example.android.delhitourguiid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Market extends Fragment {


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> locations=new ArrayList<>();
        locations.add(new Location(getString(R.string.chandni),getString(R.string.chndnichkdetl),R.drawable.chandnichowk));
        locations.add(new Location(getString(R.string.palika),getString(R.string.palikadetail),R.drawable.palika));
        locations.add(new Location(getString(R.string.khnmarkt),getString(R.string.khanmarketdetil),R.drawable.khanmarket));
        locations.add(new Location(getString(R.string.sarjoni),getString(R.string.sarojnidetail),R.drawable.sarojini));
        locations.add(new Location(getString(R.string.gaffr),getString(R.string.gaffrdetil),R.drawable.gaffar));
        locations.add(new Location(getString(R.string.janpath),getString(R.string.janptdetail),R.drawable.janpath));

        LocationAdapter locationAdapter=new LocationAdapter(getActivity(),locations);
        ListView listView=view.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return view;
    }
}
