/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class CreateNewTeams implements CreateNewTeamsInterface{
    Scanner scan = new Scanner(System.in);
    static int total_fee;
    
    public void createNewTeams(){
        System.out.println("Total number of teams:");
        int e = scan.nextInt();
        scan.nextLine();
        System.out.println("How many players for each team");
        int m = scan.nextInt();
        scan.nextLine();
        GetTeamsInfo newteam = new GetTeamsInfo();
        newteam.collectTeamInfo(e, m);
        total_fee = newteam.getTotalFee();
        
    }
    public static int getTotalFee(){
        return total_fee;
    }
    
}
