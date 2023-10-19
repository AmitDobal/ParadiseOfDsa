package practice.problems.browser;

class Node {
	String data;
	Node next;
	Node prev;

	Node(String val) {
		this(val, null);
	}

	Node(String val, Node _next) {
		data = val;
		next = _next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
	}

	
}

public class BrowserHistory {
	Node homepage;
	Node curr;

	public BrowserHistory(String homepage) {
		this.homepage = new Node(homepage);
		curr = this.homepage;
	}

	public void visit(String url) {
		Node node = new Node(url);
		curr.next = node;
		node.prev = curr;
		curr = node;
	}

	public String back(int steps) {
		while (steps > 0 && curr != homepage) {
			curr = curr.prev;
			steps--;
		}
		return curr.data;
	}

	public String forward(int steps) {
		while (steps > 0 && curr.next != null) {
			curr = curr.next;
			steps--;
		}
		return curr.data;
	}
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage); obj.visit(url); String
 * param_2 = obj.back(steps); String param_3 = obj.forward(steps);
 */