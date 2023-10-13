package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> maxNums=new ArrayList<>();

        for(int i=0;i<nums.length-k;i++){
            maxNums.add(Arrays.stream(Arrays.copyOfRange(nums,i,i+k-1)).max().getAsInt());
        }

        maxNums.stream().mapToInt(i->i).toArray();

        return maxNums.stream().mapToInt(i->i).toArray();

    }
}
