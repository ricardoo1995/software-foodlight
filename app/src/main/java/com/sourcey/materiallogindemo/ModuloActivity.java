package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by David on 01/02/2018.
 */

public class ModuloActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulos);
    }
    public void onClick(View view){
        Intent miIntent=null;
        switch(view.getId()){
            case R.id.button5:
                miIntent=new Intent(ModuloActivity.this,EjercicioActivity.class);
                break;//
            case R.id.button6:
                miIntent=new Intent(ModuloActivity.this,EjercicioActivity.class);
                break;



        }
        startActivity(miIntent);




    }
}
