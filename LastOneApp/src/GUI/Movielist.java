package GUI;

import java.io.Serializable;
import java.util.ArrayList;

public class Movielist implements Serializable {
/**
 * 
 */
private static final long serialVersionUID = 1L;
private String series;
private String title;
private String season;
private String episode;
private String director;
private String writer;
private String actors;
private String genre;
private String runtime;
private String year;
private String poster;
private String plot;
private String rating;
private String watched;

public ArrayList<Movielist> movies = new ArrayList<Movielist>();

	public void addMovie() {

 		Movielist breakingbad1_1 = new Movielist();
 		breakingbad1_1.setseries("Breaking Bad");
 		breakingbad1_1.settitle("Pilot");
 		breakingbad1_1.setseason("1");
 		breakingbad1_1.setepisode("1");
 		breakingbad1_1.setposter("http://ia.media-imdb.com/images/M/MV5BMTQzNDg0Mzc5OV5BMl5BanBnXkFtZTgwOTE0OTc5MjE@._V1_SX300.jpg");
 		breakingbad1_1.setrating("8.2");
 		breakingbad1_1.setplot("A high school chemistry teacher is diagnosed with terminal lung cancer and resorts to selling methamphetamine to provide for his family when he is dead.");
 		breakingbad1_1.setdirector("Vince Gilligan");
 		breakingbad1_1.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad1_1.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_1.setyear("2008");
 		breakingbad1_1.setgenre("Crime, Drama, Thriller");
 		breakingbad1_1.setruntime("58 min");
 		breakingbad1_1.setwatched("0");
 		movies.add(breakingbad1_1);
		
 		Movielist breakingbad1_2 = new Movielist();
 		breakingbad1_2.setseries("Breaking Bad");
 		breakingbad1_2.settitle("Cat's in the Bag...");
 		breakingbad1_2.setseason("1");
 		breakingbad1_2.setepisode("2");
 		breakingbad1_2.setposter("http://ia.media-imdb.com/images/M/MV5BMTcyOTU0MTIxNF5BMl5BanBnXkFtZTgwMzAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_2.setrating("7.6");
 		breakingbad1_2.setplot("Walt and Jesse try to decide what to do with the body of Emilio and their prisoner, Krazy 8.");
 		breakingbad1_2.setdirector("Adam Bernstein");
 		breakingbad1_2.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad1_2.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_2.setyear("2008");
 		breakingbad1_2.setgenre("Crime, Drama, Thriller");
 		breakingbad1_2.setruntime("48 min");
 		breakingbad1_2.setwatched("0");
 		movies.add(breakingbad1_2);
		
 		Movielist breakingbad1_3 = new Movielist();
 		breakingbad1_3.setseries("Breaking Bad");
 		breakingbad1_3.settitle("...And the Bag's in the River");
 		breakingbad1_3.setseason("1");
 		breakingbad1_3.setepisode("3");
 		breakingbad1_3.setposter("http://ia.media-imdb.com/images/M/MV5BMjI4NjIxOTkwMl5BMl5BanBnXkFtZTgwNTAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_3.setrating("7.6");
 		breakingbad1_3.setplot("Walt is struggling to decide if it's best to kill Krazy 8 or let him go.");
 		breakingbad1_3.setdirector("Adam Bernstein");
 		breakingbad1_3.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad1_3.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_3.setyear("2008");
 		breakingbad1_3.setgenre("Crime, Drama, Thriller");
 		breakingbad1_3.setruntime("48 min");
 		breakingbad1_3.setwatched("0");
 		movies.add(breakingbad1_3);
		
 		Movielist breakingbad1_4 = new Movielist();
 		breakingbad1_4.setseries("Breaking Bad");
 		breakingbad1_4.settitle("Cancer Man");
 		breakingbad1_4.setseason("1");
 		breakingbad1_4.setepisode("4");
 		breakingbad1_4.setposter("http://ia.media-imdb.com/images/M/MV5BODg5MTYzNzM4MV5BMl5BanBnXkFtZTgwNDAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_4.setrating("7.2");
 		breakingbad1_4.setplot("Walt tells the rest of his family about his cancer. Jesse tries to make amends with his own parents.");
 		breakingbad1_4.setdirector("Jim McKay");
 		breakingbad1_4.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad1_4.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_4.setyear("2008");
 		breakingbad1_4.setgenre("Crime, Drama, Thriller");
 		breakingbad1_4.setruntime("48 min");
 		breakingbad1_4.setwatched("0");
 		movies.add(breakingbad1_4);
		
 		Movielist breakingbad1_5 = new Movielist();
 		breakingbad1_5.setseries("Breaking Bad");
 		breakingbad1_5.settitle("Gray Matter");
 		breakingbad1_5.setseason("1");
 		breakingbad1_5.setepisode("5");
 		breakingbad1_5.setposter("http://ia.media-imdb.com/images/M/MV5BNTkxMjg1MTU5MF5BMl5BanBnXkFtZTgwODAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_5.setrating("7.2");
 		breakingbad1_5.setplot("Walt rejects everyone who tries to help him with the cancer. Jesse tries his best to create Walt's meth, with the help of an old friend.");
 		breakingbad1_5.setdirector("Tricia Brock");
 		breakingbad1_5.setwriter("Vince Gilligan (created by), Patty Lin");
 		breakingbad1_5.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_5.setyear("2008");
 		breakingbad1_5.setgenre("Crime, Drama, Thriller");
 		breakingbad1_5.setruntime("48 min");
 		breakingbad1_5.setwatched("0");
 		movies.add(breakingbad1_5);
		
 		Movielist breakingbad1_6 = new Movielist();
 		breakingbad1_6.setseries("Breaking Bad");
 		breakingbad1_6.settitle("Crazy Handful of Nothin'");
 		breakingbad1_6.setseason("1");
 		breakingbad1_6.setepisode("6");
 		breakingbad1_6.setposter("http://ia.media-imdb.com/images/M/MV5BMTY0MzYxOTEwNV5BMl5BanBnXkFtZTgwNjAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_6.setrating("8.1");
 		breakingbad1_6.setplot("With the side effects and cost of his treatment mounting, Walt demands that Jesse finds a wholesaler to buy their drugs, which lands him in trouble.");
 		breakingbad1_6.setdirector("Bronwen Hughes");
 		breakingbad1_6.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad1_6.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_6.setyear("2008");
 		breakingbad1_6.setgenre("Crime, Drama, Thriller");
 		breakingbad1_6.setruntime("48 min");
 		breakingbad1_6.setwatched("0");
 		movies.add(breakingbad1_6);
		
 		Movielist breakingbad1_7 = new Movielist();
 		breakingbad1_7.setseries("Breaking Bad");
 		breakingbad1_7.settitle("A No-Rough-Stuff-Type Deal");
 		breakingbad1_7.setseason("1");
 		breakingbad1_7.setepisode("7");
 		breakingbad1_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTkwOTQ1MjA2NF5BMl5BanBnXkFtZTgwOTAwOTc5MjE@._V1_SX300.jpg");
 		breakingbad1_7.setrating("7.7");
 		breakingbad1_7.setplot("Walt and Jesse try to up their game by making more of the crystal every week for Tuco. Unfortunately, some of the ingredients they need are not easy to find. Meanwhile, Skyler realizes that her sister is a shoplifter.");
 		breakingbad1_7.setdirector("Tim Hunter");
 		breakingbad1_7.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad1_7.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad1_7.setyear("2008");
 		breakingbad1_7.setgenre("Crime, Drama, Thriller");
 		breakingbad1_7.setruntime("48 min");
 		breakingbad1_7.setwatched("0");
 		movies.add(breakingbad1_7);
		
 		Movielist breakingbad2_1 = new Movielist();
 		breakingbad2_1.setseries("Breaking Bad");
 		breakingbad2_1.settitle("Seven Thirty-Seven");
 		breakingbad2_1.setseason("2");
 		breakingbad2_1.setepisode("1");
 		breakingbad2_1.setposter("http://ia.media-imdb.com/images/M/MV5BMjE3OTEyMTU5MV5BMl5BanBnXkFtZTcwNDAzMTMzMg@@._V1_SX300.jpg");
 		breakingbad2_1.setrating("8.6");
 		breakingbad2_1.setplot("After witnessing Tuco murder one of his junkies, Walt and Jesse fear that he will kill them next, to tie up loose ends. Unless they kill Tuco first.");
 		breakingbad2_1.setdirector("Bryan Cranston");
 		breakingbad2_1.setwriter("Vince Gilligan (created by), J. Roberts");
 		breakingbad2_1.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_1.setyear("2009");
 		breakingbad2_1.setgenre("Crime, Drama, Thriller");
 		breakingbad2_1.setruntime("47 min");
 		breakingbad2_1.setwatched("0");
 		movies.add(breakingbad2_1);
		
 		Movielist breakingbad2_2 = new Movielist();
 		breakingbad2_2.setseries("Breaking Bad");
 		breakingbad2_2.settitle("Grilled");
 		breakingbad2_2.setseason("2");
 		breakingbad2_2.setepisode("2");
 		breakingbad2_2.setposter("http://ia.media-imdb.com/images/M/MV5BMTkwODEyMTcxNl5BMl5BanBnXkFtZTcwMzM5NjA0Mg@@._V1_SX300.jpg");
 		breakingbad2_2.setrating("9.2");
 		breakingbad2_2.setplot("Tuco takes Walt and Jesse prisoner.");
 		breakingbad2_2.setdirector("Charles Haid");
 		breakingbad2_2.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad2_2.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_2.setyear("2009");
 		breakingbad2_2.setgenre("Crime, Drama, Thriller");
 		breakingbad2_2.setruntime("46 min");
 		breakingbad2_2.setwatched("0");
 		movies.add(breakingbad2_2);
		
 		Movielist breakingbad2_3 = new Movielist();
 		breakingbad2_3.setseries("Breaking Bad");
 		breakingbad2_3.settitle("Bit by a Dead Bee");
 		breakingbad2_3.setseason("2");
 		breakingbad2_3.setepisode("3");
 		breakingbad2_3.setposter("http://ia.media-imdb.com/images/M/MV5BMTc1NDYxMDM3OV5BMl5BanBnXkFtZTgwMzE4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_3.setrating("7.1");
 		breakingbad2_3.setplot("Walt and Jesse try to come up with alibis for their disappearances.");
 		breakingbad2_3.setdirector("Terry McDonough");
 		breakingbad2_3.setwriter("Vince Gilligan (created by), Peter Gould, Peter Gould (executive story editor), George Mastras (executive story editor), J. Roberts (story), Moira Walley-Beckett (story)");
 		breakingbad2_3.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_3.setyear("2009");
 		breakingbad2_3.setgenre("Crime, Drama, Thriller");
 		breakingbad2_3.setruntime("47 min");
 		breakingbad2_3.setwatched("0");
 		movies.add(breakingbad2_3);
		
 		Movielist breakingbad2_4 = new Movielist();
 		breakingbad2_4.setseries("Breaking Bad");
 		breakingbad2_4.settitle("Down");
 		breakingbad2_4.setseason("2");
 		breakingbad2_4.setepisode("4");
 		breakingbad2_4.setposter("http://ia.media-imdb.com/images/M/MV5BMjI0NzA3MDc0MF5BMl5BanBnXkFtZTgwMTE4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_4.setrating("7.4");
 		breakingbad2_4.setplot("Skyler keeps mysteriously leaving without talking to Walt. Jesse's parents throw him out of his own house.");
 		breakingbad2_4.setdirector("John Dahl");
 		breakingbad2_4.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad2_4.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_4.setyear("2009");
 		breakingbad2_4.setgenre("Crime, Drama, Thriller");
 		breakingbad2_4.setruntime("47 min");
 		breakingbad2_4.setwatched("0");
 		movies.add(breakingbad2_4);
		
 		Movielist breakingbad2_5 = new Movielist();
 		breakingbad2_5.setseries("Breaking Bad");
 		breakingbad2_5.settitle("Breakage");
 		breakingbad2_5.setseason("2");
 		breakingbad2_5.setepisode("5");
 		breakingbad2_5.setposter("http://ia.media-imdb.com/images/M/MV5BMTkyMjI5NjQ5Ml5BMl5BanBnXkFtZTgwNDE4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_5.setrating("7.1");
 		breakingbad2_5.setplot("Walt and Jesse decide to start their own little empire with the help of Jesse's friends: Skinny Pete, Combo, and Badger. Meanwhile, Hank tries to pull himself together after his encounter with Tuco.");
 		breakingbad2_5.setdirector("Johan Renck");
 		breakingbad2_5.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad2_5.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_5.setyear("2009");
 		breakingbad2_5.setgenre("Crime, Drama, Thriller");
 		breakingbad2_5.setruntime("47 min");
 		breakingbad2_5.setwatched("0");
 		movies.add(breakingbad2_5);
		
 		Movielist breakingbad2_6 = new Movielist();
 		breakingbad2_6.setseries("Breaking Bad");
 		breakingbad2_6.settitle("Peekaboo");
 		breakingbad2_6.setseason("2");
 		breakingbad2_6.setepisode("6");
 		breakingbad2_6.setposter("http://ia.media-imdb.com/images/M/MV5BMTYyNzcyOTMxMV5BMl5BanBnXkFtZTcwMTA2NTc0Mg@@._V1_SX300.jpg");
 		breakingbad2_6.setrating("7.6");
 		breakingbad2_6.setplot("After Skinny Pete gets ripped off, Walt makes Jesse go get the money. Meanwhile, Walt's cover story on how Elliott and Gretchen are paying for his medical treatment is on the verge of collapsing.");
 		breakingbad2_6.setdirector("Peter Medak");
 		breakingbad2_6.setwriter("Vince Gilligan (created by), J. Roberts, Vince Gilligan");
 		breakingbad2_6.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_6.setyear("2009");
 		breakingbad2_6.setgenre("Crime, Drama, Thriller");
 		breakingbad2_6.setruntime("47 min");
 		breakingbad2_6.setwatched("0");
 		movies.add(breakingbad2_6);
		
 		Movielist breakingbad2_7 = new Movielist();
 		breakingbad2_7.setseries("Breaking Bad");
 		breakingbad2_7.settitle("Negro Y Azul");
 		breakingbad2_7.setseason("2");
 		breakingbad2_7.setepisode("7");
 		breakingbad2_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ0MDU0Nzc3M15BMl5BanBnXkFtZTgwMzI4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_7.setrating("7.8");
 		breakingbad2_7.setplot("Rumor is spreading that Jesse killed the man that ripped Skinny Pete off. Walt uses this to his advantage on expanding their territory. Meanwhile, Hank has been promoted to the El Paso office. But it's not all he hoped it would be.");
 		breakingbad2_7.setdirector("Félix Enríquez Alcalá");
 		breakingbad2_7.setwriter("Vince Gilligan (created by), John Shiban");
 		breakingbad2_7.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_7.setyear("2009");
 		breakingbad2_7.setgenre("Crime, Drama, Thriller");
 		breakingbad2_7.setruntime("47 min");
 		breakingbad2_7.setwatched("0");
 		movies.add(breakingbad2_7);
		
 		Movielist breakingbad2_8 = new Movielist();
 		breakingbad2_8.setseries("Breaking Bad");
 		breakingbad2_8.settitle("Better Call Saul");
 		breakingbad2_8.setseason("2");
 		breakingbad2_8.setepisode("8");
 		breakingbad2_8.setposter("http://ia.media-imdb.com/images/M/MV5BMTQyNDIxMDcwMV5BMl5BanBnXkFtZTgwNjI4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_8.setrating("7.8");
 		breakingbad2_8.setplot("Badger is caught by the DEA. Walt and Jesse hire the best criminal lawyer in town, Saul Goodman.");
 		breakingbad2_8.setdirector("Terry McDonough");
 		breakingbad2_8.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad2_8.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_8.setyear("2009");
 		breakingbad2_8.setgenre("Crime, Drama, Thriller");
 		breakingbad2_8.setruntime("47 min");
 		breakingbad2_8.setwatched("0");
 		movies.add(breakingbad2_8);
		
 		Movielist breakingbad2_9 = new Movielist();
 		breakingbad2_9.setseries("Breaking Bad");
 		breakingbad2_9.settitle("4 Days Out");
 		breakingbad2_9.setseason("2");
 		breakingbad2_9.setepisode("9");
 		breakingbad2_9.setposter("http://ia.media-imdb.com/images/M/MV5BMTg5MjIzODI4MV5BMl5BanBnXkFtZTgwMDI4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_9.setrating("7.7");
 		breakingbad2_9.setplot("Walt and Jesse become stranded out in the middle of the desert after cooking more crystal.");
 		breakingbad2_9.setdirector("Michelle MacLaren");
 		breakingbad2_9.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad2_9.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_9.setyear("2009");
 		breakingbad2_9.setgenre("Crime, Drama, Thriller");
 		breakingbad2_9.setruntime("47 min");
 		breakingbad2_9.setwatched("0");
 		movies.add(breakingbad2_9);
		
 		Movielist breakingbad2_10 = new Movielist();
 		breakingbad2_10.setseries("Breaking Bad");
 		breakingbad2_10.settitle("Over");
 		breakingbad2_10.setseason("2");
 		breakingbad2_10.setepisode("10");
 		breakingbad2_10.setposter("http://ia.media-imdb.com/images/M/MV5BMTgwNjg2NjY0Ml5BMl5BanBnXkFtZTcwMTQ2NDQ1Mg@@._V1_SX300.jpg");
 		breakingbad2_10.setrating("7.2");
 		breakingbad2_10.setplot("Walt's cancer has greatly improved. Time to celebrate. Meanwhile Jesse tries to meet his new girlfriend's father.");
 		breakingbad2_10.setdirector("Phil Abraham");
 		breakingbad2_10.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad2_10.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_10.setyear("2009");
 		breakingbad2_10.setgenre("Crime, Drama, Thriller");
 		breakingbad2_10.setruntime("47 min");
 		breakingbad2_10.setwatched("0");
 		movies.add(breakingbad2_10);
		
 		Movielist breakingbad2_11 = new Movielist();
 		breakingbad2_11.setseries("Breaking Bad");
 		breakingbad2_11.settitle("Mandala");
 		breakingbad2_11.setseason("2");
 		breakingbad2_11.setepisode("11");
 		breakingbad2_11.setposter("http://ia.media-imdb.com/images/M/MV5BMTM4NDAzMzU0MF5BMl5BanBnXkFtZTcwMTg1NDY1Mg@@._V1_SX300.jpg");
 		breakingbad2_11.setrating("7.5");
 		breakingbad2_11.setplot("Combo is found dead. Walt and Jesse's little empire begins to crumble. Saul tries to set them up with a mysterious distributor.");
 		breakingbad2_11.setdirector("Adam Bernstein");
 		breakingbad2_11.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad2_11.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_11.setyear("2009");
 		breakingbad2_11.setgenre("Crime, Drama, Thriller");
 		breakingbad2_11.setruntime("47 min");
 		breakingbad2_11.setwatched("0");
 		movies.add(breakingbad2_11);
		
 		Movielist breakingbad2_12 = new Movielist();
 		breakingbad2_12.setseries("Breaking Bad");
 		breakingbad2_12.settitle("Phoenix");
 		breakingbad2_12.setseason("2");
 		breakingbad2_12.setepisode("12");
 		breakingbad2_12.setposter("http://ia.media-imdb.com/images/M/MV5BMTgxODk4MDM2M15BMl5BanBnXkFtZTcwMjgzOTg1Mg@@._V1_SX300.jpg");
 		breakingbad2_12.setrating("7.9");
 		breakingbad2_12.setplot("Walt and Skyler have a baby girl. Now that Jesse is hooked on heroin, Walt refuses to give him his money until he gets clean. Meanwhile, as an excuse for his money, Walt decides to donate the money to himself through his son's new website.");
 		breakingbad2_12.setdirector("Colin Bucksey");
 		breakingbad2_12.setwriter("Vince Gilligan (created by), John Shiban");
 		breakingbad2_12.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_12.setyear("2009");
 		breakingbad2_12.setgenre("Crime, Drama, Thriller");
 		breakingbad2_12.setruntime("47 min");
 		breakingbad2_12.setwatched("0");
 		movies.add(breakingbad2_12);
		
 		Movielist breakingbad2_13 = new Movielist();
 		breakingbad2_13.setseries("Breaking Bad");
 		breakingbad2_13.settitle("ABQ");
 		breakingbad2_13.setseason("2");
 		breakingbad2_13.setepisode("13");
 		breakingbad2_13.setposter("http://ia.media-imdb.com/images/M/MV5BMTY2NjY3NzM0OF5BMl5BanBnXkFtZTgwNzE4OTc5MjE@._V1_SX300.jpg");
 		breakingbad2_13.setrating("7.9");
 		breakingbad2_13.setplot("Walt's lies have pushed Skyler to her limit. She leaves with the kids. Meanwhile, Jesse blames himself for Jane's death and goes into rehab.");
 		breakingbad2_13.setdirector("Adam Bernstein");
 		breakingbad2_13.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad2_13.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad2_13.setyear("2009");
 		breakingbad2_13.setgenre("Crime, Drama, Thriller");
 		breakingbad2_13.setruntime("48 min");
 		breakingbad2_13.setwatched("0");
 		movies.add(breakingbad2_13);
		
 		Movielist breakingbad3_1 = new Movielist();
 		breakingbad3_1.setseries("Breaking Bad");
 		breakingbad3_1.settitle("No Más");
 		breakingbad3_1.setseason("3");
 		breakingbad3_1.setepisode("1");
 		breakingbad3_1.setposter("http://ia.media-imdb.com/images/M/MV5BMTUzMzQ1MDc5OF5BMl5BanBnXkFtZTcwMTMzOTMyMw@@._V1_SX300.jpg");
 		breakingbad3_1.setrating("8.6");
 		breakingbad3_1.setplot("Skyler is planning to divorce Walt now that she knows about the crystal meth. Jesse finishes rehab.");
 		breakingbad3_1.setdirector("Bryan Cranston");
 		breakingbad3_1.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad3_1.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_1.setyear("2010");
 		breakingbad3_1.setgenre("Crime, Drama, Thriller");
 		breakingbad3_1.setruntime("47 min");
 		breakingbad3_1.setwatched("0");
 		movies.add(breakingbad3_1);
		
 		Movielist breakingbad3_2 = new Movielist();
 		breakingbad3_2.setseries("Breaking Bad");
 		breakingbad3_2.settitle("Caballo sin Nombre");
 		breakingbad3_2.setseason("3");
 		breakingbad3_2.setepisode("2");
 		breakingbad3_2.setposter("http://ia.media-imdb.com/images/M/MV5BMjAxMzg0NDE3OV5BMl5BanBnXkFtZTgwMDYxMDg5MjE@._V1_SX300.jpg");
 		breakingbad3_2.setrating("8.7");
 		breakingbad3_2.setplot("Walter Jr is having a rough time accepting his parents' separation. Jesse buys his old house from his parents. Meanwhile, two mysterious men have come into town looking for Walt.");
 		breakingbad3_2.setdirector("Adam Bernstein");
 		breakingbad3_2.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad3_2.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_2.setyear("2010");
 		breakingbad3_2.setgenre("Crime, Drama, Thriller");
 		breakingbad3_2.setruntime("47 min");
 		breakingbad3_2.setwatched("0");
 		movies.add(breakingbad3_2);
		
 		Movielist breakingbad3_3 = new Movielist();
 		breakingbad3_3.setseries("Breaking Bad");
 		breakingbad3_3.settitle("I.F.T.");
 		breakingbad3_3.setseason("3");
 		breakingbad3_3.setepisode("3");
 		breakingbad3_3.setposter("http://ia.media-imdb.com/images/M/MV5BMTMyMTgzNDA3MF5BMl5BanBnXkFtZTcwMTMwMTIzMw@@._V1_SX300.jpg");
 		breakingbad3_3.setrating("8.5");
 		breakingbad3_3.setplot("Walt has moved back into the house without Skyler's consent. Now she can't get him out. Meanwhile, Jesse continues to cope with Jane's death.");
 		breakingbad3_3.setdirector("Michelle MacLaren");
 		breakingbad3_3.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad3_3.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_3.setyear("2010");
 		breakingbad3_3.setgenre("Crime, Drama, Thriller");
 		breakingbad3_3.setruntime("47 min");
 		breakingbad3_3.setwatched("0");
 		movies.add(breakingbad3_3);
		
 		Movielist breakingbad3_4 = new Movielist();
 		breakingbad3_4.setseries("Breaking Bad");
 		breakingbad3_4.settitle("Green Light");
 		breakingbad3_4.setseason("3");
 		breakingbad3_4.setepisode("4");
 		breakingbad3_4.setposter("http://ia.media-imdb.com/images/M/MV5BMTc5NzE3NTc0MV5BMl5BanBnXkFtZTcwMDk5MDIzMw@@._V1_SX300.jpg");
 		breakingbad3_4.setrating("8.3");
 		breakingbad3_4.setplot("Walt's world crumbles even more when he finds out that Skyler is cheating on him. Jesse tries to set up a meeting with Gus to try and sell his own version of the blue meth. Meanwhile, Hank is growing obsessed with finding Heisenberg.");
 		breakingbad3_4.setdirector("Scott Winant");
 		breakingbad3_4.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad3_4.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_4.setyear("2010");
 		breakingbad3_4.setgenre("Crime, Drama, Thriller");
 		breakingbad3_4.setruntime("47 min");
 		breakingbad3_4.setwatched("0");
 		movies.add(breakingbad3_4);
		
 		Movielist breakingbad3_5 = new Movielist();
 		breakingbad3_5.setseries("Breaking Bad");
 		breakingbad3_5.settitle("Más");
 		breakingbad3_5.setseason("3");
 		breakingbad3_5.setepisode("5");
 		breakingbad3_5.setposter("http://ia.media-imdb.com/images/M/MV5BMjA1NzQ1ODM0Nl5BMl5BanBnXkFtZTcwMjg0MDYzMw@@._V1_SX300.jpg");
 		breakingbad3_5.setrating("7.2");
 		breakingbad3_5.setplot("Gus tries to get Walt back in the business by offering him three million dollars and a brand new lab. Jesse is furious that Walt received half of the money for his blue meth. Hank tries to track down the RV meth lab.");
 		breakingbad3_5.setdirector("Johan Renck");
 		breakingbad3_5.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad3_5.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_5.setyear("2010");
 		breakingbad3_5.setgenre("Crime, Drama, Thriller");
 		breakingbad3_5.setruntime("47 min");
 		breakingbad3_5.setwatched("0");
 		movies.add(breakingbad3_5);
		
 		Movielist breakingbad3_6 = new Movielist();
 		breakingbad3_6.setseries("Breaking Bad");
 		breakingbad3_6.settitle("Sunset");
 		breakingbad3_6.setseason("3");
 		breakingbad3_6.setepisode("6");
 		breakingbad3_6.setposter("http://ia.media-imdb.com/images/M/MV5BMjEzNjI4MDI0M15BMl5BanBnXkFtZTcwNTkxMTgzMw@@._V1_SX300.jpg");
 		breakingbad3_6.setrating("7.9");
 		breakingbad3_6.setplot("Walt's new business and assistant, Gale, are making his life much easier. Hank trails the RV back to Jesse. When Walt finds out, he tries to destroy the RV.");
 		breakingbad3_6.setdirector("John Shiban");
 		breakingbad3_6.setwriter("Vince Gilligan (created by), John Shiban");
 		breakingbad3_6.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_6.setyear("2010");
 		breakingbad3_6.setgenre("Crime, Drama, Thriller");
 		breakingbad3_6.setruntime("47 min");
 		breakingbad3_6.setwatched("0");
 		movies.add(breakingbad3_6);
		
 		Movielist breakingbad3_7 = new Movielist();
 		breakingbad3_7.setseries("Breaking Bad");
 		breakingbad3_7.settitle("One Minute");
 		breakingbad3_7.setseason("3");
 		breakingbad3_7.setepisode("7");
 		breakingbad3_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTM4MjA3OTU2Ml5BMl5BanBnXkFtZTcwMTM0OTM0Mw@@._V1_SX300.jpg");
 		breakingbad3_7.setrating("8.3");
 		breakingbad3_7.setplot("Jesse ends up in the hospital after getting beaten up by Hank. Now he is threatening to press charges against the DEA. To stop him, Walt decides to bring Jesse on as his partner, once again.");
 		breakingbad3_7.setdirector("Michelle MacLaren");
 		breakingbad3_7.setwriter("Vince Gilligan (created by), Thomas Schnauz");
 		breakingbad3_7.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_7.setyear("2010");
 		breakingbad3_7.setgenre("Crime, Drama, Thriller");
 		breakingbad3_7.setruntime("47 min");
 		breakingbad3_7.setwatched("0");
 		movies.add(breakingbad3_7);
		
 		Movielist breakingbad3_8 = new Movielist();
 		breakingbad3_8.setseries("Breaking Bad");
 		breakingbad3_8.settitle("I See You");
 		breakingbad3_8.setseason("3");
 		breakingbad3_8.setepisode("8");
 		breakingbad3_8.setposter("http://ia.media-imdb.com/images/M/MV5BMTAyNTUzOTIwMDZeQTJeQWpwZ15BbWU3MDM3MTI1NDM@._V1_SX300.jpg");
 		breakingbad3_8.setrating("7.8");
 		breakingbad3_8.setplot("Hank ends up in the hospital after being attacked by Tuco's cousins. Walt spends too much time by his family's side when he should be cooking meth.");
 		breakingbad3_8.setdirector("Colin Bucksey");
 		breakingbad3_8.setwriter("Vince Gilligan (created by), Gennifer Hutchison");
 		breakingbad3_8.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_8.setyear("2010");
 		breakingbad3_8.setgenre("Crime, Drama, Thriller");
 		breakingbad3_8.setruntime("47 min");
 		breakingbad3_8.setwatched("0");
 		movies.add(breakingbad3_8);
		
 		Movielist breakingbad3_9 = new Movielist();
 		breakingbad3_9.setseries("Breaking Bad");
 		breakingbad3_9.settitle("Kafkaesque");
 		breakingbad3_9.setseason("3");
 		breakingbad3_9.setepisode("9");
 		breakingbad3_9.setposter("http://ia.media-imdb.com/images/M/MV5BMTc2NjA4OTYyMl5BMl5BanBnXkFtZTgwNjYxMDg5MjE@._V1_SX300.jpg");
 		breakingbad3_9.setrating("7.0");
 		breakingbad3_9.setplot("Skyler hatches a plan as Hank's hospital bills stack up. Meanwhile, Walt and Gus come to a better understanding as Jesse, looking for more independence, pursues a new opportunity.");
 		breakingbad3_9.setdirector("Michael Slovis");
 		breakingbad3_9.setwriter("Vince Gilligan (created by), Peter Gould, George Mastras");
 		breakingbad3_9.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_9.setyear("2010");
 		breakingbad3_9.setgenre("Crime, Drama, Thriller");
 		breakingbad3_9.setruntime("47 min");
 		breakingbad3_9.setwatched("0");
 		movies.add(breakingbad3_9);
		
 		Movielist breakingbad3_10 = new Movielist();
 		breakingbad3_10.setseries("Breaking Bad");
 		breakingbad3_10.settitle("Fly");
 		breakingbad3_10.setseason("3");
 		breakingbad3_10.setepisode("10");
 		breakingbad3_10.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ0MDczMDY4OV5BMl5BanBnXkFtZTgwMzYxMDg5MjE@._V1_SX300.jpg");
 		breakingbad3_10.setrating("7.2");
 		breakingbad3_10.setplot("There is a fly loose in the lab. Walt and Jesse must do whatever they can to kill it before it contaminates the meth.");
 		breakingbad3_10.setdirector("Rian Johnson");
 		breakingbad3_10.setwriter("Vince Gilligan (created by), Sam Catlin, Moira Walley-Beckett");
 		breakingbad3_10.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_10.setyear("2010");
 		breakingbad3_10.setgenre("Crime, Drama, Thriller");
 		breakingbad3_10.setruntime("47 min");
 		breakingbad3_10.setwatched("0");
 		movies.add(breakingbad3_10);
		
 		Movielist breakingbad3_11 = new Movielist();
 		breakingbad3_11.setseries("Breaking Bad");
 		breakingbad3_11.settitle("Abiquiu");
 		breakingbad3_11.setseason("3");
 		breakingbad3_11.setepisode("11");
 		breakingbad3_11.setposter("http://ia.media-imdb.com/images/M/MV5BMTMyMTQ2NzU5Ml5BMl5BanBnXkFtZTcwMjI0NzI1Mw@@._V1_SX300.jpg");
 		breakingbad3_11.setrating("7.1");
 		breakingbad3_11.setplot("Skyler gets more involved in Walt's business, much to his chagrin as Hank struggles with his recovery. Meanwhile, Jesse takes an active role in his new enterprise, leading him to a startling discovery.");
 		breakingbad3_11.setdirector("Michelle MacLaren");
 		breakingbad3_11.setwriter("Vince Gilligan (created by), John Shiban, Thomas Schnauz");
 		breakingbad3_11.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_11.setyear("2010");
 		breakingbad3_11.setgenre("Crime, Drama, Thriller");
 		breakingbad3_11.setruntime("47 min");
 		breakingbad3_11.setwatched("0");
 		movies.add(breakingbad3_11);
		
 		Movielist breakingbad3_12 = new Movielist();
 		breakingbad3_12.setseries("Breaking Bad");
 		breakingbad3_12.settitle("Half Measures");
 		breakingbad3_12.setseason("3");
 		breakingbad3_12.setepisode("12");
 		breakingbad3_12.setposter("http://ia.media-imdb.com/images/M/MV5BMTM2NzA0MTExMV5BMl5BanBnXkFtZTcwMjczOTQ1Mw@@._V1_SX300.jpg");
 		breakingbad3_12.setrating("8.2");
 		breakingbad3_12.setplot("Against Walt's advice, Jesse lashes out. Fearing for Jesse's safety, Walt takes drastic action to intervene. Meanwhile a tragic event leads to a shocking confrontation.");
 		breakingbad3_12.setdirector("Adam Bernstein");
 		breakingbad3_12.setwriter("Vince Gilligan (created by), Sam Catlin, Peter Gould");
 		breakingbad3_12.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_12.setyear("2010");
 		breakingbad3_12.setgenre("Crime, Drama, Thriller");
 		breakingbad3_12.setruntime("47 min");
 		breakingbad3_12.setwatched("0");
 		movies.add(breakingbad3_12);
		
 		Movielist breakingbad3_13 = new Movielist();
 		breakingbad3_13.setseries("Breaking Bad");
 		breakingbad3_13.settitle("Full Measure");
 		breakingbad3_13.setseason("3");
 		breakingbad3_13.setepisode("13");
 		breakingbad3_13.setposter("http://ia.media-imdb.com/images/M/MV5BMTM1Njc3OTkwOV5BMl5BanBnXkFtZTcwOTkyMDY1Mw@@._V1_SX300.jpg");
 		breakingbad3_13.setrating("8.8");
 		breakingbad3_13.setplot("Jesse has disappeared and Walt is in big trouble with Gus. So Gus rehires Gale to learn from Walt's cooking so that they can dispose of Walt once and for all.");
 		breakingbad3_13.setdirector("Vince Gilligan");
 		breakingbad3_13.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad3_13.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad3_13.setyear("2010");
 		breakingbad3_13.setgenre("Crime, Drama, Thriller");
 		breakingbad3_13.setruntime("47 min");
 		breakingbad3_13.setwatched("0");
 		movies.add(breakingbad3_13);
		
 		Movielist breakingbad4_1 = new Movielist();
 		breakingbad4_1.setseries("Breaking Bad");
 		breakingbad4_1.settitle("Box Cutter");
 		breakingbad4_1.setseason("4");
 		breakingbad4_1.setepisode("1");
 		breakingbad4_1.setposter("http://ia.media-imdb.com/images/M/MV5BMTA2NzQzODA3OTdeQTJeQWpwZ15BbWU3MDY3NjU2NzU@._V1_SX300.jpg");
 		breakingbad4_1.setrating("7.9");
 		breakingbad4_1.setplot("Walt and Jesse are held captive for Gus, after Gale's death. Meanwhile, Skyler tries to find out what happened to Walt.");
 		breakingbad4_1.setdirector("Adam Bernstein");
 		breakingbad4_1.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad4_1.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_1.setyear("2011");
 		breakingbad4_1.setgenre("Crime, Drama, Thriller");
 		breakingbad4_1.setruntime("60 min");
 		breakingbad4_1.setwatched("0");
 		movies.add(breakingbad4_1);
		
 		Movielist breakingbad4_2 = new Movielist();
 		breakingbad4_2.setseries("Breaking Bad");
 		breakingbad4_2.settitle("Thirty-Eight Snub");
 		breakingbad4_2.setseason("4");
 		breakingbad4_2.setepisode("2");
 		breakingbad4_2.setposter("http://ia.media-imdb.com/images/M/MV5BMjI3MjM4NjgyOV5BMl5BanBnXkFtZTcwMDU3ODQwNg@@._V1_SX300.jpg");
 		breakingbad4_2.setrating("7.0");
 		breakingbad4_2.setplot("Walt attempts to form a new alliance as he plans his next move. Meanwhile Skyler pushes Walt towards a business opportunity, in hopes of protecting the family.");
 		breakingbad4_2.setdirector("Michelle MacLaren");
 		breakingbad4_2.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad4_2.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_2.setyear("2011");
 		breakingbad4_2.setgenre("Crime, Drama, Thriller");
 		breakingbad4_2.setruntime("60 min");
 		breakingbad4_2.setwatched("0");
 		movies.add(breakingbad4_2);
		
 		Movielist breakingbad4_3 = new Movielist();
 		breakingbad4_3.setseries("Breaking Bad");
 		breakingbad4_3.settitle("Open House");
 		breakingbad4_3.setseason("4");
 		breakingbad4_3.setepisode("3");
 		breakingbad4_3.setposter("http://ia.media-imdb.com/images/M/MV5BNzg1MTcxMDI2NV5BMl5BanBnXkFtZTcwMjE1MDMxNg@@._V1_SX300.jpg");
 		breakingbad4_3.setrating("6.8");
 		breakingbad4_3.setplot("While Walt worries about Gus's interference and Jesse's increasingly fragile state of mind, Skyler steps up the pressure to get what she wants.");
 		breakingbad4_3.setdirector("David Slade");
 		breakingbad4_3.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad4_3.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_3.setyear("2011");
 		breakingbad4_3.setgenre("Crime, Drama, Thriller");
 		breakingbad4_3.setruntime("47 min");
 		breakingbad4_3.setwatched("0");
 		movies.add(breakingbad4_3);
		
 		Movielist breakingbad4_4 = new Movielist();
 		breakingbad4_4.setseries("Breaking Bad");
 		breakingbad4_4.settitle("Bullet Points");
 		breakingbad4_4.setseason("4");
 		breakingbad4_4.setepisode("4");
 		breakingbad4_4.setposter("http://ia.media-imdb.com/images/M/MV5BMjA0NDA2NjM2M15BMl5BanBnXkFtZTcwMzY0NDgxNg@@._V1_SX300.jpg");
 		breakingbad4_4.setrating("8.7");
 		breakingbad4_4.setplot("As Skyler concocts an elaborate story to explain the Whites' finances, a worried Walt discovers that Hank has begun a new investigation.");
 		breakingbad4_4.setdirector("Colin Bucksey");
 		breakingbad4_4.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad4_4.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_4.setyear("2011");
 		breakingbad4_4.setgenre("Crime, Drama, Thriller");
 		breakingbad4_4.setruntime("47 min");
 		breakingbad4_4.setwatched("0");
 		movies.add(breakingbad4_4);
		
 		Movielist breakingbad4_5 = new Movielist();
 		breakingbad4_5.setseries("Breaking Bad");
 		breakingbad4_5.settitle("Shotgun");
 		breakingbad4_5.setseason("4");
 		breakingbad4_5.setepisode("5");
 		breakingbad4_5.setposter("http://ia.media-imdb.com/images/M/MV5BMjE4NDM3MzkzMl5BMl5BanBnXkFtZTcwNjEzODcyNg@@._V1_SX300.jpg");
 		breakingbad4_5.setrating("7.2");
 		breakingbad4_5.setplot("Jesse rides shotgun with Mike on a perilous run of pickups, prompting Walt to worry that his partner is about to be killed.");
 		breakingbad4_5.setdirector("Michelle MacLaren");
 		breakingbad4_5.setwriter("Vince Gilligan (created by), Thomas Schnauz");
 		breakingbad4_5.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_5.setyear("2011");
 		breakingbad4_5.setgenre("Crime, Drama, Thriller");
 		breakingbad4_5.setruntime("47 min");
 		breakingbad4_5.setwatched("0");
 		movies.add(breakingbad4_5);
		
 		Movielist breakingbad4_6 = new Movielist();
 		breakingbad4_6.setseries("Breaking Bad");
 		breakingbad4_6.settitle("Cornered");
 		breakingbad4_6.setseason("4");
 		breakingbad4_6.setepisode("6");
 		breakingbad4_6.setposter("http://ia.media-imdb.com/images/M/MV5BMTkxODE3ODgxMV5BMl5BanBnXkFtZTcwNDcyOTYzNg@@._V1_SX300.jpg");
 		breakingbad4_6.setrating("8.5");
 		breakingbad4_6.setplot("Skyler adopts an aloof approach when she suspects that Walt isn't telling her the truth. Meanwhile, Jesse proves his worth to Mike and Gus.");
 		breakingbad4_6.setdirector("Michael Slovis");
 		breakingbad4_6.setwriter("Vince Gilligan (created by), Gennifer Hutchison");
 		breakingbad4_6.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_6.setyear("2011");
 		breakingbad4_6.setgenre("Crime, Drama, Thriller");
 		breakingbad4_6.setruntime("47 min");
 		breakingbad4_6.setwatched("0");
 		movies.add(breakingbad4_6);
		
 		Movielist breakingbad4_7 = new Movielist();
 		breakingbad4_7.setseries("Breaking Bad");
 		breakingbad4_7.settitle("Problem Dog");
 		breakingbad4_7.setseason("4");
 		breakingbad4_7.setepisode("7");
 		breakingbad4_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTA1MjUyNDM5NjZeQTJeQWpwZ15BbWU3MDg5ODQ0NDY@._V1_SX300.jpg");
 		breakingbad4_7.setrating("7.4");
 		breakingbad4_7.setplot("Ordered to return the car he bought for his son, Walt strikes back by putting Skyler in a tough spot with their new money-laundering operation.");
 		breakingbad4_7.setdirector("Peter Gould");
 		breakingbad4_7.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad4_7.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_7.setyear("2011");
 		breakingbad4_7.setgenre("Crime, Drama, Thriller");
 		breakingbad4_7.setruntime("47 min");
 		breakingbad4_7.setwatched("0");
 		movies.add(breakingbad4_7);
		
 		Movielist breakingbad4_8 = new Movielist();
 		breakingbad4_8.setseries("Breaking Bad");
 		breakingbad4_8.settitle("Hermanos");
 		breakingbad4_8.setseason("4");
 		breakingbad4_8.setepisode("8");
 		breakingbad4_8.setposter("http://ia.media-imdb.com/images/M/MV5BMjI2Nzk2NzI2NV5BMl5BanBnXkFtZTcwNjgyNDI1Ng@@._V1_SX300.jpg");
 		breakingbad4_8.setrating("8.2");
 		breakingbad4_8.setplot("When Hank produces evidence that Gus is Albuquerque's crystal meth kingpin, Walt worries that he and Jesse will be killed to protect their boss.");
 		breakingbad4_8.setdirector("Johan Renck");
 		breakingbad4_8.setwriter("Vince Gilligan (created by), Sam Catlin, George Mastras");
 		breakingbad4_8.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_8.setyear("2011");
 		breakingbad4_8.setgenre("Crime, Drama, Thriller");
 		breakingbad4_8.setruntime("47 min");
 		breakingbad4_8.setwatched("0");
 		movies.add(breakingbad4_8);
		
 		Movielist breakingbad4_9 = new Movielist();
 		breakingbad4_9.setseries("Breaking Bad");
 		breakingbad4_9.settitle("Bug");
 		breakingbad4_9.setseason("4");
 		breakingbad4_9.setepisode("9");
 		breakingbad4_9.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ0MTA3NTIxM15BMl5BanBnXkFtZTcwMDEwODE2Ng@@._V1_SX300.jpg");
 		breakingbad4_9.setrating("7.8");
 		breakingbad4_9.setplot("While Walt tries to subvert Hank's probe into the Albuquerque meth scene, a deadly warning forces Gus to consider a deal with the cartel.");
 		breakingbad4_9.setdirector("Terry McDonough");
 		breakingbad4_9.setwriter("Vince Gilligan (created by), Moira Walley-Beckett, Thomas Schnauz");
 		breakingbad4_9.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_9.setyear("2011");
 		breakingbad4_9.setgenre("Crime, Drama, Thriller");
 		breakingbad4_9.setruntime("47 min");
 		breakingbad4_9.setwatched("0");
 		movies.add(breakingbad4_9);
		
 		Movielist breakingbad4_10 = new Movielist();
 		breakingbad4_10.setseries("Breaking Bad");
 		breakingbad4_10.settitle("Salud");
 		breakingbad4_10.setseason("4");
 		breakingbad4_10.setepisode("10");
 		breakingbad4_10.setposter("http://ia.media-imdb.com/images/M/MV5BMTAwNDg2MjY5NjBeQTJeQWpwZ15BbWU3MDg2NzAwNzY@._V1_SX300.jpg");
 		breakingbad4_10.setrating("9.6");
 		breakingbad4_10.setplot("Jesse, Gus, and Mike fly down to Mexico, and Jesse cooks the blue meth for the cartel. Walt misses his son's 16th birthday after his fight with Jesse.");
 		breakingbad4_10.setdirector("Michelle MacLaren");
 		breakingbad4_10.setwriter("Vince Gilligan (created by), Peter Gould, Gennifer Hutchison");
 		breakingbad4_10.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_10.setyear("2011");
 		breakingbad4_10.setgenre("Crime, Drama, Thriller");
 		breakingbad4_10.setruntime("47 min");
 		breakingbad4_10.setwatched("0");
 		movies.add(breakingbad4_10);
		
 		Movielist breakingbad4_11 = new Movielist();
 		breakingbad4_11.setseries("Breaking Bad");
 		breakingbad4_11.settitle("Crawl Space");
 		breakingbad4_11.setseason("4");
 		breakingbad4_11.setepisode("11");
 		breakingbad4_11.setposter("http://ia.media-imdb.com/images/M/MV5BMTMzMTgzNzY4N15BMl5BanBnXkFtZTcwOTM5Nzc3Ng@@._V1_SX300.jpg");
 		breakingbad4_11.setrating("9.0");
 		breakingbad4_11.setplot("Hank asks Walt to drive him to the laundry where the meth lab is hidden. Ted still won't pay the IRS so Skyler asks Saul for help, and Saul sends in his A-Team. Gus and Jesse return from Mexico, and Walt fears he is in trouble with Gus.");
 		breakingbad4_11.setdirector("Scott Winant");
 		breakingbad4_11.setwriter("Vince Gilligan (created by), George Mastras, Sam Catlin");
 		breakingbad4_11.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_11.setyear("2011");
 		breakingbad4_11.setgenre("Crime, Drama, Thriller");
 		breakingbad4_11.setruntime("45 min");
 		breakingbad4_11.setwatched("0");
 		movies.add(breakingbad4_11);
		
 		Movielist breakingbad4_12 = new Movielist();
 		breakingbad4_12.setseries("Breaking Bad");
 		breakingbad4_12.settitle("End Times");
 		breakingbad4_12.setseason("4");
 		breakingbad4_12.setepisode("12");
 		breakingbad4_12.setposter("http://ia.media-imdb.com/images/M/MV5BMzcwNzM5MDQ4NF5BMl5BanBnXkFtZTcwODc4MzU4Ng@@._V1_SX300.jpg");
 		breakingbad4_12.setrating("8.1");
 		breakingbad4_12.setplot("The DEA is putting Hank and his family in protective custody; however, Walt refuses and awaits his fate in his house. Meanwhile, Brock has fallen terribly ill and Jesse suspects Walt may be behind it.");
 		breakingbad4_12.setdirector("Vince Gilligan");
 		breakingbad4_12.setwriter("Vince Gilligan (created by), Thomas Schnauz, Moira Walley-Beckett");
 		breakingbad4_12.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_12.setyear("2011");
 		breakingbad4_12.setgenre("Crime, Drama, Thriller");
 		breakingbad4_12.setruntime("47 min");
 		breakingbad4_12.setwatched("0");
 		movies.add(breakingbad4_12);
		
 		Movielist breakingbad4_13 = new Movielist();
 		breakingbad4_13.setseries("Breaking Bad");
 		breakingbad4_13.settitle("Face Off");
 		breakingbad4_13.setseason("4");
 		breakingbad4_13.setepisode("13");
 		breakingbad4_13.setposter("http://ia.media-imdb.com/images/M/MV5BMTkzMDU5MTcxNF5BMl5BanBnXkFtZTcwOTI2NTg4Ng@@._V1_SX300.jpg");
 		breakingbad4_13.setrating("9.9");
 		breakingbad4_13.setplot("Jesse is brought to the FBI for questioning on his knowledge of Ricin. In a last effort to kill Gus, Walt must ask for help from an old enemy.");
 		breakingbad4_13.setdirector("Vince Gilligan");
 		breakingbad4_13.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad4_13.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad4_13.setyear("2011");
 		breakingbad4_13.setgenre("Crime, Drama, Thriller");
 		breakingbad4_13.setruntime("51 min");
 		breakingbad4_13.setwatched("0");
 		movies.add(breakingbad4_13);
		
 		Movielist breakingbad5_1 = new Movielist();
 		breakingbad5_1.setseries("Breaking Bad");
 		breakingbad5_1.settitle("Live Free or Die");
 		breakingbad5_1.setseason("5");
 		breakingbad5_1.setepisode("1");
 		breakingbad5_1.setposter("http://ia.media-imdb.com/images/M/MV5BMjIwMzc0Mjk2N15BMl5BanBnXkFtZTcwODM5NzY5Nw@@._V1_SX300.jpg");
 		breakingbad5_1.setrating("8.1");
 		breakingbad5_1.setplot("Now that Gus is dead, Walt, Jesse, and Mike work to cover their tracks. Skyler panics when Ted Beneke wakes up.");
 		breakingbad5_1.setdirector("Michael Slovis");
 		breakingbad5_1.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad5_1.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_1.setyear("2012");
 		breakingbad5_1.setgenre("Crime, Drama, Thriller");
 		breakingbad5_1.setruntime("43 min");
 		breakingbad5_1.setwatched("0");
 		movies.add(breakingbad5_1);
		
 		Movielist breakingbad5_2 = new Movielist();
 		breakingbad5_2.setseries("Breaking Bad");
 		breakingbad5_2.settitle("Madrigal");
 		breakingbad5_2.setseason("5");
 		breakingbad5_2.setepisode("2");
 		breakingbad5_2.setposter("http://ia.media-imdb.com/images/M/MV5BNTc5NjQ0MTQwN15BMl5BanBnXkFtZTcwNDk2MzQxOA@@._V1_SX300.jpg");
 		breakingbad5_2.setrating("9.0");
 		breakingbad5_2.setplot("Walt and Jesse pursue an unlikely business partner; the DEA follows new leads.");
 		breakingbad5_2.setdirector("Michelle MacLaren");
 		breakingbad5_2.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad5_2.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_2.setyear("2012");
 		breakingbad5_2.setgenre("Crime, Drama, Thriller");
 		breakingbad5_2.setruntime("48 min");
 		breakingbad5_2.setwatched("0");
 		movies.add(breakingbad5_2);
		
 		Movielist breakingbad5_3 = new Movielist();
 		breakingbad5_3.setseries("Breaking Bad");
 		breakingbad5_3.settitle("Hazard Pay");
 		breakingbad5_3.setseason("5");
 		breakingbad5_3.setepisode("3");
 		breakingbad5_3.setposter("http://ia.media-imdb.com/images/M/MV5BMTczMjA0ODA2NV5BMl5BanBnXkFtZTcwMjk2MzQxOA@@._V1_SX300.jpg");
 		breakingbad5_3.setrating("7.6");
 		breakingbad5_3.setplot("The guys put a business plan into action; Walt confesses to Marie.");
 		breakingbad5_3.setdirector("Adam Bernstein");
 		breakingbad5_3.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad5_3.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_3.setyear("2012");
 		breakingbad5_3.setgenre("Crime, Drama, Thriller");
 		breakingbad5_3.setruntime("48 min");
 		breakingbad5_3.setwatched("0");
 		movies.add(breakingbad5_3);
		
 		Movielist breakingbad5_4 = new Movielist();
 		breakingbad5_4.setseries("Breaking Bad");
 		breakingbad5_4.settitle("Fifty-One");
 		breakingbad5_4.setseason("5");
 		breakingbad5_4.setepisode("4");
 		breakingbad5_4.setposter("http://ia.media-imdb.com/images/M/MV5BOTkwODc0MDU3NV5BMl5BanBnXkFtZTcwMzYxNTAyOA@@._V1_SX300.jpg");
 		breakingbad5_4.setrating("7.5");
 		breakingbad5_4.setplot("It's Walt's 51st birthday. His return to the drug business causes Skyler to go into depression.");
 		breakingbad5_4.setdirector("Rian Johnson");
 		breakingbad5_4.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad5_4.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_4.setyear("2012");
 		breakingbad5_4.setgenre("Crime, Drama, Thriller");
 		breakingbad5_4.setruntime("48 min");
 		breakingbad5_4.setwatched("0");
 		movies.add(breakingbad5_4);
		
 		Movielist breakingbad5_5 = new Movielist();
 		breakingbad5_5.setseries("Breaking Bad");
 		breakingbad5_5.settitle("Dead Freight");
 		breakingbad5_5.setseason("5");
 		breakingbad5_5.setepisode("5");
 		breakingbad5_5.setposter("http://ia.media-imdb.com/images/M/MV5BNTk2MjQ4Mzk3Nl5BMl5BanBnXkFtZTcwNDI0MTQyOA@@._V1_SX300.jpg");
 		breakingbad5_5.setrating("8.7");
 		breakingbad5_5.setplot("The boys plan on robbing a train that has an entire car of methylamine.");
 		breakingbad5_5.setdirector("George Mastras");
 		breakingbad5_5.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad5_5.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_5.setyear("2012");
 		breakingbad5_5.setgenre("Crime, Drama, Thriller");
 		breakingbad5_5.setruntime("48 min");
 		breakingbad5_5.setwatched("0");
 		movies.add(breakingbad5_5);
		
 		Movielist breakingbad5_6 = new Movielist();
 		breakingbad5_6.setseries("Breaking Bad");
 		breakingbad5_6.settitle("Buyout");
 		breakingbad5_6.setseason("5");
 		breakingbad5_6.setepisode("6");
 		breakingbad5_6.setposter("http://ia.media-imdb.com/images/M/MV5BMjE4MDM4MTc3Nl5BMl5BanBnXkFtZTcwMjcxODgyOA@@._V1_SX300.jpg");
 		breakingbad5_6.setrating("7.7");
 		breakingbad5_6.setplot("Walt, Jesse and Mike distress over the future of their business; occupational hazards weigh heavily on Jesse.");
 		breakingbad5_6.setdirector("Colin Bucksey");
 		breakingbad5_6.setwriter("Vince Gilligan (created by), Gennifer Hutchison");
 		breakingbad5_6.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_6.setyear("2012");
 		breakingbad5_6.setgenre("Crime, Drama, Thriller");
 		breakingbad5_6.setruntime("48 min");
 		breakingbad5_6.setwatched("0");
 		movies.add(breakingbad5_6);
		
 		Movielist breakingbad5_7 = new Movielist();
 		breakingbad5_7.setseries("Breaking Bad");
 		breakingbad5_7.settitle("Say My Name");
 		breakingbad5_7.setseason("5");
 		breakingbad5_7.setepisode("7");
 		breakingbad5_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTM1MjcyMzIzMl5BMl5BanBnXkFtZTcwOTk4MzAzOA@@._V1_SX300.jpg");
 		breakingbad5_7.setrating("9.5");
 		breakingbad5_7.setplot("Mike and Jesse are out. Now Walt has to handle things on his own. Hank finally finds a rat in Mike's gang.");
 		breakingbad5_7.setdirector("Thomas Schnauz");
 		breakingbad5_7.setwriter("Vince Gilligan (created by), Thomas Schnauz");
 		breakingbad5_7.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_7.setyear("2012");
 		breakingbad5_7.setgenre("Crime, Drama, Thriller");
 		breakingbad5_7.setruntime("48 min");
 		breakingbad5_7.setwatched("0");
 		movies.add(breakingbad5_7);
		
 		Movielist breakingbad5_8 = new Movielist();
 		breakingbad5_8.setseries("Breaking Bad");
 		breakingbad5_8.settitle("Gliding Over All");
 		breakingbad5_8.setseason("5");
 		breakingbad5_8.setepisode("8");
 		breakingbad5_8.setposter("http://ia.media-imdb.com/images/M/MV5BMTU0NTU4NjQ5MV5BMl5BanBnXkFtZTcwOTM2MzQzOA@@._V1_SX300.jpg");
 		breakingbad5_8.setrating("8.5");
 		breakingbad5_8.setplot("Walt expands his business overseas, and the money is pouring in.");
 		breakingbad5_8.setdirector("Michelle MacLaren");
 		breakingbad5_8.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad5_8.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_8.setyear("2012");
 		breakingbad5_8.setgenre("Crime, Drama, Thriller");
 		breakingbad5_8.setruntime("48 min");
 		breakingbad5_8.setwatched("0");
 		movies.add(breakingbad5_8);
		
 		Movielist breakingbad5_9 = new Movielist();
 		breakingbad5_9.setseries("Breaking Bad");
 		breakingbad5_9.settitle("Blood Money");
 		breakingbad5_9.setseason("5");
 		breakingbad5_9.setepisode("9");
 		breakingbad5_9.setposter("http://ia.media-imdb.com/images/M/MV5BMjI0MzMyMzg1MF5BMl5BanBnXkFtZTcwOTAyODc4OQ@@._V1_SX300.jpg");
 		breakingbad5_9.setrating("9.4");
 		breakingbad5_9.setplot("Walt is out of the meth business and trying to move on with his life. Jesse tries to get rid of his money. Hank now knows that Walt is the famous Heisenberg.");
 		breakingbad5_9.setdirector("Bryan Cranston");
 		breakingbad5_9.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad5_9.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_9.setyear("2013");
 		breakingbad5_9.setgenre("Crime, Drama, Thriller");
 		breakingbad5_9.setruntime("48 min");
 		breakingbad5_9.setwatched("0");
 		movies.add(breakingbad5_9);
		
 		Movielist breakingbad5_10 = new Movielist();
 		breakingbad5_10.setseries("Breaking Bad");
 		breakingbad5_10.settitle("Buried");
 		breakingbad5_10.setseason("5");
 		breakingbad5_10.setepisode("10");
 		breakingbad5_10.setposter("http://ia.media-imdb.com/images/M/MV5BMTcxNzk4NzYyN15BMl5BanBnXkFtZTgwMDg5OTcxMDE@._V1_SX300.jpg");
 		breakingbad5_10.setrating("8.0");
 		breakingbad5_10.setplot("Hank is determined to bring down Walt. Walt scrambles to hide evidence before Hank gets to it, and Skyler tries to stop Hank and Marie from taking away the kids.");
 		breakingbad5_10.setdirector("Michelle MacLaren");
 		breakingbad5_10.setwriter("Vince Gilligan (created by), Thomas Schnauz");
 		breakingbad5_10.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_10.setyear("2013");
 		breakingbad5_10.setgenre("Crime, Drama, Thriller");
 		breakingbad5_10.setruntime("48 min");
 		breakingbad5_10.setwatched("0");
 		movies.add(breakingbad5_10);
		
 		Movielist breakingbad5_11 = new Movielist();
 		breakingbad5_11.setseries("Breaking Bad");
 		breakingbad5_11.settitle("Confessions");
 		breakingbad5_11.setseason("5");
 		breakingbad5_11.setepisode("11");
 		breakingbad5_11.setposter("http://ia.media-imdb.com/images/M/MV5BMTQxODQwNzIzOF5BMl5BanBnXkFtZTgwMDIxMDgxMDE@._V1_SX300.jpg");
 		breakingbad5_11.setrating("9.6");
 		breakingbad5_11.setplot("Walt makes his next move against Hank, putting Hank in a tough position. Hank confronts Jesse and attempts to turn him against Walt, and Jesse decides it's time to move on. Meanwhile, Todd has taken over the business.");
 		breakingbad5_11.setdirector("Michael Slovis");
 		breakingbad5_11.setwriter("Vince Gilligan (created by), Gennifer Hutchison");
 		breakingbad5_11.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_11.setyear("2013");
 		breakingbad5_11.setgenre("Crime, Drama, Thriller");
 		breakingbad5_11.setruntime("48 min");
 		breakingbad5_11.setwatched("0");
 		movies.add(breakingbad5_11);
		
 		Movielist breakingbad5_12 = new Movielist();
 		breakingbad5_12.setseries("Breaking Bad");
 		breakingbad5_12.settitle("Rabid Dog");
 		breakingbad5_12.setseason("5");
 		breakingbad5_12.setepisode("12");
 		breakingbad5_12.setposter("http://ia.media-imdb.com/images/M/MV5BMTgzMDYwNDAyOF5BMl5BanBnXkFtZTgwMzQ5OTcxMDE@._V1_SX300.jpg");
 		breakingbad5_12.setrating("9.1");
 		breakingbad5_12.setplot("Walt discovers Jesse broke into his house and attempted to burn it down. Walt wants to protect his family so he moves them into a hotel for a few nights. Jesse makes plans to take down Walt.");
 		breakingbad5_12.setdirector("Sam Catlin");
 		breakingbad5_12.setwriter("Vince Gilligan (created by), Sam Catlin");
 		breakingbad5_12.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_12.setyear("2013");
 		breakingbad5_12.setgenre("Crime, Drama, Thriller");
 		breakingbad5_12.setruntime("48 min");
 		breakingbad5_12.setwatched("0");
 		movies.add(breakingbad5_12);
		
 		Movielist breakingbad5_13 = new Movielist();
 		breakingbad5_13.setseries("Breaking Bad");
 		breakingbad5_13.settitle("To'hajiilee");
 		breakingbad5_13.setseason("5");
 		breakingbad5_13.setepisode("13");
 		breakingbad5_13.setposter("http://ia.media-imdb.com/images/M/MV5BMTQxODA3NTE1N15BMl5BanBnXkFtZTgwMTEyMjEyMDE@._V1_SX300.jpg");
 		breakingbad5_13.setrating("9.8");
 		breakingbad5_13.setplot("Jesse and Hank come up with an idea to take Walt down. Walt hires Todd's uncle to kill Jesse.");
 		breakingbad5_13.setdirector("Michelle MacLaren");
 		breakingbad5_13.setwriter("Vince Gilligan (created by), George Mastras");
 		breakingbad5_13.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_13.setyear("2013");
 		breakingbad5_13.setgenre("Crime, Drama, Thriller");
 		breakingbad5_13.setruntime("47 min");
 		breakingbad5_13.setwatched("0");
 		movies.add(breakingbad5_13);
		
 		Movielist breakingbad5_14 = new Movielist();
 		breakingbad5_14.setseries("Breaking Bad");
 		breakingbad5_14.settitle("Ozymandias");
 		breakingbad5_14.setseason("5");
 		breakingbad5_14.setepisode("14");
 		breakingbad5_14.setposter("http://ia.media-imdb.com/images/M/MV5BMTM4NDcyNDMzMF5BMl5BanBnXkFtZTgwOTI0MTI2MDE@._V1_SX300.jpg");
 		breakingbad5_14.setrating("9.9");
 		breakingbad5_14.setplot("Walt goes on the run. Jesse is taken hostage. Skyler believes it's time to tell Flynn the truth.");
 		breakingbad5_14.setdirector("Rian Johnson");
 		breakingbad5_14.setwriter("Vince Gilligan (created by), Moira Walley-Beckett");
 		breakingbad5_14.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_14.setyear("2013");
 		breakingbad5_14.setgenre("Crime, Drama, Thriller");
 		breakingbad5_14.setruntime("48 min");
 		breakingbad5_14.setwatched("0");
 		movies.add(breakingbad5_14);
		
 		Movielist breakingbad5_15 = new Movielist();
 		breakingbad5_15.setseries("Breaking Bad");
 		breakingbad5_15.settitle("Granite State");
 		breakingbad5_15.setseason("5");
 		breakingbad5_15.setepisode("15");
 		breakingbad5_15.setposter("http://ia.media-imdb.com/images/M/MV5BMTY5MjI3MDg5NV5BMl5BanBnXkFtZTgwMDcyNzc5MjE@._V1_SX300.jpg");
 		breakingbad5_15.setrating("9.7");
 		breakingbad5_15.setplot("Walt struggles as he adapts to aspects of his new identity. Jesse plans an escape against Jack and his crew.");
 		breakingbad5_15.setdirector("Peter Gould");
 		breakingbad5_15.setwriter("Vince Gilligan (created by), Peter Gould");
 		breakingbad5_15.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_15.setyear("2013");
 		breakingbad5_15.setgenre("Crime, Drama, Thriller");
 		breakingbad5_15.setruntime("55 min");
 		breakingbad5_15.setwatched("0");
 		movies.add(breakingbad5_15);
		
 		Movielist breakingbad5_16 = new Movielist();
 		breakingbad5_16.setseries("Breaking Bad");
 		breakingbad5_16.settitle("Felina");
 		breakingbad5_16.setseason("5");
 		breakingbad5_16.setepisode("16");
 		breakingbad5_16.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ3OTAwMTQzNl5BMl5BanBnXkFtZTgwMDQxMjUzMDE@._V1_SX300.jpg");
 		breakingbad5_16.setrating("9.9");
 		breakingbad5_16.setplot("Walter White makes one last attempt to secure his family's future, while also visiting some old enemies, during his final return to Albuquerque.");
 		breakingbad5_16.setdirector("Vince Gilligan");
 		breakingbad5_16.setwriter("Vince Gilligan (created by), Vince Gilligan");
 		breakingbad5_16.setactors("Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris");
 		breakingbad5_16.setyear("2013");
 		breakingbad5_16.setgenre("Crime, Drama, Thriller");
 		breakingbad5_16.setruntime("55 min");
 		breakingbad5_16.setwatched("0");
 		movies.add(breakingbad5_16);
		
 		Movielist flash1_1 = new Movielist();
 		flash1_1.setseries("Flash");
 		flash1_1.settitle("Pilot");
 		flash1_1.setseason("1");
 		flash1_1.setepisode("1");
 		flash1_1.setposter("http://ia.media-imdb.com/images/M/MV5BMjEwMTkyOTQ3NF5BMl5BanBnXkFtZTgwNDQ2NzM4MjE@._V1_SX300.jpg");
 		flash1_1.setrating("8.6");
 		flash1_1.setplot("CSI investigator Barry Allen awakens from a coma, nine months after he was hit by lightning, and discovers he has superhuman speed.");
 		flash1_1.setdirector("David Nutter");
 		flash1_1.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg (teleplay by), Geoff Johns (teleplay by), Greg Berlanti (story), Andrew Kreisberg (story), Geoff Johns (story), Gardner Fox (characters), Harry Lampert (characters)");
 		flash1_1.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_1.setyear("2014");
 		flash1_1.setgenre("Action, Adventure, Drama");
 		flash1_1.setruntime("63 min");
 		flash1_1.setwatched("0");
 		movies.add(flash1_1);
		
 		Movielist flash1_2 = new Movielist();
 		flash1_2.setseries("Flash");
 		flash1_2.settitle("Fastest Man Alive");
 		flash1_2.setseason("1");
 		flash1_2.setepisode("2");
 		flash1_2.setposter("http://ia.media-imdb.com/images/M/MV5BMTY3ODE1NDk0MF5BMl5BanBnXkFtZTgwMzk2NjM5MjE@._V1_SX300.jpg");
 		flash1_2.setrating("8.5");
 		flash1_2.setplot("Barry must stop a group of gunmen while escorting Iris to a university gathering.");
 		flash1_2.setdirector("David Nutter");
 		flash1_2.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg (teleplay by), Geoff Johns (teleplay by), Greg Berlanti (story), Andrew Kreisberg (story), Grainne Godfree (story)");
 		flash1_2.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_2.setyear("2014");
 		flash1_2.setgenre("Action, Adventure, Drama");
 		flash1_2.setruntime("40 min");
 		flash1_2.setwatched("0");
 		movies.add(flash1_2);
		
 		Movielist flash1_3 = new Movielist();
 		flash1_3.setseries("Flash");
 		flash1_3.settitle("Things You Can't Outrun");
 		flash1_3.setseason("1");
 		flash1_3.setepisode("3");
 		flash1_3.setposter("http://ia.media-imdb.com/images/M/MV5BNTYzNDQ4Njk1MV5BMl5BanBnXkFtZTgwODg3NjM5MjE@._V1_SX300.jpg");
 		flash1_3.setrating("8.3");
 		flash1_3.setplot("Barry and his team work to capture Kyle Nimbus, a.k.a. The Mist, a dangerous meta-human with toxic gas powers.");
 		flash1_3.setdirector("Jesse Warn");
 		flash1_3.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Alison Schapker, Grainne Godfree, Grainne Godfree (story)");
 		flash1_3.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_3.setyear("2014");
 		flash1_3.setgenre("Action, Adventure, Drama");
 		flash1_3.setruntime("43 min");
 		flash1_3.setwatched("0");
 		movies.add(flash1_3);
		
 		Movielist flash1_4 = new Movielist();
 		flash1_4.setseries("Flash");
 		flash1_4.settitle("Going Rogue");
 		flash1_4.setseason("1");
 		flash1_4.setepisode("4");
 		flash1_4.setposter("http://ia.media-imdb.com/images/M/MV5BMTYxNDU3NTMwNl5BMl5BanBnXkFtZTgwODk3ODcxMzE@._V1_SX300.jpg");
 		flash1_4.setrating("8.8");
 		flash1_4.setplot("The Flash stops a robbery but the culprits get away after shooting a guard, and The Flash chooses to save the man instead of following the criminals. Joe shows Barry a book of suspects and ...");
 		flash1_4.setdirector("Glen Winter");
 		flash1_4.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Geoff Johns, Kai Wu");
 		flash1_4.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_4.setyear("2014");
 		flash1_4.setgenre("Action, Adventure, Drama");
 		flash1_4.setruntime("43 min");
 		flash1_4.setwatched("0");
 		movies.add(flash1_4);
		
 		Movielist flash1_5 = new Movielist();
 		flash1_5.setseries("Flash");
 		flash1_5.settitle("Plastique");
 		flash1_5.setseason("1");
 		flash1_5.setepisode("5");
 		flash1_5.setposter("http://ia.media-imdb.com/images/M/MV5BMTUxMDQxNjk4MV5BMl5BanBnXkFtZTgwMjc0OTgzMzE@._V1_SX300.jpg");
 		flash1_5.setrating("8.3");
 		flash1_5.setplot("After a bomb goes off downtown, the army, led by General Eiling, rolls in and takes over the case, much to Joe's surprise. Suspicious, Joe tells Barry that he and his friends at S.T.A.R. ...");
 		flash1_5.setdirector("Dermott Downs");
 		flash1_5.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Aaron Helbing, Todd Helbing, Brooke Roberts");
 		flash1_5.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_5.setyear("2014");
 		flash1_5.setgenre("Action, Adventure, Drama");
 		flash1_5.setruntime("42 min");
 		flash1_5.setwatched("0");
 		movies.add(flash1_5);
		
 		Movielist flash1_6 = new Movielist();
 		flash1_6.setseries("Flash");
 		flash1_6.settitle("The Flash Is Born");
 		flash1_6.setseason("1");
 		flash1_6.setepisode("6");
 		flash1_6.setposter("http://ia.media-imdb.com/images/M/MV5BMTY4NzUzNjI2NV5BMl5BanBnXkFtZTgwNzI1OTgzMzE@._V1_SX300.jpg");
 		flash1_6.setrating("8.6");
 		flash1_6.setplot("Barry takes on his childhood bully, who can now turn himself into steel. Iris finally coins the moniker \"the Flash.\"");
 		flash1_6.setdirector("Millicent Shelton");
 		flash1_6.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Jaime Paglia, Chris Rafferty");
 		flash1_6.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_6.setyear("2014");
 		flash1_6.setgenre("Action, Adventure, Drama");
 		flash1_6.setruntime("43 min");
 		flash1_6.setwatched("0");
 		movies.add(flash1_6);
		
 		Movielist flash1_7 = new Movielist();
 		flash1_7.setseries("Flash");
 		flash1_7.settitle("Power Outage");
 		flash1_7.setseason("1");
 		flash1_7.setepisode("7");
 		flash1_7.setposter("http://ia.media-imdb.com/images/M/MV5BMjExOTY2OTY2Ml5BMl5BanBnXkFtZTgwMTI5MTg0MzE@._V1_SX300.jpg");
 		flash1_7.setrating("8.7");
 		flash1_7.setplot("The Flash goes up against Farooq aka Blackout, a metahuman who can harness electricity. During their battle, Farooq zaps The Flash and siphons all his electricity, leaving The Flash without...");
 		flash1_7.setdirector("Larry Shaw");
 		flash1_7.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Alison Schapker, Grainne Godfree");
 		flash1_7.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_7.setyear("2014");
 		flash1_7.setgenre("Action, Adventure, Drama");
 		flash1_7.setruntime("43 min");
 		flash1_7.setwatched("0");
 		movies.add(flash1_7);
		
 		Movielist flash1_8 = new Movielist();
 		flash1_8.setseries("Flash");
 		flash1_8.settitle("Flash vs. Arrow");
 		flash1_8.setseason("1");
 		flash1_8.setepisode("8");
 		flash1_8.setposter("http://ia.media-imdb.com/images/M/MV5BMjM1NTQ0MzEyNl5BMl5BanBnXkFtZTgwNTkxMjg0MzE@._V1_SX300.jpg");
 		flash1_8.setrating("9.4");
 		flash1_8.setplot("When a series of homicides cases involving a boomerang-like weapon brings the Arrow to Central City, the Flash must also take care of a new metahuman who manipulates emotions.");
 		flash1_8.setdirector("Glen Winter");
 		flash1_8.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Ben Sokolowski (teleplay by), Brooke Roberts (teleplay by), Greg Berlanti (story), Andrew Kreisberg (story)");
 		flash1_8.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_8.setyear("2014");
 		flash1_8.setgenre("Action, Adventure, Drama");
 		flash1_8.setruntime("42 min");
 		flash1_8.setwatched("0");
 		movies.add(flash1_8);
		
 		Movielist flash1_9 = new Movielist();
 		flash1_9.setseries("Flash");
 		flash1_9.settitle("The Man in the Yellow Suit");
 		flash1_9.setseason("1");
 		flash1_9.setepisode("9");
 		flash1_9.setposter("http://ia.media-imdb.com/images/M/MV5BMTc2MTE3OTA2Nl5BMl5BanBnXkFtZTgwNDM5NzA2MzE@._V1_SX300.jpg");
 		flash1_9.setrating("9.5");
 		flash1_9.setplot("Iris and Eddie take their relationship to the next level. Barry faces his rival finally. A ghost of Caitlyn's past returns. Cisco is asked for help. And there is a secret traitor among these people.");
 		flash1_9.setdirector("Ralph Hemecker");
 		flash1_9.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Todd Helbing, Aaron Helbing");
 		flash1_9.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_9.setyear("2014");
 		flash1_9.setgenre("Action, Adventure, Drama");
 		flash1_9.setruntime("45 min");
 		flash1_9.setwatched("0");
 		movies.add(flash1_9);
		
 		Movielist flash1_10 = new Movielist();
 		flash1_10.setseries("Flash");
 		flash1_10.settitle("Revenge of the Rogues");
 		flash1_10.setseason("1");
 		flash1_10.setepisode("10");
 		flash1_10.setposter("http://ia.media-imdb.com/images/M/MV5BMjI4MTI5MjAyOF5BMl5BanBnXkFtZTgwOTU1NzkwNDE@._V1_SX300.jpg");
 		flash1_10.setrating("8.4");
 		flash1_10.setplot("As Barry is struggling to train his speed in order to beat Reverse Flash, his old friend, Captain Cold, returns to Central City with the help of a new villain, Heat Wave.");
 		flash1_10.setdirector("Nick Copus");
 		flash1_10.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Kai Wu, Geoff Johns");
 		flash1_10.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_10.setyear("2015");
 		flash1_10.setgenre("Action, Adventure, Drama");
 		flash1_10.setruntime("43 min");
 		flash1_10.setwatched("0");
 		movies.add(flash1_10);
		
 		Movielist flash1_11 = new Movielist();
 		flash1_11.setseries("Flash");
 		flash1_11.settitle("The Sound and the Fury");
 		flash1_11.setseason("1");
 		flash1_11.setepisode("11");
 		flash1_11.setposter("http://ia.media-imdb.com/images/M/MV5BMTg2MzY0NzExN15BMl5BanBnXkFtZTgwODkzODgxNDE@._V1_SX300.jpg");
 		flash1_11.setrating("8.5");
 		flash1_11.setplot("After his encounter with The Rogues, Barry must face off against a new villain, Pied Piper.");
 		flash1_11.setdirector("John F. Showalter");
 		flash1_11.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Alison Schapker, Brooke Roberts");
 		flash1_11.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_11.setyear("2015");
 		flash1_11.setgenre("Action, Adventure, Drama");
 		flash1_11.setruntime("42 min");
 		flash1_11.setwatched("0");
 		movies.add(flash1_11);
		
 		Movielist flash1_12 = new Movielist();
 		flash1_12.setseries("Flash");
 		flash1_12.settitle("Crazy for You");
 		flash1_12.setseason("1");
 		flash1_12.setepisode("12");
 		flash1_12.setposter("http://ia.media-imdb.com/images/M/MV5BMjM4NTEyNjQyNl5BMl5BanBnXkFtZTgwNTcxMzIzNDE@._V1_SX300.jpg");
 		flash1_12.setrating("8.6");
 		flash1_12.setplot("Caitlin brings Barry out to a karaoke bar, hoping they both meet someone new; Cisco thinks about Hartley's dangerous proposition; Henry's snooping gets him into trouble.");
 		flash1_12.setdirector("Rob Hardy");
 		flash1_12.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Aaron Helbing, Todd Helbing");
 		flash1_12.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_12.setyear("2015");
 		flash1_12.setgenre("Action, Adventure, Drama");
 		flash1_12.setruntime("42 min");
 		flash1_12.setwatched("0");
 		movies.add(flash1_12);
		
 		Movielist flash1_13 = new Movielist();
 		flash1_13.setseries("Flash");
 		flash1_13.settitle("The Nuclear Man");
 		flash1_13.setseason("1");
 		flash1_13.setepisode("13");
 		flash1_13.setposter("http://ia.media-imdb.com/images/M/MV5BMjA4OTgyNzA1Ml5BMl5BanBnXkFtZTgwMTI3OTkzNDE@._V1_SX300.jpg");
 		flash1_13.setrating("8.8");
 		flash1_13.setplot("After Ronnie attacks a physicist, Barry and the team go after him. Joe enlists Cisco's help in the reinvestigation of Nora Allen's murder. Barry struggles with his relationship and his duties as The Flash.");
 		flash1_13.setdirector("Glen Winter");
 		flash1_13.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg, Katherine Walczak");
 		flash1_13.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_13.setyear("2015");
 		flash1_13.setgenre("Action, Adventure, Drama");
 		flash1_13.setruntime("42 min");
 		flash1_13.setwatched("0");
 		movies.add(flash1_13);
		
 		Movielist flash1_14 = new Movielist();
 		flash1_14.setseries("Flash");
 		flash1_14.settitle("Fallout");
 		flash1_14.setseason("1");
 		flash1_14.setepisode("14");
 		flash1_14.setposter("http://ia.media-imdb.com/images/M/MV5BODYwNjY1NDc4Nl5BMl5BanBnXkFtZTgwNjMyMDg0NDE@._V1_SX300.jpg");
 		flash1_14.setrating("9.0");
 		flash1_14.setplot("After the nuclear explosion separates Ronnie and Dr. Stein, Barry and the team believe both men are safe. Barry gets some important information about time travel.");
 		flash1_14.setdirector("Stephen Surjik");
 		flash1_14.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Keto Shimizu, Ben Sokolowski");
 		flash1_14.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_14.setyear("2015");
 		flash1_14.setgenre("Action, Adventure, Drama");
 		flash1_14.setruntime("43 min");
 		flash1_14.setwatched("0");
 		movies.add(flash1_14);
		
 		Movielist flash1_15 = new Movielist();
 		flash1_15.setseries("Flash");
 		flash1_15.settitle("Out of Time");
 		flash1_15.setseason("1");
 		flash1_15.setepisode("15");
 		flash1_15.setposter("http://ia.media-imdb.com/images/M/MV5BMTU5Nzk5MzQxN15BMl5BanBnXkFtZTgwMTc0NDM4NDE@._V1_SX300.jpg");
 		flash1_15.setrating("9.8");
 		flash1_15.setplot("Mark Mardon, having survived his apparent death during the black-matter explosion, returns seeking revenge on Joe for the death of his brother Clyde and has the same weather-manipulation powers as his deceased sibling.");
 		flash1_15.setdirector("Thor Freudenthal");
 		flash1_15.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Todd Helbing, Aaron Helbing");
 		flash1_15.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_15.setyear("2015");
 		flash1_15.setgenre("Action, Adventure, Drama");
 		flash1_15.setruntime("43 min");
 		flash1_15.setwatched("0");
 		movies.add(flash1_15);
		
 		Movielist flash1_16 = new Movielist();
 		flash1_16.setseries("Flash");
 		flash1_16.settitle("Rogue Time");
 		flash1_16.setseason("1");
 		flash1_16.setepisode("16");
 		flash1_16.setposter("http://ia.media-imdb.com/images/M/MV5BMTk0NTYyMDg1OV5BMl5BanBnXkFtZTgwNzY3NDM4NDE@._V1_SX300.jpg");
 		flash1_16.setrating("8.6");
 		flash1_16.setplot("The Flash learns that Captain Cold and Heat Wave have returned to Central City. This time Snart has brought along his baby sister Lisa aka Golden Glider to help wreak havoc on the city.");
 		flash1_16.setdirector("John Behring");
 		flash1_16.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Brooke Roberts (teleplay by), Kai Wu (teleplay by), Grainne Godfree (story)");
 		flash1_16.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_16.setyear("2015");
 		flash1_16.setgenre("Action, Adventure, Drama");
 		flash1_16.setruntime("40 min");
 		flash1_16.setwatched("0");
 		movies.add(flash1_16);
		
 		Movielist flash1_17 = new Movielist();
 		flash1_17.setseries("Flash");
 		flash1_17.settitle("Tricksters");
 		flash1_17.setseason("1");
 		flash1_17.setepisode("17");
 		flash1_17.setposter("http://ia.media-imdb.com/images/M/MV5BMTgxNDE2NTAyNF5BMl5BanBnXkFtZTgwNDc3MTExNTE@._V1_SX300.jpg");
 		flash1_17.setrating("9.3");
 		flash1_17.setplot("A copy-cat-killer who goes by the name The Trickster starts setting off bombs in Central City. In order to stop the villain, Barry and Joe meet with the original Trickster, a criminal ...");
 		flash1_17.setdirector("Ralph Hemecker");
 		flash1_17.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg");
 		flash1_17.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_17.setyear("2015");
 		flash1_17.setgenre("Action, Adventure, Drama");
 		flash1_17.setruntime("40 min");
 		flash1_17.setwatched("0");
 		movies.add(flash1_17);
		
 		Movielist flash1_18 = new Movielist();
 		flash1_18.setseries("Flash");
 		flash1_18.settitle("All Star Team Up");
 		flash1_18.setseason("1");
 		flash1_18.setepisode("18");
 		flash1_18.setposter("http://ia.media-imdb.com/images/M/MV5BOTU2NDI3OTkyNV5BMl5BanBnXkFtZTgwMTA1MjIyNTE@._V1_SX300.jpg");
 		flash1_18.setrating("8.5");
 		flash1_18.setplot("Felicity Smoak and Ray come to Central City seeking help with Ray's suit; a meta-human releases deadly robotic bees; a group dinner does not go as planned.");
 		flash1_18.setdirector("Kevin Tancharoen");
 		flash1_18.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Grainne Godfree, Kai Wu");
 		flash1_18.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_18.setyear("2015");
 		flash1_18.setgenre("Action, Adventure, Drama");
 		flash1_18.setruntime("40 min");
 		flash1_18.setwatched("0");
 		movies.add(flash1_18);
		
 		Movielist flash1_19 = new Movielist();
 		flash1_19.setseries("Flash");
 		flash1_19.settitle("Who Is Harrison Wells?");
 		flash1_19.setseason("1");
 		flash1_19.setepisode("19");
 		flash1_19.setposter("http://ia.media-imdb.com/images/M/MV5BMjAxMzA2MzAxMl5BMl5BanBnXkFtZTgwOTM1MzI0NTE@._V1_SX300.jpg");
 		flash1_19.setrating("9.1");
 		flash1_19.setplot("Joe and Cisco visit Starling City and ask Captain Lance for help with their investigation into Dr. Wells; Laurel asks Cisco for a favor; Barry faces a new foe who can disguise himself into anyone he touches.");
 		flash1_19.setdirector("Wendey Stanzler");
 		flash1_19.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Ray Utarnachitt, Cortney Norris");
 		flash1_19.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_19.setyear("2015");
 		flash1_19.setgenre("Action, Adventure, Drama");
 		flash1_19.setruntime("42 min");
 		flash1_19.setwatched("0");
 		movies.add(flash1_19);
		
 		Movielist flash1_20 = new Movielist();
 		flash1_20.setseries("Flash");
 		flash1_20.settitle("The Trap");
 		flash1_20.setseason("1");
 		flash1_20.setepisode("20");
 		flash1_20.setposter("http://ia.media-imdb.com/images/M/MV5BMjE5MTk4MTc3NV5BMl5BanBnXkFtZTgwNDA0OTA1NTE@._V1_SX300.jpg");
 		flash1_20.setrating("9.5");
 		flash1_20.setplot("Barry, Caitlin, Cisco, and Joe set a trap for Wells. Cisco uses himself as bait which puts him in great danger. Meanwhile, Eddie makes a decision regarding Iris, which leaves Joe a bit unsettled.");
 		flash1_20.setdirector("Steve Shill");
 		flash1_20.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Alison Schapker, Brooke Roberts");
 		flash1_20.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_20.setyear("2015");
 		flash1_20.setgenre("Action, Adventure, Drama");
 		flash1_20.setruntime("42 min");
 		flash1_20.setwatched("0");
 		movies.add(flash1_20);
		
 		Movielist flash1_21 = new Movielist();
 		flash1_21.setseries("Flash");
 		flash1_21.settitle("Grodd Lives");
 		flash1_21.setseason("1");
 		flash1_21.setepisode("21");
 		flash1_21.setposter("http://ia.media-imdb.com/images/M/MV5BMTQzMTk3MzI3OF5BMl5BanBnXkFtZTgwMTg0OTA1NTE@._V1_SX300.jpg");
 		flash1_21.setrating("8.7");
 		flash1_21.setplot("Barry deals with the latest threat from the Reverse-Flash; Dr. Wells distracts the team by releasing Grodd on the city; Iris and Barry have a serious talk.");
 		flash1_21.setdirector("Dermott Downs");
 		flash1_21.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Grainne Godfree, Kai Wu");
 		flash1_21.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_21.setyear("2015");
 		flash1_21.setgenre("Action, Adventure, Drama");
 		flash1_21.setruntime("43 min");
 		flash1_21.setwatched("0");
 		movies.add(flash1_21);
		
 		Movielist flash1_22 = new Movielist();
 		flash1_22.setseries("Flash");
 		flash1_22.settitle("Rogue Air");
 		flash1_22.setseason("1");
 		flash1_22.setepisode("22");
 		flash1_22.setposter("http://ia.media-imdb.com/images/M/MV5BMTczNzE5NjU1Nl5BMl5BanBnXkFtZTgwOTM4MzI2NTE@._V1_SX300.jpg");
 		flash1_22.setrating("9.3");
 		flash1_22.setplot("Dr. Wells reactivates the particle accelerator and Barry has to move the Meta humans away. To do that, he needs help and he chooses to ask Captain Cold for it.");
 		flash1_22.setdirector("Douglas Aarniokoski");
 		flash1_22.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Aaron Helbing, Todd Helbing");
 		flash1_22.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_22.setyear("2015");
 		flash1_22.setgenre("Action, Adventure, Drama");
 		flash1_22.setruntime("43 min");
 		flash1_22.setwatched("0");
 		movies.add(flash1_22);
		
 		Movielist flash1_23 = new Movielist();
 		flash1_23.setseries("Flash");
 		flash1_23.settitle("Fast Enough");
 		flash1_23.setseason("1");
 		flash1_23.setepisode("23");
 		flash1_23.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ5MzM1MDAzOV5BMl5BanBnXkFtZTgwOTA0MzQ3NTE@._V1_SX300.jpg");
 		flash1_23.setrating("9.7");
 		flash1_23.setplot("When the particle accelerator is back online, Barry will have to go back in time to stop Eobard Thawne on the night of his mother's murder 15 years ago.");
 		flash1_23.setdirector("Dermott Downs");
 		flash1_23.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Gabrielle G. Stanton (teleplay by), Andrew Kreisberg (teleplay by), Greg Berlanti (story), Andrew Kreisberg (story)");
 		flash1_23.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Rick Cosnett");
 		flash1_23.setyear("2015");
 		flash1_23.setgenre("Action, Adventure, Drama");
 		flash1_23.setruntime("45 min");
 		flash1_23.setwatched("0");
 		movies.add(flash1_23);
		
 		Movielist flash2_1 = new Movielist();
 		flash2_1.setseries("Flash");
 		flash2_1.settitle("The Man Who Saved Central City");
 		flash2_1.setseason("2");
 		flash2_1.setepisode("1");
 		flash2_1.setposter("http://ia.media-imdb.com/images/M/MV5BMTU2MDcyNDkyNl5BMl5BanBnXkFtZTgwNjIyMTM5NjE@._V1_SX300.jpg");
 		flash2_1.setrating("8.6");
 		flash2_1.setplot("Still feeling responsible for Eddie's death, Barry pushes his friends away and tries to protect the city on his own; Cisco assists Joe with the Meta Task Force.");
 		flash2_1.setdirector("Ralph Hemecker");
 		flash2_1.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg (teleplay by), Gabrielle G. Stanton (teleplay by), Greg Berlanti (story), Andrew Kreisberg (story), Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_1.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_1.setyear("2015");
 		flash2_1.setgenre("Action, Adventure, Drama");
 		flash2_1.setruntime("43 min");
 		flash2_1.setwatched("0");
 		movies.add(flash2_1);
		
 		Movielist flash2_2 = new Movielist();
 		flash2_2.setseries("Flash");
 		flash2_2.settitle("Flash of Two Worlds");
 		flash2_2.setseason("2");
 		flash2_2.setepisode("2");
 		flash2_2.setposter("http://ia.media-imdb.com/images/M/MV5BMTA0MzI2NDMyMjJeQTJeQWpwZ15BbWU4MDM3MjA1OTYx._V1_SX300.jpg");
 		flash2_2.setrating("9.0");
 		flash2_2.setplot("A mysterious man has a warning about an evil speedster intent on destroying The Flash; a determined officer wants to join Joe's meta-human task force.");
 		flash2_2.setdirector("Jesse Warn");
 		flash2_2.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Aaron Helbing, Todd Helbing, Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_2.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_2.setyear("2015");
 		flash2_2.setgenre("Action, Adventure, Drama");
 		flash2_2.setruntime("43 min");
 		flash2_2.setwatched("0");
 		movies.add(flash2_2);
		
 		Movielist flash2_3 = new Movielist();
 		flash2_3.setseries("Flash");
 		flash2_3.settitle("Family of Rogues");
 		flash2_3.setseason("2");
 		flash2_3.setepisode("3");
 		flash2_3.setposter("http://ia.media-imdb.com/images/M/MV5BMjMyNzAxMzE3M15BMl5BanBnXkFtZTgwOTE2NjgwNzE@._V1_SX300.jpg");
 		flash2_3.setrating("8.6");
 		flash2_3.setplot("Barry and the team ally with the kidnapped Captain Cold's sister, but Barry feels duped with he learns Snart is working on something with his father; Joe faces a difficult decision.");
 		flash2_3.setdirector("John F. Showalter");
 		flash2_3.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Julian Meiojas, Katherine Walczak, Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_3.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_3.setyear("2015");
 		flash2_3.setgenre("Action, Adventure, Drama");
 		flash2_3.setruntime("43 min");
 		flash2_3.setwatched("0");
 		movies.add(flash2_3);
		
 		Movielist flash2_4 = new Movielist();
 		flash2_4.setseries("Flash");
 		flash2_4.settitle("The Fury of Firestorm");
 		flash2_4.setseason("2");
 		flash2_4.setepisode("4");
 		flash2_4.setposter("http://ia.media-imdb.com/images/M/MV5BMjAzOTYxNTA1Ml5BMl5BanBnXkFtZTgwMDY5MTgxNzE@._V1_SX300.jpg");
 		flash2_4.setrating("8.6");
 		flash2_4.setplot("Barry and the team look for another Firestorm match for Dr. Stein. When the team meets Jefferson Jackson, Caitlin has her reservations about whether Jax is the right match for Dr. Stein. ...");
 		flash2_4.setdirector("Stefan Pleszczynski");
 		flash2_4.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Kai Wu, Joe Peracchio");
 		flash2_4.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_4.setyear("2015");
 		flash2_4.setgenre("Action, Adventure, Drama");
 		flash2_4.setruntime("42 min");
 		flash2_4.setwatched("0");
 		movies.add(flash2_4);
		
 		Movielist flash2_5 = new Movielist();
 		flash2_5.setseries("Flash");
 		flash2_5.settitle("The Darkness and the Light");
 		flash2_5.setseason("2");
 		flash2_5.setepisode("5");
 		flash2_5.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ3NjU4MTk5MF5BMl5BanBnXkFtZTgwNTEwMjgxNzE@._V1_SX300.jpg");
 		flash2_5.setrating("9.0");
 		flash2_5.setplot("Barry learns a new breacher, Dr. Light, has come through the portal and sets off to capture her. Jay tells Barry that Dr. Light was not a threat on Earth-2 and that Barry can reason with ...");
 		flash2_5.setdirector("Steve Shill");
 		flash2_5.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Ben Sokolowski, Grainne Godfree, Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_5.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_5.setyear("2015");
 		flash2_5.setgenre("Action, Adventure, Drama");
 		flash2_5.setruntime("42 min");
 		flash2_5.setwatched("0");
 		movies.add(flash2_5);
		
 		Movielist flash2_6 = new Movielist();
 		flash2_6.setseries("Flash");
 		flash2_6.settitle("Episode #2.6");
 		flash2_6.setseason("2");
 		flash2_6.setepisode("6");
 		flash2_6.setposter("http://ia.media-imdb.com/images/M/MV5BMTQ5MzY5ODE5M15BMl5BanBnXkFtZTgwNzU4OTM1MjE@._V1_SX300.jpg");
 		flash2_6.setrating("N/A");
 		flash2_6.setplot("N/A");
 		flash2_6.setdirector("N/A");
 		flash2_6.setwriter("N/A");
 		flash2_6.setactors("Grant Gustin, Tom Cavanagh, Jesse L. Martin, Danielle Panabaker");
 		flash2_6.setyear("2015");
 		flash2_6.setgenre("Action, Adventure, Drama");
 		flash2_6.setruntime("43 min");
 		flash2_6.setwatched("0");
 		movies.add(flash2_6);
		
 		Movielist flash2_7 = new Movielist();
 		flash2_7.setseries("Flash");
 		flash2_7.settitle("Gorilla Warfare");
 		flash2_7.setseason("2");
 		flash2_7.setepisode("7");
 		flash2_7.setposter("http://ia.media-imdb.com/images/M/MV5BMTg3Njg0Mzc1OF5BMl5BanBnXkFtZTgwNjQ5NzUyNzE@._V1_SX300.jpg");
 		flash2_7.setrating("8.5");
 		flash2_7.setplot("Barry races to rescue Caitlyn when Grodd kidnaps her; Cisco plans a date with the new barista at Jitters; Patty thinks Barry is hiding something.");
 		flash2_7.setdirector("Dermott Downs");
 		flash2_7.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Aaron Helbing, Todd Helbing, Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_7.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_7.setyear("2015");
 		flash2_7.setgenre("Action, Adventure, Drama");
 		flash2_7.setruntime("42 min");
 		flash2_7.setwatched("0");
 		movies.add(flash2_7);
		
 		Movielist flash2_8 = new Movielist();
 		flash2_8.setseries("Flash");
 		flash2_8.settitle("Episode #2.8");
 		flash2_8.setseason("2");
 		flash2_8.setepisode("8");
 		flash2_8.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_8.setrating("N/A");
 		flash2_8.setplot("N/A");
 		flash2_8.setdirector("Ralph Hemecker");
 		flash2_8.setwriter("Greg Berlanti (creator), Greg Berlanti, Geoff Johns (creator), Geoff Johns, Andrew Kreisberg (creator), Andrew Kreisberg (story), Beth Schwartz");
 		flash2_8.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_8.setyear("2015");
 		flash2_8.setgenre("Action, Adventure, Drama");
 		flash2_8.setruntime("43 min");
 		flash2_8.setwatched("0");
 		movies.add(flash2_8);
		
 		Movielist flash2_9 = new Movielist();
 		flash2_9.setseries("Flash");
 		flash2_9.settitle("Running to Stand Still");
 		flash2_9.setseason("2");
 		flash2_9.setepisode("9");
 		flash2_9.setposter("http://ia.media-imdb.com/images/M/MV5BMzY0OTY0OTg3OF5BMl5BanBnXkFtZTgwOTMyNjQ0NzE@._V1_SX300.jpg");
 		flash2_9.setrating("8.9");
 		flash2_9.setplot("Weather Wizard returns to break Captain Cold and The Trickster out of Iron Heights, but Barry is determined to not let that happen. Meanwhile, Joe and Iris meet Wally West. Harrison Wells accepts to work with Zoom against Barry.");
 		flash2_9.setdirector("Kevin Tancharoen");
 		flash2_9.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), Andrew Kreisberg, Grainne Godfree (executive story editor), Kai Wu (executive story editor), Brooke Roberts (story)");
 		flash2_9.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_9.setyear("2015");
 		flash2_9.setgenre("Action, Adventure, Drama");
 		flash2_9.setruntime("42 min");
 		flash2_9.setwatched("0");
 		movies.add(flash2_9);
		
 		Movielist flash2_10 = new Movielist();
 		flash2_10.setseries("Flash");
 		flash2_10.settitle("Episode #2.10");
 		flash2_10.setseason("2");
 		flash2_10.setepisode("10");
 		flash2_10.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_10.setrating("N/A");
 		flash2_10.setplot("N/A");
 		flash2_10.setdirector("N/A");
 		flash2_10.setwriter("Greg Berlanti (creator)");
 		flash2_10.setactors("Candice Patton, Demore Barnes, Violett Beane, Tom Cavanagh");
 		flash2_10.setyear("2015");
 		flash2_10.setgenre("Action, Adventure, Drama");
 		flash2_10.setruntime("43 min");
 		flash2_10.setwatched("0");
 		movies.add(flash2_10);
		
 		Movielist flash2_11 = new Movielist();
 		flash2_11.setseries("Flash");
 		flash2_11.settitle("The Reverse-Flash Returns");
 		flash2_11.setseason("2");
 		flash2_11.setepisode("11");
 		flash2_11.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_11.setrating("N/A");
 		flash2_11.setplot("N/A");
 		flash2_11.setdirector("Michael A. Allowitz");
 		flash2_11.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by)");
 		flash2_11.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_11.setyear("2016");
 		flash2_11.setgenre("Action, Adventure, Drama");
 		flash2_11.setruntime("43 min");
 		flash2_11.setwatched("0");
 		movies.add(flash2_11);
		
 		Movielist flash2_12 = new Movielist();
 		flash2_12.setseries("Flash");
 		flash2_12.settitle("Episode #2.12");
 		flash2_12.setseason("2");
 		flash2_12.setepisode("12");
 		flash2_12.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_12.setrating("N/A");
 		flash2_12.setplot("N/A");
 		flash2_12.setdirector("Rachel Talalay");
 		flash2_12.setwriter("Greg Berlanti (developed by), Andrew Kreisberg (developed by), Geoff Johns (developed by), David Kob (staff writer)");
 		flash2_12.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_12.setyear("2016");
 		flash2_12.setgenre("Action, Adventure, Drama");
 		flash2_12.setruntime("43 min");
 		flash2_12.setwatched("0");
 		movies.add(flash2_12);
		
 		Movielist flash2_13 = new Movielist();
 		flash2_13.setseries("Flash");
 		flash2_13.settitle("Episode #2.13");
 		flash2_13.setseason("2");
 		flash2_13.setepisode("13");
 		flash2_13.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_13.setrating("N/A");
 		flash2_13.setplot("N/A");
 		flash2_13.setdirector("N/A");
 		flash2_13.setwriter("Greg Berlanti (creator), Geoff Johns (creator), Andrew Kreisberg (creator)");
 		flash2_13.setactors("Grant Gustin, Tom Cavanagh, Keiynan Lonsdale, Jesse L. Martin");
 		flash2_13.setyear("2016");
 		flash2_13.setgenre("Action, Adventure, Drama");
 		flash2_13.setruntime("43 min");
 		flash2_13.setwatched("0");
 		movies.add(flash2_13);
		
 		Movielist flash2_14 = new Movielist();
 		flash2_14.setseries("Flash");
 		flash2_14.settitle("Episode #2.14");
 		flash2_14.setseason("2");
 		flash2_14.setepisode("14");
 		flash2_14.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_14.setrating("N/A");
 		flash2_14.setplot("N/A");
 		flash2_14.setdirector("N/A");
 		flash2_14.setwriter("Greg Berlanti (creator), Geoff Johns (creator)");
 		flash2_14.setactors("Grant Gustin, Demore Barnes, Violett Beane, Tom Cavanagh");
 		flash2_14.setyear("2016");
 		flash2_14.setgenre("Action, Adventure, Drama");
 		flash2_14.setruntime("43 min");
 		flash2_14.setwatched("0");
 		movies.add(flash2_14);
		
 		Movielist flash2_15 = new Movielist();
 		flash2_15.setseries("Flash");
 		flash2_15.settitle("Episode #2.15");
 		flash2_15.setseason("2");
 		flash2_15.setepisode("15");
 		flash2_15.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_15.setrating("N/A");
 		flash2_15.setplot("N/A");
 		flash2_15.setdirector("N/A");
 		flash2_15.setwriter("Greg Berlanti (creator), Geoff Johns (creator)");
 		flash2_15.setactors("Grant Gustin, Demore Barnes, Violett Beane, Tom Cavanagh");
 		flash2_15.setyear("2016");
 		flash2_15.setgenre("Action, Adventure, Drama");
 		flash2_15.setruntime("43 min");
 		flash2_15.setwatched("0");
 		movies.add(flash2_15);
		
 		Movielist flash2_16 = new Movielist();
 		flash2_16.setseries("Flash");
 		flash2_16.settitle("Episode #2.16");
 		flash2_16.setseason("2");
 		flash2_16.setepisode("16");
 		flash2_16.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_16.setrating("N/A");
 		flash2_16.setplot("N/A");
 		flash2_16.setdirector("N/A");
 		flash2_16.setwriter("Greg Berlanti (creator), Geoff Johns (creator)");
 		flash2_16.setactors("Grant Gustin, Demore Barnes, Violett Beane, Tom Cavanagh");
 		flash2_16.setyear("2016");
 		flash2_16.setgenre("Action, Adventure, Drama");
 		flash2_16.setruntime("43 min");
 		flash2_16.setwatched("0");
 		movies.add(flash2_16);
		
 		Movielist flash2_17 = new Movielist();
 		flash2_17.setseries("Flash");
 		flash2_17.settitle("Episode #2.17");
 		flash2_17.setseason("2");
 		flash2_17.setepisode("17");
 		flash2_17.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_17.setrating("N/A");
 		flash2_17.setplot("N/A");
 		flash2_17.setdirector("N/A");
 		flash2_17.setwriter("N/A");
 		flash2_17.setactors("Grant Gustin, Demore Barnes, Violett Beane, Tom Cavanagh");
 		flash2_17.setyear("2016");
 		flash2_17.setgenre("Action, Adventure, Drama");
 		flash2_17.setruntime("43 min");
 		flash2_17.setwatched("0");
 		movies.add(flash2_17);
		
 		Movielist flash2_18 = new Movielist();
 		flash2_18.setseries("Flash");
 		flash2_18.settitle("Episode #2.18");
 		flash2_18.setseason("2");
 		flash2_18.setepisode("18");
 		flash2_18.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_18.setrating("N/A");
 		flash2_18.setplot("N/A");
 		flash2_18.setdirector("N/A");
 		flash2_18.setwriter("Andrew Kreisberg (creator)");
 		flash2_18.setactors("Grant Gustin, Tom Cavanagh, Keiynan Lonsdale, Jesse L. Martin");
 		flash2_18.setyear("2016");
 		flash2_18.setgenre("Action, Adventure, Drama");
 		flash2_18.setruntime("43 min");
 		flash2_18.setwatched("0");
 		movies.add(flash2_18);
		
 		Movielist flash2_19 = new Movielist();
 		flash2_19.setseries("Flash");
 		flash2_19.settitle("Episode #2.19");
 		flash2_19.setseason("2");
 		flash2_19.setepisode("19");
 		flash2_19.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_19.setrating("N/A");
 		flash2_19.setplot("N/A");
 		flash2_19.setdirector("N/A");
 		flash2_19.setwriter("Greg Berlanti, Geoff Johns, Andrew Kreisberg (creator)");
 		flash2_19.setactors("Grant Gustin, Candice Patton, Danielle Panabaker, Carlos Valdes");
 		flash2_19.setyear("2016");
 		flash2_19.setgenre("Action, Adventure, Drama");
 		flash2_19.setruntime("43 min");
 		flash2_19.setwatched("0");
 		movies.add(flash2_19);
		
 		Movielist flash2_20 = new Movielist();
 		flash2_20.setseries("Flash");
 		flash2_20.settitle("Episode #2.20");
 		flash2_20.setseason("2");
 		flash2_20.setepisode("20");
 		flash2_20.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_20.setrating("N/A");
 		flash2_20.setplot("N/A");
 		flash2_20.setdirector("N/A");
 		flash2_20.setwriter("Greg Berlanti, Geoff Johns, Andrew Kreisberg (creator)");
 		flash2_20.setactors("N/A");
 		flash2_20.setyear("2016");
 		flash2_20.setgenre("Action, Adventure, Drama");
 		flash2_20.setruntime("43 min");
 		flash2_20.setwatched("0");
 		movies.add(flash2_20);
		
 		Movielist flash2_21 = new Movielist();
 		flash2_21.setseries("Flash");
 		flash2_21.settitle("Episode #2.21");
 		flash2_21.setseason("2");
 		flash2_21.setepisode("21");
 		flash2_21.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_21.setrating("N/A");
 		flash2_21.setplot("N/A");
 		flash2_21.setdirector("N/A");
 		flash2_21.setwriter("N/A");
 		flash2_21.setactors("N/A");
 		flash2_21.setyear("2016");
 		flash2_21.setgenre("Action, Adventure, Drama");
 		flash2_21.setruntime("43 min");
 		flash2_21.setwatched("0");
 		movies.add(flash2_21);
		
 		Movielist flash2_22 = new Movielist();
 		flash2_22.setseries("Flash");
 		flash2_22.settitle("Episode #2.22");
 		flash2_22.setseason("2");
 		flash2_22.setepisode("22");
 		flash2_22.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_22.setrating("N/A");
 		flash2_22.setplot("N/A");
 		flash2_22.setdirector("N/A");
 		flash2_22.setwriter("N/A");
 		flash2_22.setactors("N/A");
 		flash2_22.setyear("2016");
 		flash2_22.setgenre("Action, Adventure, Drama");
 		flash2_22.setruntime("43 min");
 		flash2_22.setwatched("0");
 		movies.add(flash2_22);
		
 		Movielist flash2_23 = new Movielist();
 		flash2_23.setseries("Flash");
 		flash2_23.settitle("Episode #2.23");
 		flash2_23.setseason("2");
 		flash2_23.setepisode("23");
 		flash2_23.setposter("http://ia.media-imdb.com/images/M/MV5BNjAwNzkxNzAwNF5BMl5BanBnXkFtZTgwODg2NTc2NjE@._V1_SX300.jpg");
 		flash2_23.setrating("N/A");
 		flash2_23.setplot("N/A");
 		flash2_23.setdirector("N/A");
 		flash2_23.setwriter("N/A");
 		flash2_23.setactors("N/A");
 		flash2_23.setyear("2016");
 		flash2_23.setgenre("Action, Adventure, Drama");
 		flash2_23.setruntime("43 min");
 		flash2_23.setwatched("0");
 		movies.add(flash2_23);
		
	} 

public String getseries() { 
return series;}

public void setseries(String series){ 
this.series = series;}

public String gettitle() { 
return title;}

public void settitle(String title){ 
this.title = title;}

public String getseason() { 
return season;}

public void setseason(String season){ 
this.season = season;}

public String getepisode() { 
return episode;}

public void setepisode(String episode){ 
this.episode = episode;}

public String getposter() { 
return poster;}

public void setposter(String poster){ 
this.poster = poster;}

public String getplot() { 
return plot;}

public void setplot(String plot){ 
this.plot = plot;}

public String getwriter() { 
return writer;}

public void setwriter(String writer){ 
this.writer = writer;}

public String getdirector() { 
return director;}

public void setdirector(String director){ 
this.director = director;}

public String getruntime() { 
return runtime;}

public void setruntime(String runtime){ 
this.runtime = runtime;}

public String getyear() { 
return year;}

public void setyear(String year){ 
this.year = year;}

public String getactors() { 
return actors;}

public void setactors(String actors){ 
this.actors = actors;}

public String getgenre() { 
return genre;}

public void setgenre(String genre){ 
this.genre = genre;}

public String getrating() { 
return rating;}

public void setrating(String rating){ 
this.rating = rating;}

public String getwatched() { 
return watched;}

public void setwatched(String watched){ 
this.watched = watched;}

}