#!/usr/bin/env bash

LIB=lib/
CP=classes/:.

for jarfile in `ls ${LIB}*.jar`; do
  CP=$jarfile:$CP
done

echo "Running..."
if [[ $OSTYPE == linux-gnu ]] || [[ ${OSTYPE//[0-9.]/} == darwin ]]; then
  java -cp $CP suschord.newcoldhorizon.tests.SwingTest
elif [[ $OSTYPE == cygwin ]]; then
  java -cp `cygpath -wp $CP` suschord.newcoldhorizon.tests.SwingTest
else 
  echo "Unknown platform."
fi
echo "Done."
