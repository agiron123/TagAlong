package com.example.tagalong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGroupArrayAdapter extends ArrayAdapter<Group> {
	private final Context context;
	private final Group[] values;

	public MyGroupArrayAdapter(Context context, Group[] values) {
	    super(context, R.layout.event_carousel_item, values); //still using the event Carousel layout for now.
	    //TODO: make a different layout for groups, but this will do for now.
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
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.placeholderImage4);
	    
	    //set the start date time text for the event
	    TextView startDateTextView = (TextView) rowView.findViewById(R.id.eventDateTimeTextView);
	    startDateTextView.setText(values[position].getTitle()); //just making duplicate text for now to make sure that this array adapter functions properly.
	    //Going to have to create a view for groups in order to flesh this out some more.

	    return rowView;
	  }


}
