package Lesson10;
import java.util.*;

public class CollectionList6 {
    public static void main(String[] args) {
        String text = "Это совершенноне, это не связаный текст не это";
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for (String word : words) {
            wordsMap.put(word, Collections.frequency(wordsList, word));
        }
        System.out.println("Слов в тексте встречается : " +  wordsMap);
    }
}
