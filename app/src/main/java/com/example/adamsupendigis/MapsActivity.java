package com.example.adamsupendigis;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng rumah = new LatLng(-0.8828083999820583, 119.9062640851838);
        mMap.addMarker(new MarkerOptions().position(rumah).title("Rumah Saya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));

        LatLng pasar = new LatLng(-0.8806816256164843, 119.89152484865302);
        mMap.addMarker(new MarkerOptions().position(pasar).title("Pasar Talise"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pasar));


        mMap.addPolyline(new PolylineOptions().add(
                rumah,
                new LatLng(-0.8828083999820583, 119.9062640851838),
                new LatLng(-0.8831998818069271, 119.9059530839796),
                new LatLng(-0.8841327745182808, 119.90670559588635),
                new LatLng(-0.8843354565354322, 119.90661673839455),
                new LatLng(-0.8843382329957179, 119.90661951516313),
                new LatLng(-0.8834553167416891, 119.90493122281967),
                new LatLng(-0.8827278824295182, 119.90332623436203),
                new LatLng(-0.8819504715638425, 119.90165460281551),
                new LatLng(-0.8815173425790863, 119.90066606319134),
                new LatLng( -0.881303554538063, 119.89894167250202),
                new LatLng( -0.8814312720696402, 119.89851682256338),
                new LatLng(-0.8815034602373667, 119.89774209634932),
                new LatLng( -0.8814479308775233, 119.8965813953453),
                new LatLng(-0.8811813899316243, 119.8950097284097),
                new LatLng(-0.8806816256164843, 119.89152484865302),

                pasar
                ).width(10)
                .color(Color.BLUE)

        );
    }
}