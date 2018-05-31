/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 *
 * @author Darshana Rathnayake
 */
public class FileIterator {
    public static void iterate(File file, HashMap<String, Boolean> hashes) throws NoSuchAlgorithmException, IOException{
        if(file.isDirectory()){
            for (File f : file.listFiles()) {
                iterate(f, hashes);
            }
        } else if (file.isFile()) {
            hashes.put(file.getName(), HashDB.compare(HashGenerator.getMD5CheckSum(file)));
        }
    }
}
