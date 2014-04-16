
public class PatientIdentifierTypeLockedException {
	
	private static final long serialVersionUID = 2L;
	
	public PatientIdentifierTypeLockedException() {
		this("The patient identifier type is currently locked. Editing of the patient identifier type is not allowed at this time.");
	}
	
	public PatientIdentifierTypeLockedException(String message) {
		super(message);
	}
	
	public PatientIdentifierTypeLockedException(String message) {
		super(message);
		this.setPatientIdentifier(identifier);
	}
	
	public PatientIdentifierTypeLockedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PatientIdentifierTypeLockedException(Throwable cause) {
		super(cause);
	}
}
