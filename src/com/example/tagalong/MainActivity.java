package com.example.tagalong;

import java.util.ArrayList;
import java.util.List;

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
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

	ImageButton map_button;
	HorizontalScrollView eventsScrollView;
	HorizontalScrollView groupsScrollView;
	HorizontalScrollView watchListScrollView;
	//ScrollView scroll;
	LinearLayout scroll;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //scroll = (ScrollView) findViewById(R.id.scrollView1);
        scroll = (LinearLayout) findViewById(R.id.linearLayout);
        
        map_button =(ImageButton) findViewById(R.id.imageButton1);
        addImageButtonListener();
        
        MockData myMockData = new MockData();
        
        Event[] eventArray = myMockData.getEvents();
        
        scroll.addView(populateHorizontalViews(eventArray));
        //MyEventArrayAdapter eventAdapter = new MyEventArrayAdapter(this,myMockData.getEvents());

    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public HorizontalScrollView populateHorizontalViews(Event[] events)
    {

    	HorizontalScrollView mainlinear = new HorizontalScrollView(
	                getApplicationContext()); 
    	LinearLayout linear = null;
    	
    	//populate the events view
    	for(int i = 0; i < events.length; i++) //number of HorizontalScrollView needed
    	{
    	    for(int j = 0; j < 3; j++) //number of items wants to add in  HorizontalScrollView 

    	    {
    	    	linear = new LinearLayout(getApplicationContext());
     	   
    	        // adding any widgets as per your requirements
    	    	TextView titleView = new TextView(getApplicationContext());
    	    	titleView.setText(events[i].getTitle());
    	    	titleView.setPadding(0, 5, 0, 5);
    	    	TextView dateView = new TextView(getApplicationContext());
    	    	dateView.setText(events[i].getStartDateTime());
    	    	dateView.setPadding(0, 5, 0, 5);
    	    	
        	    linear.addView(titleView);
        	    linear.addView(dateView);
    	    } 	   
    	}
    	
	    mainlinear.addView(linear);

    	return mainlinear;
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
    	
    }
    
    /*
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
      // do something with the data
      Toast.makeText(getApplicationContext(), "ClickedEvent", Toast.LENGTH_LONG).show();
      Intent i = new Intent(getApplicationContext(), EventPageActivity.class);
      startActivity(i);
    } 
    */  
}