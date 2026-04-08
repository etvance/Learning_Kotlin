# Learning_Kotlin

This project is a console-based Hangman game written in Kotlin. The program randomly selects a word (currently predefined) and allows the user to guess letters one at a time. The game tracks correct and incorrect guesses, displays the current progress of the word, and ends when the player either guesses the word or runs out of attempts.

This project demonstrates core Kotlin programming concepts including variables, conditionals, loops, functions, and classes. It also incorporates collections and the `when` keyword as part of the stretch challenge.

---

## Instructions for Build and Use

### Steps to build and/or run the software:

1. Install the Java Development Kit (JDK) (version 17 or later recommended)
2. Install IntelliJ IDEA Community Edition
3. Create a new Kotlin project (Kotlin → JVM)
4. Add the `Hangman.kt` file to the `src` directory
5. Run the program by clicking the green run button next to the `main()` function

---

### Instructions for using the software:

1. Run the program
2. The game will display a hidden word using underscores
3. Enter one letter at a time when prompted
4. The program will indicate whether the guess is correct or incorrect
5. Continue guessing until you either:

   * Guess all letters correctly (win), or
   * Run out of guesses (lose)

---

## Development Environment

To recreate the development environment, you need the following software and/or libraries:

* Java Development Kit (JDK) 17 or newer
* IntelliJ IDEA Community Edition
* Kotlin (bundled with IntelliJ)

---

## Useful Websites to Learn More

I found these websites useful in developing this software:

* Kotlin Official Documentation – https://kotlinlang.org/docs/home.html
* Programiz Kotlin Tutorial – https://www.programiz.com/kotlin-programming
* W3Schools Kotlin Guide – https://www.w3schools.com/kotlin/

---

## Future Work

The following items I plan to fix, improve, and/or add to this project in the future:

* [ ] Add a random word generator instead of a fixed word
* [ ] Implement ASCII art for the hangman drawing
* [ ] Add input validation for non-letter characters
* [ ] Allow the user to play multiple rounds without restarting the program
* [ ] Track and display player statistics (wins/losses)
