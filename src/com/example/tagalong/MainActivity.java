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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	ImageButton map_button;
	ImageView groupsView;
	ImageView watchListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //fake buttons to click!
        groupsView = (ImageView) findViewById(R.id.groupsListImage);
        groupsView.setImageResource(R.drawable.groupinfopic);
        
        watchListView = (ImageView) findViewById(R.id.watchListImage);
        watchListView.setImageResource(R.drawable.frozon);
        
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
				Log.d("mainactivity", "Touched the map button");
				Toast.makeText(getApplicationContext(), "Pressed Map Button!", Toast.LENGTH_LONG).show();
				
				Intent i = new Intent(getApplicationContext(), MapsPageActivity.class);
				startActivity(i);
				return true;
			}
 
		});
    	
    	watchListView.setOnClickListener(new View.OnClickListener() {

      	  @Override
      	  public void onClick(View view) {
      	    // do stuff
      	      Intent i = new Intent(getApplicationContext(), EventPageActivity.class);
      	      startActivity(i);
      	  }

      	});
      
      groupsView.setOnClickListener(new View.OnClickListener() {

      	  @Override
      	  public void onClick(View view) {
      	      Intent i = new Intent(getApplicationContext(), GroupsPageActivity.class);
      	      startActivity(i);
      	    // do stuff
      	  }

      	});
    	
    }
    
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
      // do something with the data
      Toast.makeText(getApplicationContext(), "ClickedEvent", Toast.LENGTH_LONG).show();
      Intent i = new Intent(getApplicationContext(), EventPageActivity.class);
      startActivity(i);
    }   
}