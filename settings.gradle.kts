rootProject.name = "helpcar-customer"

include(":helpcar-customer-webservice")
include(":helpcar-customer-usecase")
include(":helpcar-customer-dataprovider")
include(":helpcar-customer-api")
project(":helpcar-customer-api").projectDir = file("api")
project(":helpcar-customer-webservice").projectDir = file("webservice")
project(":helpcar-customer-dataprovider").projectDir = file("dataprovider")
project(":helpcar-customer-usecase").projectDir = file("usecase")