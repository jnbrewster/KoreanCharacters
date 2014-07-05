package com.happydad.koreancharacters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_1,
                container, false);


        //Add buttons for toast message and audio player

        Button buttonga = (Button) mLinearLayout.findViewById(R.id.Buttonga);
        buttonga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display a toast message in the fragment
                Toast.makeText(getActivity(),"가",Toast.LENGTH_SHORT).show();
                //TODO: trigger audio


            }
        });
        Button buttongya = (Button) mLinearLayout.findViewById(R.id.Buttongya);
        buttongya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display a toast message in the fragment
                Toast.makeText(getActivity(),"갸",Toast.LENGTH_SHORT).show();
                //TODO: trigger audio

            }
        });

        Button buttongo = (Button) mLinearLayout.findViewById(R.id.Buttongo);
        buttongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display a toast message in the fragment
                Toast.makeText(getActivity(),"거",Toast.LENGTH_SHORT).show();
                //TODO: trigger audio

            }
        });

        Button buttongyo = (Button) mLinearLayout.findViewById(R.id.Buttongyo);
        buttongyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display a toast message in the fragment
                Toast.makeText(getActivity(),"겨",Toast.LENGTH_SHORT).show();
                //TODO: trigger audio

            }
        });

        return mLinearLayout;
        //return inflater.inflate(R.layout.fragment_1,container,false);

    }
}
