public class SimpleClass {

    private String word = "Hello";
    private int myInt = 10;
    private float myFloat = 2f;
    private long myLong = 8;

    @Override
    public String toString() {
        return String.format("My object: name:%s , digit: %d , float: %f, long: %d", word, myInt, myFloat, myLong);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public float getMyFloat() {
        return myFloat;
    }

    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    public long getMyLong() {
        return myLong;
    }

    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }


}
