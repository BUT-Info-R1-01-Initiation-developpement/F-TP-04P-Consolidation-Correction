package tp04.activite.d

import kotlin.random.Random

const val JOUEUR = "Joueur"
const val ORDI = "Ordinateur"
const val EGALITE = "Égalité"

fun main() {
    do {

        val valDeJoueur1 = recupereValeurDe()
        val valDeJoueur2 = recupereValeurDe()
        afficheValeursDes(JOUEUR, valDeJoueur1, valDeJoueur2)

        val valDeOrdi1 = recupereValeurDe()
        val valDeOrdi2 = recupereValeurDe()
        afficheValeursDes(ORDI, valDeOrdi1, valDeOrdi2)

        val vainqueur = determineVainqueur(
            valDeJoueur1,
            valDeJoueur2,
            valDeOrdi1,
            valDeOrdi2
        )

        afficheInformationVainqueur(vainqueur)

    } while(joueurVeutJouerEncore())
}

fun recupereValeurDe(): Byte {
    return Random.nextInt(1, 7).toByte()
}

fun afficheValeursDes(joueur: String, valeurDe1: Byte, valeurDe2: Byte) {
    println("""
        ${joueur} a obtenu les valeurs suivantes :
         - lancer dé 1 : $valeurDe1
         - lancer dé 2 : $valeurDe2
    """.trimIndent())
}

fun determineVainqueur(
    valeurDe1Joueur: Byte,
    valeurDe2Joueur: Byte,
    valeurDe1Ordinateur: Byte,
    valeurDe2Ordinateur: Byte
): String {
    val totalJoueur = valeurDe1Joueur + valeurDe2Joueur
    val totalOrdinateur = valeurDe1Ordinateur + valeurDe2Ordinateur
    val doubleJoueur = (valeurDe1Joueur == valeurDe2Joueur)
    val doubleOrdinateur = (valeurDe1Ordinateur == valeurDe2Ordinateur)
    return when {
        doubleJoueur && !doubleOrdinateur -> JOUEUR
        !doubleJoueur && doubleOrdinateur -> ORDI
        totalJoueur > totalOrdinateur -> JOUEUR
        totalJoueur < totalOrdinateur -> ORDI
        else -> EGALITE
    }
}

fun afficheInformationVainqueur(vainqueur: String) {
    if (vainqueur == EGALITE) {
        print("Pas de gagnant : ")
    } else {
        print("Le gagnant est : ")
    }
    println(vainqueur)
}

fun joueurVeutJouerEncore(): Boolean {
    println("Tu veux rejouer  ? (o pour oui)")
    return readln() == "o"
}