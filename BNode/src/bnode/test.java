
package bnode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class test {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException{
        BTree btree = new BTree();
        BNode Bnode =new BNode(2);
        BTree Btree = new BTree();
        BNode b = new BNode(2);
        java.io.File file = new java.io.File("C:\\data.txt");
        try {
        Scanner input = new Scanner(file);
            int count =0;
            int day;
            int year;
            int mounth;
            Bnode = null;
            btree=null;
            while(input.hasNext()){
                day = input.nextInt();
                mounth = input.nextInt();
                year = input.nextInt();
                int value= year*10000+mounth*100+day;          
                 Bnode.insertNode(btree,value);
                 
                 
                 
                Bnode = btree.search(19701203);//1.soru
        int countt = 0;
        for(int i =0;i<Bnode.m;i++){
            if(Bnode.dogum[i]==12031970){
                countt++;
         }
            else {
                System.out.println("there is no vivian that born on 12 03 1970");
            }
        }
        System.out.println("yes there are "+count+" person who born on 12 03 1970");
        
        }
            String name = null;
            String surname= null;
            b = null;
            Btree = null;
            int a = 0;
            int d = 0;
            while(input.hasNext()){
                name = input.next();
                surname = input.next();
                for(int i = 0;i<name.length();i++){
                    char c = name.charAt(i);
                    a = c;
                    break;
                }
                    b.insertNode(Btree, a);
                for(int i=0;i<surname.length();i++){
                    char e =surname.charAt(i);
                    d = e;
                    break;
                }
                   b.insertNode(Btree, d);
        char ca ='E';//3.soru
        b = Btree.searchmane(ca);
        for(int j=0;j<b.m;j++){
            for(int k=0; k<b.isim[j].length();k++){
            if(b.isim[j].charAt(k) == ca){
                System.out.println(b.isim[j]);
            }
            break;
            }
        }
        
        BNode bn;//7.soru
        BNode bnn;
        bn = Btree.searchh(name);
         bnn =Btree.searchh(surname);
         for(int m=0;m<bn.m;m++){
          for(int n=0;n<bnn.m;n++){ 
             if(bn.isim[m].length()>bnn.isim[n].length()){
                 System.out.println(bn.isim[m]);
                }
                break;
            }
    }
            }
        }
            
        catch (FileNotFoundException ex) {}
        
    }
}
