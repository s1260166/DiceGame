import java.util.Random;

public class diceProgram{

    public static void main(String[] args){
	int count1,count2;
	Random rand = new Random();
	
	System.out.println("Rolling the dice...");
	
	while(true){
	    if((count1 = rand.nextInt(7)) != 0){ break;}
	}
	System.out.println("Die 1: " + count1);

	while(true){
	    if((count2 = rand.nextInt(7)) != 0){ break;}
	}
	System.out.println("Die 2: " + count2);

	System.out.println("Total value: "+ (count1 + count2) );
    }

}
