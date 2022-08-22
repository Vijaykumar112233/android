package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView text;
    String num = "",num2 = "",operator = "";
    String mem2 = "";
    String all = "";
    ArrayList<String> mem1 = new ArrayList<>();
    ArrayList<String> his = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        text = findViewById(R.id.memory);
        editText.setShowSoftInputOnFocus(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.history,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(his.isEmpty()==false)
        {
            if (id == R.id.history) {
                Intent intent = new Intent(MainActivity.this, History.class);
                intent.putStringArrayListExtra("his",his);
                startActivity(intent);
            }
        }
        return super.onOptionsItemSelected(item);
    }

    public void number9(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "9";
            editText.setText(num2);
            all += "9";
            text.setText(all);
        }
        else
        {
            num += "9";
            editText.setText(num);
            all += "9";
            text.setText(all);
        }
    }

    public void number8(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "8";
            editText.setText(num2);
            all += "8";
            text.setText(all);
        }
        else
        {
            num += "8";
            editText.setText(num);
            all += "8";
            text.setText(all);
        }
    }

    public void number7(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "7";
            editText.setText(num2);
            all += "7";
            text.setText(all);
        }
        else
        {
            num += "7";
            editText.setText(num);
            all += "7";
            text.setText(all);
        }
    }

    public void number6(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "6";
            editText.setText(num2);
            all += "6";
            text.setText(all);
        }
        else
        {
            num += "6";
            editText.setText(num);
            all += "6";
            text.setText(all);
        }
    }

    public void number5(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "5";
            editText.setText(num2);
            all += "5";
            text.setText(all);
        }
        else
        {
            num += "5";
            editText.setText(num);
            all += "5";
            text.setText(all);
        }
    }

    public void number4(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "4";
            editText.setText(num2);
            all += "4";
            text.setText(all);
        }
        else
        {
            num += "4";
            editText.setText(num);
            all += "4";
            text.setText(all);
        }
    }

    public void number3(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "3";
            editText.setText(num2);
            all += "3";
            text.setText(all);
        }
        else
        {
            num += "3";
            editText.setText(num);
            all += "3";
            text.setText(all);
        }
    }

    public void number2(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "2";
            editText.setText(num2);
            all += "2";
            text.setText(all);
        }
        else
        {
            num += "2";
            editText.setText(num);
            all += "2";
            text.setText(all);
        }
    }

    public void number1(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "1";
            editText.setText(num2);
            all += "1";
            text.setText(all);
        }
        else
        {
            num += "1";
            editText.setText(num);
            all += "1";
            text.setText(all);
        }
    }

    public void number0(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += "0";
            editText.setText(num2);
            all += "0";
            text.setText(all);
        }
        else
        {
            num += "0";
            editText.setText(num);
            all += "0";
            text.setText(all);
        }
    }

    public void dot(View view) {
        if((num != "")&&(operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {
            num2 += ".";
            editText.setText(num2);
            all += ".";
            text.setText(all);
        }
        else
        {
            num += ".";
            editText.setText(num);
            all += ".";
            text.setText(all);
        }
    }

    public void back(View view) {
        if((num != "")&&(num.length()>0)) {
            num = num.substring(0, num.length() - 1);
            editText.setText(num);
        }
        if((num2 != "")&&(num2.length()>0)) {
            num2 = num2.substring(0, num2.length() - 1);
            editText.setText(num2);
        }
        operator = "";
        mem1.removeAll(mem1);
        mem2 = "";
        all = num;
        text.setText(all);
    }

    public void AC(View view) {
        num = "";
        num2 = "";
        operator = "";
        editText.setText(num);
        mem2 = "";
        text.setText(mem2);
        mem1.removeAll(mem1);
        all = "";
    }

    public void plus(View view) {

        mem1.add(num);

        if((num != "")&&(num2 != ""))
        {
            if(operator.equals("+"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("-"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("x"))
            {
                mem2 += "x"+num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("/"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("%"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
            }
            if(num.substring(num.length()-2).equals(".0"))
            {
                num = num.substring(0,num.length()-2);
            }
            editText.setText(num);
            text.setText(mem1.get(0)+mem2);
        }
        //..............................................................................
        operator = "+";
        if (operator.equals("+"))
        {
            mem1.add(num);
            if ((num != "") && (num2 != ""))
            {
                mem2 += operator + num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
            }
            all = mem1.get(0) + mem2 + operator;
            text.setText(all);
        }

    }

    public void multi(View view) {
        mem1.add(num);

        if((num != "")&&(num2 != ""))
        {
            if(operator.equals("+"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("-"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("x"))
            {
                mem2 += "x"+num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("/"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("%"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
            }
            if(num.substring(num.length()-2).equals(".0"))
            {
                num = num.substring(0,num.length()-2);
            }
            editText.setText(num);
            text.setText(mem1.get(0)+mem2);
        }
        //..............................................................................
        operator = "x";
        if (operator.equals("x"))
        {
            mem1.add(num);
            if ((num != "") && (num2 != ""))
            {
                mem2 += "x" + num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
            }
            all = mem1.get(0) + mem2 + operator;
            text.setText(all);
        }
    }

    public void div(View view) {
        mem1.add(num);

        if((num != "")&&(num2 != ""))
        {
            if(operator.equals("+"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("-"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("x"))
            {
                mem2 += "x"+num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("/"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("%"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
            }
            if(num.substring(num.length()-2).equals(".0"))
            {
                num = num.substring(0,num.length()-2);
            }
            editText.setText(num);
            text.setText(mem1.get(0)+mem2);
        }
        //..............................................................................
        operator = "/";
        if (operator.equals("/"))
        {
            mem1.add(num);
            if ((num != "") && (num2 != ""))
            {
                mem2 += operator + num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
            }
            all = mem1.get(0) + mem2 + operator;
            text.setText(all);
        }
    }

    public void percent(View view) {
        mem1.add(num);

        if((num != "")&&(num2 != ""))
        {
            if(operator.equals("+"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("-"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("x"))
            {
                mem2 += "x"+num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("/"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("%"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
            }
            if(num.substring(num.length()-2).equals(".0"))
            {
                num = num.substring(0,num.length()-2);
            }
            editText.setText(num);
            text.setText(mem1.get(0)+mem2);
        }
        //..............................................................................
        operator = "%";
        if (operator.equals("%"))
        {
            mem1.add(num);
            if ((num != "") && (num2 != ""))
            {
                mem2 += operator + num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
            }
            all = mem1.get(0) + mem2 + operator;
            text.setText(all);
        }
    }

    public void sub(View view) {
        mem1.add(num);

        if((num != "")&&(num2 != ""))
        {
            if(operator.equals("+"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("-"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("x"))
            {
                mem2 += "x"+num2;
                num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("/"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                num2 = "";
            }
            else if(operator.equals("%"))
            {
                mem2 += operator+num2;
                num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                num2 = "";
            }
            if(num.substring(num.length()-2).equals(".0"))
            {
                num = num.substring(0,num.length()-2);
            }
            editText.setText(num);
            text.setText(mem1.get(0)+mem2);
        }
        //..............................................................................
        operator = "-";
        if (operator.equals("-"))
        {
            mem1.add(num);
            if ((num != "") && (num2 != ""))
            {
                mem2 += operator + num2;
                num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                num2 = "";
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
            }
            all = mem1.get(0) + mem2 + operator;
            text.setText(all);
        }
    }

    public void equalto(View view) {
        if((operator.equals("+"))||(operator.equals("-"))||(operator.equals("x"))||(operator.equals("/"))||(operator.equals("%")))
        {

            mem1.add(num);

            if((num != "")&&(num2 != ""))
            {

                String operator1;
                if(operator.equals("+"))
                {
                    mem2 += operator+num2;
                    operator1 = "=";
                    num = Double.toString(Double.parseDouble(num) + Double.parseDouble(num2));
                    num2 = "";

                }
                else if(operator.equals("-"))
                {
                    mem2 += operator+num2;
                    operator1 = "=";
                    num = Double.toString(Double.parseDouble(num) - Double.parseDouble(num2));
                    num2 = "";
                }
                else if(operator.equals("x"))
                {
                    mem2 += "x"+num2;
                    operator1 = "=";
                    num = Double.toString(Double.parseDouble(num) * Double.parseDouble(num2));
                    num2 = "";
                }
                else if(operator.equals("/"))
                {
                    mem2 += operator+num2;
                    operator1 = "=";
                    num = Double.toString(Double.parseDouble(num) / Double.parseDouble(num2));
                    num2 = "";
                }
                else
                {
                    mem2 += operator+num2;
                    operator1 = "=";
                    num = Double.toString(Double.parseDouble(num) % Double.parseDouble(num2));
                    num2 = "";
                }
                if(num.substring(num.length()-2).equals(".0"))
                {
                    num = num.substring(0,num.length()-2);
                }
                editText.setText(num);
                all = all+operator1+num;
                text.setText(all);
                mem1.removeAll(mem1);
                mem2 = "";
                his.add(all);
                all = num+operator;
            }
        }
    }
}