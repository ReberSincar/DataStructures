package queue;
public class ArrayQueue
{
    int[] queue = new int[10];
    int son = 0;
	
    public void Ekle(int data)
    {
        if(Dolumu())
	{
            System.out.println("Kuyruk Dolu!");
	}
	else
	{
            queue[son]=data;
            son++;
	}
    }
	
    public void Al()
    {
        int sira=0;
	if(Bosmu())
            System.out.println("Kuyruk Bos!");
	else
	{
            sira=queue[0];
            
            for(int i=1;i<=son;i++)
            	queue[i-1]=queue[i];
            son--;
	}
    }
	
    public boolean Bosmu()
    {
    	if(son==0)
            return true;
        else
            return false;
    }
	
	
    public boolean Dolumu()
    {
        if(son == queue.length)
            return true;
	else
            return false;
    }

    public void Yaz()
    {
       	for(int i=0;i<son;i++)
            System.out.print(queue[i]+"-");
    }
}
