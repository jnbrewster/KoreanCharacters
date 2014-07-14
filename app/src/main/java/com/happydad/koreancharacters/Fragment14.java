package com.happydad.koreancharacters;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Fragment14 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        if (container == null) {
            return null;
        }

        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_14,
                container, false);


        //Fragment section for button / audio
        Button button_a = (Button) mLinearLayout.findViewById(R.id.Button_a);
        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer a = MediaPlayer.create(getActivity(), R.raw.ga);
                a.start();

                a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer a) {
                        a.release();
                    }
                });


            }
        });

        Button button_ang = (Button) mLinearLayout.findViewById(R.id.Button_ang);
        button_ang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ang = MediaPlayer.create(getActivity(), R.raw.ga);
                ang.start();

                ang.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ang) {
                        ang.release();
                    }
                });
            }
        });

        Button button_ya = (Button) mLinearLayout.findViewById(R.id.Button_ya);
        button_ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ya = MediaPlayer.create(getActivity(), R.raw.gya);
                ya.start();

                ya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ya) {
                        ya.release();
                    }
                });

            }
        });

        Button button_yang = (Button) mLinearLayout.findViewById(R.id.Button_yang);
        button_yang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yang = MediaPlayer.create(getActivity(), R.raw.gya);
                yang.start();

                yang.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yang) {
                        yang.release();
                    }
                });
            }
        });



        Button button_eo = (Button) mLinearLayout.findViewById(R.id.Button_eo);
        button_eo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer eo = MediaPlayer.create(getActivity(), R.raw.geo);
                eo.start();

                eo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer eo) {
                        eo.release();
                    }
                });

            }
        });

        Button button_eong = (Button) mLinearLayout.findViewById(R.id.Button_eong);
        button_eong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer eong = MediaPlayer.create(getActivity(), R.raw.geo);
                eong.start();

                eong.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer eong) {
                        eong.release();
                    }
                });

            }
        });


        Button button_yeo = (Button) mLinearLayout.findViewById(R.id.Button_yeo);
        button_yeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yeo = MediaPlayer.create(getActivity(), R.raw.gyeo);
                yeo.start();

                yeo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yeo) {
                        yeo.release();
                    }
                });

            }
        });

        Button button_yeong = (Button) mLinearLayout.findViewById(R.id.Button_yeong);
        button_yeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yeong = MediaPlayer.create(getActivity(), R.raw.gyeo);
                yeong.start();

                yeong.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yeong) {
                        yeong.release();
                    }
                });

            }
        });

        Button button_oh = (Button) mLinearLayout.findViewById(R.id.Button_oh);
        button_oh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer oh = MediaPlayer.create(getActivity(), R.raw.goh);
                oh.start();

                oh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer oh) {
                        oh.release();
                    }
                });

            }
        });

        Button button_ohng = (Button) mLinearLayout.findViewById(R.id.Button_ohng);
        button_ohng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ohng = MediaPlayer.create(getActivity(), R.raw.goh);
                ohng.start();

                ohng.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ohng) {
                        ohng.release();
                    }
                });

            }
        });

        Button button_yoh = (Button) mLinearLayout.findViewById(R.id.Button_yoh);
        button_yoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yoh = MediaPlayer.create(getActivity(), R.raw.gyoh);
                yoh.start();

                yoh.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yoh) {
                        yoh.release();
                    }
                });

            }
        });

        Button button_yohng = (Button) mLinearLayout.findViewById(R.id.Button_yohng);
        button_yohng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yohng = MediaPlayer.create(getActivity(), R.raw.gyoh);
                yohng.start();

                yohng.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yohng) {
                        yohng.release();
                    }
                });

            }
        });

        Button button_oo = (Button) mLinearLayout.findViewById(R.id.Button_oo);
        button_oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer oo = MediaPlayer.create(getActivity(), R.raw.goo);
                oo.start();

                oo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer oo) {
                        oo.release();
                    }
                });

            }
        });

        Button button_oong = (Button) mLinearLayout.findViewById(R.id.Button_oong);
        button_oong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer oong = MediaPlayer.create(getActivity(), R.raw.goo);
                oong.start();

                oong.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer oong) {
                        oong.release();
                    }
                });

            }
        });

        Button button_yoo = (Button) mLinearLayout.findViewById(R.id.Button_yoo);
        button_yoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yoo = MediaPlayer.create(getActivity(), R.raw.gyoo);
                yoo.start();

                yoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yoo) {
                        yoo.release();
                    }
                });

            }
        });

        Button button_yoong = (Button) mLinearLayout.findViewById(R.id.Button_yoong);
        button_yoong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer yoong = MediaPlayer.create(getActivity(), R.raw.gyoo);
                yoong.start();

                yoong.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer yoong) {
                        yoong.release();
                    }
                });

            }
        });

        Button button_eu = (Button) mLinearLayout.findViewById(R.id.Button_eu);
        button_eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer eu = MediaPlayer.create(getActivity(), R.raw.geu);
                eu.start();

                eu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer eu) {
                        eu.release();
                    }
                });

            }
        });

        Button button_eung = (Button) mLinearLayout.findViewById(R.id.Button_eung);
        button_eung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer eung = MediaPlayer.create(getActivity(), R.raw.geu);
                eung.start();

                eung.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer eung) {
                        eung.release();
                    }
                });

            }
        });

        Button button_ee = (Button) mLinearLayout.findViewById(R.id.Button_ee);
        button_ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer ee = MediaPlayer.create(getActivity(), R.raw.gee);
                ee.start();

                ee.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer ee) {
                        ee.release();
                    }
                });

            }
        });

        Button button_eeng = (Button) mLinearLayout.findViewById(R.id.Button_eeng);
        button_eeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer eeng = MediaPlayer.create(getActivity(), R.raw.gee);
                eeng.start();

                eeng.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer eeng) {
                        eeng.release();
                    }
                });

            }
        });

        //end return the layout
        return mLinearLayout;

    }
}