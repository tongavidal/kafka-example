# kafka-example
Sample repo to practice Kafka


## Steps to run kafka-example
**1.Start Kafka environment:**

 * Start the ZooKeeper service -> $ bin/zookeeper-server-start.sh config/zookeeper.properties

 * Start the Kafka broker service -> $ bin/kafka-server-start.sh config/server.properties

**2.Read the events from the topic through the terminal:**

 * Run -> $ bin/kafka-console-consumer.sh --topic gastonTopic --from-beginning --bootstrap-server localhost:9092

**3.Generate a new message in the topic:**

 * Do a POST call to -> http://localhost:8080/api/v1/messages?message=customMessage