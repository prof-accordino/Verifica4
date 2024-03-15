import java.util.Scanner;

public class MainClass
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
					es3();
				break;
				case 4:
					es4();
				break;
				case 5:
					es5();
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	
	static void stampaMenu()
	{
		// Se presente si può sostituire "esercizio *" con il nome dell'esercizio
		System.out.println("Esercizio 1");
		System.out.println("Esercizio 2");
		System.out.println("Esercizio 3");
		System.out.println("Esercizio 4");
		System.out.println("Esercizio 5");
	}
	
	static void es1()
	{
		// Inserire codice es. 1
	}
	
	static void es2()	
	{
		// Inserire codice es. 2		
	}
	
	static void es3()
	{
		// Inserire codice es. 3	
	}
	
	static void es4()
	{
		// Inserire codice es. 4	
	}
	
	static void es5()
	{
		// Inserire codice es. 5	
	}
}
