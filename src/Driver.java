import java.util.Objects;

public class Driver <D extends Mobil & Competing> {
    private String fullName;
    private String license;  // права - лицензии
    private int experience;  // стаж водителя

    public String getFullName() {
        return fullName;
    }


//*********************************************************************************************************************
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience
                && Objects.equals(fullName, driver.fullName) && Objects.equals(license, driver.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }

    @Override
    public String toString() {
        return "Водитель " + fullName + " (права категории " + license + ") будет участвовать в гонках на ";
    }
} // class ************************************************************************************************************

