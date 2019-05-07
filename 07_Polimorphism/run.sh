#!/bin/zsh
jbmc --classpath /home/fra/Cloned/cbmc/jbmc/lib/java-models-library/target/core-models.jar:. --java-threading PoliMorphism.class  --compact-trace

