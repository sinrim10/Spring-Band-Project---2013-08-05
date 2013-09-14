package shape;

public abstract class Shape {
	   protected DrawingAPI drawingAPI;
	   public Shape(DrawingAPI drawingAPI) {
		// TODO Auto-generated constructor stub
		   this.drawingAPI = drawingAPI;
	   }  
	   public abstract void draw();                             // low-level
	   public abstract void resizeByPercentage(double pct);     // high-level
}
