package first_level;

public class FirstLevelMain {
    public static void main (String[] args){
        System.out.println(Day.FRIDAY.getIsWorkingDay());
        System.out.println(Day.SUNDAY.getIsWorkingDay());

        Task task1 = new Task("Create an enum called Level", Level.MEDIUM);
        System.out.println(task1.warningString());
        Task task2 = new Task("Convert a String to an enum", Level.HIGH);
        System.out.println(task2.warningString());

        Level lowLevel = Level.valueOf("LOW");
        task2.setLevel(lowLevel);
        System.out.println(task2);
    }
}
