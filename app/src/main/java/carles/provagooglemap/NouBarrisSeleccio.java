package carles.provagooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import static carles.provagooglemap.R.id.textView;

/**
 * Created by carles on 21/12/2017.
 */

public class NouBarrisSeleccio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nou_barris_seleccio2);



        TextView btn3 = (TextView)findViewById(R.id.btnllistatentitats);
       // Button btn2 = (Button)findViewById(eprivadesnb);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (v.getContext(), MainActivityLugares.class);
                startActivityForResult(intent4, 0);
            }
        });

        TextView btn4 = (TextView)findViewById(R.id.localitzacioentitats);
        // Button btn2 = (Button)findViewById(eprivadesnb);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent (v.getContext(), MainActivityMaps.class);
                startActivityForResult(intent5, 0);
            }
        });
    }




}