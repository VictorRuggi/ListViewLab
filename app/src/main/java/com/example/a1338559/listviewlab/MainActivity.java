package com.example.a1338559.listviewlab;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements View.OnClickListener {

    ListView lv;
    Context context;
    ArrayList prgmName;
    public int[] prgmImages={R.drawable.bengals,R.drawable.colts,R.drawable.eagles,R.drawable.packers,R.drawable.panthers,R.drawable.patriots,R.drawable.redskins,R.drawable.seahawks,R.drawable.steelers,R.drawable.texans};
    public String[] prgmNameList={this.getResources().getString(R.string.bengals),
            this.getResources().getString(R.string.colts),this.getResources().getString(R.string.eagles),
            this.getResources().getString(R.string.packers),
            this.getResources().getString(R.string.panthers),
            this.getResources().getString(R.string.patriots),
            this.getResources().getString(R.string.redskins),
            this.getResources().getString(R.string.seahawks),this.getResources().getString(R.string.steelers),
            this.getResources().getString(R.string.texans)};
    LinearLayout ll, ll2;
    Button b1, b2;
    TextView tv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            context=this;

            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            ll2 = new LinearLayout(this);
            ll2.setOrientation(LinearLayout.HORIZONTAL);

            b1 = new Button(this);
            b1.setText("About");
            b1.setOnClickListener(this);
            ll2.addView(b1);

            b2 = new Button(this);
            b2.setText("WWW");
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String url = "http://www.nfl.com";
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(i);
                }
            });
            ll2.addView(b2);
            ll.addView(ll2);

            lv=(ListView) findViewById(R.id.listView);
            tv = (TextView)findViewById(R.id.textView);
            ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, prgmNameList);
            lv.setAdapter(aa);
            lv.setClickable(true);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String selectedFromList = lv.getItemAtPosition(i).toString();

                    Intent in = new Intent(MainActivity.this, TeamDescription.class);
                    in.putExtra("teamname", selectedFromList);
                    startActivity(in);
                }
            });

            ll.addView(lv);
    }

    @Override
    public void onClick(View view)
    {
        Toast.makeText(this, R.string.appdescription, Toast.LENGTH_LONG).show();
    }
}
