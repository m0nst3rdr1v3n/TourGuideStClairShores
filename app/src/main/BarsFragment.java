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
public class BarsFragment extends Fragment {
    public BarsFragment() {
    }


    // In this case, the fragment displays simple text based on the page
    public static BarsFragment newInstance() {
        BarsFragment fragment = new BarsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.results_list, container, false);

        //Create a list of results for bars.
        final ArrayList<Results> results = new ArrayList<Results>();
        results.add(new Results(R.string.boat_works, R.string.boat_works_address, R.string.boat_works_phone_number, R.drawable.boat_works));
        results.add(new Results(R.string.butter_run_saloon, R.string.butter_run_address, R.string.butter_run_phone_number, R.drawable.butter_run_saloon));
        results.add(new Results(R.string.colleens_irish_pub, R.string.colleens_address, R.string.colleens_phone_number, R.drawable.colleens_irish_pub));
        results.add(new Results(R.string.pbs_sports_grille, R.string.pbs_address, R.string.pbs_phone_number, R.drawable.pbs_sports_grille));
        results.add(new Results(R.string.shores_inn, R.string.shores_inn_address, R.string.shores_inn_phone_number, R.drawable.shores_inn));

        ResultsAdapter adapter = new ResultsAdapter(getActivity(), results, R.color.categoryBars);

        ListView listView = (ListView) rootView.findViewById(R.id.results_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}


