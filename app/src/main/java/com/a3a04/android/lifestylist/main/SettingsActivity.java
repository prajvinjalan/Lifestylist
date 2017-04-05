package com.a3a04.android.lifestylist.main;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import com.a3a04.android.lifestylist.R;

public class SettingsActivity extends AppCompatActivity {

    ActionBar mActionBar;
    EditText input1,input2,input3,input4,input5;
    ToggleButton sleep,meal,workout;
    SeekBar Fitbit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mActionBar = getSupportActionBar();
        mActionBar.setTitle("Settings");
        mActionBar.setIcon(R.drawable.ic_home_white_24dp);
        mActionBar.setHomeButtonEnabled(true);
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.show();


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
