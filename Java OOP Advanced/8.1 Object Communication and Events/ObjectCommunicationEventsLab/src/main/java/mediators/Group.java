package mediators;

import abstractions.AttackGroup;
import abstractions.Attacker;
import abstractions.Target;

import java.util.ArrayList;
import java.util.List;

public class Group implements AttackGroup {
    private List<Attacker> attackers;

    public Group() {
        this.attackers = new ArrayList<>();
    }

    @Override
    public void addMember(Attacker attacker) {
        this.attackers.add(attacker);
    }

    @Override
    public void groupTarget(Target target) {
        for (Attacker attacker : attackers) {
            attacker.setTarget(target);
        }
    }

    @Override
    public void groupAttack() {
        for (Attacker attacker : attackers) {
            attacker.attack();
        }
    }
}
