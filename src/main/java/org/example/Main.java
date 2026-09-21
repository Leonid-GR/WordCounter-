package org.example;

public class Main {
    public static void main(String[] args) {

        WordCounter counter = new WordCounter();

        counter.countWords("java python java java python code");

        System.out.println("Java: " + counter.getCount("java"));
        System.out.println("Самое частое слово: " + counter.getMostFrequent());

        System.out.println("Все слова:");
        counter.printAll();

        System.out.println("Слова, которые встречаются больше 1 раза:");
        System.out.println(counter.getWordsAbove(1));
    }
}
