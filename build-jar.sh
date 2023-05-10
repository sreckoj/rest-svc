#!/bin/bash

# This command creates an executable jar with embedded Liberty.

mvn package liberty:create liberty:install-feature liberty:deploy liberty:package -Dinclude=minify,runnable
