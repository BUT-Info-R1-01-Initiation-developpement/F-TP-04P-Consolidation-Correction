package tp04.activite.c

fun main() {
    println("Entrez le nombre de personnes :")
    val nombrePersonnes = readln().toInt()
    println(
        """
            Choisissez le type de menu :
            1. Menu Classique (15 €)
            2. Menu Végétarien (13 €)
            3. Menu Gourmet (25 €)
        """.trimIndent()
    )
    var choixMenu: String
    var nomMenu = "Non renseigné"
    var prixMenu = 0
    do {
        choixMenu = readln()
        when (choixMenu) {
            "1" -> {
                nomMenu = "Menu Classique"
                prixMenu = 15
            }
            "2" -> {
                nomMenu = "Menu Végétarien"
                prixMenu = 13
            }
            "3" -> {
                nomMenu = "Menu Gourmet"
                prixMenu = 25
            }
            else -> println("Choix invalide.")
        }
    } while (choixMenu != "1" && choixMenu != "2" && choixMenu != "3")

    val coutTotal = prixMenu * nombrePersonnes
    println(
        """
        Pour $nombrePersonnes personne(s), avec le $nomMenu :
        - Coût par personne : $prixMenu €
        - Coût total : $coutTotal €
        """.trimIndent()
    )
}