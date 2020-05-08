/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

/**
 * @author MessiahJK
 * @version : T2AddTwoNumbers.java 2020/05/08 13:19 MessiahJK
 */
public class T2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHaed=new ListNode(0);
        ListNode n1=l1,n2=l2,curr=dummyHaed;
        int carry=0;
        int x,y,temp;
        while (n1!=null||n2!=null){
            x=(n1!=null)?n1.val:0;
            y=(n2!=null)?n2.val:0;
            temp=x+y+carry;
            carry=temp/10;
            curr.next=new ListNode(temp%10);
            curr=curr.next;
            if(n1!=null){
                n1=n1.next;
            }
            if(n2!=null){
                n2=n2.next;
            }
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        return dummyHaed.next;
    }
}
