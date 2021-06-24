package Lesson;

import java.util.*;

public class MaximumNumber {
    public static <K, V extends Comparable<V>> Map.Entry<K,V>
    maxUsingIteration(Map<K, V> map) {
        //To store the result and also to initialize max.
        Map.Entry<K, V> maxEntry = null;
        //Iterate in the map to find the required entry.
        for (Map.Entry<K, V> currentEntry : map.entrySet()) {
            //If maxentry is null or if the current entry is more than the max value
            if (maxEntry == null || currentEntry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = currentEntry;
            }
        }
        //Return the entry with the highest value.
        return maxEntry;
    }
    //Print the map
    public static void print(Map<String,Integer> map){
        System.out.print("Map :");
        //If map does not contain any value.
         if(map.isEmpty()){
             System.out.println("[]");
         }
         else{
             System.out.println(map);
         }

    }
    //Driver code.
    public static void main(String[] args){
       Map<String,Integer> map = new HashMap<>();
       map.put("Car",10);
       map.put("Van",20);
       map.put("Bike",30);
       print(map);
       System.out.println("Entry with maximum value " + maxUsingIteration(map));

    }

}