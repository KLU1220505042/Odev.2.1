package projeler;

public class BinaryTree {
    Node root;

    // Derinlik sayacı için sınıf
    static class Depth {
        int d;
    }

    // Bir düğümün derinliğini hesaplayan yardımcı yöntem
    int depth(Node node, Depth d) {
        if (node == null) {
            return 0;
        }

        // Sol ve sağ alt ağaçların derinliği alınır
        int leftDepth = depth(node.left, d);
        int rightDepth = depth(node.right, d);

        // Düğümün iki alt ağacı arasındaki fark kontrol edilir
        if (Math.abs(leftDepth - rightDepth) > 1) {
            d.d = 0;
        }

        // Düğümün derinliği hesaplanır
        if (leftDepth > rightDepth) {
            return (leftDepth + 1);
        } else {
            return (rightDepth + 1);
        }
    }

    // Ağacın dengeli olup olmadığını kontrol eden yöntem
    boolean isBalanced(Node node) {
        Depth d = new Depth();
        d.d = 1;

        depth(node, d);

        if (d.d == 0) {
            return false;
        } else {
            return true;
        }
    }

    // Test için ana yöntem
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        if (tree.isBalanced(tree.root)) {
            System.out.println("Ağaç dengeli");
        } else {
            System.out.println("Ağaç dengeli değil");
        }
    }
}

// Düğüm sınıfı
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

