/*
* File: MainConsole.java
* Author: Maximilian Barabas
* Copyright: M B 
* Group: Szoft 2 N
* Date: 2023-04-19
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/

package views;

import java.util.ArrayList;

import models.Properties;


public class MainConsole {
    public void printPropeties(ArrayList<Properties> pros)
    {
        for(Properties pro : pros){
            System.out.printf(
            pro.getCity(),
            pro.getAddress(),
            pro.getSize(),
            pro.getPrice()
            );
        }
    }
}
