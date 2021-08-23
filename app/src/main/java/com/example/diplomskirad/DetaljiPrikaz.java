package com.example.diplomskirad;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DetaljiPrikaz extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalji_prikaz);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Detalji za: "+ ZarazeneDrzave.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(ZarazeneDrzave.countryModelsList.get(positionCountry).getTodayDeaths());


    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
