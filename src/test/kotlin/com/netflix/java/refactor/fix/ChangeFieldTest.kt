package com.netflix.java.refactor.fix

import com.netflix.java.refactor.AbstractRefactorTest
import org.junit.Test

class ChangeFieldTest: AbstractRefactorTest() {
    
    @Test
    fun changeFieldType() {
        val a = java("""
            |import java.util.List;
            |public class A {
            |   List collection;
            |}
        """)
        
        parseJava(a).refactor()
                .findFieldsOfType(List::class.java)
                    .changeType(Collection::class.java)
                    .done()
                .fix()
        parseJava(a).refactor()
                .removeImport(List::class.java)
                .fix()
        
        assertRefactored(a, """
            |import java.util.Collection;
            |public class A {
            |   Collection collection;
            |}
        """)
    }
    
    @Test
    fun changeFieldName() {
        val a = java("""
            |import java.util.List;
            |public class A {
            |   List collection = null;
            |}
        """)

        parseJava(a).refactor()
                .findFieldsOfType(List::class.java)
                    .changeName("list")
                    .done()
                .fix()

        assertRefactored(a, """
            |import java.util.List;
            |public class A {
            |   List list = null;
            |}
        """)
    }
    
    @Test
    fun deleteField() {
        val a = java("""
            |import java.util.List;
            |public class A {
            |   List collection = null;
            |}
        """)

        parseJava(a).refactor()
                .findFieldsOfType(List::class.java)
                .delete()
                .fix()

        assertRefactored(a, """
            |import java.util.List;
            |public class A {
            |}
        """)
    }
}