package br.com.eugenesistemas.projetomodelo.projetomodelo.model;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import pl.pojo.tester.api.assertion.Method;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

@ExtendWith(MockitoExtension.class)
class ClienteTest {

    //@Test
    public void teste(){

       final Class<?> cliente = Cliente.class;

        assertPojoMethodsFor(cliente).testing(Method.GETTER, Method.SETTER).areWellImplemented();
        assertPojoMethodsFor(cliente).testing(Method.CONSTRUCTOR).areWellImplemented();
    }



}
