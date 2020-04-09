def call(Map config = [:]) {

    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                steps {
                    runMavenBuild false
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
