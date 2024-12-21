package app;

import java.util.*;

public class MainProgram {
    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(Integer[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> checkedWords = new ArrayList<>();
        for (String word : words) {
            if (!checkedWords.contains(word)) {
                int count = 0;
                for (String w : words) {
                    if (w.equals(word)) {
                        count++;
                    }
                }
                System.out.println(word + ": " + count);
                checkedWords.add(word);
            }
        }
    }

    public static List<String> findOccurrence(List<String> words) {
        List<String> checkedWords = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (!checkedWords.contains(word)) {
                int count = 0;
                for (String w : words) {
                    if (w.equals(word)) {
                        count++;
                    }
                }
                result.add("{" + "name: \"" + word + "\", occurrence: " + count + "}");
                checkedWords.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("bird", "fox", "cat", "bird", "dog", "cat", "bird", "fox");

        System.out.println("Occurrences of 'bird': " + countOccurrence(wordList, "bird"));

        Integer[] array = {1, 2, 3};
        System.out.println("Converted to list: " + toList(array));
        // Task 3: findUnique
        List<Integer> numList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Unique numbers: " + findUnique(numList));

        System.out.println("Occurrences:");
        calcOccurrence(wordList);

        System.out.println("Occurrences as list of strings: " + findOccurrence(wordList));
    }
}