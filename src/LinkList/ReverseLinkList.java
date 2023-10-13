package LinkList;

import java.util.*;

public class ReverseLinkList {

    public ListNode reverseLinkListWithArray(ListNode head){
        ListNode current=head;
        ArrayList<Integer> tempList=new ArrayList<>();

        while(current!=null){
            tempList.add(current.val);
            current=current.next;
        }

        ListNode reversedList=null;

        for(int i=tempList.size()-1;i>=0;i--){
            ListNode newNode=new ListNode(tempList.get(i));
           reversedList.next=newNode;
        }

        return reversedList;

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode pointer=head;
        HashSet<Integer> hashMap=new HashSet<>();
        int counter=0;
        while(pointer!=null){
            hashMap.add(pointer.val);
            pointer=pointer.next;
        }
         List<Integer> list=new ArrayList<>();

        hashMap.stream().forEach(e->list.add(e));



        counter=0;

        ListNode pointer2=head;

        while(counter<=hashMap.size()-1){
            pointer2.val= list.get(counter);
            counter++;
            pointer2=pointer2.next;
        }
        pointer.next=null;

        return head;
    }

}
