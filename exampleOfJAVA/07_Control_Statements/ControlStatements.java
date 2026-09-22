public class ControlStatements { 
    public static void main(String[] args){ 
        int marks=82; 
        if(marks>=75) 
            System.out.println("Grade A"); 
        else if(marks>=40) 
            System.out.println("Pass"); 
        else System.out.println("Fail"); 
        System.out.println("For loop:"); 
        for(int i=1;i<=3;i++) 
            System.out.println(i); 
        int day=2; 
        switch(day){
            case 1: 
                System.out.println("Monday"); 
                break; 
            case 2: 
                System.out.println("Tuesday"); 
                break; 
            default: 
                System.out.println("Other day"); 
        } 
    } 
}
