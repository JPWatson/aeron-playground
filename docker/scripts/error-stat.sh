#!/bin/bash

set -eo pipefail

java -cp "${CLASSPATH}" io.aeron.samples.ErrorStat
