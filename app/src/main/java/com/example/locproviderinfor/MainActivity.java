package com.example.locproviderinfor;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textInfo;
    LocationManager locManager;
    List<String> locProviserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInfo = findViewById(R.id.textInfo);

        locManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        locProviserList = locManager.getAllProviders();
        textInfo.setText(" ");
        for(String locProvider : locProviserList){
            textInfo.append("Loc. Provider: "+locProvider+ "\n");
            textInfo.append("Enable: "+locManager.isProviderEnabled(locProvider)+ "\n\n");
        }


    }
}