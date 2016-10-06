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


public class GasStationFragment extends Fragment {
    public GasStationFragment() {
    }


    // In this case, the fragment displays simple text based on the page
    public static GasStationFragment newInstance() {
        GasStationFragment fragment = new GasStationFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.results_list, container, false);

        //Create a list of results for bars.
        final ArrayList<Results> results = new ArrayList<Results>();
        results.add(new Results(R.string.zazz, R.string.zazz_address, R.string.zazz_phone_number, R.drawable.ic_local_gas_station_black_24dp));
        results.add(new Results(R.string.mobil, R.string.mobil_address, R.string.mobil_phone_number, R.drawable.ic_local_gas_station_black_24dp));
        results.add(new Results(R.string.kroger_gas_station, R.string.kroger_address, R.string.kroger_phone_number, R.drawable.ic_local_gas_station_black_24dp));
        results.add(new Results(R.string.sunoco, R.string.sunoco_address, R.string.sunoco_phone_number, R.drawable.ic_local_gas_station_black_24dp));
        results.add(new Results(R.string.marathon, R.string.marathon_address, R.string.marathon_phone_number, R.drawable.ic_local_gas_station_black_24dp));

        ResultsAdapter adapter = new ResultsAdapter(getActivity(), results, R.color.categoryGasStations);

        ListView listView = (ListView) rootView.findViewById(R.id.results_list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
