package com.example.spinner_perso.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spinner_perso.MainActivity;
import com.example.spinner_perso.R;
import com.example.spinner_perso.utils.Marca;

import java.util.ArrayList;

public class AdaptadorSpinner extends BaseAdapter {

    ArrayList<Marca> listaDatos;
    Context context;

    public AdaptadorSpinner(ArrayList<Marca> listaDatos, Context c) {
        this.listaDatos = listaDatos;
        this.context = c;
    }



    @Override
    // Numero de elementos/filas que tendrá del spinner
    //del Array de elementos (de marcas)
    public int getCount() {
        return listaDatos.size();
    }

    @Override
    //Obtiene el objeto de la posicion correspondiente (position)
    //lista.get(position)
    public Object getItem(int position) {
        return listaDatos.get(position);
    }

    @Override
    //Obtiene el id del elemento de la posicion correspondiente
    //lista.get(position).getID();
    public long getItemId(int position) {
        return position;
    }

    @Override
    //Renderiza cada una de las filas
    //Traigo el XML creado
    public View getView(int position, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.spinner_personalizado, viewGroup, false);

        Marca mActual = listaDatos.get(position);
        TextView nombre = view.findViewById(R.id.texto_spinner);
        ImageView imagen = view.findViewById(R.id.imagen_spinner);

        nombre.setText(mActual.getNombre());
        imagen.setImageResource(mActual.getLogo());

        mActual.getLogo();
        mActual.getNombre();
        return view;
    }
}
