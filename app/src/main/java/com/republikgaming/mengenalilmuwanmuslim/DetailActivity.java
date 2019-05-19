package com.republikgaming.mengenalilmuwanmuslim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    TextView tampilNama, tampilDeskripsi, tampilDeskripsi2, tampilLahir, tampilWafat, tampilKarya;
    CircleImageView tampilIvy;
    String tampilNamaString, tampilDeskripsiString, tampilDeskripsi2String, tampilLahirString, tampilWafatString, tampilKaryaString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tampilNama = findViewById(R.id.nama_detail);
        tampilDeskripsi = findViewById(R.id.tampil_deskripsi);
        tampilDeskripsi2 = findViewById(R.id.tampil_deskripsi2);
        tampilLahir = findViewById(R.id.tahun_lahir);
        tampilWafat = findViewById(R.id.tahun_wafat);
        tampilKarya = findViewById(R.id.tampil_karya);
        tampilIvy = findViewById(R.id.ic_gambar_detail);

        getData();
    }
    @SuppressLint("NewApi")
    public void getData(){
        Bundle bundle = getIntent().getExtras();
        Intent intent = getIntent();
        tampilNamaString = bundle.getString("nama");
        tampilDeskripsiString = bundle.getString("deskripsi");
        tampilDeskripsi2String = bundle.getString("deskripsi2");
        tampilLahirString = bundle.getString("lahir");
        tampilWafatString = bundle.getString("wafat");
        tampilKaryaString = bundle.getString("karya");
        tampilNama.setText(tampilNamaString);
        tampilDeskripsi.setText(tampilDeskripsiString);
        tampilDeskripsi2.setText(tampilDeskripsi2String);
        tampilLahir.setText(tampilLahirString);
        tampilWafat.setText(tampilWafatString);
        tampilKarya.setText(tampilKaryaString);
        Bitmap bitmap = intent.getParcelableExtra("gambar");
        tampilIvy.setImageBitmap(bitmap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.share, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.share) {
            Toast.makeText(this, "Share "+tampilNamaString, Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
