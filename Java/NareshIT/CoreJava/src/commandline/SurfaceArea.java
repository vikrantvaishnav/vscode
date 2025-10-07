package commandline;
import java.text.DecimalFormat;

public class SurfaceArea {

	public static void main(String[] args) {
		
		int radius = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
		
		double surfaceArea = (2*Math.PI*radius*(radius+height));
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Area = "+df.format(surfaceArea));

	}

}
