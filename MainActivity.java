package com.example.rubelahmed.customlist;


//do not forget to replace with your own package here

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView list;
    TextView textView;
    //we create array of id of images & array of the text
   // public static int[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    public static String[] headlines = {"C (programming language)", "C++ (programming language)",
            "JAVA (programming language)", "PHP: Hypertext Preprocessor"};
    public static String[] content = {"C was originally developed by Dennis Ritchie between 1969 and 1973",
            "C++ is a middle-level programming language developed by Bjarne Stroustrup",
            "Java is a general-purpose computer programming language that is concurrent, class-based," +
                    " object-oriented, and specifically designed ", "Server-side HTML embedded scripting language. " +
            "It provides web developers with a full suite of tools for building dynamic websites"};
    public static String[] date = {"29/10/1994", "20/12/2015", "19/1/1995", "11/11/2011"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);
        list.setAdapter(new CustomAdapter(MainActivity.this, headlines, content,date)); //we pass context, array of image id  & names to custom adapter
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //textView.setText("clicked item is " + headlines[position]); // on click we get the position and use it to get clicked item

    }
}