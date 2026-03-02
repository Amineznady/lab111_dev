package com.example.hellotoast; // Vérifie que c'est le bon package
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variable pour stocker la valeur du compteur
    private int count = 0;

    // Référence vers le TextView
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des composants
        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Bouton Toast
        buttonToast.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Bonjour !", Toast.LENGTH_SHORT).show()
        );

        // Bouton Compteur
        buttonCount.setOnClickListener(v -> {
            count++;
            textCount.setText(String.valueOf(count));
        });
    }
}