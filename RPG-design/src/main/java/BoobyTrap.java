public class BoobyTrap {
    WeaponBehaviour wb;

    public BoobyTrap() {
        wb = new BowBehaviour();
    }

    public void activateBoobyTrap() {
        wb.useWeapon();
    }
}
