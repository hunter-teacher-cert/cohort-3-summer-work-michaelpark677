import java.util.*;
import java.io.*;

public class Bar {

  public static int[] BarGraphify(int[] num) {

    //int temp = 0;
    
    for(int i=0; i<num.length; i++) {
      System.out.println(i + ": ");
      //temp = num[i];
     
    for(int x=0; x<num[i+1]; x++) {
      
      //for(i=0; i<num.length; i++) {
        //System.out.println(i + ": ");
         // if(num[i] > 0) {
        System.out.print("=");
          // temp = temp - 1;
        //}
      }
    }
  
    return num;
  }//This should be the end of BarGraphify.


  
  public static void main(String[] args) {

    int[] temp = {0,3,1,2};
    BarGraphify(temp);
    
  }
}