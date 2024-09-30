package com.example.calculimpots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText adresse, surface, nbrPieces;
    private TextView impotBase, impotSupp, impotTotal;
    private CheckBox piscine;
    private Button calculBn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adresse = findViewById(R.id.adressET);
        surface = findViewById(R.id.surfaceET);
        nbrPieces = findViewById(R.id.nbrPiecesET);
        impotBase = findViewById(R.id.baseTV);
        impotSupp = findViewById(R.id.suppTV);
        impotTotal = findViewById(R.id.totalTV);
        piscine = findViewById(R.id.piscineCB);
        calculBn = findViewById(R.id.calculBn);

        calculBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float impot_base = Float.parseFloat(surface.getText().toString())*2;
                float impot_supp = Float.parseFloat(nbrPieces.getText().toString())*50;
                if(piscine.isChecked())
                    impot_supp+=100;
                float impot_total = impot_base + impot_supp;
                impotBase.setText("Surface de base: "+ String.valueOf(impot_base));
                impotSupp.setText("Surface supplémentaire: "+ String.valueOf(impot_supp));
                impotTotal.setText("Surface totale: "+ String.valueOf(impot_total));


            }
        });
    }
}