package conversion.api;

import java.util.HashMap;
import java.util.Map;

public class UnitSymbolMap {
	private final Map<Character, Unit> unitSymbol_unit_map;

	public UnitSymbolMap() {
		unitSymbol_unit_map = new HashMap<>();
	}

	public Unit get(char unitSymbol) {
		return unitSymbol_unit_map.get(unitSymbol);
	}

	public void putUnitsFrom(UnitConverterInterface converter) {
		for (Unit unit : converter.getValidUnits()) {
			char unitSymbol = unit.getSymbol();
			if (unitSymbol_unit_map.containsKey(unitSymbol))
				throw new IllegalArgumentException("Can't add unit with the already registered symbol " + unitSymbol);

			unitSymbol_unit_map.put(unitSymbol, unit);
		}
	}

	public void removeUnitsFrom(UnitConverterInterface converter) {
		for (Unit unit : converter.getValidUnits()) {
			char unitSymbol = unit.getSymbol();
			unitSymbol_unit_map.remove(unitSymbol);
		}
	}
}
