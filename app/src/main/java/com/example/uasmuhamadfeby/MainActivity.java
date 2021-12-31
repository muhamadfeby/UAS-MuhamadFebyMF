package com.example.uasmuhamadfeby;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtJumlah, txtHarga, txtGetNama;
    EditText edtNama;
    Button btnTambah, btnKurang;
    CheckBox cbx_Item1, cbx_Item2, cbx_Item3;
    int jumlah, total, harga = 10, Item1, Item2, Item3;
    boolean iscbx_Item1, iscbx_Item2, iscbx_Item3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtJumlah = (TextView) findViewById(R.id.txt_jumlah);
        txtHarga = (TextView) findViewById(R.id.txt_price);
        edtNama = (EditText) findViewById(R.id.txt_nama);
        txtGetNama = (TextView) findViewById(R.id.txt_getNama);
        cbx_Item1 = (CheckBox) findViewById(R.id.cbx_Item1);
        cbx_Item2 = (CheckBox) findViewById(R.id.cbx_Item2);
        cbx_Item3 = (CheckBox) findViewById(R.id.cbx_Item3);
    }

    public void Tambah (View view){
        jumlah = jumlah + 1;
        txtJumlah.setText("" + jumlah);
    }

    public void Kurang (View view){
        jumlah = jumlah - 1;
        txtJumlah.setText("" + jumlah);
    }

    public void order (View view){
        display(harga);
    }

    public void display ( int harga){
        total = jumlah * harga;
        if (iscbx_Item1) {
            total += (jumlah * Item1);
        }
        if (iscbx_Item1) {
            total +=(jumlah * Item2);
        }
        if (iscbx_Item2){
            total +=(jumlah * Item1);
        }
        if (iscbx_Item2) {
            total += (jumlah * Item2);
        }
        if (iscbx_Item3) {
            total += (jumlah * Item3);
        }

        txtHarga.setText("Harga : Rp." + total +"000");


    }
}
