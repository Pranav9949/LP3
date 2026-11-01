// // import java.util.*;
// // class Node {
// //     int freq;
// //     String symbol;
// //     Node left, right;
// //     int huff;
// //     Node(int freq, String symbol) {
// //         this.freq = freq;
// //         this.symbol = symbol;
// //     }
// // }
// // public class Huffman {
// //     static void printNodes(Node node, String code) {
// //         code = code + node.huff;
// //         if (node.left != null)
// //             printNodes(node.left, code);
// //         if (node.right != null)
// //             printNodes(node.right, code);
// //         if (node.left == null && node.right == null)
// //             System.out.println(node.symbol + " -> " + code);
// //     }
// //     public static void main(String[] args) {
// //         char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
// //         int[] freq = {5, 9, 12, 13, 16, 45};
// //         PriorityQueue<Node> nodes = new PriorityQueue<>(
// //             (a, b) -> a.freq - b.freq
// //         );
// //         for (int i = 0; i < chars.length; i++)
// //             nodes.add(new Node(freq[i], "" + chars[i]));
// //         while (nodes.size() > 1) {
// //             Node left = nodes.poll();
// //             Node right = nodes.poll();
// //             left.huff = 0;
// //             right.huff = 1;
// //             Node newNode = new Node(
// //                 left.freq + right.freq,
// //                 left.symbol + right.symbol
// //             );
// //             newNode.left = left;
// //             newNode.right = right;
// //             nodes.add(newNode);
// //         }
// //         printNodes(nodes.poll(), "");
// //     }
// // }


// import java.util.*;
// class Node {
//     int freq;
//     String symbol;
//     Node left, right;
//     int bit;
//     Node(int freq, String symbol) {
//         this.freq = freq;
//         this.symbol = symbol;
//     }
// }

// public class Huffman {
//     static void print(Node root, String code) {
//         if (root.left == null && root.right == null) {
//             System.out.println(root.symbol + " -> " + code);
//             return;
//         }
//         print(root.left, code + "0");
//         print(root.right, code + "1");
//     }

//     public static void main(String[] args) {
//         char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
//         int[] freq = {5, 9, 12, 13, 16, 45};

//         PriorityQueue<Node> q = new PriorityQueue<>(
//             (a, b) -> a.freq - b.freq
//         );

//         for (int i = 0; i < ch.length; i++)
//             q.add(new Node(freq[i], "" + ch[i]));

//         while (q.size() > 1) {
//             Node left = q.poll();
//             Node right = q.poll();

//             Node parent = new Node(
//                 left.freq + right.freq,
//                 left.symbol + right.symbol
//             );

//             parent.left = left;
//             parent.right = right;

//             q.add(parent);
//         }

//         print(q.poll(), "");
//     }
// }




import java.util.*;
class Node {
    int freq;
    char ch;
    Node left, right;
    Node(int f, char c) {
        freq = f;
        ch = c;
    }
}
public class Huffman {
    static void print(Node root, String code) {
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " -> " + code);
            return;
        }
        print(root.left, code + "0");
        print(root.right, code + "1");
    }
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] f = {5, 9, 12, 13, 16, 45};
        PriorityQueue<Node> q =
            new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int i = 0; i < ch.length; i++)
            q.add(new Node(f[i], ch[i]));
        while (q.size() > 1) {
            Node a = q.poll();
            Node b = q.poll();
            Node p = new Node(a.freq + b.freq, '-');
            p.left = a;
            p.right = b;
            q.add(p);
        }
        print(q.poll(), "");
    }
}