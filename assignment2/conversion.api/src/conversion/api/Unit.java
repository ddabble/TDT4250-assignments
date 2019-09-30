package conversion.api;

public abstract class Unit {
	public Unit() {
	}

	public abstract String getName();

	public abstract char getSymbol();

	@Override
	public String toString() {
		return Character.toString(getSymbol());
	}
}
