package conversion.gogo;

import java.util.Optional;

import org.apache.felix.service.command.Descriptor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Component;

import conversion.api.UnitConverterInterface;

@Component(
		service = ConversionCommands.class,
		property = {
				"osgi.command.scope=convert",
				"osgi.command.function=list",
		})
public class ConversionCommands {
	@Descriptor("List available conversions")
	public void list() {
		System.out.println("Unit converters:");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<UnitConverterInterface> serviceReference : bc.getServiceReferences(
					UnitConverterInterface.class, null)) {
				UnitConverterInterface converter = bc.getService(serviceReference);
				try {
					if (converter != null) {
						Optional<String> unitString = converter.getValidUnits().stream()
								.map(unit -> Character.toString(unit.getSymbol()))
								.reduce((u1, u2) -> u1 + "/" + u2);
						System.out.println("\t" + converter.getName() + " [" + unitString.get() + "]");
					}
				} finally {
					bc.ungetService(serviceReference);
				}
			}
		} catch (InvalidSyntaxException e) {
		}
	}
}
