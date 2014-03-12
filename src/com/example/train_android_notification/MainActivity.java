package com.example.train_android_notification;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast a = Toast.makeText(getApplicationContext(), "Test Toast", Toast.LENGTH_LONG);
        final AlertDialog.Builder b = new AlertDialog.Builder (MainActivity.this);
        b.setTitle("Test");
        b.setMessage("Is it ok ?");
        b.setPositiveButton("No",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
				
			}
		});
        b.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
				a.show();
				
			}
		});
        
        Button toast = (Button) findViewById(R.id.toast);
        toast.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				a.show();
			}
		});
        Button alert = (Button) findViewById(R.id.alert);
        alert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				b.create().show();
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
