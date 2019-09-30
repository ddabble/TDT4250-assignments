package conversion.api;

import java.util.HashMap;
import java.util.Map;

public class UnitConversionHandler {
	private UnitSymbolMap unitSymbolMap;
	private Map<Class<? extends Unit>, UnitConverterInterface> unit_converter_map;

	public UnitConversionHandler(UnitConverterInterface... converters) {
		this.unitSymbolMap = new UnitSymbolMap();
		this.unit_converter_map = new HashMap<>();

		for (UnitConverterInterface converter : converters)
			addUnitConverter(converter);
	}

	public void addUnitConverter(UnitConverterInterface converter) {
		unitSymbolMap.putUnitsFrom(converter);

		// Assumes that no two converters share a unit to convert to/from
		for (Class<? extends Unit> unit : converter.getValidUnitClasses()) {
			if (unit_converter_map.containsKey(unit))
				throw new IllegalArgumentException("Can't add another unit converter that converts to/from " + unit);

			unit_converter_map.put(unit, converter);
		}
	}

	public void removeUnitConverter(UnitConverterInterface converter) {
		for (Class<? extends Unit> unit : converter.getValidUnitClasses())
			unit_converter_map.remove(unit);

		unitSymbolMap.removeUnitsFrom(converter);
	}

	public Unit getUnitBySymbol(char symbol) {
		return unitSymbolMap.get(symbol);
	}

	public UnitConversionResult convert(Unit fromUnit, Unit toUnit, double value) {
		UnitConverterInterface converter = unit_converter_map.get(fromUnit.getClass());
		UnitConversionResult result = converter.convert(value, fromUnit, toUnit);
		if (result == null)
			result = new UnitConversionResult(value, fromUnit, toUnit);

		return result;
	}
}
