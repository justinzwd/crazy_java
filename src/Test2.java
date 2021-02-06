public class Test2
{
    public int getLength(ListNode head)
    {
        int length = 0;
        while(head != null)
        {
            length++;
            head = head.next;
        }

        return length;
    }
    public static void main(String[] args)
    {
        ListNode head = new ListNode(0);
        int len = new Test2().getLength(head);
        System.out.println(len);
        System.out.println((head.next == null));
    }
}
