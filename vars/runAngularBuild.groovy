def call(Map config = [:]) {
    echo "Building Angular source..."
    sh "./build.sh"
}
