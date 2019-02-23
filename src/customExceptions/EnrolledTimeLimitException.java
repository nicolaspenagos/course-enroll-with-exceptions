package customExceptions;

@SuppressWarnings("serial")
public class EnrolledTimeLimitException extends Exception{
	public EnrolledTimeLimitException(int week) {
		super("The enrollment time limit has been reached.Student cannot be enrolled. Current week is:"+week);
	}
}
