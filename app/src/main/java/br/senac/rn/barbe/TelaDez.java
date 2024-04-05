package br.senac.rn.barbe;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TelaDez extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dez);
    }
    public void inicio (View view){
    Intent in = new Intent(TelaDez.this, TelaQuatro.class);
    startActivity(in);
}

public void sobre (View view){
    Intent in = new Intent(TelaDez.this, TelaCinco.class);
    startActivity(in);
}

public void contato (View view){
    Intent in = new Intent(TelaDez.this, TelaSeis.class);
    startActivity(in);
}

public void plano (View view){
        Intent in = new Intent(TelaDez.this, TelaSete.class);
        startActivity(in);
}
}

