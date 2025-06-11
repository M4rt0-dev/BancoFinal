import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CuentaTest {

    @Test
    void ingresarDinero() {
        Cuenta cuenta1 = new Cuenta(500,"CUENTA1");
        Assertions.assertFalse(cuenta1.ingresarDinero(-1));
        Assertions.assertFalse(cuenta1.ingresarDinero(0));
        Assertions.assertTrue(cuenta1.ingresarDinero(1));
    }

    @Test
    void sacarDinero() {
        Cuenta cuenta1 = new Cuenta(500,"CUENTA1");
        Assertions.assertFalse(cuenta1.sacarDinero(-50));
        Assertions.assertFalse(cuenta1.sacarDinero(0));
        Assertions.assertTrue(cuenta1.sacarDinero(50));
        Assertions.assertFalse(cuenta1.sacarDinero(5000));
    }
}