interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(){
		System.out.println("Unicycle.ride()");
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Bicycle.ride()");
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Tricycle.ride()");
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}

public class CycleInterface {
	public static void rideCycle(CycleFactory factory){
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}
}
