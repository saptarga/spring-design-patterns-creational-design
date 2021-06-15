package saptarga.example.springdesignpatternscreationaldesign.singelton;

public class Counter {

    private Long value = 0L;

    public Long getValue(){
        return value;
    }

    public void increment(){
        value++;
    }
}
