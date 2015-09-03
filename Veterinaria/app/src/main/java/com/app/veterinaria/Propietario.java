package com.app.veterinaria;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class Propietario extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propietario);

        Spinner cdTipo = (Spinner) findViewById(R.id.cbTipo);
        List<String> listTipo = new ArrayList<String>();
        listTipo.add("Cedula");
        listTipo.add("Tarjeta Identidad");
        listTipo.add("Pasaporte");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listTipo);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cdTipo.setAdapter(dataAdapter);
    }

}
