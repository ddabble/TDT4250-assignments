package conversion.temperature.unit;

import conversion.api.Unit;

public class Fahrenheit extends Unit {
	@Override
	public String getName() {
		return "Fahrenheit";
	}

	@Override
	public char getSymbol() {
		return 'F';
	}

	@Override
	public String toString() {
		return "°" + getSymbol();
	}
}
