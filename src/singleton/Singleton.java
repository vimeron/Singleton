/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Flia Mersan
 */
public class Singleton {
        private static Singleton instance;
	private int id;
	
	private Singleton(){
		id = 0;
	}
	
	public int getId() {
		return id;
	}

	public static synchronized Singleton getInstance(){
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void incrementID(){
		id++;
	}   
}
