#!/bin/sh

for i in `seq 1 $1`;do ./bin/spark-submit --class org.apache.spark.examples.ohno.$2 --driver-memory 30g examples/target/scala-2.10/spark-examples-1.6.0-hadoop2.6.0.jar;done > spark-gpu-iterations.txt

