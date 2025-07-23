package com.company;

import java.util.*;

public class logical_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        HashMap<String, List<String>> replacements = new HashMap<>();
        replacements.put("sad", List.of("happy", "khush", "bahut khush"));
        replacements.put("angry", List.of("calm", "gusse mein"));
        replacements.put("hate", List.of("love", "prem"));
        replacements.put("tired", List.of("energetic", "joshila"));

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        Random r = new Random();
        for (int i = 0; i < words.length; i++) {

            if (replacements.containsKey(words[i])) {
                List<String> replacementWords = replacements.get(words[i]);
                int index = r.nextInt(replacementWords.size());
                words[i] = replacementWords.get(index);
            }
        }

        // Join the words back into a sentence
        String output = String.join(" ", words);

        // Print the modified sentence
        System.out.println("Modified sentence:");
        System.out.println(output);
 */
//        Random r = new Random();
//        System.out.println("Enter a sentence: ");
//        String input = sc.nextLine();
//
//        //String[] inputWords ={"hello","yes","no","ok","nice"};
//        String[] randomWords ={"good ","bad","honest","lier","dangerous"};
//
//        String[] words = input.split(" ");
//
//
//        for (int i = 0; i < words.length; i++) {
//            int randomIndex = r.nextInt(randomWords.length);
//            words[i] = randomWords[randomIndex];
//        }
//
//        // Step 5: Join the new words into a sentence
//        String newSentence = String.join(" ", words);
//        System.out.println("Randomized sentence: " + newSentence);

        //question2
/*
        String input = "00101011010101";
        int zeroCount = 0;

        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)=='0' ){
                zeroCount++;
            }
        }
        for(int i= 0;i<zeroCount;i++ ){
            System.out.print("0");
        }
        for(int i =0;i<input.length()-zeroCount;i++){
            System.out.print("1");
        }
 */

        //question 4
        int b = 5;
        int n = 0;
        for (int i = 0;i<=b;i++){
            for (int k = 0;k<=n;k++){
                System.out.print(k);
            }
            System.out.println();
            n++;
        }
    }
}

