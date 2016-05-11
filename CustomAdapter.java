package com.example.rubelahmed.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rubel Ahmed on 5/11/2016.
 */
public class CustomAdapter extends BaseAdapter{

    Context context;
    String [] headlines;
    String [] content;
    String [] date;
    //string array to hold texts
   // int [] imageId; //integer array to hold image id

    private static LayoutInflater inflater=null; //layout inflater

    public CustomAdapter(Activity activity, String[] namelist, String[] contenting,String[] dates) {
        // TODO Auto-generated constructor stub
        // this is a constructor that assign the parameters sent from the mainactivity

        headlines=namelist;
        content=contenting;
        date=dates;
        context=activity;

        //imageId=imagelist;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE); //we get the inflater service
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return headlines.length;
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public static class Holder  //holder class containing view components/widgets
    {
        TextView text2;
        TextView text;
        TextView date;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();  //instansiating holder class
        View rowView;   //View type object
        rowView = inflater.inflate(R.layout.row_list, null); //inflate xml to view object
        holder.text=(TextView) rowView.findViewById(R.id.NewsHeadline); //getting id of componenets
        holder.text2=(TextView) rowView.findViewById(R.id.NewsContent);
        holder.date=(TextView) rowView.findViewById(R.id.date);
        holder.text.setText(headlines[position]);
        holder.text2.setText(content[position]);
        holder.date.setText(date[position]);
        //setting value to components
        //holder.image.setImageResource(imageId[position]);
        return rowView; // returning the view object to be set to listview
    }
}