package binaryTree;

import java.util.*;

public class TreeApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BinaryTree bintree = new BinaryTree();
        
        int n;
        int id;
        double dd;
        int f,d,s;
        
        System.out.print("\t Binary Tree \n 1.Insert \n 2.Display \n 3.Find \n 4.Delete \n 5.Travers \n 6.Exit \n Enter Option: ");
        n = scan.nextInt();
        while(n != 6){
            switch(n){
                case 1:
                    System.out.print("Enter id: ");
                    id = scan.nextInt();
                    System.out.print("Enter dd: ");
                    dd = scan.nextInt();
                    bintree.insert(id,dd);
                    break;
                case 2:
                    bintree.displayTree();
                    break;
                case 3:
                    System.out.print("Enter the key of node you want to find: ");
                    f = scan.nextInt();
                    Node key = bintree.find(f);
                    System.out.println(key);
                    break;
                case 4:
                    System.out.print("Enter the key of node you want to delete: ");
                    d = scan.nextInt();
                    boolean ret = bintree.delete(d);
                    if(ret == true){
                        System.out.println("Done");
                    }else{
                        System.out.println("Can't find node or node dosen't exist.");
                    }
                    break;
                case 5:
                    System.out.print("\t Sub Menu \n 1.PreOrder \n 2.InOrder \n 3.PostOrder \n Enter your traverse option: ");
                    s = scan.nextInt();
                    bintree.traverse(s);
                    break;
                case 6:
                    break;
            }
            System.out.print("\t Binary Tree \n 1.Insert \n 2.Display \n 3.Find \n 4.Delete \n 5.Travers \n 6.Exit \n Enter Option: ");
            n = scan.nextInt();
        }       
    }
}
// FOC35 vidurathegeek
