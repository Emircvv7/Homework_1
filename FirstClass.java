public class FirstClass {
    private int field1;
    private FourthClass complexField;
    private MyEnum enumField;

    public FirstClass(int field1, FourthClass complexField, MyEnum enumField) {
        this.field1 = field1;
        this.complexField = complexField;
        this.enumField = enumField;
    }

    public int getField1() {
        return field1;
    }

    public FourthClass getComplexField() {
        return complexField;
    }

    public MyEnum getEnumField() {
        return enumField;
    }
}

enum MyEnum {
    VALUE1, VALUE2, VALUE3
}


