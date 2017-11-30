package com.unamjorge.practicas.mascotapetagram;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;

import Logica.Mascota.*;


/**
 * Created by Jorge Urueta on 21/11/2017.
 */

/**
 * Created by Jorge Urueta on 21/11/2017.
 */

public class Mascotaadaptador extends RecyclerView.Adapter<Mascotaadaptador.mascotaViewHolder>{
    ArrayList <PojoMascota> atributos;
    Activity activity;


    public Mascotaadaptador(ArrayList<PojoMascota> atributos){
        this.atributos=atributos;

    }



    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        return new mascotaViewHolder(v);
    }
    PojoMascota obj=new PojoMascota();

    @Override
    public void onBindViewHolder(final mascotaViewHolder mascotaholder, final int position) {
        final PojoMascota pojoMascota=atributos.get(position);
        mascotaholder.IMGfotoCard.setImageResource(pojoMascota.getImagen());
        mascotaholder.tvCardviewNombre.setText(pojoMascota.getNombreMascota());
        mascotaholder.tvCardviViewCantidad.setText(String.valueOf(pojoMascota.getCantidad()));



        mascotaholder.ImgbntCardview.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                PojoMascota puppiesBuilder = new PojoMascota();
                puppiesBuilder.setCantidad(pojoMascota.getCantidad()+1);
                pojoMascota.setCantidad(puppiesBuilder.getCantidad());
                mascotaholder.tvCardviViewCantidad.setText(String.valueOf(pojoMascota.getCantidad()));

            }
        });

    }

    @Override
    public int getItemCount() {
        return atributos.size();
    }

    public static  class mascotaViewHolder extends RecyclerView.ViewHolder{


        private ImageView IMGfotoCard;
        private ImageButton ImgbntCardview;
        private  TextView tvCardviewNombre;
        private  TextView tvCardviViewCantidad;
        private  ImageView tvGeneralHueso;

        public mascotaViewHolder(View itemView) {
            super(itemView);

            IMGfotoCard=(ImageView)itemView.findViewById(R.id.IMGfotoCard);
            ImgbntCardview=(ImageButton) itemView.findViewById(R.id.ImgbntCardview);
            tvCardviewNombre=(TextView) itemView.findViewById(R.id.tvCardNombre);
           tvCardviViewCantidad=(TextView) itemView.findViewById(R.id.tvCardCantidad);
           tvGeneralHueso=(ImageView)itemView.findViewById(R.id.ImgGeneralHueso);
           // urlImagen =itemView.findViewById(R.id.urlImagen);
        }


    }


}