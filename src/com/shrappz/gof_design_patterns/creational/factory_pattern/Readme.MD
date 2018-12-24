
# ** Factory Pattern **

Factory design pattern is used when we have a super class with multiple sub-classes and based on input,
we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client
program to the factory class. We can apply Singleton pattern on Factory class or make the factory method static.
This is one of the most widely used java design pattern.



## Factory Design Pattern Advantages
* Factory design pattern provides approach to code for interface rather than implementation.
* Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
* Factory pattern provides abstraction between implementation and client classes through inheritance.
