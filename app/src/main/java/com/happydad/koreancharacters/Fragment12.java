package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment12 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_12,
                container, false);


        //Fragment section for button / audio
        Button button_ga = (Button) mLinearLayout.findViewById(R.id.Button_pa);
        button_ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ga = MediaPlayer.create(getActivity(), R.raw.ga);
                ga.start();

                ga.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ga) {
                        ga.release();
                    }
                });


            }
        });

        Button button_gya = (Button) mLinearLayout.findViewById(R.id.Button_pya);
        button_gya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer gya = MediaPlayer.create(getActivity(), R.raw.gya);
                gya.start();

                gya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer gya) {
                        gya.release();
                    }
                });

            }
        });

        Button button_geo = (Button) mLinearLayout.findViewById(R.id.Button_peo);
        button_geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer geo = MediaPlayer.create(getActivity(), R.raw.geo);
                geo.start();

                geo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer geo) {
                        geo.release();
                    }
                });

            }
        });

        Button button_gyeo = (Button) mLinearLayout.findViewById(R.id.Button_pyeo);
        button_gyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer gyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                gyeo.start();

                gyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer gyeo) {
                        gyeo.release();
                    }
                });

            }
        });

        Button button_goh = (Button) mLinearLayout.findViewById(R.id.Button_poh);
        button_goh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer goh = MediaPlayer.create(getActivity(), R.raw.goh);
                goh.start();

                goh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer goh) {
                        goh.release();
                    }
                });

            }
        });

        Button button_gyoh = (Button) mLinearLayout.findViewById(R.id.Button_pyoh);
        button_gyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer gyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                gyoh.start();

                gyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer gyoh) {
                        gyoh.release();
                    }
                });

            }
        });

        Button button_goo = (Button) mLinearLayout.findViewById(R.id.Button_poo);
        button_goo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer goo = MediaPlayer.create(getActivity(), R.raw.goo);
                goo.start();

                goo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer goo) {
                        goo.release();
                    }
                });

            }
        });

        Button button_gyoo = (Button) mLinearLayout.findViewById(R.id.Button_pyoo);
        button_gyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer gyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                gyoo.start();

                gyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer gyoo) {
                        gyoo.release();
                    }
                });

            }
        });

        Button button_geu = (Button) mLinearLayout.findViewById(R.id.Button_peu);
        button_geu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer geu = MediaPlayer.create(getActivity(), R.raw.geu);
                geu.start();

                geu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer geu) {
                        geu.release();
                    }
                });

            }
        });

        Button button_gee = (Button) mLinearLayout.findViewById(R.id.Button_pee);
        button_gee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer gee = MediaPlayer.create(getActivity(), R.raw.gee);
                gee.start();

                gee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer gee) {
                        gee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}