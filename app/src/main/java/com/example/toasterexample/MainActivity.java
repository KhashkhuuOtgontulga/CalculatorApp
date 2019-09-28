package com.example.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.toasterlibrary.ToasterMessage;


public class MainActivity extends AppCompatActivity {
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;

    Button dot;
    Button equals;
    Button add;
    Button multiply;
    Button subtract;
    Button divide;

    Button sin;
    Button cos;
    Button tan;

    TextView output;

    Boolean isClicked;
    Boolean operatorClicked;

    String operator;
    double first_operand;
    double second_operand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.button_zero);
        one = findViewById(R.id.button_one);
        two = findViewById(R.id.button_two);
        three = findViewById(R.id.button_three);
        four = findViewById(R.id.button_four);
        five = findViewById(R.id.button_five);
        six = findViewById(R.id.button_six);
        seven = findViewById(R.id.button_seven);
        eight = findViewById(R.id.button_eight);
        nine = findViewById(R.id.button_nine);

        dot = findViewById(R.id.button_dot);
        equals = findViewById(R.id.button_equals);
        add = findViewById(R.id.button_add);
        multiply = findViewById(R.id.button_multiply);
        subtract = findViewById(R.id.button_minus);
        add = findViewById(R.id.button_add);
        divide = findViewById(R.id.button_divide);
        sin = findViewById(R.id.button_sin);
        cos = findViewById(R.id.button_cos);
        tan = findViewById(R.id.button_tan);

        output = findViewById(R.id.textview_output);

        isClicked = true;
        operatorClicked = false;
    }

    public void dot_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("0.");
            isClicked = false;
        }
        else {
            output.append(".");
        }
    }

    public void zero_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("0");
        }
        else {
            output.append("0");
        }
    }

    public void one_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("1");
            isClicked = false;
        }
        else {
            output.append("1");
        }
    }

    public void two_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("2");
            isClicked = false;
        }
        else {
            output.append("2");
        }
    }

    public void three_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("3");
            isClicked = false;
        }
        else {
            output.append("3");
        }
    }

    public void four_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("4");
            isClicked = false;
        }
        else {
            output.append("4");
        }
    }

    public void five_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("5");
            isClicked = false;
        }
        else {
            output.append("5");
        }
    }

    public void six_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("6");
            isClicked = false;
        }
        else {
            output.append("6");
        }
    }

    public void seven_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("7");
            isClicked = false;
        }
        else {
            output.append("7");
        }
    }

    public void eight_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("8");
            isClicked = false;
        }
        else {
            output.append("8");
        }
    }

    public void nine_clicked(View w) {
        clearButtons("");
        if(isClicked) {
            output.setText("9");
            isClicked = false;
        }
        else {
            output.append("9");
        }
    }

    public void clearButtons(String operator) {
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        // to display new text after an operator is clicked
        if(operatorClicked) {
            isClicked = true;
            operatorClicked = false;
        }
    }

    public void divide_clicked(View w) {
        divide.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operatorClicked = true;
        operator = "/";
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void multiply_clicked(View w) {
        multiply.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operatorClicked = true;
        operator = "x";
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void minus_clicked(View w) {
        subtract.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operatorClicked = true;
        operator = "-";
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void add_clicked(View w) {
        add.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operatorClicked = true;
        operator = "+";
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void equals_clicked(View w) {
        clearButtons("");
        second_operand = Double.parseDouble(output.getText().toString());
        double display = ToasterMessage.s(first_operand, second_operand, operator);
        output.setText(Double.toString(display));
        isClicked = true;
        operatorClicked = false;
    }

    public void sin_clicked(View w) {
        sin.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operator = "sin";
        operatorClicked = true;
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void cos_clicked(View w) {
        cos.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        tan.getBackground().clearColorFilter();
        operator = "cos";
        operatorClicked = true;
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void tan_clicked(View w) {
        tan.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
        divide.getBackground().clearColorFilter();
        multiply.getBackground().clearColorFilter();
        subtract.getBackground().clearColorFilter();
        add.getBackground().clearColorFilter();
        sin.getBackground().clearColorFilter();
        cos.getBackground().clearColorFilter();
        operator = "tan";
        operatorClicked = true;
        first_operand = Double.parseDouble(output.getText().toString());
    }

    public void clear(View w) {
        output.setText(null);
        isClicked = true;
        operatorClicked = false;
    }
}