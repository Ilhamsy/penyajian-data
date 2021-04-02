package com.example.penyajiandata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tNama, tNIM, tNilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tNama = findViewById(R.id.tnama);
        tNIM = findViewById(R.id.tnim);
        tNilai = findViewById(R.id.tnilai);

        String nama, nim, t_ipk;
        double ipk;

        nama = getIntent().getStringExtra("nama");
        tNama.setText(nama);

        nim = getIntent().getStringExtra("nim");
        tNIM.setText(nim);

        t_ipk = getIntent().getStringExtra("nilai");
        ipk = Double.parseDouble(t_ipk);
        if (ipk > 3.66 && ipk <= 4) {
            tNilai.setText("A");
        } else if (ipk > 3.33 && ipk <= 3.66) {
            tNilai.setText("A-");
        } else if (ipk > 3 && ipk <= 3.33) {
            tNilai.setText("B+");
        } else if (ipk > 2.66 && ipk <= 3) {
            tNilai.setText("B");
        } else if (ipk > 2.33 && ipk <= 2.66) {
            tNilai.setText("B-");
        } else if (ipk > 2 && ipk <= 2.33) {
            tNilai.setText("C+");
        } else if (ipk > 1.66 && ipk <= 2) {
            tNilai.setText("C");
        } else if (ipk > 1.33 && ipk <= 1.66) {
            tNilai.setText("C-");
        } else if (ipk > 1 && ipk <= 1.33) {
            tNilai.setText("D+");
        } else if (ipk == 1) {
            tNilai.setText("D");
        }
    }
}