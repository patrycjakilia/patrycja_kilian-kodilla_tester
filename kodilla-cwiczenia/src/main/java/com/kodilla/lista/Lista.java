package com.kodilla.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<String> vegetables = new ArrayList<>();

    public void addVegetable(String vegetable){
        vegetables.add(vegetable);
    }

    public void removeVegetable(String vegetable){
        if(!vegetables.contains(vegetable)){
            throw new IllegalArgumentException("Brak wartości na liście: " + vegetable);
        }
        vegetables.remove(vegetable);
    }

    public void findVegetable(String vegetable){
        for (int i = 0; i < vegetables.size(); i++){
            if(vegetables.get(i).equals(vegetable)){
                System.out.println("Lista zawiera: " + vegetable);
            }
        }
    }

    public List<String> getVegetables(){
        return vegetables;
        }

}
