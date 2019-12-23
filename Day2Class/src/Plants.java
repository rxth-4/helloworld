
public class Plants extends LivingThings{
	public String type;
	
	public Plants() {}
	
	public Plants(String c,int l,String t) /*though plant has only type attribute, 
	we have to include the attributes from livingthings bcos constuctor is like that*/
	{
		super(c,l); //should include super bcos inheriting from livingthings class
		type=t;
		System.out.println("this plant");
		
	}
	

}
