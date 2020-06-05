package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class DirectoryNode implements Node {

    private String name;
    private List<Node> nodes;

    DirectoryNode(String name) {
        this.name = name;
        this.nodes = new ArrayList<>();
    }

    void addNode(Node node) {
        nodes.add(node);
    }

    void removeNode(Node node) {
        nodes.remove(node);
    }

    @Override
    public void showDetails() {
        System.out.print("Directory: \t\t /" + name + " ");
        if (nodes.isEmpty()) {
            System.out.print("It's empty. \n");
            return;
        }
        System.out.print("(" + nodes.size() + " items)\n");
        for (Node node : nodes) {
            System.out.print("-- ");
            node.showDetails();
        }
    }

}
