/*
=========================================================
PROBLEM STATEMENT
=========================================================
Understand Java Classes, Objects, Object References,
and Passing Objects as Method Arguments.

This program demonstrates:

1. Creating user-defined classes.
2. Creating objects using the new keyword.
3. Accessing object properties using the dot operator.
4. Passing an object as a method argument.
5. Modifying object properties through a method.
6. Understanding how object references behave in Java.

Two classes are created:

Student:
- name
- rno
- percent

Car:
- name
- type
- price

Two methods are used:

fun(Student x):
Prints the name of the Student object.

change(Student s):
Changes the name of the Student object to "Mahato".

=========================================================
INPUT FORMAT
=========================================================
This program does not require user input.

All objects and their values are initialized
directly inside the main() method.

Therefore, Scanner is not required.

=========================================================
OUTPUT FORMAT
=========================================================
Print the following values in separate lines:

Ranjan
Mahato
alto
Pragati

=========================================================
DRY RUN EXAMPLE 1
=========================================================
Initially, Student object s1 is created.

s1.name = "Ranjan"
s1.rno = 58
s1.percent = 92.5

Print:
s1.name

Output:
Ranjan

Now call:
change(s1)

Inside change():

Student s refers to the same Student object
referenced by s1.

Execute:
s.name = "Mahato"

The original object is modified.

Now:
s1.name = "Mahato"

Print:
s1.name

Output:
Mahato

=========================================================
DRY RUN EXAMPLE 2
=========================================================
Create Student object s2.

s2.name = "Pragati"
s2.percent = 97.2
s2.rno = 67

Create Car object c1.

c1.name = "alto"
c1.price = 400000
c1.type = "hatchback"

Print:
c1.name

Output:
alto

Now call:
fun(s2)

Inside fun():

Student x refers to the object referenced by s2.

Execute:
System.out.println(x.name);

Output:
Pragati

Final Output:
Ranjan
Mahato
alto
Pragati

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class StudentClass {

    /*
    =====================================================
    USER-DEFINED CLASS : Student
    =====================================================

    A class is a blueprint used to create objects.

    This Student class contains three instance variables:

    name    -> Stores student's name.
    rno     -> Stores student's roll number.
    percent -> Stores student's percentage.

    Every Student object gets its own copy
    of these instance variables.
    */
    public static class Student {

        /*
        Instance variable to store student name.

        Default value:
        null
        */
        String name;

        /*
        Instance variable to store roll number.

        Default value:
        0
        */
        int rno;

        /*
        Instance variable to store percentage.

        Default value:
        0.0
        */
        double percent;
    }

    /*
    =====================================================
    USER-DEFINED CLASS : Car
    =====================================================

    This class represents a Car.

    It contains three instance variables:

    name  -> Car name.
    type  -> Car type.
    price -> Car price.

    Each Car object maintains its own properties.
    */
    public static class Car {

        /*
        Store the name of the car.
        */
        String name;

        /*
        Store the category or type of the car.

        Example:
        Hatchback, Sedan, SUV
        */
        String type;

        /*
        Store the price of the car.
        */
        int price;
    }

    /*
    =====================================================
    METHOD NAME : fun
    =====================================================

    Purpose:
    Accept a Student object as a method argument
    and print its name.

    Parameter:
    Student x

    Here, x receives a copy of the object reference.

    The object itself is not copied.

    Example:

    Student s2;
    fun(s2);

    Inside fun():
    x refers to the same object as s2.
    */
    public static void fun(Student x) {

        /*
        Access the name property of the Student object
        using the dot operator.

        Example:

        x.name = "Pragati"

        Output:
        Pragati
        */
        System.out.println(x.name);

        /*
        Return from the method.

        Since the return type is void,
        an explicit return statement is optional.
        */
        return;
    }

    /*
    =====================================================
    METHOD NAME : change
    =====================================================

    Purpose:
    Modify the name property of an existing
    Student object.

    Parameter:
    Student s

    The parameter receives a copy of the reference
    passed during the method call.

    Both references point to the same Student object.

    Therefore, modifying an object's field through
    s also affects the object accessed through s1.
    */
    public static void change(Student s) {

        /*
        Modify the name property of the Student object.

        Initially:

        s.name = "Ranjan"

        After execution:

        s.name = "Mahato"

        Since s and s1 refer to the same object:

        s1.name also becomes "Mahato".
        */
        s.name = "Mahato";
    }

    public static void main(String[] args) {

        /*
        =================================================
        STEP 1: CREATE FIRST STUDENT OBJECT
        =================================================

        Use the new keyword to create a Student object.

        Student s1 stores the reference to that object.

        Memory concept:

        s1 ------> Student Object
        */
        Student s1 = new Student();

        /*
        Assign the name to the Student object.

        s1.name = "Ranjan"
        */
        s1.name = "Ranjan";

        /*
        Assign roll number.

        s1.rno = 58
        */
        s1.rno = 58;

        /*
        Assign percentage.

        s1.percent = 92.5
        */
        s1.percent = 92.5;

        /*
        =================================================
        STEP 2: CREATE SECOND STUDENT OBJECT
        =================================================

        Create another independent Student object.

        s2 refers to a different object from s1.

        Memory concept:

        s1 ------> Student Object 1

        s2 ------> Student Object 2

        Both objects have their own instance variables.
        */
        Student s2 = new Student();

        /*
        Assign the second student's name.
        */
        s2.name = "Pragati";

        /*
        Assign the second student's percentage.
        */
        s2.percent = 97.2;

        /*
        Assign the second student's roll number.
        */
        s2.rno = 67;

        /*
        =================================================
        STEP 3: CREATE CAR OBJECT
        =================================================

        Create an object of the Car class.

        c1 stores the reference to the created Car object.
        */
        Car c1 = new Car();

        /*
        Assign the car name.

        c1.name = "alto"
        */
        c1.name = "alto";

        /*
        Assign the car price.

        c1.price = 400000
        */
        c1.price = 400000;

        /*
        Assign the car type.

        c1.type = "hatchback"
        */
        c1.type = "hatchback";

        /*
        =================================================
        STEP 4: PRINT FIRST STUDENT NAME
        =================================================

        Access the name property using the dot operator.

        Current value:

        s1.name = "Ranjan"

        Output:
        Ranjan
        */
        System.out.println(s1.name);

        /*
        =================================================
        STEP 5: PASS STUDENT OBJECT TO change()
        =================================================

        Pass s1 as an argument to the change() method.

        Inside the method:

        public static void change(Student s)

        The parameter s receives a copy of the reference
        stored in s1.

        Both references access the same object.

        Therefore, changes made to the object's fields
        through s are visible through s1.
        */
        change(s1);

        /*
        =================================================
        STEP 6: PRINT UPDATED STUDENT NAME
        =================================================

        Inside change():

        s.name = "Mahato"

        Since s and s1 refer to the same Student object:

        s1.name = "Mahato"

        Output:
        Mahato
        */
        System.out.println(s1.name);

        /*
        =================================================
        STEP 7: PRINT CAR NAME
        =================================================

        Access the name property of Car object c1.

        Current value:

        c1.name = "alto"

        Output:
        alto
        */
        System.out.println(c1.name);

        /*
        =================================================
        STEP 8: PASS SECOND STUDENT OBJECT TO fun()
        =================================================

        Pass s2 as an argument to fun().

        Inside fun():

        Student x receives a copy of the reference
        stored in s2.

        Both x and s2 refer to the same Student object.

        The fun() method prints:

        x.name = "Pragati"

        Output:
        Pragati
        */
        fun(s2);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. OBJECT REFERENCES AND INSTANCE VARIABLES

   A reference variable stores the reference to an object.
   Different objects of the same class have independent
   instance variables.

   Example:
   Student s1 = new Student();
   Student s2 = new Student();

   Here, s1 and s2 refer to two different Student objects.

2. JAVA IS PASS-BY-VALUE

   Java always passes arguments by value.

   When an object is passed to a method, a copy of its
   reference is passed.

   Both references can access the same object.

   Therefore:
   s.name = "Mahato";

   changes the object's field, which is also visible
   through the original reference s1.

3. STATIC NESTED CLASS

   Student and Car are static nested classes.

   They can be instantiated directly inside the
   static main() method without creating an object
   of the outer StudentClass.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates user-defined classes,
objects, instance variables, and object references
in Java.

I created two classes, Student and Car, and then
created objects of these classes inside the main method.

I also created two methods.

The first method, fun(), accepts a Student object
and prints its name.

The second method, change(), modifies the name
property of the received Student object.

The important concept here is that Java uses
pass-by-value. When an object is passed to a method,
a copy of its reference is passed, not a copy of
the object.

Therefore, when I modify the object's name inside
the change() method, the modification is visible
through the original reference as well."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

The program performs a fixed number of operations:

- Object creation.
- Instance variable assignments.
- Object reference passing.
- Field access.
- Printing values.

There are no loops or recursive calls.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

The program creates a fixed number of objects:

- Two Student objects.
- One Car object.

Only a fixed number of reference variables
and instance variables are used.

Therefore, space complexity is O(1).

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Is Java pass-by-value or pass-by-reference?

Answer:

Java is always pass-by-value.

When we pass an object to a method, Java passes
a copy of its reference. Both references can access
the same object, so modifications to the object's
fields are visible outside the method.

---------------------------------------------------------

Q2. What happens when we create two objects
of the same class?

Answer:

Two separate objects are created in memory.
Each object maintains its own instance variables.

For example, s1 and s2 are two different Student
objects, so changing s1.name does not automatically
change s2.name.

---------------------------------------------------------

Q3. What is the difference between a static
nested class and a normal inner class?

Answer:

A static nested class can be instantiated without
creating an object of the outer class.

A non-static inner class requires an instance
of the outer class for its creation.

=========================================================
END OF FILE
=========================================================
*/ 