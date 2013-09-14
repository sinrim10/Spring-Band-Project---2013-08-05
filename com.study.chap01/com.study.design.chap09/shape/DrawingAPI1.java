package shape;

public class DrawingAPI1 implements DrawingAPI{
	/** "ConcreteImplementor"  1/2 */
	@Override
	public void drawCircle(double x, double y, double radius) {
		// TODO Auto-generated method stub
		System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
		
	}

}
