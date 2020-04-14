def call(Map config = [:]) {
    echo "Building Angular source..."
    echo "Invoke ./build.sh script to build."
    sh "./build.sh"
}
