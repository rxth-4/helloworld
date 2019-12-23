
public class LivingThings {
	public String color;
	public int lifespan;
	
	//exhibiting constructor of class
	public LivingThings() {
		System.out.println("this is living constructor");
	} 
	
	
	public LivingThings(String c,int l)
	{
      color=c;
      lifespan=l;
      System.out.println("livingthing constructor");
}
}