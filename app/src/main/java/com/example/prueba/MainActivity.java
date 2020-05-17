package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.prueba.actividades.ActividadDetalle;
import com.example.prueba.adaptador.AdaptadorDeImagenes;
import com.example.prueba.datos.DataImagenes;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gridViewImagenes;
    private AdaptadorDeImagenes adaptadorImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridViewImagenes = (GridView) findViewById(R.id.gridImagenes);
        adaptadorImagenes = new AdaptadorDeImagenes(this);
        gridViewImagenes.setAdapter(adaptadorImagenes);
        gridViewImagenes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DataImagenes item = (DataImagenes) parent.getItemAtPosition(position);
        Intent intent = new Intent(this, ActividadDetalle.class);
        intent.putExtra(ActividadDetalle.EXTRA_PARAM_ID, item.getId());
        startActivity(intent);
    }
}
