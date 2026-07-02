Yahtzee Scoring Simulator (Java)

A simple Java console application that simulates a single round of **Yahtzee**. The program rolls five dice, allows the player to choose a scoring category, and awards points based on the official Yahtzee-style rules.

Features

* 🎲 Randomly rolls five six-sided dice
* 📋 Displays a menu of scoring categories
* ✅ Calculates points for:

  * Pair
  * Three of a Kind
  * Four of a Kind
  * Full House
  * Small Straight
  * Chance
  * Yahtzee
* 🛡️ Input validation to prevent invalid or non-numeric entries
* 🧩 Uses Java methods and enums to organize the program

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming concepts
* Enums
* Methods
* Switch statements
* Exception handling
* Scanner for user input

## ▶️ How It Works

1. The program randomly rolls five dice.
2. The rolled values are displayed to the player.
3. The player selects one scoring category from the menu.
4. The program checks whether the dice satisfy that category.
5. The appropriate number of points is awarded and displayed.

## 📊 Scoring

| Category        |          Points |
| --------------- | --------------: |
| Pair            |               5 |
| Three of a Kind |              10 |
| Four of a Kind  |              15 |
| Full House      |              20 |
| Small Straight  |              25 |
| Chance          | Sum of all dice |
| Yahtzee         |              50 |

## 🚀 Running the Program

1. Clone this repository:

```bash
git clone https://github.com/yourusername/yahtzee-scoring-simulator.git
```

2. Open the project in your preferred Java IDE (VS Code, IntelliJ IDEA, Eclipse, etc.).

3. Compile and run `App.java`.

## 📂 Project Structure

```
App.java
README.md
```

## 💡 Concepts Demonstrated

* Random number generation
* Conditional logic
* Modular programming
* Error handling using `try-catch`
* Enumerations (`enum`)
* User input validation
* Console application development

## 📜 License

This project was created as an educational Java programming assignment and is free to use for learning purposes.
