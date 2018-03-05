package accountsguy.net;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by advic on 02/03/2018.
 * This is the Adapter Class
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private static ListViewClickListener lvClickListener;
    private ArrayList<Months> monthsArrayList;

    public Adapter(ArrayList<Months> months){
        monthsArrayList = months;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent,
                false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.tvMonth.setText(monthsArrayList.get(position).getMonthName());
    }

    public interface ListViewClickListener {
        public void onListItemClick (int pos, View view);
    }

    @Override
    public int getItemCount() {
        return monthsArrayList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{

//        Button ascending, descending;
        TextView tvMonth;
        String monthName;

        public Holder(View itemView) {
            super(itemView);

//            ascending = (Button) itemView.findViewById(R.id.ascend);
//            descending = (Button) itemView.findViewById(R.id.descend);
//            ascending.setOnClickListener(this);
//            descending.setOnClickListener(this);
            tvMonth = (TextView) itemView.findViewById(R.id.month);
        }

        @Override
        public void onClick(View v) {
            lvClickListener.onListItemClick(getPosition(),v);
        }
    }
}
