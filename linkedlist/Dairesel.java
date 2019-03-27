package linkedlist;
public class Dairesel
{
    int data;
    public Dairesel next,first,last;
	
    public Dairesel()
    {
    	first=null;
	last=null;
    }
	
    public void basaEkle(int data)
    {
	Dairesel add=new Dairesel();
	add.data=data;
	if(first==null)
	{
            add.next=null;
            first=add;
            last=add;
	}
	else
	{
            add.next=first;
            first=add;
	}
    }
	
    public void sonaEkle(int data)
    {
    	Dairesel add = new Dairesel();
	add.data=data;
	add.next=null;
		
	if(first==null)
	{
            first=add;
            last=add;
            last.next=first;
	}
	else
	{
            last.next=add;
            last=add;
            last.next=first;
	}
    }
	
    public void siraliEkle(int data)
    {
	Dairesel add = new Dairesel();
	add.data=data;
		
	if(first==null)
	{
            add.next=null;
            first=add;
            last=add;
            last.next=first;
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
            last.next=first;
        }
	else
	{
            Dairesel temp;
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

    public void yaz()
    {
	Dairesel temp=first;
	
	while(temp.next != first)
	{
            System.out.print(temp.data+"->");
            temp=temp.next;
	}
            System.out.print(temp.data);
            System.out.println();
    }
	
    public void arayaEkle(int data, int sayi)
    {
    	Dairesel add = new Dairesel();
	add.data=data;
	Dairesel temp=first;
	Dairesel prev = first;
		
	if(first.data == sayi)
	{
            add.next=first;
            first=add;
            last.next=first;
	}
	else if(first==null)
	{
            first=add;
            last=add;
            last.next=first;
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
            if(last.data==sayi)
            {
		prev.next=add;
		add.next=last;
            }
	add.next=prev.next;
	prev.next=add;
	}
		
    }
	
    public void Sil(int data)
    {
	Dairesel temp;
        Dairesel prev;
        temp=first;
	prev=first;
	if(bosmu()==true)
	{
            System.out.println("Liste Bo�!");
            return;
	}
	if(first.data == data)
	{
            first=first.next;
            return;
	}
	while(temp.data != data)
	{
            if(temp.next==null)
            {
		System.out.println("Girdi�iniz Veri Listede Yok");
		return;
            }
            else if(temp==last)
            {
		prev.next=first;
		return;
            }
            else
            {
		prev=temp;
		temp=temp.next;
            }
	}
		
	prev.next=temp.next;
		
    }

    public boolean bosmu()
    {
        if(first == null)
            return true;
	else
            return false;
    }
	
    public int elemanSayisi()
    {
        int i=1;
	Dairesel temp = first;
		
	while(temp.next != first)
	{
            temp=temp.next;
            i++;
	}
		
	return i;
    }

    public void bastanSil()
    {
        first=first.next;
	last.next=first;
    }
	
    public  void sondanSil()
    {
        Dairesel temp = first;
		
	while(temp.next != last)
	{
            temp=temp.next;
	}
	temp.next=first;
	last=temp;
    }

    public void hepsiniSil()
    {
	first=null;
	last=null;
    }

    public void istenilenSiradaSil(int i)
    {
	Dairesel temp = first;
	Dairesel prev = first;
		
	if(i==1)
	{
            first=first.first.next;
	}
	else
	{
            while(i!=1)
            {
                prev=temp;
		temp=temp.next;
		i--;	
            }
            if(elemanSayisi()==i)
            {
		prev.next=first;
		last=prev;
            }
            else
		prev.next=temp.next;
	}
		
    }
}
