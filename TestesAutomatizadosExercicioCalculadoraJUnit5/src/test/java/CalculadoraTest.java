import Calculadora.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {


    @Test
    public void testeSeReconheceuJUnit5 (){

        assertEquals(1,1);

    }

    double numero1 = 10;
    double numero2 = 5;



    @BeforeEach
    @Test
    @DisplayName("Somar corretamente")
    public void testeSoma() {
        //Given
        Adicao soma = new Adicao(numero1, numero2);
        //When
        soma.calcular();
        //Then
        assertAll("Testes da Operação Soma",
                () -> assertFalse(soma.calcular() == 10),
                () -> assertTrue(soma.calcular() == 15),
                () -> assertNotEquals(10, soma.calcular()),
                () -> assertEquals(soma.calcular(),15,0.01)
        );
       assertEquals("Soma de " + numero1 + " + " + numero2 + " = " + 15.0,soma.toString());
       assertNotNull("o valor não é nulo", soma.toString());

    }
    @AfterEach


    @BeforeEach
    @Test
    @DisplayName("Subtrair corretamente")
    public void testeSubtracao(){
        //Given
        Subtracao subtracao = new Subtracao(numero1,numero2);
        //When
        subtracao.calcular();
        //Then
        assertAll("Testes da Operação Subtração",
                () -> assertFalse(subtracao.calcular() == 10),
                () -> assertTrue(subtracao.calcular() == 5),
                () -> assertNotEquals(10, subtracao.calcular()),
                () -> assertEquals(subtracao.calcular(),5,0.01)
        );
        assertEquals("Subtração de " + numero1 + " - " + numero2 + " = " + 5.0,subtracao.toString());
        assertNotNull("o valor não é nulo", subtracao.toString());
    }
    @AfterEach

    @BeforeEach
    @Test
    @DisplayName("Multiplicar corretamente")
    public void testeMultiplicacao() {
        //Given
        Multiplicacao multiplicacao = new Multiplicacao(numero1,numero2);
        //When
        multiplicacao.calcular();
        //Then
        assertAll("Testes da Operação Multiplicação",
                () -> assertFalse(multiplicacao.calcular() == 10),
                () -> assertTrue(multiplicacao.calcular() == 50),
                () -> assertNotEquals(10, multiplicacao.calcular()),
                () -> assertEquals(multiplicacao.calcular(),50,0.01)
        );
        assertEquals("Multiplicação de " + numero1 + " * " + numero2 + " = " + 50.0,multiplicacao.toString());
        assertNotNull("o valor não é nulo", multiplicacao.toString());
    }

    @BeforeEach
    @Test
    @DisplayName("Dividir corretamente")
    public void testeDivisao() throws Exception {
        //Given
        Divisao divisao = new Divisao(numero1,numero2);
        //When
        divisao.calcular();
        //Then
        assertAll("Testes da Operação Divisão",
                () -> assertFalse(divisao.calcular() == 10),
                () -> assertTrue(divisao.calcular() == 2),
                () -> assertNotEquals(10, divisao.calcular()),
                () -> assertEquals(divisao.calcular(),2,0.01)
        );
        assertEquals("Divisão de " + numero1 + " / " + numero2 + " = " + 2.0,divisao.toString());
        assertNotNull("o valor não é nulo", divisao.toString());
    }




//    @AfterEach

//    @BeforeEach
//    @Test
//    public void testeDivisaoComExpection() throws Exception {
//        //Given
//        Divisao divisao = new Divisao(10,0);
//        //When
//        try {
//            divisao.calcular();
//        //    fail("Não lancou a exception");
//        } catch (Exception e) {
//            assertEquals(e.getMessage(), "A velocidade deve ser maior que zero");
//        }
//
//        //Then
////        divisao.calcular();
////
////        Throwable throwable = assertThrows(Exception.class,
////                () -> divisao.calcular());
////
////        assertEquals("Não é possivel divisão por valor menor ou igual a 0",throwable.getMessage());


//        assertFalse(divisao.calcular() == 10);
//        Assertions.assertTrue(divisao.calcular() == 2);
//        Assertions.assertNotEquals(10,divisao.calcular());
//        Assertions.assertEquals(divisao.calcular(),2,0.01);
        //morreu xAssertions.assertThat(divisao.toString(),is("Divisão de  " + numero1 + " / " + numero2 + " = " + 2.0));
        //morreu xAssertions.assertThat(divisao.toString(),is(not("Divisão de " + numero1 + " / " + numero2 + " = " + 10.0)));
        //Assertions.assertNotNull("o valor não é nulo", divisao.calcular());
//    }
    @AfterEach

    @BeforeEach
    @Test
    @DisplayName("Incluir no historico da Calculadora")
    public void testeHistoricoCalc() throws Exception {
        //Given
        HistoricoCalc historicoCalc = new HistoricoCalc();
        List<OperaçãoMatematica> operacoes = new ArrayList<>();
        Adicao soma = new Adicao(numero1,numero2);
        //When
        soma.calcular();
        historicoCalc.execute(soma);
        // Then
        Assertions.assertEquals(historicoCalc.getOperacoes().toString(), "[Soma de 10.0 + 5.0 = 15.0]");
        Assertions.assertTrue(historicoCalc.getOperacoes() == historicoCalc.getOperacoes());



    }

 //PENDENCIAS:

//    CRIAR METODO DE TESTE COM EXEPCTION DA DIVISÃO para usar o  "assertThrows"


    /**
     *
     * Annotations
     *
     * @Before // Junit 4 - Antes de todos os testes da classe
     *  ->
     * @BeforeEach // Junit 5
     *
     *
     * @After // Junit 4 - Depois de todos os testes da classe
     * ->
     * @AfterEach // Junit 5
     *
     *
     * @BeforeClass // Junit 4 - Antes da classe
     * ->
     * @BeforeAll // Junit 5
     *
     *
     * @AfterClass // Depois da classe
     * ->
     * @AfterAll // Junit 5
     *
     *
     * @Ignore // Junit 4
     * ->
     * @Disabled // Junit 5
     *
     * Novo:
     * @DisplayName
     *
     *
     * ---
     * Assertions
     *
     * Nome da classe: Assert -> Assertions
     *
     * fail - fail
     * assertTrue - assertTrue
     * assertSame - assertSame
     * assertNull - assertNull
     * assertNotSame - assertNotSame
     * assertNotNull - assertNotNull
     * assertFalse - assertFalse
     * assertEquals - assertEquals
     * assertArrayEquals - assertArrayEquals
     * assertThat - N/A
     *
     * Nova:
     * assertAll
     * assertThrows
     *
     */

}
