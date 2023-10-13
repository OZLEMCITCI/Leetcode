import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray {

    int size=0;
    int [] items=new int[5];

    public MyArray() {

    }

    public void addItem(int item){
        if(size<items.length){
        this.items[size]=item;
        size++;}
        else{
            this.items= Arrays.copyOf(items,10);
            this.items[size]=item;
            size++;
        }

    }

    public int getSize() {
        return size;
    }

    public int[] getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "size=" + size +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        MyArray myArray=new MyArray();
        myArray.addItem(5);
        myArray.addItem(5);
        myArray.addItem(5);
        myArray.addItem(5);
        myArray.addItem(5);
        myArray.addItem(5);
        System.out.println(Arrays.toString(myArray.getItems()));
        System.out.println(myArray.getSize());

    }

}
