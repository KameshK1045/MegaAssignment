package classes;

public class Page {
       
	String pages[] = {"Short notes are quick to write and correct,"
						+ " tightly focused, and easy to review, and can be read "
						+ "(and comprehended) rapidly; therefore, they have the potential to reach a wide audience.",
						"Making short notes helps a lot during revision sessions, especially in class 12, when you need to revise a big topic in say, 2 hours. "
						+ "You can't read the entire book. You can read the short notes and then directly go for problem-solving.",
						"The toppers usually make their own note and revise the topic from that note itself. This also implies that they make notes throughout the year and keep on "
						+ "revising in certain spaced intervals to get everything into their brain swiftly.",
						"The truth is that many studies suggest that class valedictorians and toppers rarely become millionaires and successful people.",
						"Make good notes and revise them frequently\n"
						+ "\n"
						+ "    Create a small notebook or diary for all formulae & theoretical concepts which you would need to remember or memorise\n"
						+ "    Have long notes\n"
						+ "    Have short notes\n"
						+ "    Have bullet points"};
	
	public void printPages(int a) {
		System.out.println(pages[a-1]);
	}
}
