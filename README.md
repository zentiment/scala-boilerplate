scala-boilerplate
=========================

A template for working with scala-based data systems and creating mashups.

Currently supported:

1. Akka-cluster (remoting)
2. Apache Spark
3. Scalding-Cascading


### Build system

This project uses the sbt multi-build setup
Pertinent files are
```
./project/Build.scala
./project/Dependencies.scala
./project/Settings.scala
./project/Versions.scala
```


### Demo Run

```scala
sbt app/run
```
