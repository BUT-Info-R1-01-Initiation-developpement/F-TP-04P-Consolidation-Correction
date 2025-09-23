package tp04.activite.b

// Le programme principal se trouve dans le corps de la fonction ..........

// Quel est le but du programme principal ?
// ...
// À quelle condition une année est-elle bissextile ?
// ...

fun main() {
    println("Saisis une année comprise entre 1900 et 2100 : ")
    val annee = readln().toInt()
    if (annee < 1900 || annee > 2100) {
        println("$annee n'est pas dans l'intervalle autorisé.")
    } else {
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            println("$annee est une année bissextile.")
        } else {
            println("$annee n'est pas une année bissextile.")
        }
    }
}