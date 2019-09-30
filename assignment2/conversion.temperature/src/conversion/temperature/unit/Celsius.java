package conversion.temperature.unit;

import conversion.api.Unit;

public class Celsius extends Unit {
	@Override
	public String getName() {
		return "Celsius";
	}

	@Override
	public char getSymbol() {
		return 'C';
	}

	@Override
	public String toString() {
		return "°" + getSymbol();
	}
}
