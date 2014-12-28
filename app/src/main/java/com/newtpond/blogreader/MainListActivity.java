package com.newtpond.blogreader;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;


public class MainListActivity extends ListActivity {

    protected String[] mAndroidNames = {
        "Alpha (1.0)",
        "Beta (1.1)",
        "Cupcake (1.5)",
        "Donut (1.6)",
        "Eclair (2.0–2.1)",
        "Froyo (2.2–2.2.3)",
        "Gingerbread (2.3–2.3.7)",
        "Honeycomb (3.0–3.2.6)",
        "Ice Cream Sandwich (4.0–4.0.4)",
        "Jelly Bean (4.1–4.3.1)",
        "KitKat (4.4–4.4.4)",
        "Lollipop (5.0–5.0.2)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mAndroidNames);
        setListAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_list, menu);
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
