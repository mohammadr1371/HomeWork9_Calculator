package com.example.homework9_calculator;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class CalculatorFragment extends Fragment {

    private TextView mTextViewShowBar;

    private Button mButtonInformation;
    private Button mButtonClear;

    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;

    private Button mButtonEqual;
    private Button mButtonadd;
    private Button mButtonminus;
    private Button mButtonMullty;
    private Button mButtonDev;

    private Button mButtonDot;

    private String showDigits = "";
    private String sign;

    private int number1;
    private int number2;

    private boolean flag = false;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        findViews(view);
        updateViewShowBar();
        setListeners();

        return view;
    }

    public void findViews(View view) {
        mTextViewShowBar = view.findViewById(R.id.text_result_show);
        mButtonInformation = view.findViewById(R.id.button_information);
        mButtonClear = view.findViewById(R.id.clear_button);
        mButton0 = view.findViewById(R.id.button_0);
        mButton1 = view.findViewById(R.id.button_1);
        mButton2 = view.findViewById(R.id.button_2);
        mButton3 = view.findViewById(R.id.button_3);
        mButton4 = view.findViewById(R.id.button_4);
        mButton5 = view.findViewById(R.id.button_5);
        mButton6 = view.findViewById(R.id.button_6);
        mButton7 = view.findViewById(R.id.button_7);
        mButton8 = view.findViewById(R.id.button_8);
        mButton9 = view.findViewById(R.id.button_9);
        mButtonadd = view.findViewById(R.id.button_add);
        mButtonDev = view.findViewById(R.id.button_dev);
        mButtonminus = view.findViewById(R.id.button_minus);
        mButtonEqual = view.findViewById(R.id.button_equal);
        mButtonDot = view.findViewById(R.id.button_dot);
        mButtonMullty = view.findViewById(R.id.button_multy);
    }

    public void setListeners() {
        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "0";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 0;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 0;
                }
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "1";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 1;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 1;
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "2";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 2;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 2;
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "3";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 3;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 3;
                }
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "4";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 4;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 4;
                }
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "5";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 5;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 5;
                }
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "6";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 6;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 6;
                }
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "7";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 7;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 7;
                }
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "8";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 8;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 8;
                }
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDigits = showDigits + "9";
                updateViewShowBar();
                if (flag == false) {
                    number1 = (number1 * 10) + 9;
                } else if (flag == true) {
                    number2 = (number2 * 10) + 9;
                }
            }
        });

        mButtonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = true;
                showDigits = showDigits + "+";
                updateViewShowBar();
            }
        });

        mButtonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = true;
                showDigits = showDigits + "-";
                updateViewShowBar();
            }
        });

        mButtonMullty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = true;
                showDigits = showDigits + "*";
                updateViewShowBar();
            }
        });

        mButtonDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = true;
                showDigits = showDigits + "/";
                updateViewShowBar();
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonClear.setTextColor(Color.BLACK);
                mButtonClear.setTextSize(16);
                flag = false;
                showDigits = "";
                updateViewShowBar();
                number1 = 0;
                number2 = 0;
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonClear.setTextColor(Color.RED);
                mButtonClear.setTextSize(20);
                if (showDigits.contains("+")) {
                    int result = number1 + number2;
                    number1 = result;
                    number2 = 0;
                    showDigits = String.valueOf(result);
                    updateViewShowBar();
                } else if (showDigits.contains("-")) {
                    int result = number1 - number2;
                    number1 = result;
                    number2 = 0;
                    showDigits = String.valueOf(result);
                    updateViewShowBar();
                } else if (showDigits.contains("*")) {
                    int result = number1 * number2;
                    number1 = result;
                    number2 = 0;
                    showDigits = String.valueOf(result);
                    updateViewShowBar();
                } else if (showDigits.contains("/")) {
                    int result = number1 / number2;
                    number1 = result;
                    number2 = 0;
                    showDigits = String.valueOf(result);
                    updateViewShowBar();
                }
            }
        });


    }

    public void updateViewShowBar() {
        if (showDigits == "") {
            mTextViewShowBar.setText("0");
        } else
            mTextViewShowBar.setText(showDigits);
    }
}