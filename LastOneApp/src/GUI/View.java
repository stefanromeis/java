package GUI;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/* 
	 * Global vars for an access in functions
	 */
	public JPanel contentPane;
	public JTextField txtSearch;
	public JLabel lblTitle, lblYear, lblEpisodetitle, lblFillruntime, lblFillgenre, lblFillDirector, lblFillActors, lblFillrating, lblSeasonnumber, lblEpisodenumber, lblCover;
	public JButton btnSeasonminus, btnSeasonplus, btnEpisodeminus, btnEpisodeplus, btnSearch, btnGreen, btnGrey, btnSave;
	public JTextArea txtrEpDescr;

	/*
	 * Update the frame of the gui with all elements on it
	 */
	public void updateView(Movielist movies) throws IOException {
		
		lblTitle.setText(movies.getseries().toString());
		lblYear.setText(movies.getyear().toString());
		lblEpisodetitle.setText(movies.gettitle().toString());
		txtrEpDescr.setText(movies.getplot().toString());
		lblFillruntime.setText(movies.getruntime().toString());
		lblFillgenre.setText(movies.getgenre().toString());
		lblFillDirector.setText(movies.getdirector().toString());
		lblFillActors.setText(movies.getactors().toString());
		lblFillrating.setText(movies.getrating().toString());
		lblSeasonnumber.setText(movies.getseason().toString());
		lblEpisodenumber.setText(movies.getepisode().toString());
		ImageIcon icon;
		icon = new ImageIcon(Controller.loadImage(movies));
		lblCover.setIcon(icon);
		if(Integer.parseInt(movies.getwatched()) == 1) {
			btnGreen.setVisible(false);
		}
		else {
			btnGreen.setVisible(true);
		}
	}
	
	public View() {
		
		/*
		 * Main frame of the GUI
		 * Do not modify, it's a static part of the gui
		 */
		setTitle("LastOne - Remember Your Series");
		setResizable(false);
		setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 12));
		setForeground(Color.DARK_GRAY);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 704);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25,25,25));
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * Header of the GUI (actually it's an image)
		 * Do not modify, it's a static part of the gui
		 */
		JLabel lblHeader = new JLabel("");
		lblHeader.setIcon(new ImageIcon(View.class.getResource("/gui/header.png")));
		lblHeader.setBounds(0, 0, 900, 124);
		contentPane.add(lblHeader);
		
		/*
		 * Background image (popcorn), set as 3% alpha
		 * Do not modify, it is a static part of the gui
		 */
		JLabel lblBackgroundimage = new JLabel("");
		lblBackgroundimage.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundimage.setIcon(new ImageIcon(View.class.getResource("/gui/popcorn5.png")));
		lblBackgroundimage.setBounds(36, 239, 840, 425);
		contentPane.add(lblBackgroundimage);
		
		/*
		 * Search field in the gui
		 * you can enter the series you are looking for - feel free to alter it
		 */
		txtSearch = new JTextField();
		txtSearch.setToolTipText("Enter the name of series you are looking for");
		txtSearch.setBackground(Color.GRAY);
		txtSearch.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 16));
		txtSearch.setText("Search");
		txtSearch.setBounds(55, 136, 651, 52);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		contentPane.setBackground(new Color(25,25,25));
		
		/*
		 * Search button - works with the input in the search field
		 * Do not modify, it's a static part of the gui
		 */
		btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(View.class.getResource("/gui/lupe.png")));
		btnSearch.setBounds(740, 140, 61, 45);
		contentPane.add(btnSearch);

		/*
		 * Cover field - feel free to fill it with pictures!
		 */
		lblCover = new JLabel("");
		lblCover.setIcon(new ImageIcon(View.class.getResource("/gui/bbtcover.jpg")));
		lblCover.setBounds(60, 230, 200, 270);
		contentPane.add(lblCover);
		
		/*
		 * Text field for the year of the episode - movies.getyear()
		 */
		lblYear = new JLabel("2016");
		lblYear.setForeground(Color.WHITE);
		lblYear.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(60, 510, 200, 25);
		contentPane.add(lblYear);
		
		/*
		 * Director label. Do not touch it, it's static part of the gui
		 * The label you can modify is further buttom called lblFillDirector
		 */
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setForeground(Color.WHITE);
		lblDirector.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblDirector.setBounds(65, 559, 79, 20);
		contentPane.add(lblDirector);
		
		/*
		 * Actors label. Do not touch it, it is static part of the gui
		 * The label you can modify is further down called lblfillActors
		 */
		JLabel lblActors = new JLabel("Actors:");
		lblActors.setForeground(Color.WHITE);
		lblActors.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblActors.setBounds(65, 601, 61, 20);
		contentPane.add(lblActors);
		
		/*
		 * Director label - feel free to modify -> movies.getdirector()
		 */
		lblFillDirector = new JLabel("Mark Cendrowski");
		lblFillDirector.setForeground(Color.LIGHT_GRAY);
		lblFillDirector.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 12));
		lblFillDirector.setBounds(156, 559, 532, 20);
		contentPane.add(lblFillDirector);
		
		/*
		 * Actors input - feel free to modify -> movies.getactors()
		 */
		lblFillActors = new JLabel("Johnny Galecki, Jim Parsons, Kaley Cuoco, Simon Helberg, Kunal Nayyar, Mayim Bialik");
		lblFillActors.setToolTipText("Johnny Galecki, Jim Parsons, Kaley Cuoco, Simon Helberg, Kunal Nayyar, Mayim Bialik");
		lblFillActors.setForeground(Color.LIGHT_GRAY);
		lblFillActors.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 12));
		lblFillActors.setBounds(138, 601, 550, 20);
		contentPane.add(lblFillActors);
		
		/*
		 * Main title of the series - feel free to modify -> movies.getseries()
		 */
		lblTitle = new JLabel("Series Title");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 20));
		lblTitle.setBounds(305, 230, 401, 30);
		contentPane.add(lblTitle);
		
		/*
		 * Title of the currenty selected episode
		 * Feel free to modify -> movies.gettitle()
		 */
		lblEpisodetitle = new JLabel("Episode Title");
		lblEpisodetitle.setForeground(Color.WHITE);
		lblEpisodetitle.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblEpisodetitle.setBounds(310, 280, 394, 20);
		contentPane.add(lblEpisodetitle);
		
		/*
		 * Episode Description area... Something is going wrong here, it should not be black -.-
		 * -> movies.getplot()
		 */
		txtrEpDescr = new JTextArea();
		txtrEpDescr.setLineWrap(true);
		txtrEpDescr.setWrapStyleWord(true);
		txtrEpDescr.setBackground(new Color(25,25,25));
		txtrEpDescr.setForeground(Color.LIGHT_GRAY);
		txtrEpDescr.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 12));
		txtrEpDescr.setEditable(false);
		txtrEpDescr.setOpaque(true);
		txtrEpDescr.setText("Some plot text for the episode you have choosen. There is something wrong with the background... Why it's color after a search? Oo");
		txtrEpDescr.setBounds(310, 318, 401, 116);
		contentPane.add(txtrEpDescr);
		
		/*
		 * Runtime Label - it's for label on gui, are you looking for lblFillruntime? ;)
		 */
		JLabel lblRuntime = new JLabel("Runtime:");
		lblRuntime.setForeground(Color.WHITE);
		lblRuntime.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblRuntime.setBounds(310, 480, 79, 20);
		contentPane.add(lblRuntime);
		
		/*
		 * Label for Genre-Text - it's not to fill, are you looking for lblFillgenre?
		 */
		JLabel lblGenre = new JLabel("Genre:");
		lblGenre.setForeground(Color.WHITE);
		lblGenre.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblGenre.setBounds(496, 480, 61, 20);
		contentPane.add(lblGenre);
		
		/*
		 * Runtime of the episode - feel free to modify -> movies.getruntime()
		 */
		lblFillruntime = new JLabel("21 Min.");
		lblFillruntime.setForeground(Color.LIGHT_GRAY);
		lblFillruntime.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 14));
		lblFillruntime.setBounds(395, 480, 85, 20);
		contentPane.add(lblFillruntime);
		
		/*
		 * Genre of selected series -> movies.getgenre()...
		 */
		lblFillgenre = new JLabel("Comedy");
		lblFillgenre.setForeground(Color.LIGHT_GRAY);
		lblFillgenre.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 14));
		lblFillgenre.setBounds(560, 480, 146, 20);
		contentPane.add(lblFillgenre);
		
		/*
		 *  Copyright - just a placeholder ^
		 */
		JLabel lblCopyright = new JLabel("Alpha v. 1.0");
		lblCopyright.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopyright.setForeground(Color.GRAY);
		lblCopyright.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 10));
		lblCopyright.setBounds(350, 655, 200, 16);
		contentPane.add(lblCopyright);
		
		/*
		 *  ^Season label, do not touch, PLEASE! :'(
		 */
		JLabel lblSeason = new JLabel("Season");
		lblSeason.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeason.setForeground(Color.WHITE);
		lblSeason.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblSeason.setBounds(735, 320, 100, 20);
		contentPane.add(lblSeason);
		
		/*
		 *  Episode label, do not touch it! -.-
		 */
		JLabel lblEpisode = new JLabel("Episode");
		lblEpisode.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisode.setForeground(Color.WHITE);
		lblEpisode.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblEpisode.setBounds(735, 400, 100, 20);
		contentPane.add(lblEpisode);
		
		/*
		 *  Rating label, it's damn part of the gui!
		 */
		JLabel lblRating = new JLabel("Rating");
		lblRating.setForeground(Color.WHITE);
		lblRating.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblRating.setHorizontalAlignment(SwingConstants.CENTER);
		lblRating.setBounds(735, 484, 100, 20);
		contentPane.add(lblRating);
		
		/*
		 * Rating of the selected episode -> movies.getrating()
		 */
		lblFillrating = new JLabel("9.4");
		lblFillrating.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 39));
		lblFillrating.setHorizontalAlignment(SwingConstants.CENTER);
		lblFillrating.setForeground(Color.WHITE);
		lblFillrating.setBounds(735, 520, 100, 50);
		contentPane.add(lblFillrating);
		
		/*
		 * Season number of the episode -> movies.getepisode()
		 * Controllers - btnSeasonplus, btnSeasonminus
		 */
		lblSeasonnumber = new JLabel("9");
		lblSeasonnumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeasonnumber.setForeground(Color.WHITE);
		lblSeasonnumber.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblSeasonnumber.setBounds(770, 350, 30, 20);
		contentPane.add(lblSeasonnumber);
		
		/*
		 * Episode number -> movies.getepisode()
		 * Controllers - btnEpisodeminus, btnEpisodeplus
		 */
		lblEpisodenumber = new JLabel("11");
		lblEpisodenumber.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		lblEpisodenumber.setForeground(Color.WHITE);
		lblEpisodenumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEpisodenumber.setBounds(770, 430, 30, 20);
		contentPane.add(lblEpisodenumber);
		
		/*
		 * Button for season up-counter 
		 */
		btnSeasonplus = new JButton("");
		btnSeasonplus.setBackground(new Color(0, 0, 0));
		btnSeasonplus.setForeground(Color.LIGHT_GRAY);
		btnSeasonplus.setFont(new Font("DJB Me and My Shadow Dark", Font.PLAIN, 15));
		btnSeasonplus.setIcon(new ImageIcon(View.class.getResource("/gui/btnp.png")));
		btnSeasonplus.setBounds(805, 344, 30, 30);
		contentPane.add(btnSeasonplus);
		
		/*
		 * Button for episode up-counter
		 */
		btnEpisodeplus = new JButton("");
		btnEpisodeplus.setIcon(new ImageIcon(View.class.getResource("/gui/btnp.png")));
		btnEpisodeplus.setSize(30, 30);
		btnEpisodeplus.setLocation(805, 425);
		contentPane.add(btnEpisodeplus);
		
		/*
		 * Button for episode down-counter
		 */
		btnEpisodeminus = new JButton("");
		btnEpisodeminus.setIcon(new ImageIcon(View.class.getResource("/gui/bpnm.png")));
		btnEpisodeminus.setSize(30, 30);
		btnEpisodeminus.setLocation(735, 425);
		contentPane.add(btnEpisodeminus);
		
		/*
		 * Button for season down-counter
		 */
		btnSeasonminus = new JButton("");
		btnSeasonminus.setIcon(new ImageIcon(View.class.getResource("/gui/bpnm.png")));
		btnSeasonminus.setBounds(735, 344, 30, 30);
		contentPane.add(btnSeasonminus);
		
		/*
		 * Just a slightly visible line under the header ^
		 */
		JLabel lblLine = new JLabel("");
		lblLine.setIcon(new ImageIcon(View.class.getResource("/gui/line.png")));
		lblLine.setForeground(Color.LIGHT_GRAY);
		lblLine.setBounds(60, 200, 782, 2);
		contentPane.add(lblLine);
		
		/*
		 * Green button for set an episode as watched
		 */
		btnGreen = new JButton("");
		btnGreen.setIcon(new ImageIcon(View.class.getResource("/gui/plusgr.png")));
		btnGreen.setBounds(752, 228, 65, 65);
		contentPane.add(btnGreen);
		
		/*
		 * Grey button for set an episode as unwatched
		 */
		btnGrey = new JButton("");
		btnGrey.setIcon(new ImageIcon(View.class.getResource("/gui/plusg.png")));
		btnGrey.setBounds(752, 228, 65, 65);
		contentPane.add(btnGrey);
		
		/*
		 * Save button O_o
		 */
		btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(View.class.getResource("/gui/btnSave.png")));
		//btnSave.setBounds(750,590,70,35);
		btnSave.setSize(70,35);
		btnSave.setLocation(750, 590);
		contentPane.add(btnSave);
	}
	
}
