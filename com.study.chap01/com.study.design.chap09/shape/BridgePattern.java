package shape;
/** "Client" */
public class BridgePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	Shape [] shapes = new Shape[]{
		new CircleShape(1,2,3, new DrawingAPI1()) ,
		new CircleShape(5,7,11, new DrawingAPI2())
	};
		
				for (Shape shape : shapes) {
		           shape.resizeByPercentage(2.5);
		           shape.draw();
		       }
	}

}
