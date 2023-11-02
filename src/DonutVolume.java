// public class DonutVolume with 2 private double variables innerRadius and outerRadius
public class DonutVolume {
	private double innerRadius;
	private double outerRadius;
	
	// default constructor with initial values equal to 0.0 and 0.0
	public DonutVolume() {
		this(0.0, 0.0);
	}

	/*
	 * overloaded constructor with two values :innerRadius and outerRadius
	 */
	public DonutVolume(double innerRadius, double outerRadius) {
		this.innerRadius = innerRadius;
		this.outerRadius = outerRadius;
	}

	// getter for innerRadius
	public double getInnerRadius() {
		return innerRadius;
	}

	// setter for innerRadius
	public void setInnerRadius(double innerRadius) {
		this.innerRadius = innerRadius;
	}

	// getter for outerRadius
	public double getOuterRadius() {
		return outerRadius;
	}

	// setter for outerRadius
	public void setOuterRadius(double outerRadius) {
		this.outerRadius = outerRadius;
	}

	/**
	 * a method to calculate torus volume
	 * @return String
	 */
	public String toCalculate() {
		//declaration a double variable
		double volume;
		/*
		 * formula V=0.25π^2*(a+b)*(b−a)^2 
		 * a = inner radius and b = outer radius
		 * formula sourced from Keisan Casio website
		 * https://keisan.casio.com/exec/system/1223388402
		 * 
		 * Math.PI method follows from examples in an online tutorial by javatpoint.com
		 * reference: Java Pi in Javatpoint
		 * https://www.javatpoint.com/java-pi
		 * 
		 * Java Math.pow() method follows from examples in an online tutorial by javatpoint.com
		 * reference: Java Math.pow ()in Javatpoint
		 * https://www.javatpoint.com/java-math-pow-method
		 * 
		 * once calculated as per formula, assign the value to variable volume
		*/
		
		volume = 0.25 * Math.pow(Math.PI, 2) * (innerRadius + outerRadius)
				* Math.pow(outerRadius - innerRadius, 2);
		 /*
		  * using String.formula to return a string: 
		  * Volume = a number with 2 decimal places number, 
		  * and followed by the unit "cc"
		  */
		 
		return String.format("%s %.2f %s", "Volume =", volume, "cc");
	}
}
