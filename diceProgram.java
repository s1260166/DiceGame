import java.util.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class diceProgram{

    public static void main(String[] args){
	int count1,count2;
	Random rand = new Random();


	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("What is your name?");
	System.out.print("> ");

	String str = null;
	try{
	    str = br.readLine();
	    br.close();
	}catch(IOException e){
	    e.printStackTrace();
	}
	System.out.println("Hello, "+str+"!");
	
	
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

	

	if( (count1+count2) > 7){
	    System.out.println(str + " won!");
	    System.out.println("Congratulations!!!!!!!"); /* +a */
	}
	else {
	    System.out.println(str + " lost");
	    System.out.println(str + " might win in the next game! \nTry again!!");  /* +a */
	}
	
    }

}
