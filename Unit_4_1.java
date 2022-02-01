class Unit_4_1{

public static void longestStreak(String str){

    String previous = str.substring(0,1);
    String longest = "";
    String current = "";


    for (int x = 0; x < str.length(); x++){

      if (!str.substring(x,x+1).equals(previous)){
        current = "";
      }

      current += str.substring(x,x+1);

        
      if (current.length() > longest.length() ){
        longest = current;
        }


    previous = str.substring(x,x+1);

       

    }

    System.out.println(longest.substring(0,1) + " " + longest.length());

}






}
