package converter;

/**
 * An enumeration of length units, with value
 * @author Pimwalun Witchawanitchanun
 *
 */
public enum Length {
	Mile(1609.344),
	Kilometer(1000.0),
	Meter(1.0),
	Foot(0.30480),
	Wa(2.00000),
	AU(149597870700.0),
	Centimeter(100.0);
	
	// attribute of the enum number.
	private final double value;
	
	/**
	 * Create a Length
	 * @param value is number of the length unit.
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * Return value of the length unit.
	 * @return value of the length unit.
	 */
	public double getValue() {
		return this.value;
	}
}
