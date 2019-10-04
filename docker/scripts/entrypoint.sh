#!/bin/bash

echo "** Entry Point: ${ENTRY_POINT} **"
echo "** Args       : ${JVM_ARGS} **"

export COMMON_JAVA_OPTS=" --add-opens java.base/sun.nio.ch=ALL-UNNAMED --add-opens java.base/sun.net.dns=ALL-UNNAMED "

java -cp "${CLASSPATH}" ${COMMON_JAVA_OPTS} ${JVM_ARGS} ${ENTRY_POINT}