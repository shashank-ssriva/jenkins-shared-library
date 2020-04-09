def call(Map config = [:]) {
    echo 'Building source...'
    sh "/usr/local/bin/mvn --version"
}
