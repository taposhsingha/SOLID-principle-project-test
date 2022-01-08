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
public class GetTeamsInfo {

    Scanner scan = new Scanner(System.in);
    int total_fee = 0;
    public void collectTeamInfo(int e, int m) {
        
        for (int i = 1; i <= e; i++) {
            System.out.println("Enter Team " + " name:");
            InsertName sports_teams_name = new InsertName();
            String teamname = scan.nextLine();
            sports_teams_name.insertName(teamname);
            sports_teams_name.getName();
            for (int j = 1; j <= m; j++) {
                System.out.println("Team " + " players name " + i + ":");
                String name = scan.nextLine();
                System.out.println("Team " + " players Contact " + i + ": ");
                String contact = scan.nextLine();
                System.out.println("Team" + " players Fee " + i + ": ");
                int fee = scan.nextInt();
                scan.nextLine();
                TeamPlayerInfo s1 = new TeamPlayerInfo(name, contact, fee);
                PrintCollectedTeamsInfo s = new PrintCollectedTeamsInfo();
                s.printCollectedOrganizerInfo(s1, m);
                total_fee = total_fee + s1.getFee();
            }
        }
        
        
        System.out.println("Total Collected Fee: " + total_fee);
        
    }
    public int getTotalFee(){
    return total_fee;
    }

}
