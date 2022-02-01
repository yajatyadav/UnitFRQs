public class ExperimentalFarm

{

private Plot[][] farmPlots;

 

public ExperimentalFarm(Plot[][] p)

{

/* implementation not shown */

}

 

/** Returns the plot with the highest yield for a given crop type, as described in part (a). */

public Plot getHighestYield(String c){
int highestYield = 0;
Plot bestplot = farmPlots[0][0];


for(int row = 0; row < farmPlots.length; row++){
  for(int col  = 0; col < farmPlots[1].length; col++){
    if(farmPlots[row][col].getCropType().equals(c) && farmPlots[row][col].getCropYield() > highestYield){
      highestYield = farmPlots[row][col].getCropYield();
      bestplot = farmPlots[row][col];
    }
    
    }
  }

return bestplot;

}



public boolean sameCrop(int col){
  String type = farmPlots[0][col].getCropType();

for(int row = 0; row < farmPlots.length; row++){
  if(!(farmPlots[row][col].equals(type))){
    return false;
  }

}
return true;

}

}