package com.example.a1338559.listviewlab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TeamDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_description);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("teamname");

        LinearLayout ll = new LinearLayout(this);
        TextView tv1 = new TextView(this);
        tv1.setText(message);
        tv1.setTextSize(24);
        tv1.setTextColor(Color.RED);
        ll.addView(tv1);

        if(bundle.getString("teamname").equals("bengals"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.bengals);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc1);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("colts"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.colts);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc2);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("eagles"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.eagles);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc3);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("packers"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.packers);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc4);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("panthers"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.panthers);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc5);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("patriots"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.patriots);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc6);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("redskins"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.redskins);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc7);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("seahawks"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.seahawks);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc8);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("steelers"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.steelers);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc9);
            ll.addView(teamdescription);
        }
        else if(bundle.getString("teamname").equals("texans"))
        {
            ImageView img = new ImageView(this);
            img.setImageResource(R.drawable.texans);
            ll.addView(img);
            TextView teamdescription = new TextView(this);
            teamdescription.setText(R.string.desc10);
            ll.addView(teamdescription);
        }
    }
}
