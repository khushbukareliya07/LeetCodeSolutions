public class LinkedListt {
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node;    // Edge case: First node added will be assigned as Head.
        }
        else
        {
            Node n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;      //if present head node has null pointer, we assign it the address of Next node! This works as a link between two nodes.
        }

    }


    public void insertAtStart(int data)
    {
       Node node = new Node();
       node.data = data;
       node.next = head;
       head = node;
    }

    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        for(int j =0; j<index -1; j++)
        {
            n=n.next;
        }
        node.next = n.next;
        n.next = node;

    }

    public void display()
    {
        Node n = head;
        while(n.next != null)
        {
                System.out.println(n.data);
                n = n.next;
        }
        System.out.println(n.data);
    }

}


