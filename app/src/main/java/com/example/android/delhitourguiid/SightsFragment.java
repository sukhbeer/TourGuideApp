package com.example.android.delhitourguiid;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.location_list,container,false);

        ArrayList<com.example.android.delhitourguiid.Location> locations =new ArrayList<>();

        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.redfort),getString(R.string.redforthis),R.drawable.redfortnew));
        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.indaigate),getString(R.string.idnigatehis),R.drawable.indiagate));
        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.lotus),getString(R.string.lotustemhis),R.drawable.lotustmpl));
        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.qutub),getString(R.string.qutubhis),R.drawable.qutubminar));
        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.jantarmantr),getString(R.string.jantrmantrhis),R.drawable.newjantar) );
        locations.add(new com.example.android.delhitourguiid.Location(getString(R.string.humayunTomb),getString(R.string.humanyhis),R.drawable.humanyunstomb));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(),locations);
        ListView listView=view.findViewById(R.id.list);
        listView.setAdapter(locationAdapter);
        return view;
    }
}
