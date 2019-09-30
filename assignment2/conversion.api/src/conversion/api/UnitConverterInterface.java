package conversion.api;

import java.util.Collection;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface UnitConverterInterface {
	String getName();

	UnitConversionResult convert(double value, Unit fromUnit, Unit toUnit);

	Collection<Unit> getValidUnits();

	Set<Class<? extends Unit>> getValidUnitClasses();
}
