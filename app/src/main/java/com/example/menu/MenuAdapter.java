package com.example.menu;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class MenuAdapter extends ArrayAdapter<MenuItem> {
    private Context context;
    private List<MenuItem> menuItems = new ArrayList<>();
    public MenuAdapter(Context context, ArrayList<MenuItem> list) {
        super(context, 0 , list);
        this.context = context;
        this.menuItems = list;
    }
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);

        MenuItem menuItem = menuItems.get(position);

        TextView description= (TextView) listItem.findViewById(R.id.MenuDescription);
        description.setText(menuItem.menuDescription);

        TextView name = (TextView) listItem.findViewById(R.id.MenuName);
        name.setText(menuItem.menuName);

        TextView price = (TextView) listItem.findViewById(R.id.MenuPrice);
        price.setText(String.valueOf(menuItem.menuPrices));

        TextView calories = (TextView) listItem.findViewById(R.id.TotalCalories);
        calories.setText(String.valueOf(menuItem.totalCalories));

        ImageView pictures = (ImageView) listItem.findViewById(R.id.MenuPictures);
       pictures.setImageResource((menuItem.menuPictures));

        if (menuItem.selected) {
            listItem.setBackgroundColor(Color.RED);
                  } else {
            listItem.setBackgroundColor(Color.WHITE);
        }

        return listItem;
    }
}