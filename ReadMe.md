# Return Ready Lab 19b

* Part A - Coding Challenge
* Part B - Foundations 8-2
* Part C - Homework

## Part A

```java
public static Boolean avengersAssemble(boolean dcHero, boolean avengerHero) {
    return null;
}
```

* The parameter dcHero is true if it is an DC Hero,
and the parameter avengerHero is true if the hero is an Avenger. 
* Avengers will assemble if it is not a DC Hero, or they're an Avenger, or there is at least an Avenger on the team.

* Return true if the avengers are ready to assemble.

Example:

```
avengersAssemble(false, false) --> true
avengersAssemble(false, true) --> true
avengersAssemble(true, false) --> false
avengersAssemble(true, true) --> true
```

## Part B

### Example and Activity 01

#### Step 01

In the package `lab19.part_b.examples` look at the file `Example01_ArrayListDemo` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab19.part_a.activity` complete the `Activity01_ArrayList` per the following:

        Create a program with an arraylist that contains the following: Steve, Tim, Lucy, Pat, Angela, Tom
        Print this out to the console
        Remove Steve and Angela
        Print out the updated arraylist to the console
        Remove the third element by index
        Print out the updated arraylist to the console

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):
```
[Steve, Tim, Lucy, Pat, Angela, Tom]
[Tim, Lucy, Pat, Tom]
[Tim, Lucy, Tom]
```

> Use Example01_ArrayListDemo for reference.


### Example and Activity 02

#### Step 01

In the package `lab19.part_b.examples` look at the file `Example02_ArrayListOperations` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab19.part_a.activity` complete the `Activity02_` per the following:

        Create a program with an arraylist of Strings
        Using the add method, add four unique values to it
        Sort the list
        Print out the contents using a loop
        Create a second list of numbers
        Using the add method, add four unique values to it
        Sort the list
        Print out the contents using a loop

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):
```
Apple
Banana
Grapes
Mango
Sorting numbers...
1
11
21
51
```

> Use Example02_ArrayListOperations for reference.


### Example and Activity 03

#### Step 01

In the package `lab19.part_b.examples` look at the file `Example03_ArrayListTraversing` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `labs.lab19.part_a.activity` complete the `Activity03_Traversing` per the following:

        Create a program with an arraylist that contains five unique string elements
        Iterate through the arraylist and print out the contents to the console

Your program is working correctly, if when run, the following is the output (Abe first name Lincoln last name):
```
Gregor Clegane
Khal Drogo
Cersei Lannister
Sandor Clegane
Tyrion Lannister
```

> Use Example03_ArrayListTraversing for reference.

## Part C

```java
public static Boolean nearValue(int n) {

    return null;
}
```

* You and your friends are out walking on the boardwalk at Atlantic City
and decided to go to Casino for the fun of it.
* One person won ___ amount of money. You're trying to find out if the amount was between 90-100 or 190-200. 
* Return true if the amount of money is within 10 of 100 or 200.

> Tip: Math.abs(num) computes the absolute value of a number.
```
nearValue(93) --> true
nearValue(90) --> true
nearValue(89) --> false
```

     