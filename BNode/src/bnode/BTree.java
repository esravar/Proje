/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bnode;

/**
 *
 * @author özlo
 */
public class BTree {
    BNode root;
    public BTree(){
        root = null;
}
    BNode search(int value){
        int child;
        BNode b;
        b = root;
        while(!b.leaf){
            child = b.position(value);
            b = b.children[child];
        }
        return b;
    }
    
    BNode searchmane(char c){
        int child;
        int a = c;
        BNode b;
        b = root;
        while(!b.leaf){
            child = b.position(a);
            b = b.children[child];
            }
        return b;
    }
    
    BNode searchh(String a){
        int child;
        int sum = 0;
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            int b = c;
            sum+=b;
        }
        BNode bb;
        bb = root;
        while(!bb.leaf){
            child = bb.position(sum);
            bb = bb.children[child];
        }
        return bb;
    }
}