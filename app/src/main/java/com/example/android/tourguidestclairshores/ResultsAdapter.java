package com.example.android.tourguidestclairshores;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jenniferkocik on 9/14/16.
 */

public class ResultsAdapter extends ArrayAdapter<Results> {


    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;


    /**
     * Create a new {@link ResultsAdapter} object.
     */
    public ResultsAdapter(Context context, ArrayList<Results> results, int colorResourceId) {
        super(context, 0, results);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Result} object located at this position in the list
        Results currentResult = getItem(position);


        // Find the TextView in the results_list.xml layout with the ID title name.
        TextView titleNameTextView = (TextView) listItemView.findViewById(R.id.title_name);
        titleNameTextView.setText(currentResult.getNameOfBusiness());

        // Find the TextView in the results_list.xml layout with the ID business_address
        TextView businessAddressTextView = (TextView) listItemView.findViewById(R.id.business_address);
        businessAddressTextView.setText(currentResult.getBusinessAddress());

        // Find the TextView in the results_list.xml layout with the ID business_phone_number
        TextView businessPhoneNumberTextView = (TextView) listItemView.findViewById(R.id.business_phone_number);
        businessPhoneNumberTextView.setText(currentResult.getBusinessPhoneNumber());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentResult.getmImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 3 TextViews and 1 image view) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}



