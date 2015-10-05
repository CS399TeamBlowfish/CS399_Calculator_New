package com.example.alex.cs399_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.io.IOError;


public class main extends Activity implements OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button add;
    Button subtract;
    Button divide;
    Button multiply;
    Button clear;
    Button sign;
    Button percent;
    Button decimal;
    Button zero;
    Button equal;
    TextView entry;
    TextView result;
    String op[] = new String[100];
    Double temp;
    ImageButton options;
    Intent er;
    private CharSequence l;
    String f;
    Double j;
    String k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entry=(TextView ) findViewById(R.id.enter);
        result=(TextView ) findViewById(R.id.result);
        one=(Button) findViewById(R.id.One);
        two=(Button) findViewById(R.id.Two);
        three=(Button) findViewById(R.id.Three);
        four=(Button) findViewById(R.id.Four);
        five=(Button) findViewById(R.id.Five);
        six=(Button) findViewById(R.id.Six);
        seven=(Button) findViewById(R.id.Seven);
        eight=(Button) findViewById(R.id.Eight);
        nine=(Button) findViewById(R.id.Nine);
        add=(Button) findViewById(R.id.Plus);
        subtract=(Button) findViewById(R.id.Minus);
        divide=(Button) findViewById(R.id.Divide);
        multiply=(Button) findViewById(R.id.Multiply);
        clear=(Button) findViewById(R.id.Clear);
        sign=(Button) findViewById(R.id.Sign);
        percent=(Button) findViewById(R.id.Percent);
        decimal=(Button) findViewById(R.id.Decimal);
        zero=(Button) findViewById(R.id.Zero);
        equal= (Button)findViewById(R.id.Equal);
        options =(ImageButton) findViewById(R.id.Options);

        equal.setOnClickListener(this);
        one.setOnClickListener((OnClickListener) this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        sign.setOnClickListener(this);
        percent.setOnClickListener(this);
        decimal.setOnClickListener(this);
        zero.setOnClickListener(this);
        options.setOnClickListener(this);




    }

@Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Zero:
                entry.append("0");
                l=entry.getText();
                f= String.valueOf(l);
                Expression zero0  = new ExpressionBuilder(f).build();
                j = zero0.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.One:
                entry.append("1");
                l=entry.getText();
                f= String.valueOf(l);
                Expression one1 = new ExpressionBuilder(f).build();
                j = one1.evaluate();
                k = String.valueOf(j);
                result.setText(k);
                break;
            case R.id.Two:
                entry.append("2");
                l=entry.getText();
                f= String.valueOf(l);
                Expression two2 = new ExpressionBuilder(f).build();
                j = two2.evaluate();
                k = String.valueOf(j);
                result.setText(k);
                break;
            case R.id.Three:
                entry.append("3");
                l=entry.getText();
                f= String.valueOf(l);
                Expression three3 = new ExpressionBuilder(f).build();
                j = three3.evaluate();
                k = String.valueOf(j);
                result.setText(k);
                break;
            case R.id.Four:
                entry.append("4");
                l=entry.getText();
                f= String.valueOf(l);
                Expression four4 = new ExpressionBuilder(f).build();
                j = four4.evaluate();
                k = String.valueOf(j);
                result.setText(k);
                break;
            case R.id.Five:
                entry.append("5");
                l=entry.getText();
                f= String.valueOf(l);
                Expression five5 = new ExpressionBuilder(f).build();
                j = five5.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.Six:
                entry.append("6");
                l=entry.getText();
                f= String.valueOf(l);
                Expression six6 = new ExpressionBuilder(f).build();
                j = six6.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.Seven:
                entry.append("7");
                l=entry.getText();
                f= String.valueOf(l);
                Expression seven7 = new ExpressionBuilder(f).build();
                j = seven7.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.Eight:
                entry.append("8");
                l=entry.getText();
                f= String.valueOf(l);
                Expression eight8 = new ExpressionBuilder(f).build();
                j = eight8.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.Nine:
                entry.append("9");
                l=entry.getText();
                f= String.valueOf(l);
                Expression nine9 = new ExpressionBuilder(f).build();
                j = nine9.evaluate();
                k = String.valueOf(j);

                result.setText(k);
                break;
            case R.id.Clear:
                entry.setText("");
                result.setText("");
                break;
            case R.id.Decimal:
                try{
                entry.append(".");
                l=entry.getText();
                f= String.valueOf(l);
                Expression decimaldot = new ExpressionBuilder(f).build();
                j = decimaldot.evaluate();
                k = String.valueOf(j);
                result.setText(k);}
                catch(IOError e){
                    entry.append("");
                }
                break;
            case R.id.Divide:
                try{
                entry.append("/");}
                catch(IOError e ){
                    entry.append("");
                }
                break;
            case R.id.Multiply:
                try{
                entry.append("*");}
                catch(IOError e ){
                    entry.append("");
                }
                break;
            case R.id.Minus:
                try{
                entry.append("-");}
                catch(IOError e ){
                    entry.append("");
                }
                break;
            case R.id.Plus:
                try{
                entry.append("+");}
                catch(IOError e ){
                    entry.append("");
                }
                break;
            case R.id.Sign:
                l=entry.getText();
                try{
                entry.append("*-1");
                l=entry.getText();
                f= String.valueOf(l);
                Expression neg = new ExpressionBuilder(f).build();
                j = neg.evaluate();
                k = String.valueOf(j);
                result.setText(k);}
                catch(IOError e ){
                    entry.append("1*-1");
                }
                break;
            case R.id.Equal:
                l=entry.getText();
                f= String.valueOf(l);
                Expression eq = new ExpressionBuilder(f).build();
                j = eq.evaluate();
                k = String.valueOf(j);
                entry.setText(k);
                result.setText(k);
                break;
            case R.id.Percent:
                l=entry.getText();
                try{

                entry.append("*.01");
                f= String.valueOf(l);
                Expression p = new ExpressionBuilder(f).build();
                j = p.evaluate();
                k = String.valueOf(j);
                result.setText(k);}
                catch(IOError e ){
                    entry.append("");
                }
                break;
            case R.id.Options:
                Intent er= new Intent(this,MenuScreen.class);
                startActivity(er);
                break;









        }


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
