package doctors_appointment;

public class Main {
    
    public static void main(String[] args){
        Appointment a1= new Appointment("06-06",1312,"Yes",1);
        Appointment a2= new Appointment("06-07",1212,"No",1);
        Patient p1= new Patient("Soumitro",1821637);
        Patient p2= new Patient("Arif",1831637);
        
        
        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(p2.toString());
        System.out.println(a2.toString());
    }
    
}
