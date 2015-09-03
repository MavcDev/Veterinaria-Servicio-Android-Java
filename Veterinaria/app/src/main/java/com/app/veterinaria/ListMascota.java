package com.app.veterinaria;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.text.TextWatcher;
import android.text.Editable;
import java.util.Locale;

import com.app.veterinaria.tools.AdapterListBean;
import com.app.veterinaria.tools.DataViewList;

import java.util.ArrayList;


public class ListMascota extends ActionBarActivity {

    private ListView listData;
    private EditText textBuscar;
    private AdapterListBean adapterListBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mascota);
        try {
            ArrayList<DataViewList> dataViewLists = new ArrayList<DataViewList>();

            listData = (ListView) findViewById(R.id.listMascota);
            textBuscar = (EditText) findViewById(R.id.textBuscar);

            Log.e("err1","Cargo Componentes");

            for (int i = 0; i < 30; i++) {
                dataViewLists.add(new DataViewList(i + "", i + "", i + ""));
            }

            Log.e("err1","Cargo list");

            adapterListBean = new AdapterListBean(this, dataViewLists, null, "Codigo: ", "Valor: ", false);

            Log.e("err1","Crgo el adapter");

            listData.setAdapter(adapterListBean);

            textBuscar.addTextChangedListener(new TextWatcher() {

                @Override
                public void afterTextChanged(Editable arg0) {
                    String text = textBuscar.getText().toString().toLowerCase(Locale.getDefault());
                    adapterListBean.filter(text);
                }

                @Override
                public void beforeTextChanged(CharSequence arg0, int arg1,
                                              int arg2, int arg3) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                    // TODO Auto-generated method stub
                }
            });
        }catch (Exception er){
            Log.e("errExceptio",er.getMessage());
        }
    }
}
