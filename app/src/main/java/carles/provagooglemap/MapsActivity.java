package carles.provagooglemap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

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

// Create a LatLngBounds that includes Australia.
        LatLngBounds Barcelona = new LatLngBounds(new LatLng(41.408883, 2.142596), new LatLng(41.4326972, 2.172894));

// Set the camera to the greatest possible zoom level that includes the
// bounds
        mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(Barcelona,0));

// Add a marker in Sydney and move the camera
        LatLng cipsa = new LatLng(41.3836432,2.1571069999999963);
        LatLng otra = new LatLng(41.384823 , 2.155404);
       // LatLng barcelona = new LatLng(41.385064,2.1734034999999494);
        //LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(cipsa).title("Marker in Cipsa"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(cipsa));

        mMap.addMarker(new MarkerOptions().position(otra).title("Marker in Otra"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(otra));
    }
}
