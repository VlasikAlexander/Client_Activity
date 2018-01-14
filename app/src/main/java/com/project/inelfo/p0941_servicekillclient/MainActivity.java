package com.project.inelfo.p0941_servicekillclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        Intent intent = new Intent("com.project.inelfo.p0942_servicekillserver.MyService");
        intent.setPackage("com.project.inelfo");
        Toast.makeText(this, "onClick", Toast.LENGTH_SHORT).show();
        //intent.putExtra("name", "value");
        startService(intent);
    }
}
