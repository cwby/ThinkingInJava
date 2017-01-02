package FReU;

/** Reusing Classes, Exercise 14:
 * (1) In Car.java (changed to FReU14.java) add a service( ) method to Engine 
 * and call this method in main( ).
 * 
 * @author joe
 */
public class FReU14 {
	public FReU14Engine engine = new FReU14Engine();
	public FReU14Wheel[] wheel = new FReU14Wheel[4];
	public FReU14Door
	left = new FReU14Door(),
	right = new FReU14Door(); // 2-door
	public FReU14() {
		for(int i = 0; i < 4; i++)
			wheel[i] = new FReU14Wheel();
	}
	public static void main(String[] args) {
		FReU14 car = new FReU14();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}

class FReU14Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {}
}

class FReU14Wheel {
	public void inflate(int psi) {}
}

class FReU14Window {
	public void rollup() {}
	public void rolldown() {}
}

class FReU14Door {
	public FReU14Window window = new FReU14Window();
	public void open() {}
	public void close() {}
}
