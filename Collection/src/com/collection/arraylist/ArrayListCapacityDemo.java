package com.collection.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

class ArrayListCapacityDemo {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException  {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // Access internal array using reflection
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] elementData = (Object[]) field.get(list);

        System.out.println("Size     : " + list.size());
        System.out.println("Capacity : " + elementData.length);
    }
}
