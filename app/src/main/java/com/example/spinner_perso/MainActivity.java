package com.example.spinner_perso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.spinner_perso.adaptadores.AdaptadorSpinner;
import com.example.spinner_perso.utils.Marca;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerperson;
    ArrayList<Marca> listamarcas;
    AdaptadorSpinner adaptadorSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarlista();
    }

    private void rellenarlista() {
        spinnerperson.setAdapter(adaptadorSpinner);
        listamarcas.add(new Marca("Ford", R.drawable.ford));
        listamarcas.add(new Marca("BMW", R.drawable.bmw));
        listamarcas.add(new Marca("Audi", R.drawable.audi));
        listamarcas.add(new Marca("Mini", R.drawable.mini));
        listamarcas.add(new Marca("Mercedes", R.drawable.mercedes));
        listamarcas.add(new Marca("Toyota", R.drawable.toyota));
        listamarcas.add(new Marca("Volkswagen", R.drawable.vw));
        listamarcas.add(new Marca("Nissan", R.drawable.nissan));
        listamarcas.add(new Marca("Others", R.drawable.car_other));



    }

    private void instancias() {
        spinnerperson = findViewById(R.id.spinner_personalizado);
        listamarcas =  new ArrayList();
        adaptadorSpinner = new AdaptadorSpinner(listamarcas, getApplicationContext());
    }
}
