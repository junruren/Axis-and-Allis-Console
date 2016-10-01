public class TBomber extends Unit
{
    public TBomber(boolean haveAssistant)
    {
	super();
	setAttack(3);
	if(haveAssistant)
	{setAttack(4);}
	setDefence(3);
    }
}

