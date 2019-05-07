#!/bin/zsh
jbmc --classpath /home/fra/Cloned/cbmc/jbmc/lib/java-models-library/target/core-models.jar:. --java-threading BubbleSort.class  --compact-trace --unwind 25 --unwinding-assertions

