package com.example.estebanjojoa.bottonnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView botto_navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botto_navigation = (BottomNavigationView) findViewById(R.id.botton_navigation);
        botto_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Item_shop:
                         Fragment1 fragment1 = new Fragment1();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment1)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_buy:
                        Fragment2 fragment2 = new Fragment2();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment2)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_fav:
                        Fragment3 fragment3 = new Fragment3();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment3)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;

                    case R.id.Item_user:
                        Fragment4 fragment4 = new Fragment4();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment4)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                }
                return true;
            }

        });

    }

}
