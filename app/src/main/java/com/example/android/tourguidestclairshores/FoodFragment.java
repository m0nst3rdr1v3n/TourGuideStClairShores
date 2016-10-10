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

public class FoodFragment extends Fragment {
    public FoodFragment() {
    }


    // In this case, the fragment displays simple text based on the page
    public static FoodFragment newInstance() {
        FoodFragment fragment = new FoodFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.results_list, container, false);

        //Create a list of results for bars.
        final ArrayList<Results> results = new ArrayList<Results>();
        results.add(new Results(R.string.gim_ling, R.string.gim_ling_address, R.string.gim_ling_phone_number, R.mipmap.gim_ling));
        results.add(new Results(R.string.fishbones_rhythm_kitchen, R.string.fishbones_address, R.string.fishbones_phone_number, R.mipmap.fish_bones));
        results.add(new Results(R.string.brownies_on_the_lake, R.string.brownies_address, R.string.brownies_phone_number, R.mipmap.brownies_on_the_lake));
        results.add(new Results(R.string.the_copper_penny, R.string.copper_penny_address, R.string.copper_penny_phone_number, R.mipmap.copper_penny));
        results.add(new Results(R.string.golden_chopsticks, R.string.golden_chopsticks_address, R.string.golden_chopsticks_phone_number, R.mipmap.golden_chopsticks));

        ResultsAdapter adapter = new ResultsAdapter(getActivity(), results, R.color.categoryFood);

        ListView listView = (ListView) rootView.findViewById(R.id.results_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
