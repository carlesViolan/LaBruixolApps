package carles.provagooglemap;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by carles on 13/12/2017.
 */

public class QueFaigSi extends AppCompatActivity {


    private Typeface merryweather;
    private Typeface merryweatherRegular;

//private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quefaigsi);

// Seteamos en una Variable donde tenemos la fuente (podemos omitir este paso y ponerla directamente cuando cargamos la fuente)

        String merrieweatherbold = "fonts/merriweatherbold.ttf";
        String merrieweatheregular = "fonts/merriweatherregular.ttf";

// Obtenemos la id del TextView donde queremos cambiar la fuente

        TextView texto = (TextView) findViewById(R.id.quefaigsi);
        TextView texto1 = (TextView) findViewById(R.id.Assesorament1);
        TextView texto2 = (TextView) findViewById(R.id.Assesorament2);
        TextView texto3 = (TextView) findViewById(R.id.Assesorament3);
        TextView texto4 = (TextView) findViewById(R.id.Assesorament4);
        TextView texto5 = (TextView) findViewById(R.id.onpucadresarme1);
       // TextView texto6 = (TextView) findViewById(R.id.onpucadresarme2);

// Cargamos la fuente
        this.merryweather = Typeface.createFromAsset(getAssets(), merrieweatherbold );
        this.merryweatherRegular = Typeface.createFromAsset(getAssets(), merrieweatheregular);

// Aplicamos la fuente
        texto.setTypeface(merryweather);
        texto1.setTypeface(merryweatherRegular);
        texto2.setTypeface(merryweatherRegular);
        texto3.setTypeface(merryweatherRegular);
        texto4.setTypeface(merryweatherRegular);
        texto5.setTypeface(merryweather);
       // texto6.setTypeface(merryweather);



        TextView btn5 = (TextView)findViewById(R.id.onpucadresarme1);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent (v.getContext(), MenuActivity2.class);
                startActivityForResult(intent5, 0);
            }
        });

//        Button btn2 = (Button) findViewById(R.id.buttonVolverIni);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent (v.getContext(), MainActivity.class);
//                startActivityForResult(intent2, 0);
//            }
//        });
//
//        Button btn3 = (Button) findViewById(R.id.Assesorament1);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent3 = new Intent (v.getContext(), AcercaDe.class);
//                startActivityForResult(intent3, 0);
//            }
//        });


//        Button btn1 = (Button)findViewById(R.id.Assesorament1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                Toast toast2 =
//                        Toast.makeText(getApplicationContext(),
//                                "Adreçat als serveis d’assessorament i suport o a qualsevol entitat de dones", Toast.LENGTH_LONG);
//
//                toast2.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);
//
//                toast2.show();
//            }
//        });

//        Button btn2a = (Button)findViewById(R.id.Assesorament2);
//        btn2a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                Toast toast3 =
//                        Toast.makeText(getApplicationContext(),
//                                "Adreçat als serveis d’assessorament i suport o a qualsevol entitat de dones", Toast.LENGTH_LONG);
//
//                toast3.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);
//
//                toast3.show();
//            }
//        });
//
//        Button btn3a = (Button)findViewById(R.id.Assesorament3);
//        btn3a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                Toast toast4 =
//                        Toast.makeText(getApplicationContext(),
//                                "No hi intervinguis. Truca al 112, o a Mossos o Guàrdia Urbana i facilita l’adreça del lloc on has vist l’agressió i les característiques físiques d’agressor i agredida. Si pots, fes una fotografia sense ser vist/a. ", Toast.LENGTH_LONG);
//
//                toast4.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);
//
//                toast4.show();
//            }
//        });
//


    }




}
