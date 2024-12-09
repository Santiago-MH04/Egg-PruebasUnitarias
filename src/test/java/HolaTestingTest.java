import com.riwi.io.HolaTesting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class HolaTestingTest {
        //Atributos de MainTest
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor =  new ByteArrayOutputStream();

        //Ciclo de vida de MainTest
    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
    }

    //Asignadores de atributos de MainTest (setters)
    //Lectores de atributos de MainTest (getters)
        //Métodos de MainTest
    @Test
    public void TestMain(){
            //Ejecutar ese método main
       HolaTesting.main(new String[1]);
            //Capturar el Hola Mundo
        String esperado = "Hello, World!\r\n";
        String resultado = outputStreamCaptor.toString();
            //Ejecutar la prueba
        /*Assertions.*/assertEquals(esperado, resultado);   //Se comentó la clase Helpers porque la importación estática nos ahorra el trabajo
    }
}
