package com.example.tagalong;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	ImageButton map_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        map_button =(ImageButton) findViewById(R.id.imageButton1);
        addImageButtonListener();
        
        //Load the test data
        //TestData myTestData = new TestData();
        
        MockData myMockData = new MockData();
        
        MyEventArrayAdapter eventAdapter = new MyEventArrayAdapter(this,myMockData.getEvents());
        setListAdapter(eventAdapter);
        
        //TODO: add array adapter here for the Events list, Watch list and Group list
        //going to need to have an array of dummy data ready to access here.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void addImageButtonListener()
    {
    	map_button.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				//TODO Make this transsfer to the map view.
				Log.d("mainactivity", "Touched the map button");
				Toast.makeText(getApplicationContext(), "Pressed Map Button!", Toast.LENGTH_LONG).show();
				
				Intent i = new Intent(getApplicationContext(), MapsPageActivity.class);
				startActivity(i);
				return true;
			}
 
		});
    	
    }
    
    
}
