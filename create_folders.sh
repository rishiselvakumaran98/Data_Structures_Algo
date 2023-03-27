#!/bin/bash
# loop through each subdirectory in RoadMap
for subdir in */*/; do
    echo "$subdir"
    # check if the current item is a directory
    if [ -d "$subdir" ]; then
        # create the Python and Java directories in the current subdirectory
        mkdir "$subdir/Python"
        mkdir "$subdir/Java"
        # move all .py files into the Python directory
        mv "$subdir"/*.py "$subdir/Python/" 2>/dev/null
        # move all .java files into the Java directory
        mv "$subdir"/*.java "$subdir/Java/" 2>/dev/null
    fi
done
