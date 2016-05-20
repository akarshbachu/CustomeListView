package mgit.customelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bachu_000 on 23-03-2016.
 */
public class CustomeAdapter extends ArrayAdapter<Custome>{
    Context mContext;
    int mLayoutResourceId;
    Custome mData[]=null;

    public CustomeAdapter(Context context, int resource, Custome[] data) {
        super(context, resource, data);
        this.mContext=context;
        this.mLayoutResourceId=resource;
        this.mData=data;

    }

    @Override
    public Custome getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        //inflating layout for single row
        LayoutInflater inflater=LayoutInflater.from(mContext);
        row=inflater.inflate(mLayoutResourceId,parent,false);
        //get a reference of every element of the view u want to update
        TextView name= (TextView) row.findViewById(R.id.textView);
        TextView roll=(TextView)row.findViewById(R.id.textView2);
        ImageView imageView=(ImageView) row.findViewById(R.id.imageView);
        //get data from data array
        Custome custome=mData[position];
        //setting the view to reflect the data
        name.setText(custome.name);
        roll.setText(String.valueOf(custome.rollNum));

        int resId=mContext.getResources().getIdentifier(custome.image,"drawable",mContext.getPackageName());
        imageView.setImageResource(resId);
        //returning the row view
        return row;
    }
}
