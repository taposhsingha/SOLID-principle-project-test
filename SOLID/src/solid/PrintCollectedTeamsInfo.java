/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Taposh
 */
public class PrintCollectedTeamsInfo {
    public void printCollectedOrganizerInfo(TeamPlayerInfo s, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("Team member name " + i + ": " + s.Name);
            System.out.println("Team member Contact " + i + ": " + s.Contact);
            System.out.println("Team member Fee " + i + ": " + s.Fee);
        }

    }
    
}
