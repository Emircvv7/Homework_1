public class Main {
    public static void main(String[] args) {
        FourthClass fourth = new FourthClass();
        SecondClass objectA = new SecondClass(42, fourth, MyEnum.VALUE1);
        ThirdClass objectB = new ThirdClass();
        ThirdClass objectC = new ThirdClass();
        System.out.println("objectA.getField1(): " + objectA.getField1());
        System.out.println("objectA.getComplexField(): " + objectA.getComplexField());
        System.out.println("objectA.getEnumField(): " + objectA.getEnumField());
        objectA.overloadedMethod();
        objectA.nonOverridableMethod();

        objectB.overriddenMethod();
        objectC.overriddenMethod();
    }
}


