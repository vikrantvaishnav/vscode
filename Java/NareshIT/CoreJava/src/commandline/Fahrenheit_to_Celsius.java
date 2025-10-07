package commandline;

import java.text.DecimalFormat;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		
		float faherenheit = Integer.parseInt(args[0]);
		
		float celsius = ((faherenheit-32)*5)/9;
		
		//System.out.println(celsius);
		//System.out.printf("Cel=%.2f",celsius);
		
		DecimalFormat dc=new DecimalFormat("0.000");
		System.out.println("Celsius="+dc.format(celsius));

	}

}
