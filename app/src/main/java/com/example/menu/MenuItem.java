package com.example.menu;

public class MenuItem {
    // Store the id of the  Prices
    public double menuPrices ;
    public int menuPictures;
    // Store the name of the menu
    public String menuName;
    // Store the release date of the menu description
    public String menuDescription;
    // stores total price
    //number of items per
    public double totalPrices;
    public double totalCalories;
    public boolean selected;
    // Constructor that is used to create an instance of the Menu object
    public MenuItem(double menuPrices, String menuName, String menuDescription, double totalPrices,double totalCalories,int menuPictures,boolean selected) {
        this.menuPrices = menuPrices;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
        this.totalPrices = totalPrices;
        this.totalCalories = totalCalories;
        this.menuPictures = menuPictures;
        this.selected = selected;

        //  this.totalPrices = totalPrices;

    }
    public static void get(int position) {
    }
}
