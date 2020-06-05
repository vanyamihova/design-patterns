package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 05.06.2020
 */
final class FileSystem {

    private List<Node> nodes;

    FileSystem() {
        this.nodes = new ArrayList<>();
    }

    void listNodes() {
        for (Node node : nodes) {
            node.showDetails();
        }
    }

    void addNode(Node node) {
        nodes.add(node);
    }

    void removeNode(Node node) {
        nodes.remove(node);
    }

}
