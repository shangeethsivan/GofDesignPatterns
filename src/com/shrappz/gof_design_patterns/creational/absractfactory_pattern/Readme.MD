
** Abstract Factory Pattern **

An AbstractFactory is a class that exists to create instances of another class. Described on page 87 of the DesignPatternsBook.
Typically, if you want to construct instances of a class, where the class is selected at run time, you...
Create one AbstractFactory class for each existing class (or group of related classes) you wish to create.
Have a polymorphic "create instance" method on each AbstractFactory class, conforming to a common method signature, used to create instances of the corresponding class.
Store and pass around instances of the AbstractFactory class to control selection of the class to create.
Suppose an abstract class wants to hide its sub class name and its instantiation. If we request one static method of the class that return its sub class object.

```

 abstract class AA
 {
	static AA getInstance()
	{
	return new A();
	}
 }

```

```

 class A extends AA
 {

 }

 class Client
 {
 AA aa=AA.getInstance();
 aa.method();
 }

```


Source : http://wiki.c2.com/?AbstractFactoryPattern