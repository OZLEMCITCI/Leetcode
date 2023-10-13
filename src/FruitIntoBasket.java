import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int [] fruit ={3,3,3,1,2,1,1,2,3,3,4};

        System.out.println(FruitIntoBasket(fruit));

    }

    public static int FruitIntoBasket(int [] fruits){

        if(fruits.length==1){
            return 1;
        }

        if(fruits.length==2){
            return 2;
        }

        int count=1;

        for(int i=0;i<fruits.length-1;i++){
            if(fruits[i]==fruits[i+1]){
                count++;
            }else{
                count++;
                break;
            }
        }

        int countTemp=count;
        System.out.println(count);
       //
        List<Integer> fruitBasket=new ArrayList<>();


        for(int i=0;i<fruits.length-1;i++){
            int a =fruits[i];
            int b=fruits[i+1];
             for(int j=i+2;j<fruits.length;j++){
                 if(a==fruits[j]||b==fruits[j]){
                     count++;
                 }else{
//                     fruitBasket.add(count);
//                     count=0;
                     break;
                 }

             }
            fruitBasket.add(count);

            count=countTemp;

             if(count==fruits.length)
                 break;


        }


        return 1;
    }

  public static int nickSolution(int[] fruits){
         int firstFruitIndex=0;
         int secondFruitIndex=0;

         int tempNumberOfFruits=0;

         int longestNumberOfFruits=0;

         for(int i=firstFruitIndex;i<fruits.length-1;i++){
             if(fruits[i]==fruits[i+1]  ){
                 tempNumberOfFruits++;
             }
         }


return 1;
  }

}
