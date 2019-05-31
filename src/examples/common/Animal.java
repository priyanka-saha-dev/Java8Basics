package examples.common;

public interface Animal {

	//public void sound(String sound);
	
	public default void move() {
		System.out.println("Animal is moving");
	}
	
	public default void eat(String food) {
		System.out.println("Animal is eating : " + food);
	}
	
}
