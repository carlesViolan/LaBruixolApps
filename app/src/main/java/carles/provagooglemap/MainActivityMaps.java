package carles.provagooglemap;

/**
 * Created by carles on 29/12/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivityMaps extends AppCompatActivity {

    //static final LatLng NOUBARRIS = new LatLng(41.445699, 2.179414);
    static final LatLng NOUBARRIS = new LatLng(41.445699, 2.179414);
    static final LatLng ABITS = new LatLng(41.4369202, 2.1712029000000257);
    static final LatLng CJAS = new LatLng(41.408382, 2.154319);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {

                googleMap.addMarker(new MarkerOptions().title("DistricteNouBarris").position(NOUBARRIS));
                googleMap.addMarker(new MarkerOptions().title("ABITS").position(ABITS));
                googleMap.addMarker(new MarkerOptions().title("CJAS").position(CJAS));

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(NOUBARRIS, 55));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ABITS, 55));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CJAS, 55));
                googleMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

            }
        });
    }

}