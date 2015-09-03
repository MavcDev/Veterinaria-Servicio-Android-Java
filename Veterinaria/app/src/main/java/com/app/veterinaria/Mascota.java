package com.app.veterinaria;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;


public class Mascota extends ActionBarActivity {

    private EditText id,nombre,raza,especie,color,edad;
    private Switch estado;
    private Spinner cbSexo,cbPropietario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota);


        loadComponent();
        loadComboBoxSexo();
    }

    public void loadComponent(){
        id = (EditText) findViewById(R.id.textId);
        nombre = (EditText) findViewById(R.id.textNombre);
        raza = (EditText) findViewById(R.id.textRaza);
        especie = (EditText) findViewById(R.id.textEspecie);
        edad = (EditText) findViewById(R.id.textEdad);
        color = (EditText) findViewById(R.id.textColor);
        cbSexo = (Spinner) findViewById(R.id.cbSexo);
        cbPropietario = (Spinner) findViewById(R.id.cbPropietario);
    }

    public void loadComboBoxSexo(){
        List<String> listSexo = new ArrayList<String>();
        listSexo.add("Macho");
        listSexo.add("Hembra");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listSexo);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cbSexo.setAdapter(dataAdapter);
    }

    public void estadoVista(){

    }

    public  void estadoUpdate(){

    }

    public  void estadoInsert(){

    }

    public String JsonMascota(){
        return "";
    }
}
