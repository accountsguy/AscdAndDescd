package accountsguy.net;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

//    final String MONTHS[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST",
//            "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    ArrayList<String> stringArrayList;
    private ListView listView;
    public ArrayAdapter<String> stringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringArrayList = new ArrayList<String>(Arrays.asList("JANUARY","FEBRUARY",
                "MARCH",
                "APRIL","MAY","JUNE","JULY","AUGUST",
                "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"));

        listView = (ListView) findViewById(R.id.listview);
        stringArrayAdapter = new ArrayAdapter<String>(this, android.R
                .layout.simple_list_item_1, stringArrayList);
        listView.setAdapter(stringArrayAdapter);

//        listView.setOnItemClickListener(new OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, stringArrayList.get(position),Toast.LENGTH_SHORT)
//                .show();
//            }
//        });
    }

    public void descend(View view) {
        if(!stringArrayList.get(0).contains("SEPTEMBER"))        {
            Collections.reverse(stringArrayList);
            stringArrayAdapter.notifyDataSetChanged();
        }
        else {
            Toast.makeText(this, "List is already in Descending Order", Toast.LENGTH_SHORT).show();
        }
    }

    public void ascend(View view) {
        if(!stringArrayList.get(0).contains("APRIL")){
            Collections.sort(stringArrayList);
            stringArrayAdapter.notifyDataSetChanged();
        }
        else {
            Toast.makeText(this, "List is already in Ascending Order", Toast.LENGTH_LONG).show();
        }
    }
}
