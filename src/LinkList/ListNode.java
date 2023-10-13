package LinkList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListNode {
    int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();
        if (head == null) {
            return false;
        }
        ListNode mylistNode = head;

        while (mylistNode != null) {

            if (hashSet.contains(mylistNode)) {
                return true;
            }
            hashSet.add(mylistNode);
            mylistNode = mylistNode.next;

        }
        return true;

    }


    public ListNode hasCycle3(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();
        if (head == null) {
            return null;
        }
        ListNode mylistNode = head;

        while (mylistNode != null) {

            if (hashSet.contains(mylistNode)) {
                return mylistNode;
            }
            hashSet.add(mylistNode);
            mylistNode = mylistNode.next;

        }
        return null;

    }


    public ListNode hasCycle2 (ListNode head){

        HashMap<ListNode, Integer> hashMap = new HashMap<>();
        int counter = 0;
        if (head == null) {
            return null;
        }
        ListNode mylistNode = head;

        while (mylistNode != null) {

            if (hashMap.containsKey(mylistNode)) {
                return mylistNode;
            }

            hashMap.put(mylistNode, counter++);
            mylistNode = mylistNode.next;

        }

        return null;

    }

    public boolean hasCycleFlodys(ListNode head) {
          if(head==null||head.next==null){
              return false;
          }

          ListNode slow=head;
          ListNode fast=head;

          while(fast!=null || fast.next!=null ){
              slow=slow.next;
              fast=fast.next.next;
              if(slow==fast){
                  return true;
              }
          }

          return false;

    }

    public ListNode hasCycle6 (ListNode head){

       if(head==null && head.next==null){
           return null;
       }

       ListNode slow=head;
       ListNode fast=head;

       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;

           if(slow==fast){
               slow=head;
               while (fast!=slow){
                   fast=fast.next;
                   slow=slow.next;

               }
               return slow;
           }
       }



        return null;

    }


    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode traverser=head;
            ArrayList<Integer> tempList=new ArrayList<>();


            while(traverser!=null){
                tempList.add(traverser.val);
                traverser=traverser.next;
            }


            ListNode pointer=head;

           for(int i=tempList.size()-1;i>=0;i++){
               pointer.val=tempList.get(i);
               pointer=pointer.next;
           }

            return head;

        }

        public ListNode reverseList2(ListNode head) {

            ListNode reversedList=null;

            while(head!=null){
                ListNode newElement=new ListNode(head.val);
                newElement.next=reversedList;
                reversedList=newElement;
                head=head.next;
            }

            return reversedList;

        }

        public ListNode deleteDuplicates(ListNode head) {

            ListNode pointer=head;
            int counter=0;
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            while(pointer!=null){
                if(!hashMap.containsValue(pointer.val)){
                hashMap.put(counter, pointer.val);
                counter++;
                }
                pointer=pointer.next;
            }
            int counter2=0;
            ListNode newHead=new ListNode(hashMap.get(0));
            ListNode pointer1=newHead;


            while(counter2<=hashMap.size()){
                    ListNode newListNode=new ListNode(hashMap.get(counter2));
                    counter2++;
                    pointer1.next=newListNode;
                pointer1=pointer1.next;}

            return newHead.next;
            }

        }
    }




