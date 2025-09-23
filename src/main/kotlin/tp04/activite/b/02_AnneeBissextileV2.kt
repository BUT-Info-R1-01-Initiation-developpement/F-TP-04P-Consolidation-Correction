package tp04.activite.b

// Le programme principal se trouve dans le corps de la fonction ..........

// Quel est le but du programme principal ?
// ...

fun main() {
    // ...
    val annee = recupereAnneeSaisie()
    // ...
    if (anneeEstBissextile(annee)) {
        println("$annee est une année bissextile.")
    } else {
        println("$annee n'est pas une année bissextile.")
    }
}

// Quel est le but de cette fonction ?
// ...
// Que se passe-t-il si l'utilisateur saisit comme année "1789" ?
// ...
fun recupereAnneeSaisie(): Int {
    var annee: Int
    do {
        println("Saisis une année comprise entre 1900 et 2100 : ")
        annee = readln().toInt()
        if (anneeSaisieInvalide(annee)) {
            println("Année saisie invalide.")
        }
    } while (anneeSaisieInvalide(annee))
    return annee
}

// Pourquoi utiliser une fonction ici ?
// ...
fun anneeSaisieInvalide(annee: Int): Boolean {
    return annee < 1900 || annee > 2100
}

// Pourquoi utiliser une fonction ici ?
fun anneeEstBissextile(annee: Int): Boolean {
    return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)
}