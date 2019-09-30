package conversion.util;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import conversion.api.Unit;
import conversion.api.UnitConverter;

@Component(
		configurationPid = UnitConverterComponent.FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE)
public abstract class UnitConverterComponent extends UnitConverter {
	public static final String FACTORY_PID = "conversion.api.UnitConverterComponent";

	public static final String CONVERTER_NAME_PROP = "converterName";

	public UnitConverterComponent(Unit[] validUnits) {
		super(validUnits);
	}

	public @interface UnitConverterConfig {
		String converterName();
	}
}
