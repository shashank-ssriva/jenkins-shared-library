def call(Map config = [:]) {

    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                steps {
                    script {
                    runMavenBuild
                    }
                }
            }

            stage('Build Anugular src') {
                steps {
                    script {
                    runAngularBuild
                    }
                }
            }
        }
    }
}
