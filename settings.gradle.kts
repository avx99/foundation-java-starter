// Nom du projet à personnaliser
rootProject.name = "foundation-starter"

// Indique à Gradle qu'il s'agit d'un projet composé de 3 modules
include(":app-api")
include(":app-core") // utilise :app-api
include(":app-service") // utilise :app-service



