public class Run {

    public static void main(String[] args) {
        SimpleClass mySimpleClass = new SimpleClass();
        mySimpleClass.setMyInt(100);
        mySimpleClass.setMyFloat(5.2f);
        mySimpleClass.setMyLong(8999999);
        mySimpleClass.setWord("Hello Word");
        System.out.println(mySimpleClass);
        SmartClass smartClass = new SmartClass();
        smartClass.setStringValue("HELLO TATIANA");
        System.out.println(smartClass);

        SimpleClass secondObject = new SimpleClass();
        secondObject.setMyInt(200);
        secondObject.setMyFloat(55.25f);
        secondObject.setMyLong(10000222);
        secondObject.setWord("Hello Moldova");
        System.out.println(secondObject);
        SmartClass smartTwo = new SmartClass();
        smartTwo.setStringValue("WELCOME ANDREI");
        System.out.println(smartTwo);

    }
}
