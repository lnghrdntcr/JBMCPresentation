#!/bin/zsh
jbmc --classpath /home/fra/Cloned/cbmc/jbmc/lib/java-models-library/target/core-models.jar:. --java-threading CriticalSection.class --unwind 3 --compact-trace

