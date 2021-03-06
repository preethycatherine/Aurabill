package com.example.velu.imagebtn;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view .LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
    private String[] names;
  //  private String[] symbol;
    private String[] desc;
    private Integer[] imageid;
    private Activity context;
    private String[] btn;
   //public CustomList(Activity context,String[] names,String[] desc,Integer[] imageid,String[] btn)
    public CustomList(Activity context,String[] names,String[] desc,Integer[] imageid)
    {
        super(context,R.layout.list_layout,names);
        this.context=context;
        this.names=names;
        this.desc=desc;
        this.imageid=imageid;

    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem =inflater.inflate(R.layout.list_layout,null,true);
        TextView textViewName =(TextView)listViewItem.findViewById(R.id.textViewName);
        TextView textViewDesc =(TextView)listViewItem.findViewById(R.id.textViewDesc);
        ImageView image=(ImageView)listViewItem.findViewById(R.id.imageView);
      //  EditText quantity=(EditText)listViewItem.findViewById(R.id.quantity) ;
        textViewName.setText(names[position]);
        textViewDesc.setText(desc[position]);
        image.setImageResource(imageid[position]);
       // quantity.setText(txt[position]);
        return  listViewItem;
    }
}
