#!/usr/bin/env groovy
runPipeline() {
        node {
                stage ("succuss") {
                        echo "Hello"
                }
        }
}