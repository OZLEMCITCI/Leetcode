import java.util.HashMap;

public class GridTraveler {

    public static void main(String[] args) {

        HashMap<String,Long> map=new HashMap<>();

        System.out.println(gridTraveler(3,2,map));

    }

    public static long gridTraveler(long row, long col, HashMap<String,Long> map){
        String key=(row) +":"+(col);

        if(map.containsKey(key)){
            return map.get(key);
        }

        if(row==1 || col==1 ){
            return 1;
        }

        if(row==0 || col==0 ){
            return 0;
        }

        long value=gridTraveler(row-1,col,map) +gridTraveler(row,col-1,map);

        map.put(key,value);

        System.out.println("hello");

        return map.get(key);



    }
}
