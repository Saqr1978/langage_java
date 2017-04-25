/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.Client;
import org.junit.Test;

/**
 *
 * @author formation
 */
public class ClientCmdTest {

    @Test
    public void test() {
        Client cli = new Client("KAPLAN", "Yunus-Emre", 24);
        //cli.afficherClient();
        System.out.println(cli);
    }
}
