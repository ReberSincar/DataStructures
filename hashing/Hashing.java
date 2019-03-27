
public class Hashing
{
	static int[] Hash = new int[100];
	
	static void RakamSec(int sayi)
	{
		String a = Integer.toString(sayi);
		char[] b = a.toCharArray();
		String key = b[1]+""+b[4];
		int key2 = Integer.valueOf(key);
		Hash[key2]=sayi;
	}
	
	static void SFolding(int sayi,int n)
	{
		
		int boyut=n;
		int[] dizi = new int[boyut];
		boyut--;
		int a=sayi;
		while(boyut>-1)
		{
			dizi[boyut]=a%10;
			a=a/10;
			boyut--;
		}

		int toplam=0;
		for(int i=0;i<n;i=i+2)
		{
			toplam+=dizi[i]*10+dizi[i+1];
		}
		Hash[toplam]=sayi;
	}
	
	void BFolding()
	{
		
	}
	
	static void Division(int sayi,int n)
	{
		int key=sayi%n;
		Hash[key]=sayi;
	}
	
	static void MidSquare(int sayi)
	{
		int kare = sayi^2;
		
	}
	
	void Extraction()
	{
		
	}
	
	void RadixTransformation()
	{
		
	}
	
	static void Yazdir()
	{
		for(int i=0;i<Hash.length;i++)
			System.out.print(Hash[i]+" ");
	}
	
	static int indis(int sayi)
	{
		String a = Integer.toString(sayi);
		char[] b = a.toCharArray();
		String key = b[1]+""+b[4];
		int key2 = Integer.valueOf(key);
		System.out.println(key2);
		return key2;
	}
	public static void main(String[] args)
	{
		SFolding(123456);
	}
}
