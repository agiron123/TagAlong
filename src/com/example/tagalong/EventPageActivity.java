package com.example.tagalong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class EventPageActivity extends Activity
{

	    String eventName;
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.event_page_layout);
	        
	        Intent intent = getIntent();
			eventName = intent.getExtras().getString("eventTitle");
			
			Button addWatchListButton = (Button) findViewById(R.id.addwatchlist);
	        Button suggestGroupButton = (Button) findViewById(R.id.suggestgroup);
	        ImageButton map_button =(ImageButton) findViewById(R.id.mapbutton);
	        
	        map_button.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO Auto-generated method stub
					//TODO Make this transsfer to the map view.
					Log.d("EventPageActivity", "Touched the map button");
					Toast.makeText(getApplicationContext(), "Pressed Map Button!", Toast.LENGTH_LONG).show();
					Intent i = new Intent(EventPageActivity.this, MapsPageActivity.class);
					startActivity(i);
					return true;
				}
				
	 
			});
	        
     
	        addWatchListButton.setOnClickListener(new View.OnClickListener() {
	        	@Override
				public void onClick(View v) {
	        		
	        		Toast.makeText(EventPageActivity.this, "Added to Watch List!", Toast.LENGTH_LONG).show();
				}
			});
	        
	        suggestGroupButton.setOnClickListener(new View.OnClickListener() {
	        	@Override
				public void onClick(View v) {
	        		
	        		Toast.makeText(EventPageActivity.this, "Suggested to Group!", Toast.LENGTH_LONG).show();
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

