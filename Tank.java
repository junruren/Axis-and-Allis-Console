public class Tank extends Unit
{
    public Tank(boolean haveAssistant)
    {
	super();
	setAttack(3);
	if(haveAssistant)
	{setAttack(4);}
	setDefence(3);
    }
}

