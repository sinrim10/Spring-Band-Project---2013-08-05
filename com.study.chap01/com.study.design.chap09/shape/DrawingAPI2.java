package shape;
/** "ConcreteImplementor" 2/2 */
public class DrawingAPI2 implements DrawingAPI{

	@Override
	public void drawCircle(double x, double y, double radius) {
		// TODO Auto-generated method stub
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
	}

}
