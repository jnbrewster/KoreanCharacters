package com.happydad.koreancharacters;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class OpenHelpPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.open_help);
        Log.w("OpenHelpPage", "has started");

        Toast.makeText(this, "Help selected", Toast.LENGTH_SHORT)
                .show();

        // get action bar
        ActionBar actionBar = getActionBar();

        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
