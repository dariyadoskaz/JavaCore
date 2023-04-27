package lesson1;

public class Course {
    String result;
    private int olympics;
    private int worldcup;
    private int continental;


    public Course(int olympics, int worldcup, int continental) {
        this.olympics = olympics;
        this.worldcup = worldcup;
        this.continental = continental;
    }

    public String doIt(Team team){
        result = "Team No.: "+ team.getName()+ " " + '\n';
        for(Participant participant: team.getPeoples()){
            result += "Participant name: " + participant.getName()+ " " + '\n';
            int value = participant.getCanJumpHeights();
            testOlympics(value);
            testWorldcup(value);
            testContinental(value);

        }

        return result;
    }

    private void testOlympics(int value){
        if(value<olympics) result = result + "At Olympics jumped with height "+ '\n';
        else result += "At Olympics could not jump with height "+ '\n';

    }

    private void testWorldcup(int value){
        if(value<worldcup + 5) result += "At WorldCup jumped with height "+ '\n';
        else result += "At WorldCup could not jump with height "+ '\n';
    }

    private void testContinental(int value){
        if(value<continental - 10) result += "At Continental jumped with height "+ '\n';
        else result += "At Continental could not jump with height "+ '\n';
    }

}
