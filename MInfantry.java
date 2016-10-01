public class MInfantry extends Unit
{
    public MInfantry(boolean haveAssistant)
    {
	super();
	setAttack(1);
	if(haveAssistant)
	{setAttack(2);}
	setDefence(2);
    }
}

