package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeaanWithDependencyImplement implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeaanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero=1;

        System.out.println(myOperation.sum(numero));
        System.out.println("Holis desde la implementacion de un bean con dependenencias");
    }
}
