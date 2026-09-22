public class Variables { 
    static double salary=50000.0; 
    int age=25; 
    public void show(){ 
        String name="Java"; 
        System.out.println("Local: "+name); 
        System.out.println("Instance: "+age); 
        System.out.println("Static: "+salary); 
    } 
    public static void main(String[] args){ 
        new Variables().show(); 
    } 
}
