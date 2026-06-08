class Node{
        int data;
        Node next;
        Node(int data){
                this.data=data;
                this.next=null;
        }
}
public class newLinked
{
        public static Node insertbeg(Node head, int newvalue){
                Node newnode=new Node(newvalue);
                newnode.next=head;
                return newnode;
        }
        public static void insertend(Node head, int newvalue){
                Node newnNode=new Node(newvalue);
                if(head==null){
                        System.out.println("list empty");
                        return;
                }
                Node temp=head;
                while(temp.next!=null){
                        temp=temp.next;
                }
                temp.next=newnNode;
        }
        public static void printList(Node node){
                while(node!=null){
                        System.out.println(node.data + "->");
                }
                System.out.println("Null");
        }
        
        public static void main(String[] args) {
                Node head=null;
                head=insertbeg(head, 10);
                head=insertbeg(head, 20);
                insertend(head, 30);
                printList(head);
        }       
}