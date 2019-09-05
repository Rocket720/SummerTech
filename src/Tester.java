public class Tester {

    public static void main(String[] args) {

        BinaryTree test = new BinaryTree(0);
        BinaryNode a = new BinaryNode(1);
        test.root.setNextANode(a);
        BinaryNode b = new BinaryNode(2);
        test.root.setNextBNode(b);
        a.setNextANode(new BinaryNode(3));
        b.setNextBNode(new BinaryNode(4));

        System.out.println(test.size());

    }

}
