/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgit;

/**
 *
 * @author Tryvl
 */
public class Login {
    protected int id;
    protected String name;
    protected String lastName;
    protected String CIN;

    public Login(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.CIN = "0000000000";
    }

}
