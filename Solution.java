/*
//moveZeroes
public class Solution {
    public static void moveZeroes(int[] nums){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int num[]={0,1,0,3,12};
        moveZeroes(num);
        for(int val:num)
            System.out.println(val+" ");
    } 
}
*/

/*
//AVLTree
class Solution {

    // Node class for AVL Tree
    static class Node {
        int key, height;
        Node left, right;

        public Node(int d) {
            key = d;
            height = 1; // Newly inserted node is initially a leaf node
        }
    }

    private Node root;

    // Get height of a Node
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Get balance factor of a Node
    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Right rotate subtree rooted with y
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Insert a key into the AVL tree and balance it
    Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // Duplicate keys not allowed

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // Left Left case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder traversal to print keys
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    // Main method to test the AVL tree
    public static void main(String[] args) {
        Solution tree = new Solution();

        int[] keys = { 10, 20, 30, 40, 50, 25 };

        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        System.out.println("Inorder traversal of the constructed AVL tree:");
        tree.inorder(tree.root);
    }
}
*/
/*
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentArea = minHeight * width;
            max = Math.max(max, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 5, 6, 4, 8, 7};
        Solution solution = new Solution();
        System.out.println("Maximum area: " + solution.maxArea(height));
    }
}
*/


//CYCLIC DETECTION
public class Solution{
    private int vertices;//No.of vertices
    private int[][] adjacencyMatrix; //adjacency matrx
    //constructor to initialize graph
    public Solution(int vertices){
        this.vertices=vertices;
        adjacencyMatrix=new int[vertices][vertices];
    }
    //add edge for undirected graph
    public void addEdge(int src,int dest){
        adjacencyMatrix[src][dest]=1;
        adjacencyMatrix[dest][src]=1;
    }
    //dispaly the graph(adjacency matrix)
    public void printGraph(){
        System.out.println("Adjacency Matrix:");
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private boolean dfsCycle(int vertex,boolean[] visited,int parent){
        visited[vertex]=true;
        for(int i=0;i<vertices;i++){
            if(adjacencyMatrix[vertex][i]==1){
                if(!visited[i]){
                    if(dfsCycle(i,visited,vertex)){
                        return true;
                    }
                    else if(i!=parent){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean hasCycle(){
        boolean[] visited=new boolean[vertices];
        for(int v=0;v<vertices;v++){
            if(!visited[v]){
                if(dfsCycle(v,visited,-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution graph=new Solution(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(3,4);
        graph.printGraph();
        if(graph.hasCycle()){
            System.out.println("The graph contains a cycle");
        }
        else{
            System.out.println("The graph does not contains a cycle");
        }
    }
}

