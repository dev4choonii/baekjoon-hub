import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int connectionComponentCount = 0;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {

            // code

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());

            Graph graph = new Graph(N);

            for (int i = 0; i < E; i++) {
                StringTokenizer e = new StringTokenizer(br.readLine());
                graph.addEdge(Integer.parseInt(e.nextToken()), Integer.parseInt(e.nextToken()));
            }

            for (int i = 1; i <= N; i++) {
                Node node = graph.nodes[i];
                if (!node.visited) {
                    graph.dfs(node.data);
                }
            }

            sb.append(connectionComponentCount);

            ////////////////////

            bw.write(sb.toString());
            bw.flush();
        }
    }

    static class Graph {
        Node[] nodes;

        public Graph(int size) {
            this.nodes = new Node[size+1];
            for (int i = 0; i < nodes.length; i++) {
                this.nodes[i] = new Node(i);
            }
        }

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];

            if (!n1.adjacentNodes.contains(n2)) {
                n1.adjacentNodes.add(n2);
            }

            if (!n2.adjacentNodes.contains(n1)) {
                n2.adjacentNodes.add(n1);
            }
        }

        void dfs(int index) {
            Stack<Node> stack = new Stack<>();
            Node root = nodes[index];
            stack.push(root);

            while (!stack.isEmpty()) {
                Node currentNode = stack.pop();
                currentNode.visited = true;
                for (Node adjacentNode : currentNode.adjacentNodes) {
                    if (!adjacentNode.visited) {
                        adjacentNode.visited = true;
                        stack.push(adjacentNode);
                    }
                }
            }

            connectionComponentCount++;
        }
    }

    static class Node {
        int data;
        ArrayList<Node> adjacentNodes = new ArrayList<>();
        boolean visited;

        Node(int data) {
            this.data = data;
            this.visited = false;
        }
    }
}
