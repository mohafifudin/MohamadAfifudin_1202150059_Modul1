package com.example.fx553vd.mohamadafifudin_1202150059_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Makanan = intent.getStringExtra("Makanan");
        String jlmpesan = intent.getStringExtra("jlmpesan");
        String RmhMkn = intent.getStringExtra("RmhMkn");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Jpesan = findViewById(R.id.Jumlah);
        TextView Tempatmakan = findViewById(R.id.RumahMakan2);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int a = Integer.parseInt(jlmpesan);

        int HargaEatbus = 50000 * a;
        String b = String.valueOf(HargaEatbus);

        int c = Integer.parseInt(jlmpesan);
        int HargaAbnormal = 30000 * c;
        String d = String.valueOf(HargaAbnormal);


        if (RmhMkn.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Makanan);
                Jpesan.setText(jlmpesan);
                Tempatmakan.setText(RmhMkn);
                Hitung.setText(b);
                Toast.makeText(this, "Jangan makan disini makan malamnya , uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Jpesan.setText(jlmpesan);
                Tempatmakan.setText(RmhMkn);
                Hitung.setText(b);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Makanan);
                Jpesan.setText(jlmpesan);
                Tempatmakan.setText(RmhMkn);
                Hitung.setText(d);
                Toast.makeText(this, "Jangan makan disini makan malamnya , uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Jpesan.setText(jlmpesan);
                Tempatmakan.setText(RmhMkn);
                Hitung.setText(d);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }
        }

    }

}