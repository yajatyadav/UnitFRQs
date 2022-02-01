class CoinGame{
private int startingCoins;
private int maxRounds;

public CoinGame(int s, int r){
startingCoins = s;
maxRounds = r;
}

public int getPlayer1Move(){
  return 1;
}

public int getPlayer2Move(int round){
int result = 0;

if (round%3 == 0){result = 3;}
if (round%3 != 0 && round%2 == 0) {result = 2;}
if (round%3 != 0 && round%2 != 0) {result = 1;}

return result;

}


public void playGame(){

int player1coins = startingCoins;
int player2coins = startingCoins;
int round = 1;


while (round <= maxRounds){
if(player1coins < 3 || player2coins <3){break;}


int player1spent = getPlayer1Move();
player1coins -= player1spent;

int player2spent = getPlayer2Move(round);
player2coins -= player2spent;


if(player1spent == player2spent){player2coins++;}
else if (Math.abs(player1spent - player2spent) == 1){player2coins++;}
else{player1coins = player1coins+2;}

round++;
}


if(player1coins == player2coins) {
System.out.println("tie game");
}
else if(player1coins > player2coins) {
System.out.println("player 1 wins");
}
else{
System.out.println("player 2 wins");
}


}

}