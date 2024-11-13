Binary Tree Node Insertion
class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            // If the tree is empty, the new node becomes the root
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                // Go to the left subtree if the data is less than the parent node's data
                if (data < parent.data) {
                    current = current.leftChild;

                    // Insert the new node if there's no left child
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                // Go to the right subtree if the data is greater than the parent node's data
                else {
                    current = current.rightChild;

                    // Insert the new node if there's no right child
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Additional helper methods for testing can be added here (e.g., inOrder, preOrder traversal)
}

Binary Tree Search Operation
class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");

        while (current != null && current.data != data) {
            System.out.print(current.data + " ");

            // If the data is less than the current node's data, go to the left subtree
            if (data < current.data) {
                current = current.leftChild;
            }
            // Otherwise, go to the right subtree
            else {
                current = current.rightChild;
            }
        }

        // If the current is null, data is not found; otherwise, return the node
        if (current == null) {
            System.out.println("\nElement not found.");
            return null;
        } else {
            System.out.println("\nElement found: " + current.data);
            return current;
        }
    }

    // Additional methods (e.g., insert) can be added here
 }

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert method to add nodes to the binary tree
    public void insert(int data) {
        Node tempNode = new Node(data);
        if (root == null) {
            root = tempNode;
            return;
        }

        Node current = root;
        Node parent;
        
        while (true) {
            parent = current;
            if (data < current.data) { // go to left subtree
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = tempNode;
                    return;
                }
            } else { // go to right subtree
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = tempNode;
                    return;
                }
            }
        }
    }

    // Search method to find a node with given data
    public Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");
        
        while (current != null && current.data != data) {
            System.out.print(current.data + " ");
            if (data < current.data) { // go to left subtree
                current = current.leftChild;
            } else { // go to right subtree
                current = current.rightChild;
            }
        }

        if (current == null) {
            System.out.println("\n[ x ] Element not found (" + data + ").");
            return null;
        } else {
            System.out.println("\n[" + current.data + "] Element found.");
            return current;
        }
    }

    // Pre-order traversal (Root -> Left -> Right)
    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    // In-order traversal (Left -> Root -> Right)
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.print(node.data + " ");
            inOrderTraversal(node.rightChild);
        }
    }

    // Post-order traversal (Left -> Right -> Root)
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] array = {27, 14, 35, 10, 19, 31, 42};

        // Inserting elements into the binary tree
        for (int data : array) {
            tree.insert(data);
        }

        // Searching for elements
        int i = 31;
        tree.search(i);

        i = 15;
        tree.search(i);

        // Display traversals
        System.out.print("\nPre-order traversal: ");
        tree.preOrderTraversal(tree.root);

        System.out.print("\nIn-order traversal: ");
        tree.inOrderTraversal(tree.root);

        System.out.print("\nPost-order traversal: ");
        tree.postOrderTraversal(tree.root);
    }
}


class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert method to add nodes to the binary tree
    public void insert(int data) {
        Node tempNode = new Node(data);
        if (root == null) {
            root = tempNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (data < current.data) { // go to left subtree
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = tempNode;
                    return;
                }
            } else { // go to right subtree
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = tempNode;
                    return;
                }
            }
        }
    }

    // Search method to find a node with given data
    public Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");

        while (current != null && current.data != data) {
            System.out.print(current.data + " ");
            if (data < current.data) { // go to left subtree
                current = current.leftChild;
            } else { // go to right subtree
                current = current.rightChild;
            }
        }

        if (current == null) {
            System.out.println("\n[ x ] Element not found (" + data + ").");
            return null;
        } else {
            System.out.println("\n[" + current.data + "] Element found.");
            return current;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes into the binary tree
        int[] dataArray = {27, 14, 35, 10, 19, 31, 42};
        for (int data : dataArray) {
            tree.insert(data);
        }

        // Search for nodes in the binary tree
        int searchKey = 31;
        tree.search(searchKey);

        searchKey = 15;
        tree.search(searchKey);
    }
}

Expected Output
Visiting elements: 27 35 
[31] Element found.
Visiting elements: 27 14 19 
[ x ] Element not found (15).
