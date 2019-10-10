package com.siscompal.clarorecarga.ui;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.siscompal.clarorecarga.PaqueteFragment;
import com.siscompal.clarorecarga.PaqueteListFragment;
import com.siscompal.clarorecarga.R;
import com.siscompal.clarorecarga.ui.profile.ProfileFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_paquetes:
                        addFragment(new PaqueteFragment());
                        break;
                    case R.id.navigation_recargas:
                        addFragment(new RecargaFragment());
                        break;
                    case R.id.navigation_profile:
                        addFragment(new ProfileFragment());

                        break;
                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.navigation_paquetes);


    }
    private void addFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();


    }




}