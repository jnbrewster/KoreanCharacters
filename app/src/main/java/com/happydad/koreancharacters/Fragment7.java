package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment7 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_7,
                container, false);


        //Fragment section for button / audio
        Button button_sa = (Button) mLinearLayout.findViewById(R.id.Button_sa);
        button_sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer sa = MediaPlayer.create(getActivity(), R.raw.ga);
                sa.start();

                sa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer sa) {
                        sa.release();
                    }
                });


            }
        });

        Button button_sya = (Button) mLinearLayout.findViewById(R.id.Button_sya);
        button_sya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer sya = MediaPlayer.create(getActivity(), R.raw.gya);
                sya.start();

                sya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer sya) {
                        sya.release();
                    }
                });

            }
        });

        Button button_seo = (Button) mLinearLayout.findViewById(R.id.Button_seo);
        button_seo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer seo = MediaPlayer.create(getActivity(), R.raw.geo);
                seo.start();

                seo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer seo) {
                        seo.release();
                    }
                });

            }
        });

        Button button_syeo = (Button) mLinearLayout.findViewById(R.id.Button_syeo);
        button_syeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer syeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                syeo.start();

                syeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer syeo) {
                        syeo.release();
                    }
                });

            }
        });

        Button button_soh = (Button) mLinearLayout.findViewById(R.id.Button_soh);
        button_soh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer soh = MediaPlayer.create(getActivity(), R.raw.goh);
                soh.start();

                soh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer soh) {
                        soh.release();
                    }
                });

            }
        });

        Button button_syoh = (Button) mLinearLayout.findViewById(R.id.Button_syoh);
        button_syoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer syoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                syoh.start();

                syoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer syoh) {
                        syoh.release();
                    }
                });

            }
        });

        Button button_soo = (Button) mLinearLayout.findViewById(R.id.Button_soo);
        button_soo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer soo = MediaPlayer.create(getActivity(), R.raw.goo);
                soo.start();

                soo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer soo) {
                        soo.release();
                    }
                });

            }
        });

        Button button_syoo = (Button) mLinearLayout.findViewById(R.id.Button_syoo);
        button_syoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer syoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                syoo.start();

                syoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer syoo) {
                        syoo.release();
                    }
                });

            }
        });

        Button button_seu = (Button) mLinearLayout.findViewById(R.id.Button_seu);
        button_seu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer seu = MediaPlayer.create(getActivity(), R.raw.geu);
                seu.start();

                seu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer seu) {
                        seu.release();
                    }
                });

            }
        });

        Button button_see = (Button) mLinearLayout.findViewById(R.id.Button_see);
        button_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer see = MediaPlayer.create(getActivity(), R.raw.gee);
                see.start();

                see.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer see) {
                        see.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}