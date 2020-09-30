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
    }
}
