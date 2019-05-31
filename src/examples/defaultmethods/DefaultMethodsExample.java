package examples.defaultmethods;

import examples.common.Animal;

public class DefaultMethodsExample implements Animal {

	public static void main(String[] args) {
		DefaultMethodsExample ex = new DefaultMethodsExample();
		
		ex.move();
		ex.eat("abc");
		
	}


}
