package com.modernjava.record;

import com.modernjava.records.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductTest {

    @Test
    void createProduct() {
        // given
        var product = new Product("Iphone", new BigDecimal("999.99"), "ELECTRONICS");

        // when
        System.out.println("product " + product);
        assertEquals("Iphone", product.name());
        assertEquals("ELECTRONICS", product.type());

        //then
    }

    @Test
    void createProduct_CustomConstructor() {
        // given
        var product = new Product("Iphone", new BigDecimal("999.99"));

        // when
        System.out.println("product " + product);
        assertEquals("Iphone", product.name());
        assertEquals("GENERAL", product.type());

        //then
    }

    @Test
    void nameNotValid() {
        // given

        // when
        var exception = assertThrows(IllegalArgumentException.class, () -> new Product("", new BigDecimal("999.99"), "ELECTRONICS"));
        assertEquals("name is not valid", exception.getMessage());
        //then
    }

    @Test
    void costNotValid() {
        // given

        // when
        var exception = assertThrows(IllegalArgumentException.class, () -> new Product("Iphone", new BigDecimal("-999.99"), "ELECTRONICS"));
        assertEquals("cost is not valid", exception.getMessage());
        //then
    }

    @Test
    void createProductComparision() {
        // given
        var product = new Product("Iphone", new BigDecimal("999.99"), "ELECTRONICS");

        var product1 = new Product("Iphone", new BigDecimal("999.99"), "ELECTRONICS");

        // when
        assertEquals(product, product1);

        //then
    }
}