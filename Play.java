import java.util.*;
import java.io.*;

public class Play
{

    public static void main(String[] args)
    {

	newLine();
	print("***********************************");
	newLine();
	print("For the History Association of SFLS");
	print("    Where we met");
	print("        We learnt");
	print("            We grew");
	print("                We love!");
	newLine();
	print("           by Thomas Ren           ");
	newLine();
	print("***********************************");

	newLine();
	print("==========ATTACK==========");

	Group attack = enterAttack();

	newLine();
	print("=========DEFENSE==========");

	Group defense = enterDefense();
	showResult(attack, defense);
    }

    public static void showResult(Group attack, Group defense)
    {
	attack.printSuccessfulAttack();
	defense.printSuccessfulDefense();
    }

    public static Group enterAttack()
    {
	Group attack = new Group();
	Scanner in = new Scanner(System.in);

	newLine();

	print("******************************************************");
	print("Any land unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("******************************************************");
	String landResult = in.nextLine();
	while(!landResult.equals("Y") && !landResult.equals("N"))
	{
	    printError();
	    landResult = in.nextLine();
	}
	if(landResult.equals("Y"))
	{

	    newLine();
	    print("Number of Artilleries:");
	    int numArt = enterValidInt();
	    if(numArt != 0)
	    {
		for(int i=0; i<numArt; i++)
		{attack.addArtillery();}
	    }

	    newLine();
	    print("Number of Infantries:");
	    int numInf = enterValidInt();
	    if(numInf != 0)
	    {
		for(int i=0; i<numInf; i++)
		{attack.addInfantry(false);}
	    }

//	    if(numArt>0)
//	    {
	        newLine();
       	        print("Any supported Infantry?");
	        int numsInf = enterValidInt();
	        if(numsInf != 0)
	        {
		    for(int i=0; i < numsInf; i++)
		    {attack.addInfantry(true);}
	        }
//	    }

	    newLine();
	    print("Number of Machanized Infantries:");
	    int numMInf = enterValidInt();
	    if(numMInf != 0)
	    {
		for(int i=0; i<numMInf; i++)
		{attack.addMInfantry(false);}
	    }

	    if(numArt>0)
	    {
	        newLine();
	        print("Any supported Machanized Infantry?");
	        int numsMInf = enterValidInt();
	        if(numsMInf != 0)
	        {
		    for(int i=0; i<numsInf; i++)
		    {attack.addMInfantry(true);}
	        }
	    }

	    newLine();
	    print("Number of Tanks:");
	    int numTank = enterValidInt();
	    if(numTank != 0)
	    {
		for(int i=0; i<numTank; i++)
		{attack.addTank(false);}
	    }


	    newLine();
	    print("Any supported Tank?");
	    int numsTank = enterValidInt();
	    if(numsTank != 0)
	    {
		for(int i=0; i<numsTank; i++)
		{attack.addTank(true);}
	    }
	}

	newLine();

	print("*****************************************************");
	print("Any Air unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("*****************************************************");
	String airResult = in.nextLine();
	while(!airResult.equals("Y") && !airResult.equals("N"))
	{
	    printError();
	    airResult = in.nextLine();
	}
	if(airResult.equals("Y"))
	{

	    newLine();
	    print("Number of Fighters:");
	    int numFig = enterValidInt();
	    if(numFig != 0)
	    {
		for(int i=0; i<numFig; i++)
		{attack.addFighter();}
	    }

	    newLine();
	    print("Number of Tactical Bombers:");
	    int numTB = enterValidInt();
	    if(numTB != 0)
	    {
		for(int i=0; i<numTB; i++)
		{attack.addTBomber(false);}
	    }

	    newLine();
	    print("Any supported Tactical Bomber?");
	    int numsTB = enterValidInt();
	    if(numsTB != 0)
	    {
		for(int i=0; i<numsTB; i++)
		{attack.addTBomber(true);}
	    }

	    newLine();
	    print("Number of Strategic Bombers:");
	    int numSB = enterValidInt();
	    if(numSB != 0)
	    {
		for(int i=0; i<numSB; i++)
		{attack.addSBomber();}
	    }
	}

	newLine();

	print("*****************************************************");
	print("Any Sea unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("*****************************************************");
	String seaResult = in.nextLine();
	while(!seaResult.equals("Y") && !seaResult.equals("N"))
	{
	    printError();
	    seaResult = in.nextLine();
	}
	if(seaResult.equals("Y"))
	{
	    newLine();
	    print("Number of Battleships:");
	    int numBS = enterValidInt();
	    if(numBS != 0)
	    {
		for(int i=0; i<numBS; i++)
		{attack.addBattleship();}
	    }

	    newLine();
	    print("Number of Cruisers:");
	    int numCru = enterValidInt();
	    if(numCru != 0)
	    {
		for(int i=0; i<numCru; i++)
		{attack.addCruiser();}
	    }

	    newLine();
	    print("Number of Destroyers:");
	    int numDes = enterValidInt();
	    if(numDes != 0)
	    {
		for(int i=0; i<numDes; i++)
		{attack.addDestroyer();}
	    }

	    newLine();
	    print("Number of Submarines:");
	    int numSub = enterValidInt();
	    if(numSub != 0)
	    {
		for(int i=0; i<numSub; i++)
		{attack.addSub();}
	    }
	}
        return attack;
    }


    public static Group enterDefense()
    {
	Group defense = new Group();
	Scanner in = new Scanner(System.in);

	newLine();

	print("******************************************************");
	print("Any land unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("******************************************************");
	String landResult = in.nextLine();
	while(!landResult.equals("Y") && !landResult.equals("N"))
	{
	    printError();
	    landResult = in.nextLine();
	}
	if(landResult.equals("Y"))
	{
	    newLine();
	    print("Number of Infantries:");
	    int numInf = enterValidInt();
	    if(numInf != 0)
	    {
		for(int i=0; i<numInf; i++)
		{defense.addInfantry(false);}
	    }

	    newLine();
	    print("Number of Artilleries:");
	    int numArt = enterValidInt();
	    if(numArt != 0)
	    {
		for(int i=0; i<numArt; i++)
		{defense.addArtillery();}
	    }


	    newLine();
	    print("Number of AAAs: (Please also include the facilities in this area)");
	    int numAAA = enterValidInt();
	    if(numAAA != 0)
	    {
		for(int i=0; i<numAAA; i++)
		{defense.addAAA();}
	    }

	    newLine();
	    print("Number of Machanized Infantries:");
	    int numMInf = enterValidInt();
	    if(numMInf != 0)
	    {
		for(int i=0; i<numMInf; i++)
		{defense.addMInfantry(false);}
	    }

	    newLine();
	    print("Number of Tanks:");
	    int numTank = enterValidInt();
	    if(numTank != 0)
	    {
		for(int i=0; i<numTank; i++)
		{defense.addTank(false);}
	    }
	}

	newLine();

	print("*****************************************************");
	print("Any Air unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("*****************************************************");
	String airResult = in.nextLine();
	while(!airResult.equals("Y") && !airResult.equals("N"))
	{
	    printError();
	    airResult = in.nextLine();
	}
	if(airResult.equals("Y"))
	{

	    newLine();
	    print("Number of Fighters:");
	    int numFig = enterValidInt();
	    if(numFig != 0)
	    {
		for(int i=0; i<numFig; i++)
		{defense.addFighter();}
	    }

	    newLine();
	    print("Number of Tactical Bombers:");
	    int numTB = enterValidInt();
	    if(numTB != 0)
	    {
		for(int i=0; i<numTB; i++)
		{defense.addTBomber(false);}
	    }

	    newLine();
	    print("Number of Strategic Bombers:");
	    int numSB = enterValidInt();
	    if(numSB != 0)
	    {
		for(int i=0; i<numSB; i++)
		{defense.addSBomber();}
	    }
	}

	newLine();

	print("*****************************************************");
	print("Any Sea unit? Please enter \"Y\" for yes or \"N\" for no.");
	print("*****************************************************");
	String seaResult = in.nextLine();
	while(!seaResult.equals("Y") && !seaResult.equals("N"))
	{
	    printError();
	    seaResult = in.nextLine();
	}
	if(seaResult.equals("Y"))
	{
	    newLine();
	    print("Number of Battleships:");
	    int numBS = enterValidInt();
	    if(numBS != 0)
	    {
		for(int i=0; i<numBS; i++)
		{defense.addBattleship();}
	    }


	    newLine();
	    print("Number of Aircraft Carriers:");
	    int numAC = enterValidInt();
	    if(numAC != 0)
	    {
		for(int i=0; i<numAC; i++)
		{defense.addAC();}
	    }

	    newLine();
	    print("Number of Cruisers:");
	    int numCru = enterValidInt();
	    if(numCru != 0)
	    {
		for(int i=0; i<numCru; i++)
		{defense.addCruiser();}
	    }

	    newLine();
	    print("Number of Destroyers:");
	    int numDes = enterValidInt();
	    if(numDes != 0)
	    {
		for(int i=0; i<numDes; i++)
		{defense.addDestroyer();}
	    }

	    newLine();
	    print("Number of Submarines:");
	    int numSub = enterValidInt();
	    if(numSub != 0)
	    {
		for(int i=0; i<numSub; i++)
		{defense.addSub();}
	    }
	}
        return defense;
    }


    public static int enterValidInt()
    {
	Scanner in = new Scanner(System.in);
	double aInt = in.nextDouble();
	while(aInt<0 || (int)aInt != aInt)
	{
	    printError();
	    aInt = in.nextDouble();
	}
	int validInt = (int)aInt;
	return validInt;
    }

    public static void newLine()
    {
        System.out.println("");
    }

    public static void print(String s)
    {
        System.out.println(s);
    }

    public static void printError()
    {
        String[] error = {"No zuo no die, why you try? ", "You bad bad~~! ", "Hey! No kidding! ", "Don't you know that I am smart? "};
        int index = (int)(Math.random()*error.length);
        System.out.println("");
        System.out.println("**********ERROR**********");
        System.out.println(error[index] + "Please enter a valid value.");
        System.out.println("*************************");
        System.out.println("");
    }
}
