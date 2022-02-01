import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    while(true){

    

    System.out.println("\n==================== \nMenu \n==================== \n1. Unit 1 FRQs \n2. Unit 2 FRQs \n3. Unit 3 FRQs\n4. Unit 4 FRQs\n5. Unit 5 FRQs\n6. Unit 6 FRQs\n====================");
    
    
    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter the AP Unit");
    String unit = scan.nextLine();

    if(unit.equals("2")){
      
      System.out.println("Enter a light sequence of 0s and 1s");
      String user_sequence = scan.nextLine();
      LightSequence ls = new LightSequence(user_sequence);
      System.out.println("\n==================== \n For your Light Sequence, chose an action \n==================== \n1. Display the sequence \n2. Update the sequence \n3. Insert a segment\n4. Remove segments from oldSeq\n5.find distance between two points\n====================");
      String action = scan.nextLine();
      if(action.equals("1")){
        ls.display();
      }
      if(action.equals("2")){
        System.out.println("Enter new light sequence");
        ls.changeSequence(scan.nextLine());
        System.out.print("New sequence is ");
        ls.display();
      }

      if(action.equals("3")){
        System.out.println("Enter sequence to insert");
        String insert = scan.nextLine();
        System.out.println("Now enter the index for inserting");
        int index = Integer.parseInt(scan.nextLine());
        ls.insertSegment(insert, index);
        System.out.print("New sequence is ");
        ls.display();
      }

      if(action.equals("4")){
        System.out.println("Enter a sequence");
        String old = scan.nextLine();
        System.out.println("enter a segment to remove:");
        String remove = scan.nextLine();
        System.out.println("newSeq is " + ls.remover(old, remove));

      }

      if(action.equals("5")){
        System.out.println("Enter first double ");
        double a = Double.parseDouble(scan.nextLine());
        System.out.println("Enter second double ");
        double b = Double.parseDouble(scan.nextLine());
        System.out.print("Distance is ");
        ls.distance(a, b);

      }
        
    }
    

    if(unit.equals("3")){
      System.out.println("Enter Question Number");
      String problem = scan.nextLine();
      if(problem.equals("1")){
        System.out.println("Will you be attending? Enter true/false");
        boolean response = Boolean.parseBoolean(scan.nextLine());
        System.out.println("Now enter your meal selection, 1-4:");
        int choice = Integer.parseInt(scan.nextLine());

        Unit_3_1 food = new Unit_3_1(response, choice);
        food.message();
        System.out.println(food.option1);
      }

      if(problem.equals("2")){
        System.out.println("Enter a square side length:");
        int l = Integer.parseInt(scan.nextLine());
        Unit_3_2.drawSquare(5, 5, l);        
        
      }

    }

    
    if (unit.equals("4")){
      System.out.println("Enter Question Number");
      String problem = scan.nextLine();
      
      
      if (problem.equals("1")){
        System.out.println("Enter a string to find its longest streak of consecutive letters");
        String string_input = scan.nextLine();
        Unit_4_1.longestStreak(string_input);
      }


      if (problem.equals("2")){
        System.out.println("We will be playing the coin game. Enter a starting number of coins");
        int coins = Integer.parseInt(scan.nextLine());
        System.out.println("Now input a max number of rounds");
        int rounds = Integer.parseInt(scan.nextLine());
        CoinGame game = new CoinGame(coins, rounds);
        game.playGame();
      }

    
    }

    if(unit.equals("5")){
      System.out.println("Enter Question Number");
      String problem = scan.nextLine();
      
      if (problem.equals("1")){
        System.out.println("Do you know the host name? YES or NO:");
        String response = scan.nextLine();
        if (response.equals("YES")){
          System.out.println("Enter a host name:");
        String user_name = scan.nextLine();
        Invitation inv = new Invitation(user_name, "address");
        System.out.println("Enter an address to update the default:");
        String user_address = scan.nextLine();
        inv.updateaddress(user_address);
        System.out.println("What is your name?");
        String user = scan.nextLine();
        System.out.println(inv.invite(user));

        }
        else{
          System.out.println("Enter the address:");
          String user_address = scan.nextLine();
          Invitation inv2 = new Invitation(user_address);
          System.out.println("What is your name?");
        String user = scan.nextLine();
          System.out.println(inv2.invite(user));
        }
        
      }

      if (problem.equals("2")){
        System.out.println("This is the password generator. Enter the number of random digits you would like:");
      int digit_response = Integer.parseInt(scan.nextLine());

      
      
      System.out.println("Would you like a custom prefix? Type YES or NO:");
        String prefix_response = scan.nextLine();

      if(prefix_response.equals("YES")){
        System.out.println("Enter your custom prefix:");
        String user_prefix = scan.nextLine();
        PasswordGenerator pwd = new PasswordGenerator(digit_response, user_prefix);
        System.out.println("Generated password: " + pwd.pwGen() + " , total passwords generated: " + pwd.pwCount());

      }

      else{ 
        PasswordGenerator pwd = new PasswordGenerator(digit_response);
        System.out.println("Generated password: " + pwd.pwGen() + " , total passwords generated: " + pwd.pwCount());
      }


      


      }

    

      
      }


      if(unit.equals("6")){
      System.out.println("Enter Question Number");
      String problem = scan.nextLine();
      
      if (problem.equals("1")){
        System.out.println("Please enter a list of words, separated by commas:");
        String response = scan.nextLine();
        String[] word_list = response.split("\\s*,\\s*");
        System.out.println("Here are the words ending in ing:");
        Unit_6_1.filter(word_list);
        

        }

        if(problem.equals("2")){
          System.out.println("Enter a list of itemsSold by each employee separated by commas:");
          String response = scan.nextLine();
          String[] items_sold_str = response.split("\\s*,\\s*");
          int[] items_sold = new int[items_sold_str.length];
          for(int i = 0;i < items_sold.length;i++){
            items_sold[i] = Integer.parseInt(items_sold_str[i]);
            }

            Payroll pr = new Payroll(items_sold);

            System.out.println("Enter a starting wage:");
          double fixed_wage  = Double.parseDouble(scan.nextLine());

          System.out.println("Enter a per item wage:");
          double per_item_wage = Double.parseDouble(scan.nextLine());

          pr.computeWages(fixed_wage, per_item_wage);
          System.out.println("Here are the final employee wages, in the same order:");
          pr.printwages();
        }
        
      }

      if(unit.equals("7")){
        
      }
    
    }
    
    }

  
}

