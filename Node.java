package binaryTree;

class Node
{
    public int iData; // data item (key)
    public double dData; // data item
    public Node leftChild; // this nodeâ€™s left child
    public Node rightChild; // this nodeâ€™s right child
    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
} 
