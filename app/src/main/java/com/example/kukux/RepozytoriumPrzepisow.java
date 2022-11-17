package com.example.kukux;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    public static final Przepis[] przepisy = {
            new Przepis("Bomba Nuklearna", 1, "Nie wiem, wikipedia", R.drawable.bomba1),
            new Przepis("Car Bomba", 1, "Nie wiem, wikihow", R.drawable.bomba2),
            new Przepis("Bomba Wodna", 1, "Nie wiem, Uranium", R.drawable.bomba3),
            new Przepis("Long Face Dog", 3, "Chińszczyzna", R.drawable.dog1),
            new Przepis("Long Face Dog po włosku", 3, "Pizza", R.drawable.dog2),
            new Przepis("Travis Scott", 2, "Good Music, Cant breath", R.drawable.kanye),
            new Przepis("Herbata", 0, "Kubek, Woda, Torebka herbaty, cukier", R.drawable.herbata)
    };
    public static ArrayList<Przepis> wybierzPrzepisy (int kategoria){
        ArrayList<Przepis> wybrane = new ArrayList<>();

        for(Przepis przepis:przepisy){
            if(przepis.getKategoria() == kategoria){
                wybrane.add(przepis);
            }
        }

        return wybrane;
    }
}
