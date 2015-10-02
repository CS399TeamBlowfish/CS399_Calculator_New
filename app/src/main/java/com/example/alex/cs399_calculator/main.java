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
import android.widget.TextView;

public class main extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entry=(EditText) findViewById(R.id.enter);
        entry=(EditText) findViewById(R.id.result);
        one=(Button) findViewById(R.id.One);
        two=(Button) findViewById(R.id.Two);
        three=(Button) findViewById(R.id.Three);
        four=(Button) findViewById(R.id.Four);
        five=(Button) findViewById(R.id.Five);
        six=(Button) findViewById(R.id.Six);
        seven=(Button) findViewById(R.id.Seven);
        eight=(Button) findViewById(R.id.Eight);
        nine=(Button) findViewById(R.id.Nine);
        add=(Button) findViewById(R.id.Add);
        subtract=(Button) findViewById(R.id.Minus);
        divide=(Button) findViewById(R.id.Divide);
        multiply=(Button) findViewById(R.id.Multiply);
        clear=(Button) findViewById(R.id.Clear);
        paren=(Button) findViewById(R.id.Paren);
        percent=(Button) findViewById(R.id.Percent);
        decimal=(Button) findViewById(R.id.Decimal);
        zero=(Button) findViewById(R.id.Zero);

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
        subtact.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        paren.setOnClickListener(this);
        percent.setOnClickListener(this);
        decimal.setOnClickListener(this);
        zero.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


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
