#!/bin/bash

# this is a convenience script for local generation of the build artifacts
set -e 
set -o pipefail 

#docker run --rm -it -v $PWD:$PWD -w $PWD gradle:jdk8 ./gradlew build
docker run --rm -it -v $PWD:$PWD -w $PWD gradle:jdk11 ./gradlew build
