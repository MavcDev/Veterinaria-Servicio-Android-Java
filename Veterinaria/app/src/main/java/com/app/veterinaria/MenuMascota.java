package com.app.veterinaria;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuMascota extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mascota);
    }

    public void irRegistrar(View view) {
        Intent intent  = new Intent(this, Mascota.class);
        startActivity(intent);
    }

    public void irModificar(View view) {
        Intent intent  = new Intent(this, ListMascota.class);
        startActivity(intent);
    }

    public void irVer(View view) {
        Intent intent  = new Intent(this, ListMascota.class);
        startActivity(intent);
    }

}
