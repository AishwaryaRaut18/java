/*2.2 Create custom exception class(eg : CustomerHandlingException or InvalidInputException) , as a checked exception*/
package CustomException;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception  {
	
		public CustomerHandlingException(String mesg) {
			super(mesg);
		}
      

}
