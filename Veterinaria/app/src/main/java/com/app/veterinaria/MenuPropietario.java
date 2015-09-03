package com.app.veterinaria;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuPropietario extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_propietario);
    }

    public void irRegistrar(View view) {
        Intent intent  = new Intent(this, Propietario.class);
        startActivity(intent);
    }

    public void irModificar(View view) {
        Intent intent  = new Intent(this, ListPropietario.class);
        startActivity(intent);
    }

    public void irVer(View view) {
        Intent intent  = new Intent(this, ListPropietario.class);
        startActivity(intent);
    }
}
