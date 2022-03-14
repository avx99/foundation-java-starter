rootProject.name = "foundation-starter" //TODO: Change this to your project name

listOf("api", "service").forEach {
    include(":app-$it")
    project(":app-$it").name = rootProject.name + "-$it"
}
