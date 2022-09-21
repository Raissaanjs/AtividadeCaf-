package br.com.senac.coffeatividade;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    CoffeFragment coffeFragment = new CoffeFragment();
    MuffinFragment muffinFragment = new MuffinFragment();
    ChaFragment chaFragment = new ChaFragment();
    DonutsFragment donutsFragment = new DonutsFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.idBottomNavView);

        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,
                coffeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.Coffee:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, coffeFragment)
                                .commit();
                        return true;
                    case R.id.Muffin:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, muffinFragment)
                                .commit();
                        return true;
                    case R.id.Cha:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, chaFragment)
                                .commit();
                        return true;
                    case R.id.Donuts:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, donutsFragment)
                                .commit();
                        return true;


            }
                return false;
            }
        });
}}