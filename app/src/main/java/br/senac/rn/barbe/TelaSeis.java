package br.senac.rn.barbe;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class TelaSeis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_seis);

        final EditText editTextNome = findViewById(R.id.editNome1);
        final EditText editTextMensagem = findViewById(R.id.editMensagem1);
        final EditText editTextEmail = findViewById(R.id.editEmail1); // Novo campo para o email
        TextView textViewLogin = findViewById(R.id.textView6);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String mensagem = editTextMensagem.getText().toString();
                String email = editTextEmail.getText().toString(); // Obtendo o texto do campo de email

                if (nome.equals("oi") && email.equals("oi@email.com") && mensagem.equals("")) {
                    // Aqui você pode adicionar a lógica para verificar o email, se necessário

                    Intent in = new Intent(TelaSeis.this, TelaSeis.class);
                    startActivity(in);
                } else {
                    // Adicione uma mensagem de falha de login
                    Toast.makeText(TelaSeis.this, "Mensagem enviada", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    public void inicio (View view){
        Intent in = new Intent(TelaSeis.this, TelaQuatro.class);
        startActivity(in);
    }

    public void sobre(View view){
        Intent in = new Intent(TelaSeis.this, TelaCinco.class);
        startActivity(in);
    }
    public void contato(View view){
        Intent in = new Intent(TelaSeis.this, TelaSeis.class);
        startActivity(in);
    }
    public  void plano (View view){
        Intent in = new Intent(TelaSeis.this, TelaSete.class);
        startActivity(in);
    }
}