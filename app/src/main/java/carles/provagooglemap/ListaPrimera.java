package carles.provagooglemap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListaPrimera extends Activity {
	
	private ListView lista; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        
        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();  
        
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "PIAD Nou Barris", "Pl. Major de Nou Barris, 1 (Seu del Districte de Nou Barris)\n" +
                "Tel. 93 291 68 67","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "PIAD Nou Barris", " – Zona Nord (Ciutat Meridiana)\n Av. Rasos de Peguera, 25 (Centre de Serveis Socials)\n" +
                "Tel. 93 619 73 11","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "CUERVO", "El cuervo . Presente en tospecies en Am�rica y dos en el Viejo Mundo. Tienen cr�neo desmognato holorrino, con 16 a 20 v�rtebras cervicales y pies anisod�ctilos.","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "KIWI", "Los kiwis (Apterix, gr. 'sin alas') son un g�nero de aves paleognatas compuesto por cinco especies end�micas de Nueva Zelanda.1 2 Son aves no voladoras peque�as, aproximadamente del tama�o de una gallina. Antes de la llegada de los humanos alrededor del a�o 1300, en Nueva Zelanda los �nicos mam�feros que hab�a eran murci�lagos, y los nichos ecol�gicos que en otras partes del mundo eran ocupados por animales tan diversos como caballos, lobos y ratones fueron utilizados en Nueva Zelanda por p�jaros (y en menor proporci�n por ciertas especies de reptiles). La denominaci�n kiwi es maor�, idioma del pueblo hom�nimo de linaje malayopolinesio que coloniz� Nueva Zelanda antes de la llegada de los europeos.","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "LORO", "Las Psit�cidas (Psittacidae) son una familia de aves psitaciformes llamadas com�nmente loros o papagayos, e incluye a los guacamayos, las cotorras, los periquitos, los agapornis y formas afines.","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "PAVO", "Pavo es un g�nero de aves galliformes de la familia Phasianidae, que incluye dos especies, el pavo real com�n (Pavo cristatus) y el pavo real cuelliverde (Pavo muticus).1","COLIBR�"));
        datos.add(new Lista_entrada(R.drawable.localitzagoogle, "PING�INO", "Los ping�inos (familia Spheniscidae, orden Sphenisciformes) son un grupo de aves marinas, no voladoras, que se distribuyen �nicamente en el Hemisferio Sur, sobre todo en sus altas latitudes.","COLIBR�"));
        
        lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){
			@Override
			public void onEntrada(Object entrada, View view) {
		        if (entrada != null) {
		            TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior); 
		            if (texto_superior_entrada != null) 
		            	texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima()); 
		              
		            TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
		            if (texto_inferior_entrada != null)
		            	texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                    TextView texto_mapa_google = (TextView) view.findViewById(R.id.textView_mapaGoogle);
                    if (texto_mapa_google != null)
                        texto_mapa_google.setText(((Lista_entrada) entrada).getMapaGoogle());

                    ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
		            if (imagen_entrada != null)
		            	imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());
		        }
			}
		});
        
        lista.setOnItemClickListener(new OnItemClickListener() { 
			@Override
			public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
				Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion); 
                
                CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo()+elegido.getMapaGoogle();
                Toast toast = Toast.makeText(ListaPrimera.this, texto, Toast.LENGTH_LONG);
                toast.show();
			}
        });
        
        
        
    }
    
}

