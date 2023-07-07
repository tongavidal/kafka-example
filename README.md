# kafka-example
Sample repo to practice Kafka


## Steps to run kafka-example
**1.Start Kafka environment:**

 * Start the ZooKeeper service -> $ bin/zookeeper-server-start.sh config/zookeeper.properties

 * Start the Kafka broker service -> $ bin/kafka-server-start.sh config/server.properties

**2.Read the events from the topic through the terminal:**

 * Run -> $ bin/kafka-console-consumer.sh --topic gastonTopic --from-beginning --bootstrap-server localhost:9092

**3.Read the events processed by the stream:**

 * Run -> $ bin/kafka-console-consumer.sh --topic afterStreamTopic --from-beginning --bootstrap-server localhost:9092

**4.Generate a new message in the topic:**

 * Do a POST call to -> http://localhost:8080/api/v1/messages?message=customMessage
 * The stream only consider the messages that starts with 'Message_' - In order to generate a message in the afterStreamTopic it is needed to add it. Ex: Message_example