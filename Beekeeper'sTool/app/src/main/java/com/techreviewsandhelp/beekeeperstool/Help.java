package com.techreviewsandhelp.beekeeperstool;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by crua9 on 4/3/2015.
 */
public class Help extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);


    Button b1 = (Button)findViewById(R.id.help_youtube);



        Button start = (Button)findViewById(R.id.start);

                final Context c = this;


        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(c, Start.class));
                finish();
            }
        });

          b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent yt = new Intent(Intent.ACTION_VIEW);
                        yt.setData(Uri.parse("https://www.youtube.com/playlist?list=PLioOFeHwQV5wqTf9S43CmwNml4UBXYqkT"));
                        startActivity(yt);

        Button git = (Button)findViewById(R.id.Github);

        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt = new Intent(Intent.ACTION_VIEW);
                yt.setData(Uri.parse("https://github.com/crua9"));
                startActivity(yt);
            }});}});}}