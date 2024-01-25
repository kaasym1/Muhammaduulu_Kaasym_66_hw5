public class Main {
    public static void main(String[] args) {

        Hero[] hero = createHeroes();
        System.out.println("HEROES INFO: ");
        for (Hero heroes : hero) {
            System.out.println("HEALTH: " + heroes.getHealth() +
                    " SUPER POWER: " + heroes.getSuperPower() +
                    " DAMAGE: " + heroes.getDamage());
        }

        Boss boss = new Boss();
        boss.setHealth(90);
        boss.setDamage(20);
        boss.setProtectionType("Block");
        System.out.println("BOSS INFO: ");
        System.out.println("HEALTH: " + boss.getHealth() +
                " PROTECTION TYPE: " + boss.getProtectionType() +
                " DAMAGE: " + boss.getDamage());
    }

    public static Hero[] createHeroes() {
        Hero islam = new Hero(30, 40, " chidori ");
        Hero nurdan = new Hero(35, 35);
        Hero zypar = new Hero(45, 50, " rasengan ");

        Hero[] hero = {islam, nurdan, zypar};
        return hero;

    }

}
