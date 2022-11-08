
package com.kittyki.project;
import com.kittyki.project.dao.jdbc.DbConnection;
public class Main {
    public static void main(String []args) {
	System.out.println("KittyKi project");
    DbConnection.printConnectionDetails();
    }
}
