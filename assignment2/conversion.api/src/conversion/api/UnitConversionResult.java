package conversion.api;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class UnitConversionResult {
	public final double value;
	public final Unit fromUnit;
	public final double result;
	public final Unit toUnit;
	public final boolean success;

	/**
	 * Constructor for when the conversion was not successful.
	 */
	public UnitConversionResult(double value, Unit fromUnit, Unit toUnit) {
		this(value, fromUnit, Double.NaN, toUnit, false);
	}

	public UnitConversionResult(double value, Unit fromUnit, double result, Unit toUnit, boolean success) {
		this.value = value;
		this.fromUnit = fromUnit;
		this.result = result;
		this.toUnit = toUnit;
		this.success = success;
	}
}
