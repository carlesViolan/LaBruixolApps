package carles.provagooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by carles on 13/12/2017.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escull_districte);




//        Button btn2 = (Button) findViewById(R.id.buttonVolverIni);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
//                startActivityForResult(intent2, 0);
//            }
//        });
//
        Button btn3 = (Button) findViewById(R.id.Assesorament3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (v.getContext(), NouBarrisSeleccio.class);
                startActivityForResult(intent3, 0);
            }
        });
//
//        Button btn4 = (Button) findViewById(R.id.mapesGoogle);
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent4 = new Intent (v.getContext(), MapsActivity.class);
//                startActivityForResult(intent4, 0);
//            }
//        });
    }


}
