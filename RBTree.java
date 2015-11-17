/**
 * RBTree
 * <p>
 * An implementation of a Red Black Tree with
 * non-negative, distinct integer keys and values
 */

public class RBTree {

    private RBNode root;



    /**
     * public class RBNode
     */
    public class RBNode {
        private String value;
        private int key;
        private boolean isRed;
        private RBNode leftChild;
        private RBNode rightChild;
        private RBNode parent;

        public RBNode(String value, int key, boolean isRed, RBNode leftChild, RBNode rightChild, RBNode parent) {
            this.value = value;
            this.key = key;
            this.isRed = isRed;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.parent = parent;
        }

        public RBNode(String value, int key) {
            this.value = value;
            this.key = key;
            this.isRed = true;
            this.leftChild = null;
            this.rightChild = null;
            this.parent = null;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public boolean isRed() {
            return isRed;
        }

        public void setRed(boolean red) {
            isRed = red;
        }

        public RBNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(RBNode leftChild) {
            this.leftChild = leftChild;
        }

        public RBNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(RBNode rightChild) {
            this.rightChild = rightChild;
        }

        public RBNode getParent() {
            return parent;
        }

        public void setParent(RBNode parent) {
            this.parent = parent;
        }
    }

    /**
     * public RBNode getRoot()
     * <p>
     * returns the root of the red black tree
     */
    public RBNode getRoot() {
        return null; // to be replaced by student code
    }

    /**
     * public boolean empty()
     * <p>
     * returns true if and only if the tree is empty
     */
    public boolean empty() {
        return false; // to be replaced by student code
    }

    /**
     * public String search(int k)
     * <p>
     * returns the value of an item with key k if it exists in the tree
     * otherwise, returns null
     */
    public String search(int k) {
        return "42";  // to be replaced by student code
    }

    /**
     * public int insert(int k, String v)
     * <p>
     * inserts an item with key k and value v to the red black tree.
     * the tree must remain valid (keep its invariants).
     * returns the number of color switches, or 0 if no color switches were necessary.
     * returns -1 if an item with key k already exists in the tree.
     */
    public int insert(int k, String v) {
        return 42;    // to be replaced by student code
    }

    /**
     * public int delete(int k)
     * <p>
     * deletes an item with key k from the binary tree, if it is there;
     * the tree must remain valid (keep its invariants).
     * returns the number of color switches, or 0 if no color switches were needed.
     * returns -1 if an item with key k was not found in the tree.
     */
    public int delete(int k) {
        return 42;    // to be replaced by student code
    }

    /**
     * public String min()
     * <p>
     * Returns the value of the item with the smallest key in the tree,
     * or null if the tree is empty
     */
    public String min() {
        return "42"; // to be replaced by student code
    }

    /**
     * public String max()
     * <p>
     * Returns the value of the item with the largest key in the tree,
     * or null if the tree is empty
     */
    public String max() {
        return "42"; // to be replaced by student code
    }

    /**
     * public int[] keysToArray()
     * <p>
     * Returns a sorted array which contains all keys in the tree,
     * or an empty array if the tree is empty.
     */
    public int[] keysToArray() {
        int[] arr = new int[42]; // to be replaced by student code
        return arr;              // to be replaced by student code
    }

    /**
     * public String[] valuesToArray()
     * <p>
     * Returns an array which contains all values in the tree,
     * sorted by their respective keys,
     * or an empty array if the tree is empty.
     */
    public String[] valuesToArray() {
        String[] arr = new String[42]; // to be replaced by student code
        return arr;                    // to be replaced by student code
    }

    /**
     * public int size()
     * <p>
     * Returns the number of nodes in the tree.
     * <p>
     * precondition: none
     * postcondition: none
     */
    public int size() {
        return 42; // to be replaced by student code
    }



    private RBNode[] treeToOrderedArray() {

    }

    /**
     * If you wish to implement classes, other than RBTree and RBNode, do it in this file, not in
     * another file.
     */


}
  

