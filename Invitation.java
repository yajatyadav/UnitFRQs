// unit 5 frq #1

public class Invitation{
  private String hostName;
  private String address;
  
public Invitation(String n, String a){
    hostName = n;
    address = a;
    }
// part a
public String getName(){
  return hostName;
}

// part b
public void updateaddress(String s){
address = s;

}

// part c
public String invite(String person){
return "Dear " + person + ", please attend my event at " + address + ". See you then, " + hostName + ".";

}

// part d
public Invitation(String a){
  hostName = "Host";
  address = a;
}

}