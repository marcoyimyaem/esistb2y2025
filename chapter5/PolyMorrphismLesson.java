package chapter5;

public class PolyMorrphismLesson {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object lemurAsObject = lemur;
        System.out.println();
        //
        Primate primate = lemur;
        HasTail hasTail = lemur;
        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age);
        // System.out.println(primate.age);
        // System.out.println(hasTail.age);
        System.out.println(primate.hasHair());
        // System.out.println(hasTail.hasHair());
        System.out.println(hasTail.isTailStripped());
        // System.out.println(primate.isTailStripped());
        System.out.println(lemur.isTailStripped());
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());
        // System.out.println(lemurAsObject);
    }
    
}
class Lemur extends Primate implements HasTail{
    int age = 10;

    @Override
    public boolean isTailStripped() {
        return true;
    }
}
interface HasTail{
    boolean isTailStripped();
}
class Primate{
    boolean hasHair(){
        return true;
    }
}

