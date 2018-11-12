package linkedlist;

/**
 * 单向链表
 */
public class SingleNode {

    SingleNode next = null;
    int data;

    public SingleNode(int data){
        this.data = data;
    }

    /**
     * 追加节点到末尾
     * @param node
     * @return
     */
    public SingleNode appendToTail(SingleNode node){
        SingleNode end = node;
        SingleNode n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
        return end;
    }

    /**
     * 数据生成节点并追加到链表末尾
     * @param d
     * @return
     */
    public SingleNode appendToTail(int d){
        SingleNode end = new SingleNode(d);
        SingleNode n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
        return end;
    }

    public static void main(String[] args) {
        SingleNode n1 = new SingleNode(1);
        SingleNode n2 = new SingleNode(2);
        SingleNode n3 = new SingleNode(3);
        SingleNode end = n1.appendToTail(2);
        end = end.appendToTail(n2);
        end = end.appendToTail(n3);

        while (n1.next != null){
            System.out.println("node->"+n1.data);
            n1 = n1.next;
        }
        System.out.println("node->"+n1.data);
    }
}
