plugins {
    gradlebuild.distribution.`core-api-java`
    gradlebuild.classycle
}

description = "A set of general-purpose resource abstractions"

dependencies {
    implementation(project(":baseServices"))
    implementation(project(":files"))
    implementation(project(":messaging"))
    implementation(project(":native"))

    implementation(library("slf4j_api"))
    implementation(library("guava"))
    implementation(library("commons_io"))

    testImplementation(project(":processServices"))
    testImplementation(project(":coreApi"))
    testImplementation(project(":fileCollections"))
    testImplementation(project(":snapshots"))

    testImplementation(testFixtures(project(":core")))

    integTestImplementation(project(":internalIntegTesting"))
    integTestRuntimeOnly(project(":runtimeApiInfo"))
}
