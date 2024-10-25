package homework_week_6;
/**
 * Write a java program to display following pattern.
 * Sample Pattern
 * j a  v v a
 * j a a v v a a
 * j j aaaaa V V aaaaa
 * j j a a V a a
 */

public class Programme_11_JavaPattern {

    public static void main(String[] args) {
        Programme_11_JavaPattern t = new Programme_11_JavaPattern();
        System.out.println("----------------------------------------------");
        t.javaPattern();
    }

    //printing the java pattern
    public void javaPattern(){
        System.out.println("j  a  v   v a");
        System.out.println("j a a  v v a a");
        System.out.println("j j aaaaa V V aaaaa");
        System.out.println("j j a   a V a  a");
    }
}
