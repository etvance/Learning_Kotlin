//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class HangmanGame(val word: String) {
    var remainingGuesses = 6
    val guessedLetters = mutableSetOf<Char>()
}

fun displayWord(word: String, guessedLetters: Set<Char>): String {
    return word.map {
        if (it in guessedLetters) it else '_'
    }.joinToString(" ")
}

fun won(word: String, guessedLetters: Set<Char>): Boolean {
    return word.all { it in guessedLetters }
}

fun main() {
    val game = HangmanGame("kotlin")

    println("Welcome to Hangman!")

    while (game.remainingGuesses > 0 && !won(game.word, game.guessedLetters)) {
        println("\nWord: ${displayWord(game.word, game.guessedLetters)}")
        println("Guesses left: ${game.remainingGuesses}")
        println("Guessed letters: ${game.guessedLetters}")

        print("Guess a letter: ")
        val input = readln()?.lowercase()

        if (input == null || input.length != 1) {
            println("Please enter a single letter.")
            continue
        }

        val guess = input[0]

        when {
            guess in game.guessedLetters -> {
                println("You already guessed that letter.")
            }
            guess in game.word -> {
                println("Correct!")
                game.guessedLetters.add(guess)
            }
            else -> {
                println("Wrong guess.")
                game.guessedLetters.add(guess)
                game.remainingGuesses--
            }
        }
    }

    if (won(game.word, game.guessedLetters)) {
        println("\nYou won! The word was '${game.word}'.")
    } else {
        println("\nYou lost. The word was '${game.word}'.")
    }
}
