package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Lab3 {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam porta lorem non vestibulum vulputate. Suspendisse ac tellus nec enim ullamcorper finibus a eget quam. Donec convallis nunc nec suscipit vulputate. Quisque sodales mauris nibh, scelerisque rutrum velit finibus eu. Praesent faucibus et magna nec condimentum. Cras pellentesque facilisis nulla, et sollicitudin lorem faucibus sed. Ut vitae iaculis mi, ut facilisis augue. Sed vehicula dolor eget libero commodo pulvinar. Duis quis condimentum arcu, quis egestas orci. Nullam porta suscipit volutpat. Integer sed dignissim nulla, non molestie ligula. Sed viverra metus magna, a blandit dolor luctus pulvinar. Etiam bibendum iaculis aliquet. Sed feugiat sollicitudin eleifend. Mauris tempor odio et justo varius, cursus interdum arcu venenatis. Fusce lobortis arcu eget sollicitudin pellentesque. Nullam consectetur nec mi varius malesuada. Aenean id imperdiet magna. Duis nec justo consectetur, malesuada sapien in, gravida sapien. Curabitur pretium elit ex, vitae scelerisque arcu gravida et. Morbi a posuere purus. Aliquam sed ullamcorper urna. Mauris vel vulputate mi. Maecenas enim risus, scelerisque nec turpis id, volutpat aliquam sem. Sed in purus scelerisque, porta neque et, pharetra augue. Fusce auctor fringilla interdum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Integer vel elit vel sem posuere volutpat non accumsan libero. Nulla rutrum at tellus quis gravida. Praesent nec fermentum sem, ut volutpat libero. In suscipit posuere ullamcorper. Pellentesque tempor est non arcu rutrum blandit. Fusce eget consectetur massa. In ac nulla massa. Sed vel ultrices sem, et vehicula orci. Nullam rutrum justo ac velit tincidunt, in ullamcorper odio accumsan. Nulla vel eros ex. Nam semper congue ante auctor congue. Praesent non sem ac eros egestas dignissim eget ut sem. Nam scelerisque ante a fringilla egestas. Nulla in turpis fringilla, consequat risus ac, aliquam enim. Integer finibus elementum enim sed bibendum. Donec laoreet non nulla et pellentesque. Nunc efficitur convallis neque, sed blandit neque dignissim aliquam. Sed sodales orci sed nibh auctor, ac aliquam diam tempus. Cras luctus fermentum pellentesque. Quisque tristique eros ac sapien commodo, sit amet elementum augue maximus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam commodo dolor ex, vel congue orci elementum porttitor. Sed eget placerat massa. Donec vel bibendum orci. Maecenas semper tortor vitae porttitor egestas. Proin cursus dolor et est lobortis, et tincidunt lorem tincidunt. Nullam eget lectus posuere ipsum porttitor volutpat. Morbi auctor fringilla lorem eu finibus. Praesent sed suscipit nisi. Ut ligula lectus, euismod tincidunt arcu et, ullamcorper pellentesque risus. Nam in sollicitudin eros. Donec pulvinar velit eget purus porta laoreet. Quisque sed arcu eu enim maximus tempor ut ut ex. Etiam sapien nunc, lobortis nec ipsum quis, luctus vehicula urna. Vivamus pellentesque ac velit sit amet placerat. Maecenas convallis vestibulum lectus, sed feugiat lorem accumsan dapibus. Sed lorem augue, bibendum nec imperdiet vitae, venenatis vel tortor. Curabitur laoreet sodales dolor at viverra. Aliquam sit amet dui quis neque laoreet consequat ac ut turpis.";

        System.out.println("Sentences: " + TextManipulation.CalculateSentences(text));
        System.out.println("Words: " + TextManipulation.CalculateWords(text));
        var lettersCounts = TextManipulation.CalculateLetters(text);
        System.out.println("All letters: "+lettersCounts[0]+"; Vowels: "+lettersCounts[1]+"; Consonants: "+lettersCounts[2]);
        var topWords = TextManipulation.CalculateTopWords(text);
        var topWordsList = new ArrayList(topWords.keySet());
        System.out.println("Top Words:");
        for(int i=0; i<5; i++){
            System.out.println(i+1  +") "+topWordsList.get(i));
        }
        System.out.println("Longest Word: "+TextManipulation.CalculateLongestWord(text));
    }
}

class TextManipulation{
    //Basic Level (5-6)
    public static int CalculateSentences(String str){
        var sentenceList = str.split("[!?.:]+");
        return sentenceList.length;
    }

    public static int CalculateWords(String str){
        var wordList = str.split("\\s+");
        return wordList.length;
    }

    //AdvanceLevel (7-8)
    public static int[] CalculateLetters(String str){
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if(c >= 'a'&& c <= 'z')
                consonants++;
        }
        return new int[] {vowels+consonants, vowels, consonants};
    }

    //AdvancedLevel (9-10)
    public static Map<String, Integer> CalculateTopWords(String str){
        var map = new HashMap<String, Integer>();
        var wordList = GetCleanWordList(str);
        for(var w: wordList){
            var val = map.get(w);
            val = (val == null) ? 1 : val+1;
            map.put(w, val);
        }

        //Copy all data to LinkedHashMap
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        //Sort in reverse order (higher value on top)
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
       return reverseSortedMap;
    }

    public static String CalculateLongestWord(String str){
        var wordList = GetCleanWordList(str);
        String longestOne = wordList[0];
        for (String w:wordList) {
             if(w.length() > longestOne.length()) longestOne = w;
        }
        return longestOne;
    }

    private static String[] GetCleanWordList(String str){
      return str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
}
