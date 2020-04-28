import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test9Queues {

	public static void main(String[] args) {
		// Front of the Queues is called d"Headd" and end of the Queue is called "Tail"
		// Queue is FiFo

		/////// showing how to use add(), remove() and element()//////////
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        // Throws wrror "NoSuchElementException" as no items is queue yet
		//System.out.println("Head of the queue is: " + q1.element());
		
		q1.add(20);
		q1.add(10);
		q1.add(30);

		System.out.println("Head of the queue is: " + q1.element());
		try {
			q1.add(10); // will give runtime exception as Queue full
						// because queue is dedfined for length 3 only
						// so need to handle exception here

		} catch (IllegalStateException e) {
			System.out.println("Too many items to add in a queue");
		}

		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}

		// Integer value1;
		// value1 = q1.remove();
		System.out.println("\nRemoved from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());

		// after removing all 3 will give exception while executing below so we have to
		// capture that
		// in try..catch though it is not compulsory to handle runtime exception
		try {
			System.out.println("\nRemoved from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("\ntrying to remove too many items from queue");
		}
		
		System.out.println();
	/////// showing how to use offer(), poll() and peek()//////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());// q2.peek() will return null 
		                             // as queue is empty
		q2.offer(20);
		q2.offer(10);
		
		System.out.println("Queue 2 peek: " + q2.peek()); // will return first item of queue
		
		
//		q2.offer(30);  /// it will not add this element but also will not throw any exception
		              // offer() just return false  if it can't add values
		if(q2.offer(30) == false) {
			System.out.println("Offer failed to add third item\n");
		}
		
		
		for (Integer value : q2) {
			System.out.println("Queue 2 value: " + value);
		}
		System.out.println("\nUsing Poll\n");
		
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll()); // Poll() will not throw exception but return null
		                                                 // if there are no items in queue to remove

		
	}

}
