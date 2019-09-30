package conversion.api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class UnitConverter implements UnitConverterInterface {
	private final Collection<Unit> validUnits;
	private final Set<Class<? extends Unit>> validUnitClasses;

	public UnitConverter(Unit[] validUnits) {
		this.validUnits = Collections.unmodifiableCollection(Arrays.asList(validUnits));
		validUnitClasses = Collections.unmodifiableSet(
				this.validUnits.stream().map(unit -> unit.getClass())
						.collect(Collectors.toSet()));
	}

	@Override
	public Collection<Unit> getValidUnits() {
		return validUnits;
	}

	@Override
	public Set<Class<? extends Unit>> getValidUnitClasses() {
		return validUnitClasses;
	}

	protected boolean isUnitCombinationValid(Unit unit1, Unit unit2) {
		return !unit1.getClass().equals(unit2.getClass())
				&& validUnitClasses.contains(unit1.getClass())
				&& validUnitClasses.contains(unit2.getClass());
	}
}
