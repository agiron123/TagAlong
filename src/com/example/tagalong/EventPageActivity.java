package com.example.tagalong;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class EventPageActivity extends Activity
{

	  //Button myButton;
	
	   //onCreate is where the page is first created. Initialize things like buttons here.
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.event_page_layout);
	        
	        //Example of how you initialize a button. Remember to add onClick listener later.
	        //myButton =(Button) findViewById(R.id.button1); 
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);	        
	        return true;
	    }
}
