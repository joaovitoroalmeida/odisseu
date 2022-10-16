rootProject.name = "odisseu"
val rootFolderModules = "modules"

include(":odisseu-webservice")
include(":odisseu-usecase")
include(":odisseu-dataprovider")
include(":odisseu-api")
include(":odisseu-database")
project(":odisseu-api").projectDir = file("$rootFolderModules/api")
project(":odisseu-webservice").projectDir = file("$rootFolderModules/webservice")
project(":odisseu-dataprovider").projectDir = file("$rootFolderModules/dataprovider")
project(":odisseu-usecase").projectDir = file("$rootFolderModules/usecase")
project(":odisseu-database").projectDir = file("$rootFolderModules/database")