package com.example.myapplication;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Dictionary;

public class Buildings {


    final static String[] buildingNames = {"Wallace Hall", "Mary Berry", "Carver Hall", "College Hall",
            "Smith Chapel", "Hopper Gymnasium", "Cowles Fieldhouse", "McNeill Hall", "Hillman Hall",
            "BPAC", "Kent Campus Center", "Lekburg Recital Hall", "Great Hall/Pfieffer Dining",
            "Bill Buxton Stadium", "Dunn Library"};

    final static LatLng[] buildingLatLngs = {new LatLng(41.365068, -93.562963),
            new LatLng(41.365537, -93.564544),
            new LatLng(41.363742, -93.563243),
            new LatLng(41.364976, -93.563648),
            new LatLng(41.364191, -93.562678),
            new LatLng(41.365530, -93.565462),
            new LatLng(41.365907, -93.565964),
            new LatLng(41.364399, -93.564544),
            new LatLng(41.364231, -93.564044),
            new LatLng(41.365412, -93.567308),
            new LatLng(41.366596, -93.565547),
            new LatLng(41.364779, -93.562696),
            new LatLng(41.365849, -93.563772),
            new LatLng(41.364268, -93.565690),
            new LatLng(41.365502, -93.563619)
        };


    final static int[] buildingLayoutIDs = {R.layout.activity_wallace, R.layout.activity_mary_berry,
            R.layout.activity_carver, R.layout.activity_college_hall, R.layout.activity_smith_chapel,
            R.layout.activity_hopper, R.layout.activity_cowles, R.layout.activity_mcneill,
            R.layout.activity_hillman, R.layout.activity_bpac, R.layout.activity_kent, R.layout.activity_lekburg,
            R.layout.activity_greathall, R.layout.activity_bill_buxton, R.layout.activity_dunn};

    final static int[] buildingButtonIDs = {R.id.wallace, R.id.mary_berry, R.id.carver, R.id.college,
            R.id.smith, R.id.hopper, R.id.cowles, R.id.mcneill, R.id.hillman, R.id.title_bpac, R.id.kent,
            R.id.lekburg, R.id.great_pfieffer, R.id.bill_buxton, R.id.dunn};

    public static void setViewLocation(GoogleMap map)
    {
        // Zoom in vicinity of Simpson Campus
        final LatLng simpson = new LatLng(41.365475, -93.564849);
        final CameraUpdate newLoc = CameraUpdateFactory.newLatLngZoom(simpson, 17);
        map.animateCamera(newLoc);

    }

    public static Marker[] getBuildingMarkers(GoogleMap map)
    {
        Marker[] buildingMarkers = new Marker[buildingNames.length];
        for(int i = 0; i < buildingNames.length; i++)
        {
            final Marker buildingMarker = map.addMarker(new MarkerOptions().position(buildingLatLngs[i]));
            buildingMarker.setTitle(buildingNames[i]);
            buildingMarker.setTag(buildingLatLngs[i]);
            buildingMarkers[i] = buildingMarker;
        }

        return buildingMarkers;
    }

}
