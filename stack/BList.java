
public class BList
{
    int data;
    public BList next,last;

    public BList()
    {
	last=null;
    }

    public void push(int sayi)
    {
	BList add = new BList();
	add.data=sayi;
	if(last==null)
	{
            last=add;
	}
	else
	{
            add.next=last;
            last=add;
	}
    }
	
    public int pop()
    {
	if(last==null)
	{
            System.out.println("Stackte Veri Yok");
            return -1;
	}
	else
	{
            int cikar = last.data;
            last=last.next;
            return cikar;
	}
		
    }
	
    public int top()
    {
        return last.data;
    }
	
    public void yazdir()
    {
        BList yaz = last;
		
        while(yaz != null)
	{
            System.out.print(yaz.data+"->");
            yaz=yaz.next;
	}
            System.out.println();
    }
    
}
