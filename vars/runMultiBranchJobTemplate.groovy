def call(Map config = [:]) {
    def runMavenBuild = config.runMavenBuild
    node {
            stage('Build Java src') {
                    if (config.runMavenBuild){
                    runMavenBuild true
                    }
                }
            
            stage('Build Anugular src') {
                    runAngularBuild
                }
        }
    }
