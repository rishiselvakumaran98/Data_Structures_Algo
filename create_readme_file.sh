#!/bin/bash
# loop through each subdirectory in RoadMap
for subdir in */*; do
    echo "$subdir"
    touch "$subdir/README.md"
done
