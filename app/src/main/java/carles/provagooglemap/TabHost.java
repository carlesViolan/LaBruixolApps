package carles.provagooglemap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by carles on 18/12/2017.
 */

public class TabHost extends AppCompatActivity{

    android.widget.TabHost TbH1, TbH2, TbH3;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);

        TbH1 = (android.widget.TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
        TbH1.setup();  //lo activamos

        /*TbH2 = (android.widget.TabHost) findViewById(R.id.tabHost2); //llamamos al Tabhost
        TbH2.setup();  //lo activamos

        TbH3 = (android.widget.TabHost) findViewById(R.id.tabHost3); //llamamos al Tabhost
        TbH3.setup();  //lo activamos*/

        android.widget.TabHost.TabSpec tab1 = TbH1.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
        android.widget.TabHost.TabSpec tab2 = TbH1.newTabSpec("tab2");
        android.widget.TabHost.TabSpec tab3 = TbH1.newTabSpec("tab3");

        tab1.setIndicator("Que faig si...");    //qué queremos que aparezca en las pestañas
        tab1.setContent(R.id.tab1); //definimos el id de cada Tab (pestaña)

        tab2.setIndicator("Entitats_Públiques");
        tab2.setContent(R.id.tab2);

        tab3.setIndicator("Entitats_Privades");
        tab3.setContent(R.id.tab3);

        TbH1.addTab(tab1); //añadimos los tabs ya programados
        TbH1.addTab(tab2);
        TbH1.addTab(tab3);

    }
}
