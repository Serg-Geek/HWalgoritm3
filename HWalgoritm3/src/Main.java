public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer> tree = new RedBlackTree<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(15);
        tree.add(25);
        tree.add(35);
        tree.add(12);
        tree.add(17);
        tree.add(27);
        tree.add(32);
        tree.add(40);
        tree.printTree();
    }
}
