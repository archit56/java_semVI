class Increament
{
	public static void main(String args[])
	{
		int x=5;
		int y=10;
		int z= y++;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= ++y;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= y++ +x+ x;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= ++y +x+ x;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= y++ +x+ y++;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= y++ +x+ ++y;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= y++ +x+ x++;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		x=5;
		y=10;
		z= y++ +x+ ++x;
		System.out.println("X= "+x+" Y= "+y+" Z= "+z);
		//OUTPUT=?	<-Write Here->
		
		
	}
}