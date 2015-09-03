package com.app.veterinaria;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;



public class MenuVeterinaria extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void irMascota(View view) {

        Intent intent  = new Intent(this, MenuMascota.class);
        startActivity(intent);
    }

    public void irPropietario(View view) {
        Intent intent  = new Intent(this, MenuPropietario.class);
        startActivity(intent);
    }

    public void irPersonal(View view) {
        Intent intent  = new Intent(this, MenuPersonal.class);
        startActivity(intent);
    }

    public void irHistorial(View view) {
        Intent intent  = new Intent(this, MenuHistorial.class);
        startActivity(intent);
    }

}
