public class Test {
    public static void main(String[] args) {
        GenericsClass firstElement = new GenericsClass();
        GenericsClass secondElement = new GenericsClass();
        GenericsClass thirdElement = new GenericsClass();
        GenericsClass fourthElement = new GenericsClass();
        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.println("Numeri: " + GenericsClass.isEqual(firstElement, secondElement));
        System.out.println("Stringhe: " + GenericsClass.isEqual(thirdElement,fourthElement));


    }
}
