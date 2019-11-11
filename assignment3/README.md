## Assignment 3

### Folder structure
 * **[`study.acceleo`](study.acceleo)** contains code for generating HTML files from model instances
 * **[`study.servlet`](study.servlet)** contains code for the servlets that serve the generated HTML files and also some static files

### Prerequisites
 * Eclipse
 * The following Eclipse plugins:
   * Acceleo, Acceleo Query SDK
   * Bndtools, Bndtools m2e, Bndtools PDE
   * Eclipse DSL Tools
   * EMF - Eclipse Modeling Framework SDK, EMF - Eclipse Modeling Framework Xcore SDK, EMF Forms SDK
   * MWE2 Language SDK
   * Xtext Complete SDK

### Setup
 * Clone this repo
 * Create a new Eclipse workspace in the **[`assignment3`]()** folder
 * Import the Bnd workspace
 * Import the **[`assignment1`](/assignment1)** and **[`study.acceleo`](study.acceleo)** projects
 * Run **[`generate.mtl`](study.acceleo/src/study/acceleo/main/generate.mtl)** as an Acceleo application with the "Model" field set to `/assignment1/model/NTNU.xmi` and the "Target" field set to `/study.servlet/resources`. This will replace the [`NTNU.html`](study.servlet/resources/NTNU.html) file already present.
 * Open `study.servlet`'s **[`launch.bndrun`](study.servlet/launch.bndrun)**, and click **Run OSGi**

After this, you can visit the servlet's index page - http://localhost:8080/ - and view the generated HTML file by clicking the [NTNU.html](http://localhost:8080/ntnu) link.
