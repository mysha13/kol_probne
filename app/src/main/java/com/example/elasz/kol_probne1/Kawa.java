package com.example.elasz.kol_probne1;

/**
 * Created by elasz on 03.01.2018.
 */

public class Kawa {
    private String Price;
    private String Name;

    public Kawa(String name, String price) {
        this.Name=name;
        this.Price=price;
    }

    public String getName() {
                return Name;
            }

            public void setName(String name) {
                Name = name;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String price) {
                Price = price;
            }



}
