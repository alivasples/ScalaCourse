# Scala Practice Section 2

This folder was created to propose some exercises that help us understand better the fundamentals of scala.
The content of this section is related to the table content of a [udemy course](https://www.udemy.com/course/rock-the-jvm-scala-for-beginners/). However, anyone can try solving these problems.
Please get comfortable, sit down, get a coffee and start coding!

This project includes 10 questions:

1. Using Tail Recursion, convert a positive integer into a binary string number.
For example:
- 1 = 1
- 2 = 10
- 3 = 11
- 4 = 100

2. Using Tail Recursion, convert an unsigned binary (string) number into a decimal integer number.
For example:
- 1 = 1
- 10 = 2
- 11 = 3
- 100 = 4
  
3. Using Tail Recursion, reverse a string.
For example:
- "Hi" -> "iH"
- "mine" -> "enim"
- "you" -> "uoy"
  
4. Using tail recursion, create a function that reads a base (double), an exponent (positive and integer), and compute its power (you must only use the exponentiation definition, not math pow).
For example:
- power(2,10) = 1024
- power(3,2) = 9
- power(5,3) = 125
  
5. Using Tail Recursion, define a function to verify if a text contains a key as a substring.
   **DO NOT USE** the .contains method of String object.
For example:
- contains("Hello World", "el") = true
- contains("Hello World", "ello Wo") = true
- contains("Hello World", "Hi") = false
  
6. Using Tail Recursion, reverse a String each n characters.
For example:
- reverse("nice", 2) = "inec"
- reverse("google", 3) = "oogelg"
- reverse("hello world", 5) = " ollehdlrdw"  

7. Using Tail Recursion, verify if a string is a Palindrome or not.
Example of palindromes:
- "eye"
- "noon"
- "redder"  

8. Define a expression that verifies if two numbers are relatively prime (number that in common only 1 as divisor).
Examples of relatively prime numbers:
- 25 & 49
- 10 & 11
- 35 & 8
  

9. Given an expression and using tail recursion, validate if all parenthesis are correct. You only need to verify if parenthesis are in correct order and all of them are closed at the end. No need to verify the expression itself. 
Example of valid expressions:
- (1 + (2 * 3))
- (a * 3 + 2)
- 12 + 45
- (1+2) * (3+4)

10. Define a expression for adding two binary numbers (strings):
For example:
- "1010" + "101" = "1111"
- "10000" + "10" "10010"
