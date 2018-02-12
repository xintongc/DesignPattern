package builder.robot;

public class TestRobotBuilder {
    public static void main(String[] args) {
        OldRobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.getRobotArms());
        System.out.println(firstRobot.getRobotHead());
        System.out.println(firstRobot.getRobotLegs());
        System.out.println(firstRobot.getRobotTorso());

    }


}
