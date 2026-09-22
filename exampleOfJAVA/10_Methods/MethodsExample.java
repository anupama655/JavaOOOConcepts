public class MethodsExample { 
    static int add(int a,int b){
        return a+b;
    } 
    static void greet(String n){
        System.out.println("Hello, "+n);
    } 
    public static void main(String[] args){
        greet("Anu"); 
        System.out.println("10 + 20 = "+add(10,20));
    } 
}
