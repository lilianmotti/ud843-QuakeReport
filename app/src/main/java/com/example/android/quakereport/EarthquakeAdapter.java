package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /*
     *contructor for a new earthquake adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    /*
     *returns a list of item views displaying info about earthquakes
     * at the given position
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

       /*
        *is there an existing view to be reused? if not, inflate
        */
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        /*
         *get current position
         */
        Earthquake currentEarthquake = getItem(position);

        /*
         * find views by Id and display text from current earthquake item
         */
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        String formattedMag = formatMag(currentEarthquake.getmMagnitude());
        magnitudeView.setText(formattedMag);

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getmLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        Date dateObject= new Date(currentEarthquake.getmTimeInMs());
        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);

        return listItemView;

    }

    private String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatMag(double magnitude){
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }



}
