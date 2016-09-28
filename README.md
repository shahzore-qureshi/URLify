# URLify
Simple implementation of a String-to-URL-friendly-String generator in Java.

## Usage
Type in the following commands in a terminal:
(note: make sure that asterisk * is escaped via quotes)

```java
javac URLify.java
java URLify
>>> Please include one String argument and its integer length as a second argument.

java URLify test 4
>>> Original String: "test"
>>> URLified String: "test"

java URLify "test me" 7
>>> Original String: "test me"
>>> URLified String: "test%20me"

java URLify "hello there sir    " 15
>>> Original String: "hello there sir    "
>>> URLified String: "hello%20there%20sir"

java URLify "Mr John Smith    " 13
>>> Original String: "Mr John Smith    "
>>> URLified String: "Mr%20John%20Smith"

```
