package Tema9;

public abstract class Animal {
private double height;
private double weight;
private String emotion;
private String colour; 
private String sound;
private String name;
public Animal(double h, double w, String color, String sound, String n) {
this.height = h;
this.weight = w;
this.emotion = (( (int) (Math.random()*2))) == 1 ? "GOOD" : "BAD";
this.sound = sound;
this.colour = color;
this.name = n;
}
public void makeSound() {
	System.out.println(sound);
}
public void stare() {
	if (this.emotion == "BAD") {
		System.out.println(this.sound.toUpperCase()+ "!!!!!!!!!!");
		System.out.println("You have been attacked by your own " + this.getClass().getSimpleName());
	} else {
		System.out.println("It seems your animal didn't like it very much");
		this.emotion = "BAD";
	}
}
}
