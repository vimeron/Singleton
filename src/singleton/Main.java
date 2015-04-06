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
public class Main {
    
    public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		s1.incrementID();
		s1.incrementID();
		int id = s2.getId();
		System.out.println(id);

	}
}
