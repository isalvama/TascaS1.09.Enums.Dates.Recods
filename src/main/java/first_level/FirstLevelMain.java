package first_level;

public class FirstLevelMain {
    public static void main (String[] args){
        // Exercise 1
        System.out.println(Day.FRIDAY.getIsWorkingDay());
        System.out.println(Day.SUNDAY.getIsWorkingDay());

        // Exercise 2 and 3
        Task task1 = new Task("Create an enum called Level", Level.MEDIUM);
        System.out.println("Task 1: " + task1);
        System.out.println("Task 1 call to warningString() method: " + task1.warningString());
        Task task2 = new Task("Convert a String to an enum", Level.HIGH);
        System.out.println("Task 2: " + task2);
        System.out.println("Task 2 call to warningString() method: " + task2.warningString());

        // Exercise 4
        try {
            Level level1 = Level.getLevelFromString("xdf");
            task2.setLevel(level1);
        } catch (RuntimeException rte){
            System.out.println(rte.getMessage());
        }
        System.out.println(task2);

        try {
            Level level1 = Level.getLevelFromString("medium");
            task2.setLevel(level1);
        } catch (RuntimeException rte){
            System.out.println(rte.getMessage());
        }
        System.out.println(task2);
    }
}
