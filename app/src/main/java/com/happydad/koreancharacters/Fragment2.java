package com.happydad.koreancharacters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2,container,false);
    }
    //Add options menu
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuInflater mInflater = new MenuInflater(getActivity().getApplicationContext());
        mInflater.inflate(R.menu.main, menu);
    }
}
