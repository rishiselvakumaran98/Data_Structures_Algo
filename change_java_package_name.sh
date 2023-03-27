#!/bin/bash
# loop through each subdirectory in RoadMap
for subdir in */*/; do
    # replace the package name in each Java file
    find "$subdir/Java" -type f -name "*.java" -exec sed -i '' 's/package \(.*\)\.Java\.\(.*\);/package \1.\2.Java;/' {} +
done
