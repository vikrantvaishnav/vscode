package Demo;

class Demo 
{	
    static
	{   
		i = 100;
		System.out.println(i);
	}

        static int i;
}

public class Test
{
    public static void main(String[] args) 
	{
        System.out.println(Demo.i);
	}
}

