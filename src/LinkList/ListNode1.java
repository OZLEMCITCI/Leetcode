package LinkList;

public class ListNode1 {
    @Override
    public String toString() {
        return "ListNode1{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    int val;
    ListNode1 next;

    public ListNode1(int val) {
        this.val = val;
    }

    public ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

    public ListNode1() {
    }

    public static ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {

       if(list1==null){
           return list2;
       }

        if(list2==null){
            return list1;
        }

        ListNode1 tempList=new ListNode1();

        ListNode1 pointer=tempList;

        while(list1!=null && list2 !=null){

            if(list1.val>= list2.val){
                pointer.next=list2;
                list2=list2.next;
            }else{
                pointer.next=list1;
                list1=list1.next;
            }
            pointer=pointer.next;

        }

        pointer.next=list1==null?list2:list1;

        return tempList.next;
    }

    public ListNode1 removeElements(ListNode1 head, int val) {

        if(head==null){
            return null;
        }

        ListNode1 tempList=new ListNode1(0);
        tempList.next=head;

        ListNode1 pointer=tempList;

         while(pointer!=null && pointer.next!=null){
             if(pointer.next.val==val){
                 pointer.next=pointer.next.next;
             }
             pointer=pointer.next;

         }
        return tempList.next;
    }
}
