package com.example.unitconversioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    Button btn2, btn3, btn4, btn5, btn6, btn7;
    EditText ed1 , ed2 , ed3,ed4, ed5, ed6,ed7,ed8,ed9,ed10,ed11,ed12,ed13 , ed14,ed15,ed16,ed17,ed18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = findViewById(R.id.button3);
        btn2= findViewById(R.id.button2);

        btn4 = findViewById(R.id.button);
        btn5 = findViewById(R.id.button7);

        btn6 = findViewById(R.id.button5);
        btn7 = findViewById(R.id.button6);


        ed1 = findViewById(R.id.editText6);
        ed2 = findViewById(R.id.editText7);
        ed3 = findViewById(R.id.editText8);
        ed4 = findViewById(R.id.editText2);
        ed5 = findViewById(R.id.editText3);
        ed6 = findViewById(R.id.editText4);

        ed7 = findViewById(R.id.editText5);
        ed8 = findViewById(R.id.editText9);
        ed9 = findViewById(R.id.editText10);
        ed10 = findViewById(R.id.editText11);
        ed11 = findViewById(R.id.editText12);
        ed12 = findViewById(R.id.editText13);
        ed13 = findViewById(R.id.editText14);

        ed14 = findViewById(R.id.editText15);
        ed15 = findViewById(R.id.editText16);
        ed16 = findViewById(R.id.editText17);
        ed17 = findViewById(R.id.editText18);
        ed18 = findViewById(R.id.editText19);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(ed1.isFocused()) {
                    double m = Double.parseDouble(ed1.getText().toString());


                    double inch = m * 39.37;
                    double feet = m * 3.281;
                    double yard = m * 1.094;
                    double miles = m / 1609.344;
                    double nm = m / 1852;

                    ed2.setText("" + String.format("%.2f", inch));
                    ed3.setText("" + String.format("%.2f", feet));
                    ed4.setText("" + String.format("%.2f", yard));
                    ed5.setText("" + String.format("%.4f", miles));
                    ed6.setText("" + String.format("%.4f", nm));
                }


                else if (ed2.isFocused()) {
                    double i = Double.parseDouble(ed2.getText().toString());


                    double meter = i / 39.37;
                    double feet = i / 12;
                    double yard = i / 36;
                    double miles = i / 63360;
                    double nm = i / 72913.386;

                    ed1.setText("" + String.format("%.4f", meter));
                    ed3.setText("" + String.format("%.4f", feet));
                    ed4.setText("" + String.format("%.4f", yard));
                    ed5.setText("" + String.format("%.4f", miles));
                    ed6.setText("" + String.format("%.4f", nm));
                }

                else if (ed3.isFocused()) {
                    double f = Double.parseDouble(ed3.getText().toString());

                    double meter = f / 3.281;
                    double inch = f * 12;
                    double yard = f / 3;
                    double miles = f / 5280;
                    double nm = f / 6076.115;

                    ed1.setText("" + String.format("%.4f", meter));
                    ed2.setText("" + String.format("%.2f", inch));
                    ed4.setText("" + String.format("%.4f", yard));
                    ed5.setText("" + String.format("%.4f", miles));
                    ed6.setText("" + String.format("%.4f", nm));
                }

                else if (ed4.isFocused()) {
                    double y = Double.parseDouble(ed4.getText().toString());

                    double meter = y / 1.094;
                    double inch = y * 36;
                    double feet = y * 3;
                    double miles = y / 1760;
                    double nm = y / 2025.372;

                    ed1.setText("" + String.format("%.4f", meter));
                    ed2.setText("" + String.format("%.2f", inch));
                    ed3.setText("" + String.format("%.2f", feet));
                    ed5.setText("" + String.format("%.4f", miles));
                    ed6.setText("" + String.format("%.4f", nm));
                }

                else if (ed5.isFocused()) {
                    double mi = Double.parseDouble(ed5.getText().toString());

                    double meter = mi * 1609.344;
                    double inch = mi * 63360;
                    double feet = mi * 5280;
                    double yard = mi * 1760;
                    double nm = mi / 1.151;

                    ed1.setText("" + String.format("%.2f", meter));
                    ed2.setText("" + String.format("%.2f", inch));
                    ed3.setText("" + String.format("%.2f", feet));
                    ed4.setText("" + String.format("%.2f", yard));
                    ed6.setText("" + String.format("%.4f", nm));
                }

                else if(ed6.isFocused()){
                    double na = Double.parseDouble(ed6.getText().toString());

                    double meter = na * 1852;
                    double inch = na * 72913.386;
                    double feet = na * 6076.115;
                    double yard = na * 2025.372;
                    double miles = na * 1.151;

                    ed1.setText("" + String.format("%.2f", meter));
                    ed2.setText("" + String.format("%.2f", inch));
                    ed3.setText("" + String.format("%.2f", feet));
                    ed4.setText("" + String.format("%.2f", yard));
                    ed5.setText("" + String.format("%.2f", miles));
                }









            }
        });

          btn5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  if (ed7.isFocused()) {
                      double kg = Double.parseDouble(ed7.getText().toString());

                      double ou = kg * 35.274;
                      double po = kg * 2.205;
                      double tp = kg * 2.68;
                      double st = kg / 6.35;
                      double sht = kg / 907.185;
                      double lot = kg / 1016.047;


                      ed8.setText("" + String.format("%.2f", ou));
                      ed9.setText("" + String.format("%.2f", po));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed11.setText("" + String.format("%.4f", st));
                      ed12.setText("" + String.format("%.4f", sht));
                      ed13.setText("" + String.format("%.4f", lot));
                  }


                  else if (ed8.isFocused()){

                      double o = Double.parseDouble(ed8.getText().toString());

                      double kg = o / 35.274;
                      double po = o / 16;
                      double tp = o * 0.0760;
                      double st = o / 224;
                      double sht = o / 32000;
                      double lot = o / 35850;


                      ed7.setText("" + String.format("%.4f", kg));
                      ed9.setText("" + String.format("%.4f", po));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed11.setText("" + String.format("%.4f", st));
                      ed12.setText("" + String.format("%.4f", sht));
                      ed13.setText("" + String.format("%.4f", lot));

                  }

                  else if(ed9.isFocused()){
                      double p = Double.parseDouble(ed9.getText().toString());

                      double kg = p / 2.205;
                      double ou = p * 16;
                      double tp = p * 1.2153;
                      double st = p / 14;
                      double sht = p / 2000;
                      double lot = p / 2240;


                      ed7.setText("" + String.format("%.4f", kg));
                      ed8.setText("" + String.format("%.2f", ou));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed11.setText("" + String.format("%.4f", st));
                      ed12.setText("" + String.format("%.4f", sht));
                      ed13.setText("" + String.format("%.4f", lot));

                  }

                  else if (ed10.isFocused()){
                      double t = Double.parseDouble(ed10.getText().toString());

                      double kg = t * 0.3732;
                      double ou = t * 13.165;
                      double po =t * 0.8228;
                      double st = t * 0.0588;
                      double sht = t * 0.0004;
                      double lot = t * 0.00038;


                      ed7.setText("" + String.format("%.2f", kg));
                      ed8.setText("" + String.format("%.2f", ou));
                      ed9.setText("" + String.format("%.2f", po));
                      ed11.setText("" + String.format("%.2f", st));
                      ed12.setText("" + String.format("%.2f", sht));
                      ed13.setText("" + String.format("%.2f", lot));

                  }

                  else if(ed11.isFocused()){
                      double s = Double.parseDouble(ed11.getText().toString());

                      double kg = s * 6.35;
                      double ou = s * 224;
                      double po =s * 14;
                      double tp = s * 17.014;
                      double sht = s / 142.857;
                      double lot = s / 160;


                      ed7.setText("" + String.format("%.2f", kg));
                      ed8.setText("" + String.format("%.2f", ou));
                      ed9.setText("" + String.format("%.2f", po));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed12.setText("" + String.format("%.4f", sht));
                      ed13.setText("" + String.format("%.4f", lot));

                  }

                  else if(ed12.isFocused())
                  {
                      double sh = Double.parseDouble(ed12.getText().toString());

                      double kg = sh * 907.19;
                      double ou = sh * 32000;
                      double po = sh * 2000;
                      double tp = sh * 2430.6;
                      double st = sh * 142.86;
                      double lot = sh * 0.9072;

                      ed7.setText("" + String.format("%.2f", kg));
                      ed8.setText("" + String.format("%.2f", ou));
                      ed9.setText("" + String.format("%.2f", po));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed11.setText("" + String.format("%.2f", st));
                      ed13.setText("" + String.format("%.2f", lot));

                  }

                  else if(ed13.isFocused()){
                      double lo = Double.parseDouble(ed13.getText().toString());

                      double kg = lo * 1000;
                      double ou = lo * 35840;
                      double po = lo * 2204.6;
                      double tp = lo * 2679.3;
                      double st = lo * 157.47;
                      double sht = lo * 1.1023;

                      ed7.setText("" + String.format("%.2f", kg));
                      ed8.setText("" + String.format("%.2f", ou));
                      ed9.setText("" + String.format("%.2f", po));
                      ed10.setText("" + String.format("%.2f", tp));
                      ed11.setText("" + String.format("%.2f", st));
                      ed12.setText("" + String.format("%.2f", sht));

                  }

              }
          });

                    btn7.setOnClickListener(new View.OnClickListener() {
            @Override
                  public void onClick(View v) {

                if(ed16.isFocused()) {
                    double qu =Double.parseDouble(ed16.getText().toString());

                    double li = qu / 1.057;
                    double fo = qu * 32;
                    double ga = qu / 4;
                    double ig = qu / 4.804;


                    ed14.setText("" +String.format("%.4f", li));
                    ed15.setText("" +String.format("%.2f", fo));
                    ed17.setText("" +String.format("%.4f", ga));
                    ed18.setText("" +String.format("%.4f", ig));

                }

                else if(ed14.isFocused()){
                    double lit = Double.parseDouble(ed14.getText().toString());

                    double fo = lit * 33.814;
                    double qua = lit * 1.057;
                    double ga = lit * 0.2642;
                    double ig = lit *  0.2200;


                    ed15.setText("" + String.format("%.2f", fo));
                    ed16.setText("" + String.format("%.2f", qua));
                    ed17.setText("" + String.format("%.2f", ga));
                    ed18.setText("" + String.format("%.2f", ig));


                }
                else if(ed15.isFocused()){
                    double f = Double.parseDouble(ed15.getText().toString());

                    double li = f / 33.814;
                    double qua = f /32;
                    double ga = f /128;
                    double ig = f /153.722;


                    ed14.setText("" + String.format("%.4f", li));
                    ed16.setText("" + String.format("%.4f", qua));
                    ed17.setText("" + String.format("%.4f", ga));
                    ed18.setText("" + String.format("%.4f", ig));

                }
                else if(ed17.isFocused()){
                    double g = Double.parseDouble(ed17.getText().toString());

                    double li = g * 3.785;
                    double fo = g * 128;
                    double qua = g * 4;
                    double ig = g / 1.201;


                    ed14.setText("" + String.format("%.2f", li));
                    ed15.setText("" + String.format("%.2f", fo));
                    ed16.setText("" + String.format("%.2f",qua));
                    ed18.setText("" + String.format("%.4f", ig));

                }
                else if(ed18.isFocused()) {

                    double im = Double.parseDouble(ed18.getText().toString());

                    double li = im * 4.546;
                    double fo = im * 153.722;
                    double qua = im * 4.804;
                    double ga = im * 1.201;


                    ed14.setText("" + String.format("%.2f", li));
                    ed15.setText("" + String.format("%.2f", fo));
                    ed16.setText("" + String.format("%.2f",qua));
                    ed17.setText("" + String.format("%.2f", ga));

                }






            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                ed5.setText("");
                ed6.setText("");
            }

        });

        btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed7.setText("");
            ed8.setText("");
            ed9.setText("");
            ed10.setText("");
            ed11.setText("");
            ed12.setText("");
            ed13.setText("");


    }
     });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed14.setText("");
                ed15.setText("");
                ed16.setText("");
                ed17.setText("");
                ed18.setText("");
            }
        });

    }
}





