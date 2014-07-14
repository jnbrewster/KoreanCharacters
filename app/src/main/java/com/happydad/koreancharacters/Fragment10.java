package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment10 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_10,
                container, false);


        //Fragment section for button / audio
        Button button_ka = (Button) mLinearLayout.findViewById(R.id.Button_ka);
        button_ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ka = MediaPlayer.create(getActivity(), R.raw.ga);
                ka.start();

                ka.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ka) {
                        ka.release();
                    }
                });


            }
        });

        Button button_kya = (Button) mLinearLayout.findViewById(R.id.Button_kya);
        button_kya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer kya = MediaPlayer.create(getActivity(), R.raw.gya);
                kya.start();

                kya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer kya) {
                        kya.release();
                    }
                });

            }
        });

        Button button_keo = (Button) mLinearLayout.findViewById(R.id.Button_keo);
        button_keo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer keo = MediaPlayer.create(getActivity(), R.raw.geo);
                keo.start();

                keo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer keo) {
                        keo.release();
                    }
                });

            }
        });

        Button button_kyeo = (Button) mLinearLayout.findViewById(R.id.Button_kyeo);
        button_kyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer kyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                kyeo.start();

                kyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer kyeo) {
                        kyeo.release();
                    }
                });

            }
        });

        Button button_koh = (Button) mLinearLayout.findViewById(R.id.Button_koh);
        button_koh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer koh = MediaPlayer.create(getActivity(), R.raw.goh);
                koh.start();

                koh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer koh) {
                        koh.release();
                    }
                });

            }
        });

        Button button_kyoh = (Button) mLinearLayout.findViewById(R.id.Button_kyoh);
        button_kyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer kyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                kyoh.start();

                kyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer kyoh) {
                        kyoh.release();
                    }
                });

            }
        });

        Button button_koo = (Button) mLinearLayout.findViewById(R.id.Button_koo);
        button_koo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer koo = MediaPlayer.create(getActivity(), R.raw.goo);
                koo.start();

                koo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer koo) {
                        koo.release();
                    }
                });

            }
        });

        Button button_kyoo = (Button) mLinearLayout.findViewById(R.id.Button_kyoo);
        button_kyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer kyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                kyoo.start();

                kyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer kyoo) {
                        kyoo.release();
                    }
                });

            }
        });

        Button button_keu = (Button) mLinearLayout.findViewById(R.id.Button_keu);
        button_keu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer keu = MediaPlayer.create(getActivity(), R.raw.geu);
                keu.start();

                keu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer keu) {
                        keu.release();
                    }
                });

            }
        });

        Button button_kee = (Button) mLinearLayout.findViewById(R.id.Button_kee);
        button_kee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer kee = MediaPlayer.create(getActivity(), R.raw.gee);
                kee.start();

                kee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer kee) {
                        kee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}