package main;

import Users.User;
import Data.Data;
import frame.MainFrame;
import frame.MainFrame;
public class Main {

	public static void main(String[] args) {
		
		MainFrame start = new MainFrame();
		Data startDB = new Data();
		
		try {
			start.registerPanel();
			startDB.createDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
