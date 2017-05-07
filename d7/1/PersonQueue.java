public interface PersonQueue {

	/*
     * Pushes a new person onto the stack
     */
	void insert(Person person);
	
	/*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
	Person retrieve();

}