import java.util.*;

public class Group
{
    private ArrayList<Unit> myUnits;
    private int infantry;
    private int minfantry;
    private int artillery;
    private int tank;
    private int aaa;
    private int fighter;
    private int tbomber;
    private int sbomber;
    private int battleship;
    private int ac;
    private int cruiser;
    private int destroyer;
    private int sub;

    public Group()
    {
	myUnits = new ArrayList<Unit>();
	infantry = 0;
	minfantry = 0;
	artillery = 0;
	tank = 0;
	aaa = 0;
	fighter = 0;
	tbomber = 0;
	sbomber = 0;
	battleship = 0;
	ac = 0;
	cruiser = 0;
	destroyer = 0;
	sub = 0;
    }

    public void showDice(int[] dices)
    {
	System.out.print("# Result of dices: ");
	for(int a: dices)
	{System.out.print(a+" ");}
	newLine();
    }

    public void printSuccessfulAttack()
    {

	newLine();
	System.out.println("****************************");
	System.out.println("      Result of Attack      ");
	System.out.println("****************************");
	newLine();

	int count = 0;
	if(infantry != 0)
	{
	    int[] dice = new int[infantry];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Infantry)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
	    System.out.println("Infantry: " + count);
	    showDice(dice);
	    count = 0;
	    newLine();
	}


	if(artillery !=0)
	{
	    int[] dice = new int[artillery];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Artillery)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Artillery: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	
	if(minfantry != 0)
	{
	    int[] dice = new int[minfantry];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof MInfantry)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Machanized Infantry: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(tank != 0)
	{
	    int[] dice = new int[tank];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Tank)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Tanks: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(fighter !=0 )
	{
	    int[] dice = new int[fighter];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Fighter)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Fighters: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(tbomber != 0)
	{
	    int[] dice = new int[tbomber];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof TBomber)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Tactical Bobmers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(sbomber != 0)
	{
	    int[] dice = new int[sbomber];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof SBomber)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Strategic Bombers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(battleship != 0)
	{
	    int[] dice = new int[battleship];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Battleship)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Battleships: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(cruiser != 0)
	{
	    int[] dice = new int[cruiser];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Cruiser)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Cruisers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(destroyer != 0)
	{
	    int[] dice = new int[destroyer];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Destroyer)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Destroyers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(sub != 0)
	{
	    int[] dice = new int[sub];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Sub)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).attSucc())
	            {count++;}
		}
	    }
            System.out.println("Submarines: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}
    }

    public void printSuccessfulDefense()
    {

	newLine();
	System.out.println("*****************************");
	System.out.println("      Result of Defense      ");
	System.out.println("*****************************");
	newLine();

	int count = 0;
	if(infantry != 0)
	{
	    int[] dice = new int[infantry];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Infantry)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
	    System.out.println("Infantry: " + count);
	    showDice(dice);
	    count = 0;
	    newLine();
	}


	if(artillery !=0)
	{
	    int[] dice = new int[artillery];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Artillery)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Artillery: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}
	
	if(minfantry != 0)
	{
	    int[] dice1 = new int[minfantry];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof MInfantry)
		{
		    dice1[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Machanized Infantry: " + count);
	    showDice(dice1);
            count = 0;
	    newLine();
	}

	if(aaa != 0)
	{
	    int[] dice = new int[aaa];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof AAA)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("AAA & Facilities: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(tank != 0)
	{
	    int[] dice = new int[tank];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Tank)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Tanks: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(fighter !=0 )
	{
	    int[] dice = new int[fighter];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Fighter)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Fighters: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(tbomber != 0)
	{
	    int[] dice = new int[tbomber];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof TBomber)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Tactical Bobmers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(sbomber != 0)
	{
	    int[] dice = new int[sbomber];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof SBomber)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Strategic Bombers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(battleship != 0)
	{
	    int[] dice = new int[battleship];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Battleship)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Battleships: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(ac != 0)
	{
	    int[] dice = new int[ac];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof AC)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Aircraft Carriers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(cruiser != 0)
	{
	    int[] dice = new int[cruiser];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Cruiser)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Cruisers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(destroyer != 0)
	{
	    int[] dice = new int[destroyer];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Destroyer)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Destroyers: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}

	if(sub != 0)
	{
 	    int[] dice = new int[sub];
	    int j = 0;
	    for(int i=0;i<myUnits.size();i++)
	    {
		if(myUnits.get(i) instanceof Sub)
		{
		    dice[j] = myUnits.get(i).getDice();
		    j++;
		    if(myUnits.get(i).defSucc())
	            {count++;}
		}
	    }
            System.out.println("Submarines: " + count);
	    showDice(dice);
            count = 0;
	    newLine();
	}
    }

    public void addInfantry(boolean isAssisted)
    {myUnits.add(new Infantry(isAssisted)); infantry++;}

    public void addArtillery()
    {myUnits.add(new Artillery()); artillery++;}

    public void addAAA()
    {myUnits.add(new AAA()); aaa++;}

    public void addTank(boolean isAssisted)
    {myUnits.add(new Tank(isAssisted)); tank++;}

    public void addMInfantry(boolean isAssisted)
    {myUnits.add(new MInfantry(isAssisted)); minfantry++;}

    public void addFighter()
    {myUnits.add(new Fighter()); fighter++;}

    public void addTBomber(boolean isAssisted)
    {myUnits.add(new TBomber(isAssisted)); tbomber++;}

    public void addSBomber()
    {myUnits.add(new SBomber()); sbomber++;}

    public void addBattleship()
    {myUnits.add(new Battleship()); battleship++;}

    public void addAC()
    {myUnits.add(new AC()); ac++;}

    public void addCruiser()
    {myUnits.add(new Cruiser()); cruiser++;}

    public void addDestroyer()
    {myUnits.add(new Destroyer()); destroyer++;}

    public void addSub()
    {myUnits.add(new Sub()); sub++;}

    public void newLine()
    {
        System.out.println("");
    }
}
