package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class logical_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<String, String> replacements = new HashMap<>();
        replacements.put("sad", "happy");
        replacements.put("angry", "calm");
        replacements.put("hate", "love");
        replacements.put("tired", "energetic");


        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        for(int i = 0;i< words.length;i++){
                // Check if the word is in the replacements map
                if (replacements.containsKey(words[i])) {
                    // Replace the word with its replacement
                    words[i] = replacements.get(words[i]);
                }
            }

            // Join the words back into a sentence
            String output = String.join(" ", words);

            // Print the modified sentence
            System.out.println("Modified sentence:");
            System.out.println(output);

        }
    }

