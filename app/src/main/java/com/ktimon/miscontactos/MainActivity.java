package com.ktimon.miscontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto("Pirula da Silva", "7777999", "pirula@gmail.com"));
        contactos.add(new Contacto("Tarzan Bosque", "22227777", "tarzan@gmail.com"));
        contactos.add(new Contacto("Zorro de la Vega", "55558888", "zorro@gmail.com"));
        contactos.add(new Contacto("Batman Bruce", "66664444", "batman@gmail.com"));
        contactos.add(new Contacto("Ana Frozen", "88884444", "afrozen@gmail.com"));

        ArrayList<String>[] nombresContacto = new ArrayList<>().toArray(new ArrayList[0]);
        for (Contacto contacto : contactos) {
            nombresContacto.add (contacto.getNombre());
        }

        ListView listView = (ListView) findViewById(R.id.lstContactos);
        ListView lstContactos;
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.Layout.simple_list_item_1, nombresContacto
        +  ));

    }
}