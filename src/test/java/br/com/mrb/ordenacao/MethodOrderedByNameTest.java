package br.com.mrb.ordenacao;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@Order(2)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest {

    @Test
    void testC(){
        System.out.println("Running Teste C");
    }

    @Test
    void testD(){
        System.out.println("Running Teste D");
    }
    @Test
    void testA(){
        System.out.println("Running Teste A");
    }

    @Test
    void testB(){
        System.out.println("Running Teste B");
    }


}
