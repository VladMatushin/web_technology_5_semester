package by.bsuir.lab1.task13;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ProgrammerBook)) {
            return false;
        }
        if (obj.hashCode() != hashCode()) {
            return false;
        }
        if (!super.equals(obj)) return false;
        ProgrammerBook progBook = (ProgrammerBook) obj;
        return level == progBook.level && Objects.equals(language, progBook.language);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 37 * language.hashCode() + 61 * Integer.valueOf(level).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "Language: " + language + "\n Level: " + level;
    }
}
