/**
 * <h1>Week</h1>
 * The Week class is a subclass of user that holds another user class and
 *
 * <p>
 *
 *
 * @author  Alex Gonzalez
 * @version 1.0
 * @since   03-21-2020
 */

package TwoBucks;

import java.util.Scanner;

public class Week {


    private User previousWeek = new User(null,null,null,0,0,0,0,new Budget());


    public Week(){


    }

    // progress to next week copies user variables and saves them to
    // new User object previousWeek. Previous week cannot be edited.
    public User toNextWeek(User currentWeek){

        Scanner scan = new Scanner(System.in);
        int input;

        while(true) {


            System.out.println("Are you sure you want to Progress to next week?");
            System.out.println("You will not be able to make further edits for this week");
            System.out.println("==========================================================");
            System.out.println("1. Proceed to next week");
            System.out.println("2. Return to main");
            input = scan.nextInt();


            if(input == 1) {
                // Copy all current user parameters from 'currentWeek' to 'previousWeek'
                previousWeek.setFirstName(currentWeek.getFirstName());          // first name
                previousWeek.setLastName(currentWeek.getLastName());            // last name
                previousWeek.setEmail(currentWeek.getEmail());                  // email
                previousWeek.setIncome(currentWeek.getIncome());                // income
                previousWeek.setSaveAmount(currentWeek.getSaveAmount());        // saveAmount
                previousWeek.setSpendAmount(currentWeek.getSpendAmount());      // spendAmount

                // copy budget parameters
                previousWeek.getBudget().setTotalIncome(currentWeek.getBudget().getTotalIncome());
                previousWeek.getBudget().setWageIncome(currentWeek.getBudget().getWageIncome());
                previousWeek.getBudget().setOtherIncome(currentWeek.getBudget().getOtherIncome());
                previousWeek.getBudget().setRentExpenses(currentWeek.getBudget().getRentExpenses());
                previousWeek.getBudget().setUtilitiesExpenses(currentWeek.getBudget().getUtilitiesExpenses());
                previousWeek.getBudget().setFoodExpenses(currentWeek.getBudget().getFoodExpenses());
                previousWeek.getBudget().setTravelExpenses(currentWeek.getBudget().getTravelExpenses());
                previousWeek.getBudget().setHealthcareExpenses(currentWeek.getBudget().getHealthcareExpenses());
                previousWeek.getBudget().setEntertainmentExpenses(currentWeek.getBudget().getEntertainmentExpenses());
                previousWeek.getBudget().setTotalExpenses(currentWeek.getBudget().getTotalExpenses());
                previousWeek.getBudget().setMonthlyNetChange(currentWeek.getBudget().getMonthlyNetChange());


                currentWeek.clearBudget();

                return currentWeek;
            }
            else if (input ==2 ){
                return currentWeek;

            }
            else{
                System.out.println("Invalid Input");
            }
        }


    }



    /**
     * previousWeek setter method
     *
     * @param previousWeek
     */
    public void setPreviousWeek(User previousWeek) {
        this.previousWeek = previousWeek;

    }

    /**
     * previousWeek getter method
     *
     * @return previousWeek
     */
    public User getPreviousWeek() {
        return this.previousWeek;
    }

    //@Override
    //public String toString() {
     //   return "Week{" +
     //           "previousWeek=" + previousWeek.toString() +
     //           '}';
    //}
}
