package com.company.serial;

import com.company.insurance.*;
import java.io.*;

public class Serialization{
        public synchronized boolean serialization (Insurance[] s, String fileName) {
            boolean flag = false;
            File f = new File(fileName);
            ObjectOutputStream ostream = null;
            try {
                FileOutputStream fos = new FileOutputStream(f);
                if (fos != null) {
                    ostream = new ObjectOutputStream(fos);
                    ostream.writeObject(s); // сериализация
                    flag = true;
                }
            } catch (FileNotFoundException e) {
                System.err.println("File cannot be created: "+ e);
            } catch (NotSerializableException e) {
                System.err.println("Class does not support serialization: " + e);
            } catch (IOException e) {
                System.err.println(e);
            } finally {
                try {
                    if (ostream != null) {
                        ostream.close();
                    }
                } catch (IOException e) {
                    System.err.println("stream closing error");
                }
            }
            return flag;
        }
        public Insurance[] deserialization(String fileName) throws InvalidObjectException {
            File fr = new File(fileName);
            ObjectInputStream istream = null;
            try {
                FileInputStream fis = new FileInputStream(fr);
                istream = new ObjectInputStream(fis);
                // десериализация
                Insurance[] st = (Insurance[]) istream.readObject();
                return st;
            } catch (ClassNotFoundException ce) {
                System.err.println("Class does not exist: " + ce);
            } catch (FileNotFoundException e) {
                System.err.println("File for serialization does not exist: "+ e);
            } catch (InvalidClassException ioe) {
                System.err.println("Class versions mismatch: " + ioe);
            } catch (IOException ioe) {
                System.err.println("General I/O error: " + ioe);
            } finally {
                try {
                    if (istream != null) {
                        istream.close();
                    }
                } catch (IOException e) {
                    System.err.println("stream closing error ");
                }
            }
            throw new InvalidObjectException("object is not reestablished");
        }
}

