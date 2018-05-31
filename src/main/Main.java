/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darshana Rathnayake
 */
public class Main {
    public static void main(String[] args){
        try {
            File file = new File("D:\\Assignments");
            HashMap<String, Boolean> scannedList = new HashMap<>();
            FileIterator.iterate(file, scannedList);
            for (String k : scannedList.keySet()) {
                System.out.printf("%s is infected: %b\n", k, scannedList.get(k));
            }
        } catch (NoSuchAlgorithmException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
