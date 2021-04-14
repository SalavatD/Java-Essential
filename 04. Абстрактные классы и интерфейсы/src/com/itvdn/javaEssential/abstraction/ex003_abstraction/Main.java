package com.itvdn.javaEssential.abstraction.ex003_abstraction;

/**
 * јбстрактный класс может быть унаследован от абстрактного класса.
 * –еализаци€ абстрактного метода из базового абстрактного класса, в производном абстрактном классе - не об€зательна.
 */

/**
 * јбстрактный класс A.
 */
abstract class AbstractClassA {
    public abstract void operationA();
}

/**
 * јбстрактный класс B.
 */
abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}

/**
 *  онкретный класс.
 */
class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();

        instance.operationA();

        //instance.operationB();  // ¬опрос: почему недоступен данный метод?
    }
}
