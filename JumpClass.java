package lesson1;

public class JumpClass {
    public static void main(String[] args) {
        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Alex", 203);
        participant[1] = new Participant("Max", 200);
        participant[2] = new Participant("Luke", 210);
        participant[3] = new Participant("Mark", 205);
        Team group = new Team("Team1", participant);

        Course course = new Course(239, 245, 242);
        String result = course.doIt(group);
        System.out.println(result);
    }
}