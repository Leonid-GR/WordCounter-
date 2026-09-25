package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Integer> words;

    public WordCounter() {
        words = new HashMap<>();
    }

    public void countWords(String text) {
        String[] allWords = text.toLowerCase().split("\\s+");

        for (String word : allWords) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
    }

    public int getCount(String word) {
        return words.getOrDefault(word.toLowerCase(), 0);
    }

    public String getMostFrequent() {
        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    public void printAll() {
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public Map<String, Integer> getWordsAbove(int n) {
        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > n) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}
