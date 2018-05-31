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
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darshana Rathnayake
 */
public class HashDB {

    private static final LinkedList<String> hashes = initialize();

    private static LinkedList<String> initialize() {
        BufferedReader br = null;
        try {
            LinkedList<String> db = new LinkedList<>();
            File file = new File("./src/db/db.md5");
            br = new BufferedReader(new FileReader(file));
            String text = "";
            while ((text = br.readLine()) != null) {
                db.add(text.trim());
            }
            return db;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return null;
    }

    public static boolean compare(String hash){
        return hashes.contains(hash);
    }
}
