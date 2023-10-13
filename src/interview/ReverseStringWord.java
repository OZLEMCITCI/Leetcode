package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringWord {

    public static void main(String[] args) {
        System.out.println(reversedWordsSentence("Hello World!"));
        System.out.println(reversedWordsSentence("OpenAI is great"));
        System.out.println(reversedWordsSentence("123 456"));
    }

    public static String reversedWordsSentence(String word){
        List<String> list = Arrays.stream(word.split(" ")).collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining(" "));

    }
}
