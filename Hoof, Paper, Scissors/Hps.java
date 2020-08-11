import java.io.BufferedWriter;
import java.io.*;
import java.util.*;

class Hps {
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(new File("hps.in"));
    FileWriter fw = new FileWriter("hps.out");
    BufferedWriter bw = new BufferedWriter(fw);

    int n = sc.nextInt();
    int[] cowA = new int[10];
    int[] cowB = new int[10];

    for(int i = 0; i < n; i++){
      cowA[i] = sc.nextInt();
      cowB[i] = sc.nextInt();
    }


    int totalA = 0;
    int totalB = 0;
    for (int i = 0; i < n; i++){
      if(cowA[i] == 1){
        if(cowB[i] == 1){
          continue;
        }
        if (cowB[i] == 2){
          totalB++;
        }
        if (cowB[i] == 3){
          totalA++;
        }
      }
      if(cowA[i] == 2){
        if(cowB[i] == 1){
          totalA++;
        }
        if (cowB[i] == 2){
          continue;
        }
        if (cowB[i] == 3){
          totalB++;
        }
      }
      else {
        if(cowB[i] == 1){
          totalB++;
        }
        if (cowB[i] == 2){
          totalA++;
        }
        if (cowB[i] == 3){
          continue;
        }
      }
    }
     if(totalA > totalB){
      bw.write(totalA + "\n");
    }

    else bw.write(totalB + "\n");
    bw.close();
  }
}