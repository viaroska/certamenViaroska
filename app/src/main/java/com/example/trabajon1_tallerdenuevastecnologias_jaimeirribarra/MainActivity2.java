package com.example.trabajon1_tallerdenuevastecnologias_jaimeirribarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button BotonVolver;
    private String stNombre;
    private TextView TextLabelNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextLabelNombre=(TextView) findViewById(R.id.TextLabelNombre);
        Context context=getApplicationContext();

        Bundle intentV=this.getIntent().getExtras();
        if (intentV!=null){
            stNombre=intentV.getString("nombre");
            Toast.makeText(context,"Su Nombre es: "+stNombre,Toast.LENGTH_SHORT).show();
        }

        TextLabelNombre.setText("Nombre del estudiante: "+ stNombre);

        BotonVolver = (Button) findViewById(R.id.buttonVolver);
        Intent intentVol=new Intent(this,MainActivity.class);

        BotonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentVol);
            }
        });
    }
}