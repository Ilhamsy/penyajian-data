package com.example.penyajiandata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editNama, editNIM, editNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.submit);
        editNama = findViewById(R.id.nama);
        editNIM = findViewById(R.id.nim);
        editNilai = findViewById(R.id.nilai);
    }

    public void SUBMIT(View view) {
        try {
            String sNama = editNama.getText().toString();
            String sNIM = editNIM.getText().toString();
            String sNilai = editNilai.getText().toString();
            /*double ipk = Double.parseDouble(sNilai);

            if (ipk > 3.66 && ipk <= 4) {
                nilai.setText("A");
            } else if (ipk > 3.33 && ipk <= 3.66) {
                nilai.setText("A-");
            } else if (ipk > 3 && ipk <= 3.33) {
                nilai.setText("B+");
            } else if (ipk > 2.66 && ipk <= 3) {
                nilai.setText("B");
            } else if (ipk > 2.33 && ipk <= 2.66) {
                nilai.setText("B-");
            } else if (ipk > 2 && ipk <= 2.33) {
                nilai.setText("C+");
            } else if (ipk > 1.66 && ipk <= 2) {
                nilai.setText("C");
            } else if (ipk > 1.33 && ipk <= 1.66) {
                nilai.setText("C-");
            } else if (ipk > 1 && ipk <= 1.33) {
                nilai.setText("D+");
            } else if (ipk == 1) {
                nilai.setText("D");
            }*/
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nama",sNama);
            intent.putExtra("nim",sNIM);
            intent.putExtra("nilai",sNilai);
            startActivity(intent);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(),"Field tidak boleh kosong",Toast.LENGTH_SHORT).show();
        }
    }
}