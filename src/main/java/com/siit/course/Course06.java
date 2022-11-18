package com.siit.course;

import java.util.*;

public class Course06 {

    public static void runCourse06() {

        int[] arrayInt = {1, 5, 6};
        String[] arrayString = {"Alex", "are", "prune"};
        ArrayList arr3 = new ArrayList<>();

        Map<Integer, String> namesIndex = new HashMap<>();
        namesIndex.put(10, "Alex");
        namesIndex.put(7, "Andreea");
        for (Integer key : namesIndex.keySet()) {
            System.out.println(key + " : " + namesIndex.get(key));
        }
    }

    public static Set<String> getUniqueWords(String phrase) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = phrase.split(" "); //split the phrase into words
        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }

}
