package accountsguy.net;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Months> MONTHS = new ArrayList<>();
    final String StringMonths[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST",
            "SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    private ListView lv;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**        https://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
       adapter.notifyDataSetChanged();
        Suggested input*/

        MONTHS = new ArrayList<>();
        for (int i = 0; i<=12; i++){
            Months months = new Months();
            months.setMonthName(StringMonths[i]);
            MONTHS.add(months);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclierView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();

        Adapter adapter = new Adapter(MONTHS);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        MONTHS.clear();
//        MONTHS.add(0,"JANUARY");
//        MONTHS.add(1,"FEBRUARY");
//        MONTHS.add(2,"MARCH");
//        MONTHS.add(3,"APRIL");
//        MONTHS.add(4,"MAY");
//        MONTHS.add(5,"JUNE");
//        MONTHS.add(6,"JULY");
//        MONTHS.add(7,"AUGUST");
//        MONTHS.add(8,"SEPTEMBER");
//        MONTHS.add(9,"OCTOBER");
//        MONTHS.add(10,"NOVEMBER");
//        MONTHS.add(11,"DECEMBER");

        //lv = (ListView) findViewById(R.id.month);
//        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,
//                MONTHS);
    }

    public void descend(View view) {
//        Collections.reverse(MONTHS);
//        lv.setAdapter(adapter);
//        Toast.makeText(this, "List shown in Descending Order", Toast.LENGTH_LONG).show();
    }

    public void ascend(View view) {
        //Collections.sort(MONTHS);
//        Collections.sort(MONTHS, )
//        lv.setAdapter(adapter);
//        Toast.makeText(this, "List shown in Ascending Order", Toast.LENGTH_LONG).show();
    }
}
