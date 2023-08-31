package com.lzlgdx.elts.ui;

import java.util.ArrayList;

public interface Observable {
    ArrayList<Observer> observers=new ArrayList<>();
    default void addObserver(Observer observer){
        observers.add(observer);
    }
    default void removeObserver(Observer observer){
        observers.remove(observer);
    }
    void notifyObserver(String command);
}
