package com.javiernunez.puppies.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javiernunez.puppies.R;
import com.javiernunez.puppies.adapter.MascotaAdaptador;
import com.javiernunez.puppies.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Javier Núñez on 22/05/2016.
 */
public class FragmentRecyclerView extends Fragment{
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container,false);

        //return super.onCreateView(inflater, container, savedInstanceState);


        listaMascotas= (RecyclerView) v.findViewById(R.id.rvMascotas);


        //GridLayoutManager lm = new GridLayoutManager(this,2);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        lm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(lm);
        inicializaListaMascotas();
        inicializarAdaptador();

        return v;

    }
    public void inicializarAdaptador(){
        //crea objeto mascotaAdaptador para que reciba la lista y que pueda hacer lo configurado
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializaListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota1,"Scooby", 3));
        mascotas.add(new Mascota(R.drawable.mascota2,"Infantil", 2));
        mascotas.add(new Mascota(R.drawable.mascota3,"Hamster", 4));
        mascotas.add(new Mascota(R.drawable.mascota4,"Marroncete", 5));
        mascotas.add(new Mascota(R.drawable.mascota5,"Tristón", 1));
        mascotas.add(new Mascota(R.drawable.mascota6,"Juguetón", 4));

    }
}
