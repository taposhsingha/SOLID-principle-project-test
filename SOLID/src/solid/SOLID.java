/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Taposh
 */
public class SOLID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total_expense = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sports event name:");
        InsertName sports_event_name = new InsertName();
        String eventname = scan.nextLine();
        sports_event_name.insertName(eventname);
        sports_event_name.getName();
        System.out.println("How many organizers for the event:");
        int x = scan.nextInt();
        scan.nextLine();
        ArrayList<OrganizerInfo> list_organizers = new ArrayList<OrganizerInfo>();
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter organizers name " + i + ":");
            String name = scan.nextLine();
            System.out.println("Enter organizers title " + i + ": ");
            String title = scan.nextLine();
            System.out.println("Enter organizers contact " + i + ": ");
            String contact = scan.nextLine();
            OrganizerInfo s1 = new OrganizerInfo(name, contact, title);
            list_organizers.add(s1);
        }
        for (int y = 0; y < x; y++) {
            int z = y + 1;
            System.out.println("Event organizer name " + z + ": " + list_organizers.get(y).Name);
            System.out.println("Event organizer Title " + z + ": " + list_organizers.get(y).Title);
            System.out.println("Event organizer ContactNo. " + z + ": " + list_organizers.get(y).Contact);
        }
        System.out.println("Total number of teams:");
        int e = scan.nextInt();
        scan.nextLine();
        System.out.println("How many players for each team");
        int m = scan.nextInt();
        scan.nextLine();
        int total_fee = 0;
        for (int k = 1; k <= e; k++) {
            System.out.println("Enter Team " + k + " name:");
            InsertName sports_teams_name = new InsertName();
            String teamname = scan.nextLine();
            sports_teams_name.insertName(teamname);
            sports_teams_name.getName();

            ArrayList<TeamPlayerInfo> list_teams = new ArrayList<TeamPlayerInfo>();
            for (int i = 1; i <= m; i++) {
                System.out.println("Team " + k + " players name " + i + ":");
                String name = scan.nextLine();
                System.out.println("Team " + k + " players Contact " + i + ": ");
                String contact = scan.nextLine();
                System.out.println("Team" + k + " players Fee " + i + ": ");
                int fee = scan.nextInt();
                scan.nextLine();
                TeamPlayerInfo s1 = new TeamPlayerInfo(name, contact, fee);
                list_teams.add(s1);
            }

            for (int n = 0; n < m; n++) {
                int c = n + 1;
                System.out.println("Event organizer name " + c + ": " + list_teams.get(n).Name);
                System.out.println("Event organizer ContactNo. " + c + ": " + list_teams.get(n).Contact);
                System.out.println("Event organizer Fee " + c + ": " + list_teams.get(n).Fee);
                total_fee = total_fee + list_teams.get(n).Fee;
            }
        }
        System.out.println("Total Collected Fee: " + total_fee);
        System.out.println("Sports decoration cost: ");
        int decoration = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports accessories cost: ");
        int accessories = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports rewards cost: ");
        int rewards = scan.nextInt();
        scan.nextLine();
        System.out.println("Sports management cost: ");
        int managecost = scan.nextInt();
        scan.nextLine();
        total_expense = decoration + accessories + rewards + managecost;
        System.out.println("Total event expense: " + total_expense);
        if (total_expense > total_fee) {
            System.out.println("The event is not feasible");
        } else {
            System.out.println("The event is feasible");
        }
    }

}
