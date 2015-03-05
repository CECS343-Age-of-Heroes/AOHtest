

// comments go here
// test comment
// my name is matt
// another commit
// I hope this works

public class GameTestClass {

	public GameTestClass() {
		System.out.println("test game");
	}

	public static void main(String[] args) {
        System.out.println("Hello World!");
		new GameTestClass();
		System.out.println(Poop(3, 2));
	}

	public static int Poop(int x, int y) {
		return x + y;
	}
}
