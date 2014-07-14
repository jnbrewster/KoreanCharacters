package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment13 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_13,
                container, false);


        //Fragment section for button / audio
        Button button_ha = (Button) mLinearLayout.findViewById(R.id.Button_ha);
        button_ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ha = MediaPlayer.create(getActivity(), R.raw.ga);
                ha.start();

                ha.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ha) {
                        ha.release();
                    }
                });


            }
        });

        Button button_hya = (Button) mLinearLayout.findViewById(R.id.Button_hya);
        button_hya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hya = MediaPlayer.create(getActivity(), R.raw.gya);
                hya.start();

                hya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hya) {
                        hya.release();
                    }
                });

            }
        });

        Button button_heo = (Button) mLinearLayout.findViewById(R.id.Button_heo);
        button_heo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer heo = MediaPlayer.create(getActivity(), R.raw.geo);
                heo.start();

                heo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer heo) {
                        heo.release();
                    }
                });

            }
        });

        Button button_hyeo = (Button) mLinearLayout.findViewById(R.id.Button_hyeo);
        button_hyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                hyeo.start();

                hyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hyeo) {
                        hyeo.release();
                    }
                });

            }
        });

        Button button_hoh = (Button) mLinearLayout.findViewById(R.id.Button_hoh);
        button_hoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hoh = MediaPlayer.create(getActivity(), R.raw.goh);
                hoh.start();

                hoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hoh) {
                        hoh.release();
                    }
                });

            }
        });

        Button button_hyoh = (Button) mLinearLayout.findViewById(R.id.Button_hyoh);
        button_hyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                hyoh.start();

                hyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hyoh) {
                        hyoh.release();
                    }
                });

            }
        });

        Button button_hoo = (Button) mLinearLayout.findViewById(R.id.Button_hoo);
        button_hoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hoo = MediaPlayer.create(getActivity(), R.raw.goo);
                hoo.start();

                hoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hoo) {
                        hoo.release();
                    }
                });

            }
        });

        Button button_hyoo = (Button) mLinearLayout.findViewById(R.id.Button_hyoo);
        button_hyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                hyoo.start();

                hyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hyoo) {
                        hyoo.release();
                    }
                });

            }
        });

        Button button_heu = (Button) mLinearLayout.findViewById(R.id.Button_heu);
        button_heu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer heu = MediaPlayer.create(getActivity(), R.raw.geu);
                heu.start();

                heu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer heu) {
                        heu.release();
                    }
                });

            }
        });

        Button button_hee = (Button) mLinearLayout.findViewById(R.id.Button_hee);
        button_hee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer hee = MediaPlayer.create(getActivity(), R.raw.gee);
                hee.start();

                hee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer hee) {
                        hee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}