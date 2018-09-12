package com.zermeno.isaac.evidencia1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        Usuario u = intent.getParcelableExtra("user");

        ((TextView) findViewById(R.id.outputNombre)).setText(u.nombre);
        ((TextView) findViewById(R.id.outputPrimerApellido)).setText(u.pApellido);
        ((TextView) findViewById(R.id.outputSegundoApellido)).setText(u.sApellido);
        ((TextView) findViewById(R.id.outpuFecha)).setText(u.nFecha);
        ((TextView) findViewById(R.id.outputEstado)).setText(u.estado);
        ((TextView) findViewById(R.id.outputGenero)).setText(u.genero);


        /*((TextView)findViewById(R.id.outputNombre)).setText(u.nombre);
        u.pApellido = ((EditText)findViewById(R.id.inputPrimerApellido)).getText().toString();
        u.sApellido = ((EditText)findViewById(R.id.inputSegundoApellido)).getText().toString();
        u.nFecha = ((EditText)findViewById(R.id.inputFecha)).getText().toString();
        u.estado = ((Spinner)findViewById(R.id.spEstado)).getSelectedItem().toString();
        u.genero = ((RadioButton)findViewById(((RadioGroup)findViewById(R.id.grupoGenero)).getCheckedRadioButtonId())).getText().toString();*/

        //((TextView)findViewById(R.id.outputEdad)).setText(u.edad);


    }

    //MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
