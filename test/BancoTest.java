import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void traspasarDinero() {
        Banco banco = new Banco();
        Cuenta cuenta1 = new Cuenta(500,"CUENTA1");
        Cuenta cuenta2 = new Cuenta(500,"CUENTA2");
        Cuenta cuenta3 = new Cuenta(500,"CUENTA3");
        Cuenta cuenta4 = new Cuenta(500,"CUENTA4");
        banco.agregarCliente("Alice", "111A", "Calle A", cuenta1);
        banco.agregarCliente("Bob", "222B", "Calle B", cuenta2);
        banco.agregarCliente("Ron", "222C", "Calle C", cuenta3);
        banco.agregarCliente("Ren", "222D", "Calle D", cuenta4);
        Assertions.assertTrue(banco.traspasarDinero("111A", "222B", 300));
        Assertions.assertFalse(banco.traspasarDinero("111A", "222B", -300));
        Assertions.assertFalse(banco.traspasarDinero("111A", "222B", 30000));
        Assertions.assertFalse(banco.traspasarDinero("111A", "222A", 300));
        Assertions.assertFalse(banco.traspasarDinero("111J", "222P", 300));
    }
}