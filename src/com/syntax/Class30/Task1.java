package com.syntax.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer,String> buildingMap=new HashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2,"Apple");
        buildingMap.put(3,"Tesla");
        buildingMap.put(1,"Amazon");
        buildingMap.put(5,"Amazon");
        buildingMap.put(4,"Syntax");
        buildingMap.put(6,"Multiverse");
        System.out.println(buildingMap.size());
        System.out.println(buildingMap);
        buildingMap.replace(4,"Facebook"); //update
        System.out.println(buildingMap);
        buildingMap.remove(7);
        System.out.println(buildingMap);

    }
}
