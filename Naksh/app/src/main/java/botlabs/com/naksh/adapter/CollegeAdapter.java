package botlabs.com.naksh.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import botlabs.com.naksh.R;

/**
 * Created by dell on 23-03-2017.
 */

public class CollegeAdapter extends RecyclerView.ViewHolder {

    public View view;

    public CollegeAdapter(View itemView) {
        super(itemView);
        view = itemView;
    }

    public void setCollegeName(String name){
        TextView textView = (TextView) view.findViewById(R.id.name);
        textView.setText(name);
    }

}
