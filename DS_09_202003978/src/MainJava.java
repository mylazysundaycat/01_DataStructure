public class MainJava {
    public static void main(String[] args) {
        Node node1 = new Node(4,null,null);
        Node node2 = new Node(5,null,null);
        Node node3 = new Node(2,null,null);
        Node node4 = new Node(3,node1,node2);
        Node node5 = new Node(1,node3,node4);

        BinaryTree tree = new BinaryTree(node5);

        System.out.print("Inorder : ");
        tree.inorder(tree.getRoot());
        System.out.println();

        System.out.println("Number of leaves : "+tree.numleaves(tree.getRoot()));
        System.out.println("Path length : "+tree.pathlength(tree.getRoot(),0));






    }
}

