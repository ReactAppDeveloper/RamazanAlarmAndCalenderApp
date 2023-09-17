package com.ramazanalarmandcalender;

/**
 * Created by Cclub on 16/05/2018.
 */

import com.ramazanalarmandcalender.sahaab.hijri.hijricalendar.CaldroidFragment;
import com.ramazanalarmandcalender.sahaab.hijri.hijricalendar.CaldroidGridAdapter;

public class CaldroidSampleCustomFragment extends CaldroidFragment {

    @Override
    public CaldroidGridAdapter getNewDatesGridAdapter(int month, int year) {
        // TODO Auto-generated method stub
        return new CaldroidSampleCustomAdapter(getActivity(), month, year,
                getCaldroidData(), extraData);
    }

}