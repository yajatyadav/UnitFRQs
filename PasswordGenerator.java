// unit 5, frq #2

import java.lang.Math.*;

public class PasswordGenerator{

  private int suffix_length;
  private String prefix = "A.";
  private static int counter;

  public PasswordGenerator(int s, String p){
    prefix = p + ".";
    suffix_length = s;
  }

  public PasswordGenerator(int s){
    suffix_length = s;
  }


    
    public String pwGen(){
      for (int i = 1; i<=suffix_length; i++){
        prefix += Integer.toString((int) (Math.random()*10));
      }
      counter+=1;
      return prefix;

    }

    public int pwCount(){
      return counter;

    }


  
  
}