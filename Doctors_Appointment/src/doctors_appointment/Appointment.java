package doctors_appointment;

public class Appointment {
    
    int appointmentId;
    String date;
    int slotId;
    String isAvailable;
    
    
    Appointment(){}
    Appointment(String date, int appointmentId, String isAvailable, int slotId){
        
        this.appointmentId=appointmentId;
        this.date=date;
        this.isAvailable=isAvailable;
        this.slotId=slotId;
        
}
    
    @Override
    public String toString(){
        
        return ("Slot : "+slotId+"\nAppointment ID : "+appointmentId+"\nDate : "+date+"\nAvailable : "+isAvailable);
    }
    
}
