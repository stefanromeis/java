package GUI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
	public static View frame;
	public static Controller controller;
	public static Movielist movie = new Movielist();

	public static void main(String[] args) {

		frame = new View();
		frame.setVisible(true);
		controller = new Controller();
		
		try {
			FileInputStream fin = new FileInputStream("movies.ser");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fin);
			movie = (Movielist) ois.readObject();
		} catch (IOException e) {
			System.out.println("no save data available");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (movie.movies.isEmpty()) {
			movie.addMovie();	
		}
	}

}
