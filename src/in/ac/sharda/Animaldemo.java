package in.ac.sharda;

public class Animaldemo {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.speak();
		a.walk();
        Dog d= new Dog();
        d.speak();
        d.walk();
        d.bite();
        Animal c= new Cat();
        c.speak();
        c.walk();
        Animal t= new Tiger();
        
        Tiger g=new Tiger();
        System.out.println(t.equals(g));
        
	}

}
