//  unit 6, question 2
public class Payroll {
    private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60}; // number of items sold by each employee
    private double[] wages;

    public Payroll(int[] x){
        itemsSold = x;
        wages = new double[x.length];

    }

    public void printwages(){
        for (int i = 0; i < wages.length ; i++){
            System.out.println(wages[i]);
        }
    }





    public double computeBonusThreshold(){

        int temp;

        double average = 0;
        for (int i : itemsSold){
            average += i;
        }


// loop through and sort array to find max and min
        for(int i =0; i< itemsSold.length; i++){
            for(int x = i+1; x < itemsSold.length; x++){
                if (itemsSold[x] < itemsSold[i]){
                    temp = itemsSold[i];
                    itemsSold[i] = itemsSold[x];
                    itemsSold[x] = temp;

                }
            }

        }
// returning average of items excluding min and max
        return ((average - itemsSold[0] - itemsSold[itemsSold.length-1]) / ((itemsSold.length)-2));


    }

    public void computeWages(double fixedWage, double perItemWage){
        double threshold = computeBonusThreshold();
        double bonus_rate = 1.1;

// loop through array, calculating the pay. then multiply by 1.1 (if 10%) if higher than bonus threshold
        for (int x = 0; x < wages.length; x++){
            wages[x] = fixedWage + (perItemWage * itemsSold[x]);

            if(itemsSold[x] - threshold > 0){
                wages[x] = wages[x] * bonus_rate;
            }


        }
    }

    public static void main(String[] args){
        int[] array1 = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
        Payroll pay = new Payroll(array1);
        System.out.println(pay.computeBonusThreshold());
        pay.computeWages(10.0, 1.5);
        pay.printwages();

        }
    }


