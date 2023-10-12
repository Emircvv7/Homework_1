public class SecondClass extends FirstClass {
    public SecondClass(int field1, FourthClass complexField, MyEnum enumField) {
        super(field1, complexField, enumField);
    }

    public void overloadedMethod() {
        System.out.println("Перегруженный метод в SecondClass");
    }

    public void nonOverridableMethod() {
        System.out.println("Неперезаписываемый метод в SecondClass");
    }
}
