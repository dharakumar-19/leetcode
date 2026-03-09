class BrowserHistory {

    class Node {
        String url;
        Node next;
        Node prev;

        Node(String url) {
            this.url = url;
        }
    }

    Node cur;

    public BrowserHistory(String homepage) {
        cur = new Node(homepage);
    }

    public void visit(String url) {
        Node nn = new Node(url);

        cur.next = nn;
        nn.prev = cur;

        cur = nn;
    }

    public String back(int steps) {
        while (steps > 0 && cur.prev != null) {
            cur = cur.prev;
            steps--;
        }
        return cur.url;
    }

    public String forward(int steps) {
        while (steps > 0 && cur.next != null) {
            cur = cur.next;
            steps--;
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */