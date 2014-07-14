package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment5 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_5,
                container, false);


        //Fragment section for button / audio
        Button button_ma = (Button) mLinearLayout.findViewById(R.id.Button_ma);
        button_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ma = MediaPlayer.create(getActivity(), R.raw.ga);
                ma.start();

                ma.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ma) {
                        ma.release();
                    }
                });


            }
        });

        Button button_mya = (Button) mLinearLayout.findViewById(R.id.Button_mya);
        button_mya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mya = MediaPlayer.create(getActivity(), R.raw.gya);
                mya.start();

                mya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mya) {
                        mya.release();
                    }
                });

            }
        });

        Button button_meo = (Button) mLinearLayout.findViewById(R.id.Button_meo);
        button_meo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer meo = MediaPlayer.create(getActivity(), R.raw.geo);
                meo.start();

                meo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer meo) {
                        meo.release();
                    }
                });

            }
        });

        Button button_myeo = (Button) mLinearLayout.findViewById(R.id.Button_myeo);
        button_myeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer myeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                myeo.start();

                myeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer myeo) {
                        myeo.release();
                    }
                });

            }
        });

        Button button_moh = (Button) mLinearLayout.findViewById(R.id.Button_moh);
        button_moh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer moh = MediaPlayer.create(getActivity(), R.raw.goh);
                moh.start();

                moh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer moh) {
                        moh.release();
                    }
                });

            }
        });

        Button button_myoh = (Button) mLinearLayout.findViewById(R.id.Button_myoh);
        button_myoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer myoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                myoh.start();

                myoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer myoh) {
                        myoh.release();
                    }
                });

            }
        });

        Button button_moo = (Button) mLinearLayout.findViewById(R.id.Button_moo);
        button_moo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer moo = MediaPlayer.create(getActivity(), R.raw.goo);
                moo.start();

                moo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer moo) {
                        moo.release();
                    }
                });

            }
        });

        Button button_myoo = (Button) mLinearLayout.findViewById(R.id.Button_myoo);
        button_myoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer myoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                myoo.start();

                myoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer myoo) {
                        myoo.release();
                    }
                });

            }
        });

        Button button_meu = (Button) mLinearLayout.findViewById(R.id.Button_meu);
        button_meu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer meu = MediaPlayer.create(getActivity(), R.raw.geu);
                meu.start();

                meu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer meu) {
                        meu.release();
                    }
                });

            }
        });

        Button button_mee = (Button) mLinearLayout.findViewById(R.id.Button_mee);
        button_mee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer mee = MediaPlayer.create(getActivity(), R.raw.gee);
                mee.start();

                mee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mee) {
                        mee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}