def call(Map config = [:]) {
    def runMavenBuild = config.runMavenBuild
    pipeline {
        agent any

        stages {
            stage('Build Java src') {
                steps {
                    script {
                    if (config.runMavenBuild){
                    runMavenBuild()
                    }
                    }
                }
            }

            stage('Build Angular src') {
                steps {
                    script {
                    runAngularBuild()
                }
                }
            }
        }
    }
}
