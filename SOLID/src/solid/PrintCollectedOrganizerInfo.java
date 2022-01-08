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
public class PrintCollectedOrganizerInfo {

    public void printCollectedOrganizerInfo(OrganizerInfo s, int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("Event organizer name " + i + ": " + s.Name);
            System.out.println("Event organizer Title " + i + ": " + s.Title);
            System.out.println("Event organizer ContactNo. " + i + ": " + s.Contact);
        }

    }

}
