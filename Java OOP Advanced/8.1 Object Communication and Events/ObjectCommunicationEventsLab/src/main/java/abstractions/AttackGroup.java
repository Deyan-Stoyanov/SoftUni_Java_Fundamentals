package abstractions;

public interface AttackGroup {
    void addMember(Attacker attacker);
    void groupTarget(Target target);
    void groupAttack();
}
