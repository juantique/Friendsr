package com.example.prueba.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.prueba.R;
import com.example.prueba.datos.DataImagenes;

public class ActividadDetalle extends AppCompatActivity {

    public static final String EXTRA_PARAM_ID = "com.example.prueba.extra.ID";
    public static final String VIEW_NAME_HEADER_IMAGE = "imagen_compartida";
    private DataImagenes itemDetallado;
    private ImageView imagenDetalle;
    private TextView txtNombrePersonaDetalle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle("Detalle");

        // Obtener el dato de la imagen con el identificador establecido en la actividad principal
        itemDetallado = DataImagenes.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        imagenDetalle = (ImageView) findViewById(R.id.imagen_detalle);
        txtNombrePersonaDetalle = (TextView) findViewById(R.id.nombre_persona_detalle);
        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle("Detalle");
        cargarImagenDetalle();
        cargarTextoDetalle();
    }

    private void cargarImagenDetalle() {
        Glide.with(imagenDetalle.getContext())
                .load(itemDetallado.getIdDrawable())
                .into(imagenDetalle);
    }

    private void cargarTextoDetalle() {
        txtNombrePersonaDetalle.setText(itemDetallado.getNombreCompleto() + " was born on " + itemDetallado.getFechaNacimiento());
    }


}
