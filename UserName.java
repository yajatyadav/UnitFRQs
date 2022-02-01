import java.util.ArrayList;
// unit 7 FRQ
public class UserName

{
private ArrayList<String> possibleNames;


public UserName(String firstName, String lastName){ 
  
  for(int x = 1; x <= firstName.length(); x++){
    possibleNames.add(lastName + firstName.substring(0,x));
  }
}

 

/** Returns true if arr contains name, and false otherwise. */

public boolean isUsed(String name, String[] arr){
  for (String s : arr){
    if(s.equals(name)){
      return true;
    }
  }
  return false;

}

 

/** Removes strings from possibleNames that are found in usedNames as described in part (b).

*/

public void setAvailableUserNames(String[] usedNames){
  for(int s = 0; s < possibleNames.size(); s++){
    if(isUsed(possibleNames.get(s), usedNames)){
      possibleNames.remove(s);
      s--;

    }
  }

}

}