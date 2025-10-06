package tp04.activite.c

// L'utilisation des constantes est une bonne pratique :
// Si on a besoin de changer le prix ou l'intitulé d'un menu,
// on le fait en modifiant la valeur de la constante une seule fois
// dans le programme.
const val MENU_CLASSIQUE = "Menu classique"
const val MENU_VEGE = "Menu Végétarien"
const val MENU_GOURMET = "Menu gourmet"

const val PRIX_CLASSIQUE = 15
const val PRIX_VEGE = 13
const val PRIX_GOURMET = 25

// Le programme principal se lit comme un algorithme ayant un haut niveau d'abstraction
// dont les détails sont déportés dans les autres fonctions.
fun main() {
    val nombrePersonnes = recupereNombrePersonnes()
    afficheCarteMenus()

    val choixMenu = recupereChoixMenu()
    val nomMenu = recupereNomMenu(choixMenu)
    val prixMenu = recuperePrixMenu(choixMenu)

    val coutTotal = calculeCoutTotalRepas(prixMenu, nombrePersonnes)

    afficheInformationsPrixRepas(nombrePersonnes, nomMenu, prixMenu, coutTotal)
}


fun recupereNombrePersonnes(): Int {
    println("Entrez le nombre de personnes :")
    val nombrePersonnes = readln().toInt()
    return nombrePersonnes
}

fun afficheCarteMenus() {
    println(
        """
            Choisissez le type de menu :
            1. $MENU_CLASSIQUE ($PRIX_CLASSIQUE €)
            2. $MENU_VEGE ($PRIX_VEGE €)
            3. $MENU_GOURMET ($PRIX_GOURMET €)
        """.trimIndent()
    )
}

fun recupereChoixMenu(): Int {
    var choixMenu: String
    do {
        println("Entrez le choix de menu:")
        choixMenu = readln()
    } while(choixMenu != "1" && choixMenu != "2" && choixMenu != "3")
    return choixMenu.toInt()
}

fun recupereNomMenu(choixMenu: Int): String {
    return when (choixMenu) {
        1 -> MENU_CLASSIQUE
        2 -> MENU_VEGE
        else -> MENU_GOURMET
    }
}

fun recuperePrixMenu(choixMenu: Int): Int {
    return when (choixMenu) {
        1 -> PRIX_CLASSIQUE
        2 -> PRIX_VEGE
        else -> PRIX_GOURMET
    }
}

fun calculeCoutTotalRepas(prixMenu: Int, nombrePersonnes: Int): Int {
    return prixMenu * nombrePersonnes
}

fun afficheInformationsPrixRepas(
    nombrePersonnes: Int,
    nomMenu: String,
    prixMenu: Int,
    coutTotal: Int
) {
    println(
        """
        Pour $nombrePersonnes personne(s), avec le $nomMenu :
        - Coût par personne : $prixMenu €
        - Coût total : $coutTotal €
        """.trimIndent()
    )
}