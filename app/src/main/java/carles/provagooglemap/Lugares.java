package carles.provagooglemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by carles on 20/05/2016.
 */
public class Lugares {

    protected static List<Lugar> vectorLugares;


    final static String TAG = "MisLugares";
    protected static GeoPunto posicionActual = new GeoPunto(0,0);

    public Lugares(){
    }

    static Lugar elemento(int id){

        return vectorLugares.get(id);
    }
    static void anyade(Lugar lugar){

        vectorLugares.add(lugar);
    }
    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }
    static void borrar (int id){

        vectorLugares.remove(id);
    }
    public static int size(){

        return vectorLugares.size();
    }

  static class ComparadorPersonas implements Comparator<Lugar> {
        public int compare(Lugar a, Lugar b) {
            return a.getNombre().compareTo(b.getNombre());
        }
    }

    public static ArrayList<Lugar> ejemploLugares(){

        //Collections.sort(ejemploLugares(), new ComparadorPersonas());

        ArrayList<Lugar> lugares = new ArrayList<Lugar>();

        lugares.add(new Lugar("ABITS", "C/Plza Major de Nou Barris,1 - 08042 - Barcelona",0,0,
                TipoLugar.EDUCACION, 962849300, "http://ajuntament.barcelona.cat/dones/ca/canal/prostitucio-i-explotacio-sexual-abits","Abordatge Integral del Treball Sexual (municipal)",3));

        lugares.add(new Lugar("ASSIR", "avenida Río de Janeiro,83-91,3 08016 Barcelona", 0,0,
                TipoLugar.EDUCACION, 636472405, "https://assirbarcelonaics.wordpress.com/","Atenció a la Salut Sexual i Reproductiva",3));

        lugares.add(new Lugar("CJAS", " La granja,19, baixos Barcelona", 0,0,
                TipoLugar.EDUCACION, 934150000, "http://www.centrejove.org/","Centre Jove d’Anticoncepció i Sexualitat ",5));

        lugares.add(new Lugar("CMAU", "Barcelona", 0,0,
                TipoLugar.EDUCACION, 0, "http://ajuntament.barcelona.cat/dones/ca/canal/serveis-dacolliment-cmau-vm",
                "Centre d’Acolliment de Llarga Estada",4));

        lugares.add(new Lugar("CUESB", "Llacuna,25, Barcelona",  0,0,
                TipoLugar.EDUCACION, 900703030, "http://guia.barcelona.cat/detall/central-d-urgencies-i-emergencies-socials-de-barcelona_92086031399.html","Centre d’Urgències i Emergències Socials de Barcelona",2));

        return lugares;
    }
}
