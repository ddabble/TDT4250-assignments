## Assignment 2

### Folder structure
 * **[`conversion.api`](conversion.api)** contains the classes for the unit conversion API
 * **[`conversion.gogo`](conversion.gogo)** contains the components for handling commands in the gogo shell
 * **[`conversion.servlet`](conversion.servlet)** contains code for the servlet that can be queried for unit conversion
 * **[`conversion.temperature`](conversion.temperature)** contains an implementation of `UnitConverterInterface`
 * **[`conversion.util`](conversion.util)** contains a stub class for configuration of unit converters

### Setup
Import the Bnd workspace (this folder) into Eclipse, open `conversion.servlet`'s **[`launch.bndrun`](conversion.servlet/launch.bndrun)**, and click **Run OSGi**.

After this, you can query the servlet for unit conversions, using URLs like this one: http://localhost:8080/convert?v=100&from=F&to=C
