import java.io.BufferedWriter;
import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(new File("notlast.in"));
    FileWriter fw = new FileWriter("notlast.out");
    BufferedWriter bw = new BufferedWriter(fw);


    int n = sc.nextInt();
    HashMap<String, Integer> milkproduced = new HashMap<>();

    for (int i = 0; i < n; i++){
      String name = sc.next();
      int milk = sc.nextInt();
      milkproduced.put(name, milkproduced.getOrDefault(name, 0) + milk);
    }

    int fmin = -1;
    String first = "";
    int fcount = 0;
    int smin = -1;
    String second = "";
    int scount = 0;
    String names[] = {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
    for (String name : names){
      int milk = milkproduced.getOrDefault(name, 0);
      if (milk < fmin || fmin == -1){
        smin = fmin;
        scount = fcount;
        second = first;
        fmin = milk;
        fcount = 1;
        first = name;
        continue;
      }
      if (milk == fmin){
        fcount ++;
        continue;
      }
      if (milk < smin || smin == -1){
        smin = milk;
        scount = 1;
        second = name;
        continue;
      }
      if (milk == scount){
        scount++;
        continue;
      }     
    }
    if (scount == 1 && smin != -1){
      bw.write(second + "\n");
    }
    else{
      bw.write("Tie\n");
    } 
    bw.close(); 

  }
}