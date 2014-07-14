package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment11 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_11,
                container, false);


        //Fragment section for button / audio
        Button button_ta = (Button) mLinearLayout.findViewById(R.id.Button_ta);
        button_ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ta = MediaPlayer.create(getActivity(), R.raw.ga);
                ta.start();

                ta.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ta) {
                        ta.release();
                    }
                });


            }
        });

        Button button_tya = (Button) mLinearLayout.findViewById(R.id.Button_tya);
        button_tya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer tya = MediaPlayer.create(getActivity(), R.raw.gya);
                tya.start();

                tya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer tya) {
                        tya.release();
                    }
                });

            }
        });



        Button button_teo = (Button) mLinearLayout.findViewById(R.id.Button_teo);
        button_teo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer teo = MediaPlayer.create(getActivity(), R.raw.geo);
                teo.start();

                teo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer teo) {
                        teo.release();
                    }
                });

            }
        });

        Button button_tyeo = (Button) mLinearLayout.findViewById(R.id.Button_tyeo);
        button_tyeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer tyeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                tyeo.start();

                tyeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer tyeo) {
                        tyeo.release();
                    }
                });

            }
        });

        Button button_toh = (Button) mLinearLayout.findViewById(R.id.Button_toh);
        button_toh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer toh = MediaPlayer.create(getActivity(), R.raw.goh);
                toh.start();

                toh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer toh) {
                        toh.release();
                    }
                });

            }
        });

        Button button_tyoh = (Button) mLinearLayout.findViewById(R.id.Button_tyoh);
        button_tyoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer tyoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                tyoh.start();

                tyoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer tyoh) {
                        tyoh.release();
                    }
                });

            }
        });

        Button button_too = (Button) mLinearLayout.findViewById(R.id.Button_too);
        button_too.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer too = MediaPlayer.create(getActivity(), R.raw.goo);
                too.start();

                too.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer too) {
                        too.release();
                    }
                });

            }
        });

        Button button_tyoo = (Button) mLinearLayout.findViewById(R.id.Button_tyoo);
        button_tyoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer tyoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                tyoo.start();

                tyoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer tyoo) {
                        tyoo.release();
                    }
                });

            }
        });

        Button button_teu = (Button) mLinearLayout.findViewById(R.id.Button_teu);
        button_teu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer teu = MediaPlayer.create(getActivity(), R.raw.geu);
                teu.start();

                teu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer teu) {
                        teu.release();
                    }
                });

            }
        });

        Button button_tee = (Button) mLinearLayout.findViewById(R.id.Button_tee);
        button_tee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer tee = MediaPlayer.create(getActivity(), R.raw.gee);
                tee.start();

                tee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer tee) {
                        tee.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}