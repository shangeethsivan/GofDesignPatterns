
** Singleton Pattern **

    Singleton pattern restricts the instantiation of a class and ensures that only one instance of the
class exists in the java virtual machine. It seems to be a very simple design pattern but when it comes to implementation,
it comes with a lot of implementation concerns. The implementation of Singleton pattern has always been a controversial
topic among developers. This is one of the most discussed java design patterns.


• Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
• The singleton class must provide a global access point to get the instance of the class.
• Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
• Singleton pattern is used for logging, drivers objects, caching and thread pool.
• Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

To implement Singleton pattern, we have different approaches but all of them have following common concepts.

• Private constructor to restrict instantiation of the class from other classes.
• Private static variable of the same class that is the only instance of the class.
• Public static method that returns the instance of the class, this is the global access point for outer world to get the
instance of the singleton class.

The different approaches are:
    • Eager initialization
    • Static block initialization
    • Lazy Initialization
    • Thread Safe Singleton
    • Bill Pugh Singleton Implementation
    • Using Reflection to destroy Singleton Pattern
    • Enum Singleton
    • Serialization and Singleton


The singleton pattern can be destroyed using reflection and many other ways and there are ways to overcome this.

There is an interesting blog too check this out -
https://medium.com/exploring-code/how-to-make-the-perfect-singleton-de6b951dfdb0

I have only implemented a few types. If you want to know more about the different ways to implement singleton
please refer this site below.
https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples



