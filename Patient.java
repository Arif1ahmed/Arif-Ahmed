package doctors_appointment;

public class Patient {
    
    private int PatientId;
    private String Name;
    
    Patient(){}
    Patient(String Name, int PateintId){
        
        this.Name=Name;
        this.PatientId=PateintId;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String toString(){
        
        return ("Name : "+Name+"\nPatient Id : "+PatientId);
    }
    
}
