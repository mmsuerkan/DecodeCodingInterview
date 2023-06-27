package org.example.netflix.groupsmilartitle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static List<List<String>> groupTitles(String[] strs){

        HashMap<String, List<String>> anagramDict = new HashMap<>();

        for(String anagram: strs){
            char[] chars = anagram.toCharArray();
            Arrays.sort(chars);
            String sortedAnagram = new String(chars);

            if(!anagramDict.containsKey(sortedAnagram)) {
                anagramDict.put(sortedAnagram, new ArrayList<>());
            }
            anagramDict.get(sortedAnagram).add(anagram);
        }

        return new ArrayList<>(anagramDict.values());
    }
}
