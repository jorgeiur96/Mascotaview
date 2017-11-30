package com.unamjorge.practicas.mascotapetagram;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import Logica.Mascota.PojoMascota;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<PojoMascota> atribu;

    SwipeRefreshLayout sfiMirefres;
    private RecyclerView rvTaxonomia;

    PojoMascota obj =  new PojoMascota();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);




        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvTaxonomia=(RecyclerView)findViewById(R.id.rvTaxonomia);
        LinearLayoutManager lnm=new LinearLayoutManager(this);
        lnm.setOrientation(LinearLayoutManager.VERTICAL);
        rvTaxonomia.setLayoutManager(lnm);

        sfiMirefres=(SwipeRefreshLayout)findViewById(R.id.sfiMirefres);



        sfiMirefres.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Repfrescandocontenido();
            }
        });

        llenar();

        adaptador();
    }



    private void Repfrescandocontenido() {
        adaptador();
        sfiMirefres.setRefreshing(false);
    }

    public  void  adaptador(){
        Mascotaadaptador mascotaadaptador=new Mascotaadaptador(atribu);
        rvTaxonomia.setAdapter(mascotaadaptador);
    }
    public void   llenar(){
        atribu=new ArrayList<PojoMascota>();
        atribu.add(new PojoMascota(R.drawable.img1,"tonbie",5));
        atribu.add(new PojoMascota(R.drawable.img2,"tonbie",6));
        atribu.add(new PojoMascota(R.drawable.img3,"tonbie",3));
        atribu.add(new PojoMascota(R.drawable.img4,"tonbie",4));
        atribu.add(new PojoMascota(R.drawable.img5,"tonbie",1));

    }
}
