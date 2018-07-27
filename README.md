# Micronaut Eclipse

Demonstrates Micronaut Eclipse issues

* Import the project into Eclipse using Eclipse BuildShip https://projects.eclipse.org/projects/tools.buildship
* Run ./gradlew eclipse and Refresh the project
* Run a clean build in Eclipse
* Open "Error Log" view and you will see the message `Creating bean classes for 1 type elements` which indicates Micronaut is working

If you look in the `bin` directory the `default` directory contains the `META-INF/services` files that are generated, but the `.class` files are no where to be seen.
