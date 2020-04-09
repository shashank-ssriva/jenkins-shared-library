def call(Map config = [:]) {
    def runMavenBuild = config.runMavenBuild
    node {
            stage('Build Java src') {
                    if (config.runMavenBuild){
                    runMavenBuild
                    }
                }
            
            stage('Build Anugular src') {
                    runAngularBuild
                }
        }
    }
