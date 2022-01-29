package com.example.menu;
/*This is the vegan file
this file  incorporates a menu items
has constructor
requires on item click
menu items have a counter on the application
 */

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
public class Vegan extends Fragment {
    ArrayList<MenuItem> menuItems;
    ListView listView;
    private static MenuAdapter adapter;
    public Vegan() {
        // required empty public constructor.
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vegan_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.listview);
        //sets array list for items
        this.menuItems = new ArrayList<>();
        this.menuItems.add(new MenuItem(10.0, "Eggs", "plant goods", 0,9,R.drawable.eggs,false));
        this.menuItems.add(new MenuItem(10.0, "Eggs", "plant goods", 0,1,R.drawable.onion,false));
        this.menuItems.add(new MenuItem(20.0, "cheddar", "plant goods", 0,13,R.drawable.cheddar,false));
        this.menuItems.add(new MenuItem(30.0, "Limburger", "plant goods", 0,10,R.drawable.limburger,false));
        this.menuItems.add(new MenuItem(40.0, "parmesan", "plant goods", 0,11,R.drawable.pamersan,false));
        this.adapter = new MenuAdapter(getActivity(), this.menuItems);

        final TextView textView = (TextView) view.findViewById(R.id.TotalCalories);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MenuItem selectedItem = (MenuItem)parent.getItemAtPosition(position);
                boolean current =(selectedItem.selected);
                selectedItem.selected = (!current);
                if (selectedItem.selected) {
                    view.setBackgroundColor(Color.RED);
                } else {
                    view.setBackgroundColor(Color.WHITE);
                }
                for (MenuItem i : menuItems) {
                    //add calculate with felica
                }
                textView.setText("The total calories: " + selectedItem.totalCalories);

            }
        });
        return view;

    }
}




