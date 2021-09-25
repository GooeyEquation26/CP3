# CP3
## This is the notes and class work from class

The main ideas of the class were
* Abstract
* Extends
* The difference between this, and super
## Description: 

### We mainly worked on learning how different classes interact with each other.
### Such as how super effects the parent class and how this effects class specific data to that class

### We also learned about the extension of a class with the word extends 

```java

public class ThatClass {
    //This is executed therefore "Hello World!" is printed
    public String toString() {
    	System.out.println("Hello World!");
    }
}
public class ThisClass extends ThatClass {
    //Stuff here can be linked to parent like so
    public String toString() {
	String str = super.toString();
	return str;
    }
}

```


