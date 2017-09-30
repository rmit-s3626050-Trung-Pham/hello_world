/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiderdojo;

import View.MenuBar;
import java.util.Scanner;

/**
 *
 * @author phamtrung
 */
public class Carer {
    public int iD;
    String name;
    String dateOfBirth;
    MenuBar mnB = new MenuBar();
    
    public void createCarer(int id, String name, String date){
        id = this.iD;
        name = this.name;
        date = this.dateOfBirth;
    }
    public void updateCarer(int id, String name, String date){
    
    }
    int i = 0;
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("input x : ");
        int x = S.nextInt();
        if ( x == 1 || x == 5 || x ==7 )
//        if ( !(x == 1 || x == 5 || x ==7 ))
//        if ( x != 1 && x != 5 && x !=7 )
//        if ( !(x == 1 && x == 5 && x ==7 ))
        {
            System.out.println("true");
        }
        else
            System.out.println("false!");
    }
}
