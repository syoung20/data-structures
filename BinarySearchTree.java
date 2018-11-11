public class BinarySearchTree {

    Node root = null;

    public BinarySearchTree() {

    }

    public void insert(int data) {

	if (this.root != null) {

	    Node n = this.root;

	    while (true) {

		if (data <= n.d) {

		    if (n.left != null) {

			n = n.left;

		    } else {

			n.left = new Node(data);
			break;

		    }

		} else if (data > n.d) {

		    if (n.right != null) {

			n = n.right;

		    } else {

			n.right = new Node(data);
			break;

		    }

		}
	    }

	} else {

	    this.root = new Node(data);

	}

    }

    public void delete(int data) {

	Node d = this.find(data);

	if (d.left != null && d.right != null) {

	    if (d.left != null) {

		if (d.right != null) {

		    Node n = d.right;
		    Node prev = d;
		    
		    while (true) {

			if (n.left != null) {

			    prev = n;
			    n = n.left;

			} else {

			    d.d = n.d;

			    if (n.right != null) {
				n.d = n.right.d;
				if (n.right.right != null) {
				    n.right = n.right.right;
				} else {
				    n.right = null;
				}
			    } else {
				prev.right = null;
			    }
			    break;
			}
		    }

		} else {

		    d.d = d.left.d;
		    d.left = d.left.left;

		}
	       
	    } else {

		d.d = d.right.d;
		d.right = d.right.right;
		d.left = d.right.left;

	    }

	} else {

	    d = null;

	}
	    
    }

    public Node find(int data) {

	if (this.root.d == data) {

	    return this.root;

	} else {

	    Node n = this.root;

	    while (n != null) {

	        if (data < n.d) {

		    n = n.left;

		}

		else if (data > n.d) {

		    n = n.right;

		}

		else if (n.d == data) {

		    return n;

		}

	    }

	    return null;
	    
	}
	
    }


    public static void main(String args[]) {

	BinarySearchTree tree = new BinarySearchTree();
	tree.insert(25);
	tree.insert(8);
	tree.insert(42);
	tree.insert(17);
	tree.insert(36);
	tree.insert(4);
	tree.insert(100);
	
        System.out.println(tree.root.d);
	System.out.println(tree.root.left.d);
	System.out.println(tree.root.right.d);
	System.out.println(tree.root.left.left.d);
	System.out.println(tree.root.left.right.d);
	System.out.println(tree.root.right.left.d);
	System.out.println(tree.root.right.right.d);


	tree.delete(8);

	System.out.println(tree.root.d);
	System.out.println(tree.root.left.d);
	System.out.println(tree.root.right.d);
	System.out.println(tree.root.left.left.d);
	/*System.out.println(tree.root.left.right.d);*/
	System.out.println(tree.root.right.left.d);
	System.out.println(tree.root.right.right.d);

    }


}
