// Binary Search Tree implementation
public class BST<E extends Comparable<E>> {
  private BSTNode<E> root; // Root of the BST
  private int nodecount; // Number of nodes in the BST

  // constructor
  BST() { root = null; nodecount = 0; }

  // Reinitialize tree
  public void clear() { root = null; nodecount = 0; }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
  public void insert(E e) {
    root = inserthelp(root, e);
    nodecount++;
  }

  // Remove a record from the tree
  // key: The key value of record to remove
  // Returns the record removed, null if there is none.
  public E remove(E key) {
    E temp = findhelp(root, key); // First find it
    if (temp != null) {
      root = removehelp(root, key); // Now remove it
      nodecount--;
    }
    return temp;
  }

  // Return the record with key value k, null if none exists
  // key: The key value to find
  public E find(E key) { return findhelp(root, key); }

  // Return the number of records in the dictionary
  public int size() { return nodecount; }
//Binary tree node implementation: supports comparable objects
private class BSTNode<E extends Comparable<? super E>> implements BinNode<E> {
 private E element;           // Element for this node
 private BSTNode<E> left;     // Pointer to left child
 private BSTNode<E> right;    // Pointer to right child

 // Constructors
 BSTNode() { left = right = null; }
 BSTNode(E val) { left = right = null; element = val; }
 BSTNode(E val, BSTNode<E> l, BSTNode<E> r)
   { left = l; right = r; element = val; }

 // Get and set the element value
 public E value() { return element; }
 public void setValue(E v) { element = v; }

 // Get and set the left child
 public BSTNode<E> left() { return left; }
 public void setLeft(BSTNode<E> p) { left = p; }

 // Get and set the right child
 public BSTNode<E> right() { return right; }
 public void setRight(BSTNode<E> p) { right = p; }

 // return TRUE if a leaf node, FALSE otherwise
 public boolean isLeaf() { return (left == null) && (right == null); }
}
}
