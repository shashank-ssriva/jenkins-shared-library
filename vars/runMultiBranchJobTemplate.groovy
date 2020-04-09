def call() {

    pipeline {
        agent any

        stages {
            stage('Build Anugular src') {
                steps {
                    runAngularBuild
                }
            }
        }
    }
}
