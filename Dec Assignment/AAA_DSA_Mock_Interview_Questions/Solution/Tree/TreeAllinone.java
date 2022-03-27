/* ........this is Tree.............
                1
			   /\
			  /	 \
			 2    3
			/\	   \
		   /  \		\
		  4    5     6
*/
import java.util.*;
import java.io.*;
public class Main{

	static class Node{
		int data;
		Node left;
		Node right;

		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}


	static class BinaryTree{
		static int idx=-1;
		public static Node BuildTree(int nodes[]){
			idx++;
			if(nodes[idx]==-1){
				return null;
			}

			Node newNode =new Node(nodes[idx]);
			newNode.left=BuildTree(nodes);
			newNode.right=BuildTree(nodes);

			return newNode;
		}

	}

	public static void PreOrder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}

	public static void inOrder(Node root){
		if(root == null){
			return;
		}

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}


	public static void postOrder(Node root){
		if(root==null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
    static int maxlevel = 0;
    public static void leftViewUtil(Node node, int level)
    {
        
        if (node == null)
            return;
 
        if (maxlevel < level) {
            System.out.print(" " + node.data);
            maxlevel = level;
        }
 

        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    public static void printRightView(Node root)
    {
        if (root == null) {
            return;
        }
 
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        Node curr = null;
 
        while (!queue.isEmpty())
        {
            int size = queue.size();
            int i = 0;
 
            while (i++ < size)
            {
                curr = queue.poll();
 
                if (i == size) {
                    System.out.print(curr.data+ " ");
                }
 
                if (curr.left != null) {
                    queue.add(curr.left);
                }
 
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }


	public static void levelOrder(Node root){
		if(root==null){
			return;
		}

		Queue<Node>q=new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			Node currNode=q.remove();
			if(currNode == null){
				System.out.println();

				if(q.isEmpty()){
					break;
				}else{
					q.add(null);
				}
			}

			else{
				System.out.print(currNode.data+" ");
				if(currNode.left!=null){
					q.add(currNode.left);
				}

				if(currNode.right!=null){
					q.add(currNode.right);
				}
			}


		}
	}

	public static void main(String[] args) {
		int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b1=new BinaryTree();
		Node root = b1.BuildTree(nodes);

		// System.out.println(root.data);
		// PreOrder(root);
		// inOrder(root);
		// levelOrder(root);
        leftViewUtil(root, 1);
        printRightView(root);

	}
}