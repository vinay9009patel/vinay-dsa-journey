import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
     
     if(root ==null) return;
     Node temp = root;
     
      Queue<Node> queue =new LinkedList<>();
      
      queue.add(root);
      
      while(!queue.isEmpty()){
      Node curr = queue.poll();
      
      
  System.out.print(curr.data+" ");
      if(curr.left!=null){
        queue.add(curr.left);
  
      }
      
      if(curr.right!=null){
        queue.add(curr.right);
    
      }
     
    }
  
    }
	public static Node insert(Node root, int data) {
