def call(Map config = [:]) {

    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                steps {
                    if (config.runMavenBuild) {
                    runMavenBuild
                    }
                }
            }

            stage('Build Anugular src') {
                steps {
                    if (config.runAngularBuild) {
                    runAngularBuild
                    }
                }
            }
        }
    }
}
