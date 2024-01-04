package kh.edu.rupp.ite.kh_ontime.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import kh.edu.rupp.ite.kh_ontime.R;
import kh.edu.rupp.ite.kh_ontime.databinding.ActivityMainBinding;
import kh.edu.rupp.ite.kh_ontime.fragment.HomeFragment;
import kh.edu.rupp.ite.kh_ontime.fragment.InboxFragment;
import kh.edu.rupp.ite.kh_ontime.fragment.ProfileFragment;
import kh.edu.rupp.ite.kh_ontime.fragment.SearchFragment;
import kh.edu.rupp.ite.kh_ontime.fragment.SettingFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Setup Listeners
        binding.bottomNavigationView.setOnItemSelectedListener(item ->{

            if (item.getItemId() == R.id.menuHome){
                showFragment(new HomeFragment());
            }else if (item.getItemId() == R.id.menuSearch) {
                showFragment(new SearchFragment());
            }else if (item.getItemId() == R.id.menuInbox){
                showFragment(new InboxFragment());
            }else if (item.getItemId() == R.id.menuSetting) {
                showFragment(new SettingFragment());
            }
            return true;
        });
    }
    
    private void showFragment(Fragment fragment) {

        // FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Create fragment object
        HomeFragment homeFragment = new HomeFragment();

        // Replace HomeFragment in lytActivity
        fragmentTransaction.replace(R.id.lytActivity, fragment);

        // commit transaction
        fragmentTransaction.commit();


    }



}