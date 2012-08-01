#!/usr/bin/env bash

LIB=lib/
CP=.
SRC_DIR=src/
CLASS_DIR=classes/

echo "Building..."
if [ ! -d $CLASS_DIR ]; then
  mkdir $CLASS_DIR
fi

for jarfile in `ls ${LIB}*.jar`; do
  CP=$jarfile:$CP
done

if [[ $OSTYPE == linux-gnu ]] || [[ ${OSTYPE//[0-9.]/} == darwin ]]; then
  javac -cp $CP -sourcepath $SRC_DIR -d $CLASS_DIR $1 $SRC_DIR/suschord/newcoldhorizon/tests/*.java && echo "Done."
elif [[ $OSTYPE == cygwin ]]; then
  javac -cp `cygpath -wp $CP` -sourcepath $SRC_DIR -d $CLASS_DIR $1 $SRC_DIR/suschord/newcoldhorizon/tests/*.java && echo "Done."
else
  echo "Unknown platform."
fi
