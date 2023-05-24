package com.example.mt2;

import static com.google.android.material.bottomnavigation.BottomNavigationView.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarMenu;
import com.google.android.material.navigation.NavigationBarView;




public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private FragmentManager fragmentManager = getSupportFragmentManager();

    private MainMenuCamera fragmentCamera = new MainMenuCamera();

    private MainMenuSearch fragmentSearch = new MainMenuSearch();

    private MainMenu fragmentMenu = new MainMenu();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //처음화면
        getSupportFragmentManager().beginTransaction().add(R.id.menu_frame_layout, new MainMenuSearch()).commit();
        bottomNavigationView = findViewById(R.id.menu_bottom_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    if (item.getItemId() == R.id.menu_search) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentSearch).commitAllowingStateLoss();
                        return true;
                    }
                    if (item.getItemId() == R.id.menu_camera) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentCamera).commitAllowingStateLoss();
                        return true;
                    }
                    if (item.getItemId() == R.id.menu_menu) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.menu_frame_layout, fragmentMenu).commitAllowingStateLoss();
                        return true;
                    }

                    return false;

            }
        });

    };

}