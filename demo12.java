package constrchaining;
class demo11
{
	demo11()
	{
		System.out.println("hlo");
	}
}
class sample12 extends demo11
{
	
	
}
class cool123 extends sample12
{
}
class demo12 {
public static void main(String [] args)
{
	new cool123();
}
}

