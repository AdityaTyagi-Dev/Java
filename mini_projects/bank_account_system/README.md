# Bank Account System

A Java mini project that simulates a basic bank account system using OOP concepts.

## Features
- Savings and Current account support
- Deposit money
- Withdraw money with account-specific rules
- Check balance
- Data persists when switching between accounts
- Input validation

## Concepts Used
- Abstract Classes
- Inheritance
- Encapsulation
- Method Overriding
- Static Methods
- Exception Handling

## How to Run
Run the Java file using:
```
javac BankAccountSystem.java
java BankAccountSystem
```

## Requirements
- Java JDK 8 or above

## Menu Options

| Option | Action |
|--------|--------|
| 1 | Savings Account |
| 2 | Current Account |
| 3 | Exit |

## Account Rules

| Account | Rule |
|---------|------|
| Savings | Balance cannot go below 1000 rupees |
| Current | Overdraft limit of 10000 rupees |

## Sample Output

```
Welcome to Bank Account System
Choose account type: 
- Enter 1 for Savings Account
- Enter 2 for Current Account
- Enter 3 for Exit
Enter your choice: 1
You have selected Savings account.
- Enter 1 for Deposit Money
- Enter 2 for Withdraw Money
- Enter 3 for Check balance
- Enter 4 for Exit
Enter your choice: 1
Enter the amount of money in rupees: 5000
5000 rupees deposited to your Savings Account
```