# Number Guessing Game

A Java mini project where the user guesses a randomly generated number within a limited number of attempts.

## Features
- 3 Difficulty levels (Easy, Medium, Hard)
- 10 attempt limit per game
- High/Low hints after each guess
- Reveals the number on losing
- Input validation
- Play again option

## Concepts Used
- Loops
- Random Class
- Switch Statement
- Exception Handling
- User Input
- Scanner Class

## How to Run
Compile and run using:
```
javac NumberGuessingGame.java
java NumberGuessingGame
```

## Requirements
- Java JDK 8 or above

## Difficulty Levels
| Level | Range |
|-------|-------|
|  Easy |  1-50 |
| Medium| 1-100 |
|  Hard | 1-200 |

## Sample Output
```
Enter the difficulty of game
1 for easy (1 to 50)
2 for medium (1 to 100)
3 for hard (1 to 200)
Enter the level: 2
Guess the number [Attempt 1/10]: 50
You have guessed too low
Guess the number [Attempt 2/10]: 75
You have guessed too low
Guess the number [Attempt 3/10]: 85
You have guessed too low
Guess the number [Attempt 4/10]: 88
You have guessed too high
Guess the number [Attempt 5/10]: 87
Congratulations! you have guessed right on attempt 5
```