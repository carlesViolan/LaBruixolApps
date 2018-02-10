package carles.provagooglemap;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static carles.provagooglemap.R.id.imageApp;
import static carles.provagooglemap.R.id.textApp;


public class MainActivity extends Activity {

    private Typeface wireone;
    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

// Seteamos en una Variable donde tenemos la fuente (podemos omitir este paso y ponerla directamente cuando cargamos la fuente)
        String wireOnes = "fonts/WireOne.ttf";

// Obtenemos la id del TextView donde queremos cambiar la fuente
        TextView vistaFuente = (TextView) findViewById(R.id.textApp);

// Cargamos la fuente
        this.wireone = Typeface.createFromAsset(getAssets(), wireOnes);

// Aplicamos la fuente
       // vistaFuente.setTypeface(fuente);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn2 = findViewById(imageApp);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), QueFaigSi.class);
                startActivityForResult(intent2, 0);
            }
        });

        texto1 = (TextView) findViewById(textApp);
        texto1.setTypeface(wireone);

    }


    
}

