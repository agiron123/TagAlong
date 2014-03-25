package com.example.tagalong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsPageActivity extends FragmentActivity implements  LocationListener, GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener,OnInfoWindowClickListener
{
	  
		private GoogleMap map;
		private Map<String,Marker> mapMarkers = new HashMap<String,Marker>();
		private ArrayList<Marker> newMarkerList = new ArrayList<Marker>();
		LocationManager mLocationManager;
		
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.map_page_layout);
	        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap(); 
	        map.setMyLocationEnabled(true);
	        map.setMapType(GoogleMap.MAP_TYPE_NORMAL); 
	        //Have to change coordinates below for gatech
	        LatLngBounds gaTech = new LatLngBounds(new LatLng(33.78, -84.394), new LatLng(33.78, -84.394));
	        map.moveCamera(CameraUpdateFactory.newLatLngZoom(gaTech.getCenter(), 14));
	        
	        map.addMarker(new MarkerOptions().position(new LatLng(33.778, -84.401)).title("Movie Screening").snippet("03/28/2014 8:00 PM"));
	        map.addMarker(new MarkerOptions().position(new LatLng(33.779, -84.394)).title("All you can eat Ribs!").snippet("03/27/2014 6:00 PM"));
	        map.addMarker(new MarkerOptions().position(new LatLng(33.777, -84.388)).title("Concert").snippet("03/29/2014 8:00 PM"));
	        map.addMarker(new MarkerOptions().position(new LatLng(33.771816, -84.404)).title("Drinking at the Bar").snippet("03/29/2014 10:00 PM"));
	        map.addMarker(new MarkerOptions().position(new LatLng(33.78, -84.4107)).title("Pick up Basketball").snippet("03/30/2014 2:00 PM"));
	        
	        map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
				
				@Override
				public void onInfoWindowClick(Marker marker) {
					Intent i = new Intent(MapsPageActivity.this, EventPageActivity.class);
					i.putExtra("eventTitle", marker.getTitle());       			
					startActivity(i);				
				}
			});
	    }
	   	
	   @Override
		public void onInfoWindowClick(Marker arg0) {
			// TODO Auto-generated method stub
			
		}
	   
	   
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

		@Override
		public void onConnectionFailed(ConnectionResult arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onConnected(Bundle arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDisconnected() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onLocationChanged(Location arg0) {
			// TODO Auto-generated method stub
			
		}
}

