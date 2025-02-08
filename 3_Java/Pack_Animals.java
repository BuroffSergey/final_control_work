import java.time.LocalDate;
import java.util.Set;

public class Pack_Animals extends Animals {
    protected Pack_Animals(String name, LocalDate birthday, TypeAnimal type) {
        super(name, birthday, type);
    }

    protected Pack_Animals(String name, LocalDate birthday, Set<String> commands, TypeAnimal type) {
        super(name, birthday, commands, type);
    }
}