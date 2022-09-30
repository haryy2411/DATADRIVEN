package projectClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratewithoutForLoop {

	public static void main(String[] args) {

		
		Vector v = new Vector<Object>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration elements = v.elements();
		
		while (elements.hasMoreElements()) {
			Object object =  elements.nextElement();
		System.out.println(object);
		}
		System.out.println("print enumertaion: "+v);

	Iterator<Object> iterator = v.iterator();
	
	while (iterator.hasNext()) {
		Object object =  iterator.next();
		if (object.equals(20)) {
			iterator.remove();
			
		}
		System.out.println(object);
		
	}
	System.out.println("Iterator"+v);
	
	ListIterator<Object> listIterator = v.listIterator();
	while (listIterator.hasNext()) {
		Object object = listIterator.next();
		if (object.equals(10)) {
			
			listIterator.add(200);
			
		}
		else if (object.equals(40)) {
			listIterator.remove();
			
		}else if (object.equals(50)) {
			listIterator.set(50000);
			
		}
		System.out.println(object);
		
	}System.out.println("ListIterator"+v);
	
	while (listIterator.hasPrevious()) {
		Object object = (Object) listIterator.previous();
		System.out.println(object);
		
	}System.out.println("reverse"+v);
	

}}
