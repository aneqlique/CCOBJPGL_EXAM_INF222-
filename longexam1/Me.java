import java.util.zip.CheckedInputStream;

public class Me implements Tourist {

    static int budget = 50;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= boracay.airFare){
            budget -= boracay.airFare;
             System.out.println("$___$ \nEnjoy and have a fresh vacation at Boracay!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");
        }
        
        checkBudget();
         System.out.println(" ");

    }

    public void visit(Palawan palawan) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= palawan.airFare){
            budget -= palawan.airFare;
             System.out.println("$___$ \nHave a tranquil and adventurous trip around Palawan!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");    
        }
        
        checkBudget();
        System.out.println(" ");

    }

    public void visit(Batanes batanes) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= batanes.airFare){
            budget -= batanes.airFare;
             System.out.println("$___$ \nWelcome to home of the winds, Batanes!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");   
        }
        
        checkBudget();
        System.out.println(" ");

    }

    public void visit(Vigan vigan) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= vigan.airFare ){
            budget -= vigan.airFare;
            System.out.println("$___$ \nEnjoy your historical visit at, Vigan!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");    
        }

        checkBudget();
        System.out.println(" ");
    }

    public void visit(Batangas batangas) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= batangas.airFare){
            budget -= batangas.airFare;
             System.out.println("$___$ \nEnjoy the clear beach and clean air at Batangas!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");
        }
    
        checkBudget();
        System.out.println(" ");

    }

    public void visit(Cebu cebu) {
        System.out.println("I still have " + budget +" on me.");
        if (budget >= cebu.airFare){
            budget -= cebu.airFare;
            System.out.println("$___$ \nWelcome to the oldest city in the Philippines, Cebu!");
        } else {
            System.out.println("T____T \nInsuffecient budget, maybe next time!");
        }
        checkBudget();
        System.out.println(" ");
    }

    public void checkBudget() {
        System.out.println("My current budget is " + budget +".");
    }

}