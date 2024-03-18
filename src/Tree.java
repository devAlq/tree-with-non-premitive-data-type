import java.util.Stack;
// Write a function that prints all tree values.
// Write a function that searches for a specific name in the tree and returns true if it is found, and false otherwise.
// In main class:

import javax.swing.plaf.TreeUI;

// Declare a tree and pass the root to it.
// Access the root data (name) and print it.
// Access and update the root data to be "Anas".
// Create root children as shown in the image above.
// Print the tree values.
// Call the search method to search for "Rashed".
// The output should be the same as below:
class Node {

    // Data
    String name;
    // Pointers
    Node left;
    Node center;
    Node right;

    // Constructor
    Node(String name) {
        this.name = name;
        this.left = null;
        this.center = null;
        this.right = null;
    }

}

class Tree {

    Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Tree() {
        root = null;
    }


    public void printTreeValues(){
        if (this.root != null){
            Stack <Node> stack = new Stack<Node>();
            stack.push(this.root);
            while (! stack.isEmpty()){
                Node currentNode;
                currentNode = stack.pop();
                System.out.println(currentNode.name);
                if (currentNode.right != null){
                     stack.push(currentNode.right);
                }
                
                if (currentNode.left != null){
                    stack.push(currentNode.left);
               }

               if (currentNode.center != null){
                stack.push(currentNode.center);
           }
            }
        
        }else{
            System.out.println("there is nothing to print(tree is empty)");
        }
    }

   


    public boolean treeSearch(String value){
        if (this.root != null){
            Stack <Node> stack = new Stack<Node>();
            stack.push(this.root);
            while (! stack.isEmpty()){
                Node currentNode;
                currentNode = stack.pop();
                if (currentNode.name == value){
                    return true;
                }
                if (currentNode.right != null){
                     stack.push(currentNode.right);
                }
                
                if (currentNode.left != null){
                    stack.push(currentNode.left);
               }

               if (currentNode.center != null){
                stack.push(currentNode.center);
           }
            }
        
        }else{
           return false;
        }
        return false;
    }

    

    public static void main(String[] args) {
/* 
    3 - Declare Tree
    4 - Access the root data and print it
    5 - Access and update the root data to be (Anas)
    6 - Create root children as the image above shows
    7 - Print tree values
    8 - Search for (Rashed) call the search method
*/
        
        /* Your code here  */ 
        Tree firstTree = new Tree(new Node("Anas"));
        firstTree.root.right = new Node("Sami");
        firstTree.root.right.left = new Node("jasser");
        firstTree.root.right.left.left = new Node("lena");

        firstTree.root.center = new Node("fatema");
        firstTree.root.center.center = new Node("Rashed");
        firstTree.root.center.left = new Node("Faisal");


        firstTree.root.left = new Node("Abdullah");
        firstTree.root.left.center = new Node("yasser");
        firstTree.root.left.left = new Node("salem");
        firstTree.root.left.right = new Node("maha");


        firstTree.printTreeValues();
        System.out.println(firstTree.treeSearch("Rashed"));












    }

}
