package carles.provagooglemap;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by carles on 13/12/2017.
 */

public class MenuActivity2 extends AppCompatActivity {


    private Typeface merryweather;
    private Typeface merryweatherRegular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escull_districte);

// Seteamos en una Variable donde tenemos la fuente (podemos omitir este paso y ponerla directamente cuando cargamos la fuente)

        String merrieweatherbold = "fonts/merriweatherbold.ttf";
        String merrieweatheregular = "fonts/merriweatherregular.ttf";

// Obtenemos la id del TextView donde queremos cambiar la fuente

        TextView texto = (TextView) findViewById(R.id.esculldistricte);
        TextView texto1 = (TextView) findViewById(R.id.eixample);
        TextView texto2 = (TextView) findViewById(R.id.gracia);
        TextView texto3 = (TextView) findViewById(R.id.noubarris);
        TextView texto4 = (TextView) findViewById(R.id.hortaguinardo);
        TextView texto5 = (TextView) findViewById(R.id.lescorts);
        TextView texto6 = (TextView) findViewById(R.id.santandreu);
        TextView texto7 = (TextView) findViewById(R.id.santsmontjuic);
        TextView texto8 = (TextView) findViewById(R.id.sarria);
        TextView texto9 = (TextView) findViewById(R.id.ciutatvella);


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
        texto6.setTypeface(merryweather);
        texto7.setTypeface(merryweatherRegular);
        texto8.setTypeface(merryweatherRegular);
        texto9.setTypeface(merryweatherRegular);

        TextView btn3 = (TextView) findViewById(R.id.noubarris);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (v.getContext(), NouBarrisSeleccio.class);
                startActivityForResult(intent3, 0);
            }
        });

    }


}
