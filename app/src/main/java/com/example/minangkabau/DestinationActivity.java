package com.example.minangkabau;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DestinationActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
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
        LatLng Pantai = new LatLng(-0.929130, 100.350333);
        mMap.addMarker(new MarkerOptions().position(Pantai).title("Pantai Padang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pantai));

        LatLng Jam = new LatLng(-0.305199, 100.369480);
        mMap.addMarker(new MarkerOptions().position(Jam).title("Jam Gadang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jam));

        LatLng mande = new LatLng(-1.1949369,100.4161773);
        mMap.addMarker(new MarkerOptions().position(mande).title("Pulau Mandeh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mande));

        LatLng kelok = new LatLng(0.0699775,100.6962527);
        mMap.addMarker(new MarkerOptions().position(kelok).title("Kelok 9"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kelok));

        LatLng nyarai = new LatLng(-0.6835132,100.360187917);
        mMap.addMarker(new MarkerOptions().position(nyarai).title("Air Turjun Nyarai Pariaman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nyarai));

    }





}
