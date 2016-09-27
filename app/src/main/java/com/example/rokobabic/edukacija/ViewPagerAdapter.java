package com.example.rokobabic.edukacija;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Roko Babic on 18.8.2016..
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // Nazivi tabova
    int NumbOfTabs; // Broj tabova


    // Konstruktor
    public ViewPagerAdapter(FragmentManager fm,CharSequence _Titles[], int _NumbOfTabsumb) { super(fm);

        this.Titles = _Titles;
        this.NumbOfTabs = _NumbOfTabsumb;

    }

    //Metoda vraca fragment za svaku poziciju u ViewPager
    @Override
    public Fragment getItem(int position)
    {
        if(position == 0) // Ako je pozicija 0 vraca prvi Tab
        {
            Tab1 tab1 = new Tab1();
            return tab1;
        }
        else             // .... vraca 2 Tab
        {
            Tab2 tab2 = new Tab2();
            return tab2;
        }
    }

    // Metoda vraca nazive Tabova

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // Metoda vraca broj Tabova

    @Override
    public int getCount()
    {
        return NumbOfTabs;
    }
}
