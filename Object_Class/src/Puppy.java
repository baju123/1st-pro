
public class Puppy {
	public Puppy() {
		System.out.println("Hi default puppy");
		}
public Puppy(String name) {
//parameter (name)
System.out.println("Hi " + name);
}

public static void main (String args[]) {
	Puppy myPuppy = new Puppy ("tommy");
	Puppy myPuppy2 = new Puppy();
}
}