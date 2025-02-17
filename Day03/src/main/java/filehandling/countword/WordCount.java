package filehandling.countword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class WordCount {
    public static void countWords(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Normalize the line by converting to lowercase and removing punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                // Split the line into words
                String[] words = line.split("\\s+");

                // Count word occurrences
                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Calculate total words
        int totalWords = 0;
        for (int count : wordCount.values()) {
            totalWords += count;
        }
        System.out.println("Total words in file: " + totalWords);

        // Convert HashMap to List and sort manually
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());

        for (int i = 0; i < wordList.size() - 1; i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).getValue() < wordList.get(j).getValue()) {
                    // Swap elements to sort in descending order
                    Map.Entry<String, Integer> temp = wordList.get(i);
                    wordList.set(i, wordList.get(j));
                    wordList.set(j, temp);
                }
            }
        }

        // Display the top 5 frequent words
        System.out.println("\nTop 5 most frequent words:");
        for (int i = 0; i < Math.min(5, wordList.size()); i++) {
            System.out.println(wordList.get(i).getKey() + " -> " + wordList.get(i).getValue());
        }
    }

}
