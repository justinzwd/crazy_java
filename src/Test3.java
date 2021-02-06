public class Test3
{

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode dummy = new ListNode(0);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("dummy的地址值：" + dummy);
        System.out.println("head的地址值：" + head);

        dummy.next = head;
        System.out.println(dummy.next.val);
        head = dummy;
        head.val = 55;
        System.out.println(dummy.next.val);
        System.out.println(head.val);
        System.out.println(dummy.val);
        //
        //System.out.println("dummy的地址值：" + dummy);
        //System.out.println("head的地址值：" + head);
        //
        //while(head.next != null)
        //{
        //    head = head.next;
        //}
        //System.out.println("head的地址值：" + head);
        //System.out.println("node4的地址值：" + node4);
    }
}
