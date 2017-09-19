package kr.ac.jbnu.se.advweb.gitplay0;

public class HelloGit {

	public static void main(String[] args) {
		System.out.println("Hello Git!!");
		System.out.println("Hello Git!!???????????");
		// hihihi
		// hohoho
		// Hello, git!
		// Commit
		// test complete!
		for(int i = 0;i < 100; i++)
		{
<<<<<<< HEAD
			System.out.println("i:" + i + "bbbbbbbbbbb");
=======
			System.out.println("i:" + i + "aaaaaaaaaaa");
>>>>>>> refs/remotes/origin/master
		}
		
		System.out.println("This is a confliction test.");
	}
}
