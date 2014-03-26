package com.example.tagalong;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FriendsPageActivity extends Activity
{
    
    Button button;
    Button button2;
    
    
    //onCreate is where the page is first created. Initialize things like buttons here.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_page_layout);
        
        button =(Button) findViewById(R.id.button);
        addButtonListener();
        
        button2 =(Button) findViewById(R.id.button2);
        addButtonListener();
        
        //Example of how you initialize a button. Remember to add onClick listener later.
        //myButton =(Button) findViewById(R.id.button1);
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        
        return true;
    }
    
    public void addButtonListener()
    {
        button.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                
                Log.d("FriendsPageActivity", "Touched the remove friend button");
                Toast.makeText(getApplicationContext(), "Removed friend!", Toast.LENGTH_LONG).show();
                
            }
        });
        
        button2.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                
                Log.d("FriendsPageActivity", "Touched the add to group button");
                Toast.makeText(getApplicationContext(), "Added friend to group!", Toast.LENGTH_LONG).show();
                
                
            }
        });
        
    }
    
}
