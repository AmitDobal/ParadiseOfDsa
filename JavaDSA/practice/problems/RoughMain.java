package practice.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoughMain {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(6);
		l.add(3);
		l.add(8);
		l.add(1);

		int m = 7;

		l.forEach(e -> {
			if (e < m) {
			}
		});
	}

	public ListNode sortList(ListNode head) {

		ListNode temp = head;

		List<Integer> list = new ArrayList<>();

		while (null != temp) {
			list.add(temp.val);
			temp = temp.next;
		}
		Collections.sort(list);

		ListNode newHead = null;
		ListNode p1 = newHead;

		list.forEach(val -> {
			ListNode node = new ListNode(val);
			if (newHead == null) {
//				newHead = node;
//				p1 = newHead;
			} else {
				p1.next = node;
//				p1 = p1.next;
			}
		});

		return newHead;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
