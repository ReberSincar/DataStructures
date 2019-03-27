package linkedlist;
public class Ciftyon
{
    int data;
    public Ciftyon next,prev,first,last;
	
    public Ciftyon()
    {
	first=null;
	last=null;
    }

    public void basaEkle(int data)
    {
	Ciftyon add = new Ciftyon();
	add.data=data;
	if(first==null)
	{
            first=add;
            last=add;
	}
        else
	{
            add.next=first;
            first.prev=add;
            first=add;
	}
    }
	
    public void sonaEkle(int data)
    {
        Ciftyon add = new Ciftyon();
	add.data=data;
	if(first==null)
	{
            first=add;
            last=add;
	}
	else
	{
            last.next=add;
            add.prev=last;
            last=add;
	}
    }
	
    public void siraliEkle(int data)
    {
        Ciftyon add = new Ciftyon();
	add.data=data;
	if(first==null)
	{
            first=add;
            last=add;
	}
	else if(add.data < first.data)
	{
            add.next=first;
            first.prev=add;
            first=add;
	}
	else if(add.data > last.data)
	{
            last.next=add;
            add.prev=last;
            last=add;
	}
	else
	{
            Ciftyon temp = first;
            while(add.data > temp.data)
            {
                if(temp.data==data)
		{
                    System.out.println("Girdi�iniz Veri Zaten Listede Kay�tl�");
                    return;
		}
		temp=temp.next;
            }
			
            temp.prev.next=add;
            add.prev=temp.prev;
            add.next=temp;
	}
    }

    public void yaz()
    {
        Ciftyon yaz = first;
	while(yaz != null)
	{
            System.out.print(yaz.data+"->");
            yaz=yaz.next;
	}
    }
	
    public void arayaEkle(int data, int sayi)
    {
        Ciftyon add = new Ciftyon();
	add.data=data;
	Ciftyon temp = first;
	if(first==null)
	{
            first=add;
            last=add;
	}
	else if(first.data==sayi)
	{
            add.next=first;
            first.prev=add;
            first=add;
	}
	else
	{
            while(temp.data != sayi)
            {
            	if(temp.next==null)
		{
                    System.out.println("Girdi�iniz Say� Bulunamad�");
		}
		else
		{
                    temp=temp.next;
		}
				
            }
            temp.prev.next=add;
            add.next=temp;
            add.prev=temp.prev;
        }
		
    }
	
    public void Sil(int data)
    {
        Ciftyon sil = first;
            
	if(first.data==data)
	{
            first=first.next;
            first.prev=null;
            return;
	}
	else if(last.data==data)
	{
            last=last.prev;
            last.next=null;
	}
	else
	{
            while(sil.data != data)
            {
                if(sil.next==null)
		{
                    System.out.println("Girdi�iniz Say� Bulunamad�");
                    return;
		}
		sil=sil.next;
            }
			
            sil.prev.next=sil.next;
            sil.next.prev=sil.prev;
        }
		
    }

    public boolean bosmu()
    {
        if(first==null)
            return true;
	else
            return false;
    }
	
    public int elemanSayisi()
    {
    	Ciftyon say = first;
	int i=0;
	while(say != null)
	{
            say=say.next;
            i++;
	}
        return i;
    }

    public void bastanSil()
    {
    	first=first.next;
	first.prev=null;
    }
	
    public void sondanSil()
    {
    	last=last.prev;
	last.next=null;
    }

    public void hepsiniSil()
    {
	first=null;
	last=null;
    }
	
    public void istenilenSiradaSil(int i)
    {
        Ciftyon sil = first;
		
	if(elemanSayisi()<i)
	{
            System.out.println("Eleman Sayisinden Fazla Bir De�er Girdiniz.");
	}
	else if(i == 1)
	{
            first=first.next;
            first.prev=null;
	}
	else if(i==elemanSayisi())
	{
            last=last.prev;
            last.next=null;
	}
	else
	{
            while(i != 1)
            {
            	sil=sil.next;
		i--;
            }
			
            sil.prev.next=sil.next;
            sil.next.prev=sil.prev;
	}
		
    }
	
}
