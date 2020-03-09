# Learning Java Project
Java resources team #3786

### Problem 1
```System.out.println(data);```
This is how Java prints out data in the console.

### Problem 2
GOAL: Print all the numbers 1-10... ex. 1 2 3 4 5 6 7 8 9 10
```java
int x = 1;
while(x <= 10) {
  System.out.println(x); 
  x++;
}
```
In coding, you can't just say "print all numbers out to 10" ... you have to define the logic.
First, you need to create a variable.
`type name = value;`
Variables always must have a type. Some common ones are int (integer) and String.
Then, it should have a name so you can refer to it. We will call this one x.
Lastly, you should give it a value. For this example, we need to start with the number 1 (the first number to print).
Don't forget that there should always be a semicolon at the end of Java variables!

Next, we need to print a value 10 times. You might think, oh, how about calling `System.out.println(1)` 10 times with a different number. But this is not efficient, and later on you may not even know what the number is. Instead, we can use loops to run repeated processes.

A loop can be formatted with for or while, we will use while to start off since it makes more sense.
```java
while (condition) {
  //Run code
}
```
Essentially, it means while some expression is true, the code will repeatedly run itself.
We can write expressions like this:
x <= 10 (x is less than or equal to 10)
This means, we can repeat a print statement until x is 10, therefore it will stop printing when x gets to 10.
Great, but wouldn't it just keep printing 1... how do we get it to go up by 1?

To add on to a variable, we can say: `name = name + number;` or `x = x + 1`... but a shortcut is `x += 1;` or even better `x++;` (adds 1). Do not forget the semicolon.

So, each time the condition is true, it will repeat itself, printing x and then adding one. So the next time it runs, x will be two. This will repeat on and on until x is 10, and it won't run since the condition isn't true. Try this code, and see it print all numbers 1-10.
