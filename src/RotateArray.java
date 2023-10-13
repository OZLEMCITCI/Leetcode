import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums,3);

    }
    public static void rotate(int[] nums, int k) {

        int [] tempfirstPart=Arrays.copyOfRange(nums,nums.length-k,nums.length);

        int [] tempsecondPart=Arrays.copyOfRange(nums,0,k+1);

//        int[] integers = IntStream.concat(Arrays.stream(tempfirstPart), Arrays.stream(tempsecondPart))
//                .toArray();
//
//        nums=integers;
//
//        System.out.println(Arrays.toString(nums));

        int index=0;
        for(int i:tempfirstPart){
           nums[index]=i;
           index++;
        }

        for(int i:tempsecondPart){
            nums[index]=i;
            index++;
        }



    }
}
