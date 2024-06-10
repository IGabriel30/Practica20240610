package operacionesmatematicas;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {

    Calculadora calculadora;
    @BeforeEach
    void setUp() {
         calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        calculadora = null;
    }

    @BeforeEach
    void setUpAllTest(){
        System.out.println("Iniciar todas las pruebas");
    }

    @AfterEach
    void AlFinalizartodaslaspruebas(){
        System.out.println("Finalizaron todas las pruebas");
    }
    @Test
    @Order(1)
    void sumar() {
        int num1 =5;
        int num2=6;
        int resultadoEsperado=11;

        //Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(num1,num2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @Order(2)
    void restar() {
        int num1 =5;
        int num2=6;
        int resultadoEsperado= -1;

       // Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(num1,num2);

        assertTrue(resultadoEsperado == resultado);
    }

    @Test
    @Order(2)
    void multiplicar() {
        int num1 =10;
        int num2=6;
        int resultadoEsperado=60;

        //Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(num1,num2);

        if(resultadoEsperado != resultado){
            fail("Falló la multiplicacion");
        }
    }
    @Test
    @Order(4)
    void dividir() {
        int num1 =10;
        int num2=0;
        int resultadoEsperado=0;

        //Calculadora calculadora = new Calculadora();


        if(num2 !=0){
            int resultado = calculadora.dividir(num1,num2);

            if(resultadoEsperado != resultado){
                fail("Falló la division");
            }
        }else {
            assertThrows(
                    ArithmeticException.class,() -> {
                        int result = calculadora.dividir(num1,num2);
                    }
            );
        }

    }
}