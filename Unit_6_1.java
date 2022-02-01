
public class Unit_6_1 {

  public static void filter(String[] words){
    // enhanced for loop through words
    for(String s: words){
            if (s.substring(Math.abs(s.length()-3),s.length()).equals("ing")){
                System.out.println(s);
            }

        }

  }

    
}
