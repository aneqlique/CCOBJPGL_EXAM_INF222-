public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= boracay.airFare){
            budget -= boracay.airFare;
            visit();
             System.out.println("\n$___$ \nHaving a fresh vacation at Boracay!");
             checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");
        }

         System.out.println(" ");

    }

    public void visit(Palawan palawan) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= palawan.airFare){
            budget -= palawan.airFare;
            visit();
             System.out.println("\n$___$ \nHaving a tranquil and adventurous trip around Palawan!");
             checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");    
        }
        
        System.out.println(" ");

    }

    public void visit(Batanes batanes) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= batanes.airFare){
            budget -= batanes.airFare;
            visit();
             System.out.println("\n$___$ \nExploring the beauty of home of the winds, Batanes!");
             checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");   
        }
        
        System.out.println(" ");

    }

    public void visit(Vigan vigan) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= vigan.airFare ){
            budget -= vigan.airFare;
            visit();
              System.out.println("\n$___$ \nAmused with the historical structures at Vigan!");
              checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");    
        }

        System.out.println(" ");
    }

    public void visit(Batangas batangas) {
        System.out.println("I still have " + budget +" on me.");

        if (budget >= batangas.airFare){
            budget -= batangas.airFare;
            visit();
             System.out.println("\n$___$ \nEnjoying the clear beach and clean air at Batangas!");
             checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");
        }
        
        System.out.println(" ");

    }

    public void visit(Cebu cebu) {
        System.out.println("I still have " + budget +" on me.");
        if (budget >= cebu.airFare){
            budget -= cebu.airFare;
            visit();
            System.out.println("\n$___$ \nHaving fun at the oldest city in the Philippines, Cebu!");
            checkBudget();
        } else {
            System.out.println("\nT____T \nInsuffecient budget, maybe next time!");
        }
        
        System.out.println(" ");
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget +".");
    }

}
