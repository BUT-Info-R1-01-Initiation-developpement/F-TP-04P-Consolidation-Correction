package tp04.activite.b

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestAnneeBissextile {
    @Test
    fun testAnneeSaisieInvalide() {
        assertTrue(anneeSaisieInvalide(1789))
        assertTrue(anneeSaisieInvalide(1899))
        assertTrue(anneeSaisieInvalide(2101))
        assertFalse(anneeSaisieInvalide(2000))
        assertFalse(anneeSaisieInvalide(1900))
        assertFalse(anneeSaisieInvalide(2100))
    }

    @Test
    fun anneeEstBissextile() {
        assertTrue(anneeEstBissextile(2000))
        assertTrue(anneeEstBissextile(1996))
        assertFalse(anneeEstBissextile(1900))
        assertFalse(anneeEstBissextile(2002))
        assertFalse(anneeEstBissextile(2003))
    }

}