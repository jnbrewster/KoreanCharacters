package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_4,
                container, false);


        //Fragment section for button / audio
        Button button_la = (Button) mLinearLayout.findViewById(R.id.Button_la);
        button_la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer la = MediaPlayer.create(getActivity(), R.raw.ga);
                la.start();

                la.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer la) {
                        la.release();
                    }
                });


            }
        });

        Button button_lya = (Button) mLinearLayout.findViewById(R.id.Button_lya);
        button_lya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer lya = MediaPlayer.create(getActivity(), R.raw.gya);
                lya.start();

                lya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer lya) {
                        lya.release();
                    }
                });

            }
        });

        Button button_leo = (Button) mLinearLayout.findViewById(R.id.Button_leo);
        button_leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer leo = MediaPlayer.create(getActivity(), R.raw.geo);
                leo.start();

                leo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer leo) {
                        leo.release();
                    }
                });

            }
        });

        Button button_lyeo = (Button) mLinearLayout.findViewById(R.id.Button_lyeo);
        button_lyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer lyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                lyeo.start();

                lyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer lyeo) {
                        lyeo.release();
                    }
                });

            }
        });

        Button button_loh = (Button) mLinearLayout.findViewById(R.id.Button_loh);
        button_loh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer loh = MediaPlayer.create(getActivity(), R.raw.goh);
                loh.start();

                loh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer loh) {
                        loh.release();
                    }
                });

            }
        });

        Button button_lyoh = (Button) mLinearLayout.findViewById(R.id.Button_lyoh);
        button_lyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer lyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                lyoh.start();

                lyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer lyoh) {
                        lyoh.release();
                    }
                });

            }
        });

        Button button_loo = (Button) mLinearLayout.findViewById(R.id.Button_loo);
        button_loo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer loo = MediaPlayer.create(getActivity(), R.raw.goo);
                loo.start();

                loo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer loo) {
                        loo.release();
                    }
                });

            }
        });

        Button button_lyoo = (Button) mLinearLayout.findViewById(R.id.Button_lyoo);
        button_lyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer lyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                lyoo.start();

                lyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer lyoo) {
                        lyoo.release();
                    }
                });

            }
        });

        Button button_leu = (Button) mLinearLayout.findViewById(R.id.Button_leu);
        button_leu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer leu = MediaPlayer.create(getActivity(), R.raw.geu);
                leu.start();

                leu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer leu) {
                        leu.release();
                    }
                });

            }
        });

        Button button_lee = (Button) mLinearLayout.findViewById(R.id.Button_lee);
        button_lee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer lee = MediaPlayer.create(getActivity(), R.raw.gee);
                lee.start();

                lee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer lee) {
                        lee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}