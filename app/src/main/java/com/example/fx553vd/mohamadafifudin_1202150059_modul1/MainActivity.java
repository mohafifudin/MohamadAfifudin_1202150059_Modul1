package com.example.fx553vd.mohamadafifudin_1202150059_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pesan;
    private EditText jumlahpesan;
    private Button Eatbus;
    private Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesan = findViewById(R.id.Pesanan);
        jumlahpesan = findViewById(R.id.Jumlahpesan);
        Eatbus = findViewById(R.id.btneatbus);
        Abnormal = findViewById(R.id.btnabnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = pesan.getText().toString();
        String jlmpesan = jumlahpesan.getText().toString();
        String RmhMkn = Eatbus.getText().toString();


        intent.putExtra("Makanan", Makanan);
        intent.putExtra("jlmpesan", jlmpesan);
        intent.putExtra("RmhMkn", RmhMkn);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = pesan.getText().toString();
        String jlmpesan = jumlahpesan.getText().toString();
        String RmhMkn = Abnormal.getText().toString();


        intent.putExtra("Makanan", Makanan);
        intent.putExtra("jlmpesan", jlmpesan);
        intent.putExtra("RmhMkn", RmhMkn);

        startActivity(intent);
    }
}