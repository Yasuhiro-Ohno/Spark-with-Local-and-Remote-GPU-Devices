#!/bin/sh

./bin/spark-submit --class org.apache.spark.examples.ohno.$1 --executor-memory 10g examples/target/scala-2.10/spark-examples-1.6.0-hadoop2.6.0.jar > spark-gpu.txt
