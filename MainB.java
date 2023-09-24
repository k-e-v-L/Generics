/* pseudo code to show how useful generics actually is!
public class MainB {
    public static void main(String[] args) {

        Player player = new player();
        Enemy enemy = new enemy();
        Item item = new item();
        Tree tree = new tree();

        draw(player);
        draw(enemy);
        draw(item);
        draw(tree);
    }

    private static <Thing> void draw(Thing x) {
        x.draw();
    }
}
*/