package saikia.priyam.smart.algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Day5 {
    public static void main(String[] args) {
        System.out.println("Hello World! on " + Day5.class.getSimpleName());
        findDuplicateWordsOne("Priyam Saikia Priyam");
        findDuplicateWordsTwo("Priyam Saikia Priyam");
    }

    static void findDuplicateWordsOne(String inputString) {
        String[] words = inputString.split(" ");
        if (words.length == 1) {
            System.out.println(inputString + " only has one word");
            return;
        }

        HashMap<String, Integer> mapCountDuplicates = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (mapCountDuplicates.containsKey(words[i])) {
                mapCountDuplicates.put(words[i], mapCountDuplicates.get(words[i]) + 1);
            } else {
                mapCountDuplicates.put(words[i], 1);
            }
        }
        Set<String> set = mapCountDuplicates.keySet();
        ArrayList<String> setList = new ArrayList<>(set);
        System.out.println("Input is " + inputString);
        for (int i = 0; i < set.size(); i++) {
            String key = setList.get(i);
            Integer count = mapCountDuplicates.get(key);
            System.out.println(key + " occurs " + count + " times");
        }
    }

    static void findDuplicateWordsTwo(String inputString) {
        String[] words = inputString.split("\\s+");
        Set<String> wordSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String word : words) {
            if (!wordSet.add(word)) {
                duplicates.add(word);
            }
        }

        for (String w : duplicates) {
            System.out.println(w);
        }
    }
}
