def call(Map config = [:]) {
    def runMavenBuild = config.runMavenBuild
    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                steps {
                    runMavenBuild
                }
            }

            stage('Build Anugular src') {
                steps {
                    runAngularBuild
                }
            }
        }
    }
}
