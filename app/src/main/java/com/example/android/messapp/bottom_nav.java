package com.example.android.messapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class bottom_nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        new MaterialTapTargetPrompt.Builder(bottom_nav.this)
                .setTarget(findViewById(R.id.fab))
                .setPrimaryText("Favourites")
                .setSecondaryText("Tap to view your favourite meals and get notified everytime they are on the menu")
                .setPromptStateChangeListener(new MaterialTapTargetPrompt.PromptStateChangeListener()
                {
                    @Override
                    public void onPromptStateChanged(MaterialTapTargetPrompt prompt, int state)
                    {
                        if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED)
                        {
                            // User has pressed the prompt target
                        }
                    }
                })
                .show();
    }
}
