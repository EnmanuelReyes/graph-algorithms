package dfs.TopologicalOrdering;


import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: enmanuelreyes
 * Date: 2/24/19
 * Time: 1:56 AM
 */
public class TopologicalOrdering {


    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex vertex) {

        vertex.setVisited(true);
        for (Vertex v : vertex.getNeighbourList()) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }

        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return this.stack;
    }

}
