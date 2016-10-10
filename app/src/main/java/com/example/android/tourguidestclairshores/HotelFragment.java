package com.example.android.tourguidestclairshores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */


public class HotelFragment extends Fragment {
    public HotelFragment() {
    }


    // In this case, the fragment displays simple text based on the page
    public static HotelFragment newInstance() {
        HotelFragment fragment = new HotelFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.results_list, container, false);

        //Create a list of results for bars.
        final ArrayList<Results> results = new ArrayList<Results>();
        results.add(new Results(R.string.red_roof_inn, R.string.red_roof_address, R.string.red_roof_phone_number, R.mipmap.red_roof_inn));
        results.add(new Results(R.string.extended_stay_america, R.string.extended_stay_address, R.string.extended_stay_phone_number, R.mipmap.extended_stay));
        results.add(new Results(R.string.holiday_inn, R.string.holiday_inn_address, R.string.holiday_inn_phone_number, R.mipmap.holiday_inn));
        results.add(new Results(R.string.baymont_inn, R.string.baymont_inn_address, R.string.baymont_phone_number, R.mipmap.baymont_hotel));
        results.add(new Results(R.string.days_inn, R.string.days_inn_address, R.string.days_inn_phone_number, R.mipmap.days_inn));

        ResultsAdapter adapter = new ResultsAdapter(getActivity(), results, R.color.categoryHotels);

        ListView listView = (ListView) rootView.findViewById(R.id.results_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
