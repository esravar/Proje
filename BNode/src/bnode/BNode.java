/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bnode;

/**
 *
 * @author özlo
 */
public class BNode {
    String[] isim;
    int[] dogum;
    int m;
    int d;
    boolean leaf;
    BNode[] children;
    private BNode root;
    public BNode(int d){
        m = 0;
        this.d = d;
        leaf = true;
        isim = new String[2*d];
        dogum = new int[2*d];
        children = new BNode[2*d+1];
    }
    
    
     int position(int value){
        int i;
        if(value>=dogum[m-1]) {
            return m;
        }
        else {
            for(i=0;i<m;i++) {
                if(value<dogum[m]) {
                    return i;
                }
            }
        }
        return 0;
        
} 
     
      BNode insertNode(BTree a, int value){
          BNode s; 
          BNode newNode;
          int child; 
          int i ;
          child = position(value);
          if (!children[ child ]. leaf ) {
              s = children[ child ]. insertNode(a,value);
          }
          else {
              s = children[ child ]. insertLeaf (value);
          }
          if (s == null) {
              return null;
          }
          for (i= m;i>child;i--){
              dogum[i] = dogum[i-1];
          }
              dogum[child] = s.dogum[d];
          if ( m < 2*d){
              for (i= m+1; i>child;i--){
              children[i] = children[i-1];
              children[child] = s;
              m++;
              return null;
          }
          }
          else {
              newNode = new BNode(d);
              for (i = 0; i < d; i++) {
                  newNode.dogum[i] = dogum[d + i];
              }
              for (i = 0; i < d; i++) {
                  newNode.children[i] = children[d + 1 + i ];
              }
              newNode.m = d;
              m = d;
              if (this == root){
                  a.root = new BNode(d);
                  a.root.m = 1;
                  a.root. children[0] = this;
                  a.root. children[1] = newNode;
                  a.root.dogum[0] = this.dogum[d];
                  return null;
              } 
              else {
                  return newNode;
              }
            }
        return null;
      }
      
    BNode insertLeaf(int value){
         int i,child;
         BNode newNode;
         child = position(value);
         for(i = m;i>child;i++){
             dogum[i] = dogum[i-1];
             dogum[child]=value;
             if(m<4*d){
                 m++;
                 return null;
             }
             else{
                 newNode = new BNode(d);
                 for(i = 0;i<d+1;i++){
                     newNode.m = d+1;
                     m = d;
                     return newNode;
                 }
             }
         }
        return null;
         

    }
}

