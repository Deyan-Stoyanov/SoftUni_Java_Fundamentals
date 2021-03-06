package exam_05_01_2018;

public abstract class Medic extends Colonist {
    private String sign;

    public Medic(String id, String familyId, int talent, int age, String sign) {
        super(id, familyId, talent, age);
        this.sign = sign;
    }

    @Override
    public int getPotential() {
        return this.getTalent() + 2;
    }

    protected String getSign() {
        return sign;
    }

    private void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
