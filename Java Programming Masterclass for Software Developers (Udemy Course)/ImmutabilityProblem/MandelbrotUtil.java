package immutability-oop;

public class MandelbrotUtil {
	
	private MandelbrotUtil() {
		
	}
	
	
	/**
	 * Return the number of iterations needed to determine if z(n + 1) = z(n) * z(n) + c
	 * remains bounded where z(0) = 0 + 0i. z(n + 1) is bounded if its magnitude
	 * is less than or equal to 2. Returns 1 if the magnitude of c
	 * is greater than 2. Returns max if the magnitude
	 * of z(n + 1) is less than or equal to 2 after max iterations.
	 * 
	 * <p>
	 * If z(n + 1) remains bounded after max iterations then c is assumed to
	 * be in the Mandelbrot set.
	 * 
	 * @param c a complex number
	 * @param max the maximum number of iterations to attempt
	 * @return the number of iterations needed to determine if z(n + 1) = z(n) * z(n) + c
	 * remains bounded where z(0) = 0.0 + 0.0i. 
	 * @pre. max is greater than 0
	 */
	public static int mandelbrotIterations(Complex c, int max) {
		if (max < 0) {
			throw new IllegalArgumentException("invalid max value");
		}
		int counter = 0;
		Complex z = new Complex(0.0, 0.0);
		if (c.mag() <= 2.0) {
			for (int i = 0; i < max; i++) {
				z = z.multiply(z).add(c);
				counter++;
					if (z.mag() > 2) {
						return counter;
					}
			}
		}
	
		else {
			return 1;
		}
		
		// You need a loop here. Inside the loop, set z to z * z + c
		// (i.e. perform one iteration of the equation) and
		// check if the magnitude of z is greater than 2; if
		// the magnitude is greater than 2 then return the
		// number of times you computed z * z + c.
		// If you compute z * z + c max times and the magnitude
		// of z is still less than or equal to 2 you should
		// return max.
	
		return max;
	}
}
