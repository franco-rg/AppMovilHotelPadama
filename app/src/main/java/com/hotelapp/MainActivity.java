package com.hotelapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity implements Navigation {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new Inicio())
                    .commit();
        }
    }
    /**
     *
     * Aquí va el fragmento de navegación
     * @param fragment Fragmento a donde vamos a navegar
     * @param addToBackstack Si podemos ir hacia atras o no
     */
    @Override
    public void navigateTo(Fragment fragment, boolean addToBackstack){
        FragmentTransaction transaction =
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, fragment);

        if(addToBackstack){
            transaction.addToBackStack(null);
        }

        transaction.commit();
    }
}