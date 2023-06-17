package com.example.diylib.generic;

public class MyGenericContainer<E> {

    private E value;

    public MyGenericContainer(E value){
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
