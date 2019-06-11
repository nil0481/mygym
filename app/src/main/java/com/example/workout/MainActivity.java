package com.example.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Spinner spinner;
    ScrollView scrollView;

    advise advise=new advise();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        spinner=(Spinner)findViewById(R.id.spinner);

    }

    public void clk(View view) {
        String display=String.valueOf(spinner.getSelectedItem());
        //textView.setText(display);
        List<String> list=advise.workname(display);
        StringBuilder buildwork=new StringBuilder();
        for (String x:list) {
            buildwork.append(x).append("\n\n");
        }
        textView.setText(buildwork);
        textView.setMovementMethod(new ScrollingMovementMethod());

        }

/*
    public boolean onOptionsItemSelected(Spinner item) {
        if (item.getSelectedItem()=="chest")
            textView.setText("dddd");

        return true;


    }*/
}

