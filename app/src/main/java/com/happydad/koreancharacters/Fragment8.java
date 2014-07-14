package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment8 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_8,
                container, false);


        //Fragment section for button / audio
        Button button_ja = (Button) mLinearLayout.findViewById(R.id.Button_ja);
        button_ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ja = MediaPlayer.create(getActivity(), R.raw.ga);
                ja.start();

                ja.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ja) {
                        ja.release();
                    }
                });


            }
        });

        Button button_jya = (Button) mLinearLayout.findViewById(R.id.Button_jya);
        button_jya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jya = MediaPlayer.create(getActivity(), R.raw.gya);
                jya.start();

                jya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jya) {
                        jya.release();
                    }
                });

            }
        });

        Button button_jeo = (Button) mLinearLayout.findViewById(R.id.Button_jeo);
        button_jeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jeo = MediaPlayer.create(getActivity(), R.raw.geo);
                jeo.start();

                jeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jeo) {
                        jeo.release();
                    }
                });

            }
        });

        Button button_jyeo = (Button) mLinearLayout.findViewById(R.id.Button_jyeo);
        button_jyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                jyeo.start();

                jyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jyeo) {
                        jyeo.release();
                    }
                });

            }
        });

        Button button_joh = (Button) mLinearLayout.findViewById(R.id.Button_joh);
        button_joh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer joh = MediaPlayer.create(getActivity(), R.raw.goh);
                joh.start();

                joh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer joh) {
                        joh.release();
                    }
                });

            }
        });

        Button button_jyoh = (Button) mLinearLayout.findViewById(R.id.Button_jyoh);
        button_jyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                jyoh.start();

                jyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jyoh) {
                        jyoh.release();
                    }
                });

            }
        });

        Button button_joo = (Button) mLinearLayout.findViewById(R.id.Button_joo);
        button_joo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer joo = MediaPlayer.create(getActivity(), R.raw.goo);
                joo.start();

                joo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer joo) {
                        joo.release();
                    }
                });

            }
        });

        Button button_jyoo = (Button) mLinearLayout.findViewById(R.id.Button_jyoo);
        button_jyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                jyoo.start();

                jyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jyoo) {
                        jyoo.release();
                    }
                });

            }
        });

        Button button_jeu = (Button) mLinearLayout.findViewById(R.id.Button_jeu);
        button_jeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jeu = MediaPlayer.create(getActivity(), R.raw.geu);
                jeu.start();

                jeu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jeu) {
                        jeu.release();
                    }
                });

            }
        });

        Button button_jee = (Button) mLinearLayout.findViewById(R.id.Button_jee);
        button_jee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer jee = MediaPlayer.create(getActivity(), R.raw.gee);
                jee.start();

                jee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer jee) {
                        jee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}