package Diploma_Semester5.Exp5;

class SportsStudents extends Student implements Sport {
    String chosenSport;

    // Constructor initializing all data members
    SportsStudents(String name, int age, String chosenSport) {
        super(name, age);
        this.chosenSport = chosenSport;
    }

    // Implementing the play method from Sport interface
    @Override
    public void play() {
        System.out.println(name + " is playing " + chosenSport + ".");
    }

    // Main method to test the program execution
    public static void main(String[] args) {
        // Create an object of SportStudents
        SportsStudents s = new SportsStudents("Karan", 19, "Football");

        // Call method inherited from Person class
        s.walk();

        // Call method implemented from Sport interface
        s.play();
    }
}
