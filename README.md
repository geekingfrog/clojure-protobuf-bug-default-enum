To run the java stuff:

```bash
mvn clean compile assembly:single
java -jar target/prototest-1-jar-with-dependencies.jar
```

And for clojure `lein run`


The protobuf file is under `resources`. The resulting java file has been created with `protoc --java_out=src/main/java/ resources/proto/*.proto`
