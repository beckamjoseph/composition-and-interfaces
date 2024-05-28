package interfaces;

public class Main {

    void addNumber (int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.addNumber(6, 7);
        
            computer hp250 = 
                new computer(new ram(), new processor(), new storage());{
                System.out.println(hp250);
            }
               
            
        
        
    }
}
