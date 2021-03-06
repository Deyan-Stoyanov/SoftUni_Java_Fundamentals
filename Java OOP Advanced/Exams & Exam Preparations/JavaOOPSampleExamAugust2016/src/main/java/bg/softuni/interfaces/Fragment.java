package bg.softuni.interfaces;

import bg.softuni.models.enums.FragmentType;

public interface Fragment {
    String getName();

    FragmentType getType();

    Integer getPressureAffection();
}
