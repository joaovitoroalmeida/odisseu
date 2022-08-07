rootProject.name = "odisseu"

include(":odisseu-webservice")
include(":odisseu-usecase")
include(":odisseu-dataprovider")
include(":odisseu-api")
project(":odisseu-api").projectDir = file("api")
project(":odisseu-webservice").projectDir = file("webservice")
project(":odisseu-dataprovider").projectDir = file("dataprovider")
project(":odisseu-usecase").projectDir = file("usecase")