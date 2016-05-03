package GUI;

import GUI.Movielist;

import javax.imageio.ImageIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;

/**
 * 	App Controller
 */
public class Controller {

	// Variables for app control
	private Movielist movies; 	
	public Movielist master = null;
	private int season = 1;
	private int episode = 1;

	// returns an image from an url of the act episode
	public static BufferedImage loadImage(Movielist movie) throws IOException {
		return ImageIO.read(new URL(movie.getposter()));
	}
	
	// searches the actual episode and season with
	// specified name and returns the episode if exists
    private Movielist search(String name) {
    	Movielist series = null;
		for(int i = 0; i < Main.movie.movies.size(); i++) {
    		movies = Main.movie.movies.get(i);
    		int s = Integer.parseInt(movies.getseason());
    		int e = Integer.parseInt(movies.getepisode());

			if(movies.getseries().toLowerCase().contains(name) && s == season && e == episode) {
					series = movies;
			}
    	}
		return series;
    }
    
    
    /**
     * 	Controller Logic
     */
    public Controller () {
    	
    	
    	/**
    	 *  Textsearch Listener
    	 */
    	Main.frame.txtSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				season = 1;
				episode = 1;
				String name = Main.frame.txtSearch.getText().toString();		
				master = search(name);
				if(master != null) {
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					Main.frame.txtSearch.setText("\"" +name +"\" not in list");
				}
			}
	    });
		
    	
    	/**
    	 * 	Searchbutton
    	 */
		Main.frame.btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				season = 1;
				episode = 1;
				String name = Main.frame.txtSearch.getText().toString();		
				master = search(name);
				if(master != null) {
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					Main.frame.txtSearch.setText("\"" +name +"\" not in list");
				}
			}
		});
		
    	/**
    	 * 	Season +
    	 */
		Main.frame.btnSeasonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = Main.frame.txtSearch.getText().toString();	
				season++;
				episode = 1;
				master = search(name);
				if(master != null){
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						System.out.println("updating view failed");
					}	
				} else {
					System.out.println("No more season.");
					season--;
				}
			}
		});
		
    	/**
    	 * 	Season -
    	 */
		Main.frame.btnSeasonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = Main.frame.txtSearch.getText().toString();	
				season--;
				episode = 1;
				master = search(name);
				if(master != null){
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						System.out.println("updating view failed");
					}	
				} else {
					System.out.println("No more seasons.");
					season++;
				}
			}
		});
		
    	/**
    	 * 	Episode -
    	 */
		Main.frame.btnEpisodeminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = Main.frame.txtSearch.getText().toString();	
				episode--;
				master = search(name);
				if(master != null){
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						episode++;
					}	
				} else {
					System.out.println("No more episodes in this season.");
					episode++;
				}
			}
		});
		
    	/**
    	 * 	Episode +
    	 */
		Main.frame.btnEpisodeplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = Main.frame.txtSearch.getText().toString();	
				episode++;
				master = search(name);
				if(master != null){
					try {
						Main.frame.updateView(master);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("No more episodes in this season.");
					episode--;
				}
			}
		});
		
    	/**
    	 * 	Set Series Watched
    	 */
		Main.frame.btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.frame.btnGreen.setVisible(false);
				if(master != null) {
					master.setwatched("1");
				}
			}
		});
		
    	/**
    	 * 	Set Series unwatched
    	 */
		Main.frame.btnGrey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.frame.btnGreen.setVisible(true);
				if(master != null) {
					master.setwatched("0");
				}
			}
		});
		
    	/**
    	 * 	Save the Model to Disk
    	 */
		Main.frame.btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					FileOutputStream fout = new FileOutputStream("movies.ser");
					ObjectOutputStream oos = new ObjectOutputStream(fout);   
					oos.writeObject(Main.movie);
					oos.close();
					System.out.println("Done");				   
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		

    }
}
