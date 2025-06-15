class AccessModifiersExample {
    public int publicField = 10;
    private int privateField = 20;
    protected int protectedField = 30;


    public int getPublicField() {
        return publicField;
    }
    public int getPrivateField() {
        return privateField;
    }

    public int getProtectedField() {
        return protectedField;
    }



    public void displayFields() {
        System.out.println("Public Field: " + publicField);
        System.out.println("Private Field: " + privateField);
        System.out.println("Protected Field: " + protectedField);
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifiersExample accessModifiersExample = new AccessModifiersExample();

        accessModifiersExample.displayFields();

    }
}