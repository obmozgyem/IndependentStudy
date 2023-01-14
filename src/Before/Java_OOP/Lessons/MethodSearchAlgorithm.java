package Before.Java_OOP.Lessons;

public class MethodSearchAlgorithm {
    public static void main(String[] args) {
        GrandParent o = new Child();
        o.doSomething();
        o.doSomething2();

        GrandParent grandParent=new GrandParent();
        System.out.println(grandParent.toString());

    }

    private static class GrandParent /* extends Object */ {

        void doSomething() {
            System.out.println("GrandParent.doSomething()");
        }

        void doSomething2() {
            System.out.println("GrandParent.doSomething2()");
        }
    }

    private static class Parent extends GrandParent {

        @Override
        void doSomething() {
            System.out.println("Parent.doSomething()");
        }

        @Override
        public String toString() {
            return "Parent.toString()";
        }
    }

    private static class Child extends Parent {

        @Override
        public String toString() {
            return "Child.toString()";
        }
    }
}
