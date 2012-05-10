#!/usr/bin/env bash

CP=lib/libjcsi.jar:classes/.:.

echo "Running..."
if [[ $OSTYPE == linux-gnu ]] || [[ ${OSTYPE//[0-9.]/} == darwin ]]; then
  java -cp $CP suschord.newcoldhorizon.tests.SwingTest
elif [[ $OSTYPE == cygwin ]]; then
  java -cp `cygpath -wp $CP` suschord.newcoldhorizon.tests.SwingTest
else 
  echo "Unknown platform."
fi
echo "Done."
