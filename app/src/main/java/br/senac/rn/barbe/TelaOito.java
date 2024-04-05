package br.senac.rn.barbe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelaOito extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextData;
    private EditText editTextHora;
    private Spinner spinnerFormaPagamento;
    private TextView textViewCriar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_oito);

        editTextUsuario = findViewById(R.id.editUsuario);
        editTextData = findViewById(R.id.editData);
        editTextHora = findViewById(R.id.editHora);
        spinnerFormaPagamento = findViewById(R.id.spinnerFormaPagamento);
        textViewCriar = findViewById(R.id.textView5);

        // Configuração do Spinner com as opções de forma de pagamento
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.formas_pagamento_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFormaPagamento.setAdapter(adapter);

        // Configuração do evento de clique do botão "Criar"
        textViewCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String data = editTextData.getText().toString();
                String hora = editTextHora.getText().toString();
                String formaPagamento = spinnerFormaPagamento.getSelectedItem().toString();

                // Verifica se algum campo está vazio
                if (usuario.isEmpty() || data.isEmpty() || hora.isEmpty()) {
                    Toast.makeText(TelaOito.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else {
                    // Aqui você pode adicionar a lógica para processar os dados do agendamento
                    // Por exemplo, você pode criar um objeto Agendamento e passar esses dados para ele
                    //Agendamento agendamento = new Agendamento(usuario, data, hora, formaPagamento);

                    // Depois de processar os dados, você pode iniciar uma nova atividade ou fazer o que for necessário
                   Intent intent = new Intent(TelaOito.this, TelaDez.class);
                    //intent.putExtra("agendamento", agendamento); // Passa o objeto Agendamento para a próxima atividade
                    startActivity(intent);
                }
            }
        });
    }
}
