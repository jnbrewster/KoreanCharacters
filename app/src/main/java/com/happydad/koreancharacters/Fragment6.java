package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment6 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_6,
                container, false);


        //Fragment section for button / audio
        Button button_ba = (Button) mLinearLayout.findViewById(R.id.Button_ba);
        button_ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ba = MediaPlayer.create(getActivity(), R.raw.ga);
                ba.start();

                ba.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ba) {
                        ba.release();
                    }
                });


            }
        });

        Button button_bya = (Button) mLinearLayout.findViewById(R.id.Button_bya);
        button_bya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer bya = MediaPlayer.create(getActivity(), R.raw.gya);
                bya.start();

                bya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer bya) {
                        bya.release();
                    }
                });

            }
        });

        Button button_beo = (Button) mLinearLayout.findViewById(R.id.Button_beo);
        button_beo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer beo = MediaPlayer.create(getActivity(), R.raw.geo);
                beo.start();

                beo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer beo) {
                        beo.release();
                    }
                });

            }
        });

        Button button_byeo = (Button) mLinearLayout.findViewById(R.id.Button_byeo);
        button_byeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer byeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                byeo.start();

                byeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer byeo) {
                        byeo.release();
                    }
                });

            }
        });

        Button button_boh = (Button) mLinearLayout.findViewById(R.id.Button_boh);
        button_boh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer boh = MediaPlayer.create(getActivity(), R.raw.goh);
                boh.start();

                boh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer boh) {
                        boh.release();
                    }
                });

            }
        });

        Button button_byoh = (Button) mLinearLayout.findViewById(R.id.Button_byoh);
        button_byoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer byoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                byoh.start();

                byoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer byoh) {
                        byoh.release();
                    }
                });

            }
        });

        Button button_boo = (Button) mLinearLayout.findViewById(R.id.Button_boo);
        button_boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer boo = MediaPlayer.create(getActivity(), R.raw.goo);
                boo.start();

                boo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer boo) {
                        boo.release();
                    }
                });

            }
        });

        Button button_byoo = (Button) mLinearLayout.findViewById(R.id.Button_byoo);
        button_byoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer byoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                byoo.start();

                byoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer byoo) {
                        byoo.release();
                    }
                });

            }
        });

        Button button_beu = (Button) mLinearLayout.findViewById(R.id.Button_beu);
        button_beu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer beu = MediaPlayer.create(getActivity(), R.raw.geu);
                beu.start();

                beu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer beu) {
                        beu.release();
                    }
                });

            }
        });

        Button button_bee = (Button) mLinearLayout.findViewById(R.id.Button_bee);
        button_bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer bee = MediaPlayer.create(getActivity(), R.raw.gee);
                bee.start();

                bee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer bee) {
                        bee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}