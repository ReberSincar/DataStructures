package queue;
public class QueueList
{
    int islem;
    String isim;
    public QueueList first,last,next;
	
    public QueueList()
    {
	first=null;
	last=null;
    }

    public void Ekle(int data,String isim)
    {
	QueueList add = new QueueList();
	add.islem=data;
	add.isim=isim;
		
	if(first==null)
	{
            first=add;
            last=add;
	}
	else
	{
            if(add.islem>=last.islem)
            {
            	last.next=add;
            	last=add;
            }
            else if(add.islem<first.islem)
            {
		add.next=first;
		first=add;
            }
            else
            {
		QueueList temp = first;
		QueueList prev = first;
		
		while(temp.islem<=add.islem)
		{
                    prev=temp;
                    temp=temp.next;
		}
		prev.next=add;
		add.next=temp;
            }
	}
    }

    public int Cikar()
    {
	int sira = first.islem;
	first=first.next;
	return sira;
    }

    public void Yaz()
    {
    	QueueList temp = first;
	
	while(temp != null)
	{
            System.out.print(temp.islem+"-"+temp.isim+" ");
            temp=temp.next;
	}
			
    }

}
