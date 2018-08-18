package com.example.android.delhitourguiid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotel extends Fragment {
    public Hotel() {
    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.location_list,container,false);

        ArrayList<Location> list =new ArrayList<>();
        list.add(new Location(getString(R.string.thelalit),getString(R.string.lalitdeatil),R.drawable.thelalit));
        list.add(new Location(getString(R.string.thelila),getString(R.string.leeladetil),R.drawable.leelapalace));
        list.add(new Location(getString(R.string.itcmuyra),getString(R.string.itcdetail),R.drawable.itcmuyra));
        list.add(new Location(getString(R.string.tajpalace),getString(R.string.tajdetail),R.drawable.tajpalace));
        list.add(new Location(getString(R.string.hyttregency),getString(R.string.hyttdetail),R.drawable.hytt));
        list.add(new Location(getString(R.string.parkplaza),getString(R.string.parkdetail),R.drawable.parkplaza));

        LocationAdapter hoteladapter = new LocationAdapter(getActivity(),list);
        ListView listView=view.findViewById(R.id.list);
        listView.setAdapter(hoteladapter);
        return view;
    }
}
