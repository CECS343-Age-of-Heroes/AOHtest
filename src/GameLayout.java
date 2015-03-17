
/**
 *
 * @author Kazunori
 */
public class GameLayout {
    public static void main(String[] args) {
        Player player1 = new Player("Billy","Norse");
        System.out.println(player1.getAge());
        player1.newAge();
        System.out.println(player1.getAge());
        player1.newAge();
        System.out.println(player1.getAge());
        player1.newAge();
        System.out.println(player1.getAge());
        player1.newAge();
        System.out.println(player1.getAge());
        player1.addCard("New Resource");
        player1.addResource("Wood");
        player1.addResource("Gold");
        player1.addResource("Grain");
        player1.addResource("Wood");
        player1.addResource("Grain");
        System.out.println(player1.resourceQuantity("Grain"));
    }
    

}
