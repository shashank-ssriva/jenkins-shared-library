def call(Map config = [:]) {

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
