public abstract class Unit
{

    private int myDice;
    private int myAttack;
    private int myDefence;
    private boolean toLand;
    private boolean toAir;
    private boolean toSea;

    public Unit()
    {
    	myDice = (int)(Math.random()*6+1);
    	toLand = false;
    	toAir = false;
    	toSea = false;
    }

    public boolean attSucc()
    {return myDice <= myAttack;}

    public boolean defSucc()
    {return myDice <= myDefence;}

    public int getDice()
    {return myDice;}

    public int getAttack()
    {return myAttack;}

    public int getDefence()
    {return myDefence;}

    public void setAttack(int att)
    {myAttack = att;}

    public void setDefence(int def)
    {myDefence = def;}

    public void canLand()
    {toLand = true;}

    public void canAir()
    {toAir = true;}

    public void canSea()
    {toSea = true;}

}
