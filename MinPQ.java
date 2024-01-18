@SuppressWarnings("unchecked")
public class MinPQ<T extends Comparable<T>> {
    private T[] array;//the underlying array
    private int nextOpen;//marks the next open index in the array
    private final int CAP;//the starting capacity of the array--it should never drop below this

    /***
     *constructor: constructs a new 
     *MinPQ with starting capacity of 10
     ***/
    public MinPQ() {
	this.CAP = 10;
	this.array = (T[]) new Comparable[CAP];
	this.nextOpen = 0;
    }

    /**
     *constructor: constructs a new MinPQ with 
     *starting capacity of cap
     ***/
    public MinPQ(int cap) {
	this.CAP = cap;
	this.array = (T[]) new Comparable[CAP];
	this.nextOpen = 0;
    }

    /***
     *@param item to be inserted into PQ
     *if the array is full after the insert, 
     *resize the array to be twice as large
     ***/
    public void insert(T item) {
	//TO BE IMPLEMENTED
    }

    /***
     *@return and remove the min item in the PQ and re-heapify
     *throw EmptyQueueException if the PQ is empty
     *if array.length/2 >= CAP and the number of elements drops below
     *array.length/4 (after the delete), resize the array to array.length/2
     ***/
    public T delMin() throws EmptyQueueException {
	//TO BE IMPLEMENTED
    }

    /***
     *@return but do not remove the min item in the PQ
     *throw EmptyQueueException if the PQ is empty
     ***/
    public T getMin() throws EmptyQueueException {
	//TO BE IMPLEMENTED
    }

    /***
     *@return the number of items currently in 
     *the PQ
     ***/
    public int size() {
	//TO BE IMPLEMENTED
    }

    /***
     *@return true if the PQ is empty and false
     *otherwise
     ***/
    public boolean isEmpty() {
	//TO BE IMPLEMENTED
    }

    /***
     *returns the underlying array
     *This method is only used for testing.
     *Do not change it, and do not use it in your
     *own code!!!
     ***/
    public T[] getArray() {
	return this.array;
    }
}
    
