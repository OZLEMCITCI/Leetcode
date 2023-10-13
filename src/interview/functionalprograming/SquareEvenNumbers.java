package interview.functionalprograming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareEvenNumbers {


    public static List<Integer> squareEvenNumbers(List<Integer> numbers){

//        numbers.stream().map(number->number%2==0?number*number:number).collect(Collectors.toList());
          numbers.replaceAll(number->number%2==0?number*number:number);

          return numbers;

    }
}
