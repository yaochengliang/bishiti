package linkedlist;


import java.util.Hashtable;

/**
 * 删除链表中的重复节点
 */
public class DeleteDuplicateNodes {

    /**
     * 使用散列表的方式，时间复杂度 O（N）
     * @param node
     */
    public static void deleteDuplicateNodes(SingleNode node){
        Hashtable hashtable = new Hashtable();
        SingleNode previous = null;
        while (node != null){
            if (hashtable.containsKey(node.data)){
                previous.next = node.next;
            }else{
                hashtable.put(node.data,true);
                previous = node;
            }
            node = node.next;
        }
    }

    /**
     * 不使用临时缓冲区  时间复杂度 O（N^2）
     * @param head
     */
    public static void deleteDuplicateNodes2(SingleNode head){
        if (null == head) return;

        SingleNode current = head;
        while (null != current){
            SingleNode nextNode = current;
            while (nextNode.next != null){
                if (current.data == nextNode.next.data){
                    nextNode.next = nextNode.next.next;
                } else {
                    nextNode = nextNode.next;
                }
            }
            current = current.next;
        }
    }



    public static void main(String[] args) {
        SingleNode n1 = new SingleNode(1);
        SingleNode n2 = new SingleNode(1);
        SingleNode n3 = new SingleNode(2);
        SingleNode n4 = new SingleNode(3);
        SingleNode n5 = new SingleNode(4);
        SingleNode n6 = new SingleNode(4);
        SingleNode end = n1.appendToTail(n2);
        end = end.appendToTail(n3);
        end = end.appendToTail(n4);
        end = end.appendToTail(n5);
        end = end.appendToTail(n6);

//        deleteDuplicateNodes(n1);
        deleteDuplicateNodes2(n1);
        while (n1.next != null){
            System.out.println("node->"+n1.data);
            n1 = n1.next;
        }
        System.out.println("node->"+n1.data);
    }
}
