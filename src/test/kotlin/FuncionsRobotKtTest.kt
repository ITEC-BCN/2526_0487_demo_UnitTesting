import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class FuncionsRobotKtTest {
    /*@Test
    fun checkIfIncreasesVelocitat() {
        val expected = 2.0
        assertEquals(expected, accelerar(1.5))
    }

    @Test
    fun checkIfMoveEsquerra() {
        val expected = arrayOf(1.5, 1.0)
        assertArrayEquals(expected, esquerra(arrayOf(2.5, 1.0), 1.0))
    }

    @Test
    fun checkIfEsquerraWithNoVelocitat() {
        val expected = arrayOf(2.0, 1.0)
        assertArrayEquals(expected, esquerra(arrayOf(2.5, 1.0)))
    }*/

    // tests de la funció accelerar
    @Test
    fun testAccelerarRetornTipusDouble() {
        assertTrue(accelerar() is Double)
    }

    @Test
    fun testAccelerarDinsElLimit() {
        val velocitatInicial = 5.0
        val novaVelocitat = accelerar(velocitatInicial)
        val esperat = velocitatInicial + 0.5
        assertEquals(esperat, novaVelocitat)
    }



    @Test
    fun testAccelerarAlLimit() {
        val velocitatInicial = 9.5
        val novaVelocitat = accelerar(velocitatInicial)
        val esperat = velocitatInicial + 0.5
        assertEquals(esperat, novaVelocitat)
    }

    @Test
    fun testAccelerarSuperarLimit() {
        assertEquals(10.0, accelerar(10.0))
    }

    // tests de la funció disminuir

    @Test
    fun testosFuncioDisminuir() {
        //tipus de dades Double
        assertTrue(disminuir() is Double)

        //disminuïr dins el límit (0-10)
        var velocitatInicial = 5.0
        var novaVelocitat = disminuir(velocitatInicial)
        var esperat = velocitatInicial - 0.5
        assertEquals(esperat, novaVelocitat)

        //disminuïr fins el límit inferior (0)
        velocitatInicial = 0.5
        novaVelocitat = disminuir(velocitatInicial)
        esperat = velocitatInicial - 0.5
        assertEquals(esperat, novaVelocitat)

        //disminuïr intentant superar el límit inferior (0)
        assertEquals(0.0, disminuir(0.0),"Velocitat mínima (0.0) assolida, no es pot disminuïrasdf")
    }

    // tests de la funció dalt, que duplicaria per les altres funcions de desplaçament
    @Test
    fun testDaltRetornTipusArray() {
        assertTrue(dalt(arrayOf(0.0, 0.0)) is Array<Double>)
    }

    @Test
    fun testDaltSenseVelocitat() {
        val posicioInicial = arrayOf(1.0, 2.0)
        val novaPosicio = dalt(posicioInicial)
        val posicioEsperada = arrayOf(1.0, 2.5)
        assertArrayEquals(posicioEsperada, novaPosicio)
    }

    @Test
    fun testDaltAmbVelocitatPersonalitzada() {
        val posicioInicial = arrayOf(3.0, 4.0)
        val novaPosicio = dalt(posicioInicial, 1.5)
        val posicioEsperada = arrayOf(3.0, 5.5)
        assertArrayEquals(posicioEsperada, novaPosicio)
    }

}