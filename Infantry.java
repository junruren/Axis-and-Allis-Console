public class Infantry extends Unit
{
    public Infantry(boolean haveAssistant)
    {
	super();
	setAttack(1);
	if(haveAssistant)
	{setAttack(2);}
	setDefence(2);
    }
}
