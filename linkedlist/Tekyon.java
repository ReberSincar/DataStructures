package linkedlist;

public class Tekyon
{
    public int data;
    public Tekyon next;
    public Tekyon first,last;
    
    public Tekyon()
    {
        first=null;
        last=null;
    }

    public void sonaEkle(int data)
    {
        Tekyon add = new Tekyon();
        add.data=data;
        add.next=null;
        if(first==null)
        {
            first=add;
            last=add;
        }
        else
        {
            last.next=add;
            last=add;
        }
    }

    public void yazdir()
    {
        Tekyon temp = new Tekyon();
        temp=first;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public void basaEkle(int data)
    {
        Tekyon add = new Tekyon();
        add.data=data;
        if(first==null)
        {
            first=add;
            last=add;
        }
        else
        {
            add.next=first;
            first=add;
        }
    }

    public void sil(int data)
    {
        Tekyon temp,prev;
        temp=first;
        prev=first;
        
        if(first.data==data)
            first=first.next;
        else
        {
            while(temp.data!=data)
            {
                if(temp.next==null)
                {
                    System.out.println("Girdiğiniz Değer Listede Bulunamadı!");
                    return;
                }
                prev=temp;
                temp=temp.next;
            }
        
            prev.next=temp.next;
        }
        
        
    }
    
    public void siraliEkle(int data)
    {
	Tekyon add = new Tekyon();
	add.data=data;
		
	if(first==null)
	{
		add.next=null;
		first=add;
		last=add;
	}
	else if(add.data<first.data)
	{
		add.next=first;
		first=add;
	}
	else if(add.data>last.data)
	{
		add.next=null;
		last.next=add;
		last=add;
	}
	else
	{
		Tekyon temp;
		temp=first;
		while(temp.next.data < data)
		{
			if(temp.data==data)
				System.out.println("Aradiginiz Veri Zaten Listede.");
			else
			{
				temp=temp.next;
			}
		}
		add.next=temp.next;
		temp.next=add;
	}
    }
 
    public void arayaEkle(int data, int sayi)
	{
	Tekyon add = new Tekyon();
	add.data=data;
	Tekyon temp=first;
	Tekyon prev = first;
	
	if(first.data == sayi)
	{
		add.next=first;
		first=add;
	}
	else if(first==null)
	{
		first=add;
		last=add;
	}
	else
	{
		while(temp.data != sayi)
		{
			if(temp.next == null)
			{
				System.out.println("Girdi�iniz Say� Listede Bulunamad�");
				return;
			}
			else
				prev=temp;
				temp=temp.next;
		}
		add.next=prev.next;
		prev.next=add;
	}
	
    }

    public boolean bosmu()
    {
	if(first == null)
            return true;
	else
            return false;
    }
	
    public void elemanSayisi()
    {
	int i=1;
	Tekyon temp = first;
	
	while(temp.next != null)
	{
            temp=temp.next;
            i++;
	}
	
	System.out.println("Listenin Eleman Sayisi = "+i);
    }

    public void bastanSil()
    {
	first=first.next;
    }
	
    public void sondanSil()
    {
	Tekyon temp = first;
		
	while(temp.next != last)
	{
            temp=temp.next;
	}
	temp.next=null;
	last=temp;
    }

    public void hepsiniSil()
    {
	first=null;
	last=null;
    }

    public void istenilenSiradaSil(int i)
    {
	Tekyon temp = first;
	Tekyon prev = first;
	
	while(i!=1)
	{
            prev=temp;
            temp=temp.next;
            i--;	
	}
	prev.next=temp.next;
    }

}
