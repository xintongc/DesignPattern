package builder.attack;

public class Test {

    public static void main(String[] args) {

        AttackArea blizzard = AttackArea.builder()
                .circle(2)
                .attackAllEnemy()
                .build();

        AttackArea repairTotem = AttackArea.builder()
                .circle(2)
                .healFriends(3)
                .build();

        AttackArea groundCrack = AttackArea.builder()
                .oneDirection(3,1)
                .attackAllEnemy()
                .build();

        AttackArea lightCannon = AttackArea.builder()
                .oneDirection(1,1)
                .attackFirstEnemy()
                .build();

        AttackArea volcanoEruption = AttackArea.builder()
                .circle(4)
                .attackAllEnemy()
                .build();

        AttackArea santaCrossHealing = AttackArea.builder()
                .cross(4)
                .attackAllEnemy()
                .healAllFriends()
                .build();

    }




}
