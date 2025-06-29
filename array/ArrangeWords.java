

import java.util.ArrayList;
import java.util.Scanner;

public class ArrangeWords {

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        arr.add("ram");
        arr.add("get");
        arr.add("word");
        arr.add("lucky");
        arr.add("apple");
        boolean exit=false;
        while(!exit){
        System.out.println("enter the word");
String word=sc.next();
if(word.equals("stop"))
exit=true;
else{
addWord(arr, word);
arr.forEach(a->System.out.print(a+","));
sc.close();
}
        }

  

    }
          static void addWord(ArrayList<String> arr,String word){
            boolean flag=true;
for(int i=0;i<arr.size();i++){
    String w=arr.get(i);
    if(w.charAt(1)==word.charAt(1)){
        for(int j=i;j<arr.size();j++){
            String nw=arr.get(j);
            if(nw.charAt(1)!=word.charAt(1)){
              arr.add(j, word);
              flag=false;
              return;
            }
        }
        
    }
}
if(flag)
arr.add(word);

    }
    
  
}