def call(Map config = [:]) {

    pipeline {
        
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
