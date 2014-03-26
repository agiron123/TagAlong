package com.example.tagalong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class GroupsPageActivity extends Activity
{
	 
		private String groupName;
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.groups_page_layout);
	        
	        Intent intent = getIntent();
			//groupName = intent.getExtras().getString("groupName");
			groupName = "tests";
	        
			TextView textView = (TextView) findViewById(R.id.groupnametext);
			textView.setText(groupName);
	        
			ImageView chatLogImageView = (ImageView) findViewById(R.id.chatlogimage);
			chatLogImageView.setImageResource(R.drawable.chatlog);
			
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        
	        
	        return true;
	    }
}
