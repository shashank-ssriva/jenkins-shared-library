def call(Map config = [:]) {
    def runMavenBuild = config.runMavenBuild
    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                if(config.runMavenBuild)
                {
                steps {
                    runMavenBuild
                }
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
