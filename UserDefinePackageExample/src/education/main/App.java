package education.main;
//import educatio.college.Attendance;
//import education.school.Attendance;

public class App {

	public static void main(String[] args) {
		educatio.college.Attendance  att1 = new educatio.college.Attendance();
		att1.display();
		education.school.Attendance att2 = new education.school.Attendance();
		att2.display();
	}

}