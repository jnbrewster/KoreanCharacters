package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment9 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_9,
                container, false);


        //Fragment section for button / audio
        Button button_cha = (Button) mLinearLayout.findViewById(R.id.Button_cha);
        button_cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer cha = MediaPlayer.create(getActivity(), R.raw.ga);
                cha.start();

                cha.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer cha) {
                        cha.release();
                    }
                });


            }
        });

        Button button_chya = (Button) mLinearLayout.findViewById(R.id.Button_chya);
        button_chya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer chya = MediaPlayer.create(getActivity(), R.raw.gya);
                chya.start();

                chya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer chya) {
                        chya.release();
                    }
                });

            }
        });

        Button button_cheo = (Button) mLinearLayout.findViewById(R.id.Button_cheo);
        button_cheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer cheo = MediaPlayer.create(getActivity(), R.raw.geo);
                cheo.start();

                cheo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer cheo) {
                        cheo.release();
                    }
                });

            }
        });

        Button button_chyeo = (Button) mLinearLayout.findViewById(R.id.Button_chyeo);
        button_chyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer chyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                chyeo.start();

                chyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer chyeo) {
                        chyeo.release();
                    }
                });

            }
        });

        Button button_choh = (Button) mLinearLayout.findViewById(R.id.Button_choh);
        button_choh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer choh = MediaPlayer.create(getActivity(), R.raw.goh);
                choh.start();

                choh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer choh) {
                        choh.release();
                    }
                });

            }
        });

        Button button_chyoh = (Button) mLinearLayout.findViewById(R.id.Button_chyoh);
        button_chyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer chyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                chyoh.start();

                chyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer chyoh) {
                        chyoh.release();
                    }
                });

            }
        });

        Button button_choo = (Button) mLinearLayout.findViewById(R.id.Button_choo);
        button_choo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer choo = MediaPlayer.create(getActivity(), R.raw.goo);
                choo.start();

                choo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer choo) {
                        choo.release();
                    }
                });

            }
        });

        Button button_chyoo = (Button) mLinearLayout.findViewById(R.id.Button_chyoo);
        button_chyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer chyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                chyoo.start();

                chyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer chyoo) {
                        chyoo.release();
                    }
                });

            }
        });

        Button button_cheu = (Button) mLinearLayout.findViewById(R.id.Button_cheu);
        button_cheu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer cheu = MediaPlayer.create(getActivity(), R.raw.geu);
                cheu.start();

                cheu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer cheu) {
                        cheu.release();
                    }
                });

            }
        });

        Button button_chee = (Button) mLinearLayout.findViewById(R.id.Button_chee);
        button_chee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer chee = MediaPlayer.create(getActivity(), R.raw.gee);
                chee.start();

                chee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer chee) {
                        chee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}