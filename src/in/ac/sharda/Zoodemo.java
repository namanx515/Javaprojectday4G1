package in.ac.sharda;

public class Zoodemo {

	public static void main(String[] args) {
	        Zoo z=new Zoo();
	        z.add(new Animal());
	        z.add(new Animal());
	        z.add(new Animal());
	        z.add(new Animal());
	        z.add(new Animal());
	        z.add(new Animal());
	        z.add(new Cat());
	        z.add(new Cat());
	        z.add(new Cat());
	        z.add(new Cat());
	        z.add(new Cat());
	        z.add(new Dog());
	        z.add(new Dog());
	        z.add(new Dog());
	        z.add(new Dog());
	        z.add(new Dog());
	        System.out.println(z.count());
	        
	        z.feed();
	}

}
