package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void getFoodTestWithExeption() throws Exception {
        Animal animal = new Animal();
        boolean isExeption = false;
        String expected = "";
        try {
            animal.getFood("Кот");
        } catch (Exception exception) {
            isExeption = true;
            expected = exception.getMessage();
        }
        Assert.assertEquals(true, isExeption);
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", expected);
    }

}
