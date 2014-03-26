package com.example.tagalong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyEventArrayAdapter extends ArrayAdapter<Event> {
	private final Context context;
	private final Event[] values;

	public MyEventArrayAdapter(Context context, Event[] values) {
	    super(context, R.layout.event_carousel_item, values);
	    this.context = context;
	    this.values = values;
	  }
	
	@Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.event_carousel_item, parent, false);
	    //set the title text for the event
	    TextView titleTextView = (TextView) rowView.findViewById(R.id.eventNameTextView);
	    titleTextView.setText(values[position].getTitle());

	    //set the image for the event
	    //Setting the image to the placeholder for now.
	    ImageView imageView = (ImageView) rowView.findViewById(R.drawable.placeholder);

	    //set the start date time text for the event
	    TextView startDateTextView = (TextView) rowView.findViewById(R.id.eventDateTimeTextView);
	    startDateTextView.setText(values[position].getStartDateTime());

	    return rowView;
	  }


}
