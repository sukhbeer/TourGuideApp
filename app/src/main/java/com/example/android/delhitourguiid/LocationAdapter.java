package com.example.android.delhitourguiid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(Context context, List<Location> locations) {
        super(context, 0, locations);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Location currlocation = getItem(position);

        TextView sightName = convertView.findViewById(R.id.nameTextView);
        sightName.setText(currlocation.getLocationname());

        TextView sigthDetail = convertView.findViewById((R.id.descriptionTextView));
        sigthDetail.setText(currlocation.getLocationDetails());

        ImageView sightImage = convertView.findViewById(R.id.photoImageView);
        sightImage.setImageResource(currlocation.getLocationImageR());
        return convertView;
    }
}