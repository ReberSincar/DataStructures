package stack;
public class Array
{
    int[] Stack = new int[10];
    int boyut;
	
    public Array()
    {
    	boyut=0;
    }
	
    public void push(int sayi)
    {
	if(isFull())
	{
            System.out.println("Stack Dolu");
	}
	else
	{
            Stack[boyut]=sayi;
            boyut++;
	}
    }
	
    public int pop()
    {
	if(isEmpty())
	{
            System.out.println("Dizi Bo�");
            return -1;
	}
	else
	{
            int cikar=Stack[boyut-1];
            boyut--;
            return cikar;
	}
    }
	
    public int top()
    {
    	return Stack[boyut-1];
    }
	
    public int size()
    {
	return boyut;
    }
	
    public boolean isFull()
    {
	if(boyut==Stack.length)
            return true;
	else
            return false;
    }
	
    public boolean isEmpty()
    {
	if(boyut==0)
            return true;
	else
            return false;
    }
	
    public void yazdir()
    {
        for(int i=0;i<boyut;i++)
	{
            System.out.print(Stack[i]+"->");
	}
	System.out.println();
    }
}
