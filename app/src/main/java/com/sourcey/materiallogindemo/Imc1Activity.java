package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Imc1Activity extends AppCompatActivity {

    TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc1);
        final float[] imc=new float[1];
        Button btCalc0ular= (Button) findViewById(R.id.btCalcular);
        btCalc0ular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
                int peso =Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0]=peso/(altura*altura);

                if (imc[0] < 18.5) {

                    tvResultado.setText(imc[0] + "");
                    tvDescripcion.setText("Desnutricion");
                } else {
                    if (imc[0] < 25) {
                        tvResultado.setText(imc[0] + "");
                        tvDescripcion.setText("Peso adecuado");
                    } else {
                        if (imc[0] < 30) {
                            tvResultado.setText(imc[0]+"");
                            tvDescripcion.setText("Sobrepeso");

                        }else{
                            tvResultado.setText(imc[0]+"");
                            tvDescripcion.setText("OBESIDAD");
                        }


                    }


                }


                // });
            }



        });
        /*Intent i = new Intent(Imc1Activity.this,LoginActivity.class);
        startActivity(i);

        button2 =(TextView) findViewById (R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent i = new Intent(Imc1Activity.this,ImcActivity.class);
                startActivity(i);

            }





        });*/

    }}