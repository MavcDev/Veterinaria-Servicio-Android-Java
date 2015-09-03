package com.app.veterinaria;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logear(View view) {
        Intent intent  = new Intent(this, MenuVeterinaria.class);
        intent.putExtra("nick", "");
        startActivity(intent);
    }

}
