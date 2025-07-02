package collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListt l=new LinkedListt();
		l.insertFirst(3);
		l.insertFirst(4);
		l.insertFirst(365);
		l.insertLast(123);
		l.insert(100, 2);
		l.deleteFirst();
//		System.out.println(l.get(1));
//		l.display();
//		System.out.println(l.deleteLast());
//		l.deleteLast();
//		l.delete(1);
		System.out.println(l.find(3));
		
		l.display();
	}

}
