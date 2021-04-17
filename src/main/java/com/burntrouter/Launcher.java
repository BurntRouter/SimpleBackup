package com.burntrouter;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Launcher {
    private static final String filePath = "test.txt";
    public static File file;
    public static String oldName;
    public static String newName;

    public static void main(String[] args){
        try{
            file = FileUtils.getFile(filePath);
        } catch(Exception e) {
            e.printStackTrace();
        }
    try{
        oldName = file.getName();
        int at = oldName.indexOf(".");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        newName = oldName.substring(0, at) + formatter.format(date) + oldName.substring(at);
        FileUtils.copyFile(file, new File(newName));
    } catch(Exception e) {
    e.printStackTrace();
    }
    }
}
