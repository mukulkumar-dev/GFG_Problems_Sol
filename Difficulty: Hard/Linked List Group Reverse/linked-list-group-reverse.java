//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head==null && k<=1){
            return head;
        }
        int count=0;
        Node dummy=head;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        Node temp=new Node(0);
        temp.next=head;
        Node prevGroup=temp;
        while(count>0){
            int currk=Math.min(k,count);
            Node groupStart=prevGroup.next;
            Node prev=null;
            Node curr=groupStart;
            Node next=null;
            for(int i=0;i<currk;i++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            prevGroup.next=prev;
            groupStart.next=curr;
            prevGroup=groupStart;
            count-=k;
        }
        return temp.next;
    }
}
