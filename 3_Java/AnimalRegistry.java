import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AnimalRegistry {
    private ArrayList<Animals> register;

    public AnimalRegistry() {
        register = new ArrayList<>();
    }

    public void loadAnimals() throws IOException {
        File file = new File(
                "C:\\Users\\burof\\Desktop\\final_control_homework_geekbrains\\3_Java\\Animals.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            register.add(Animals.parse(line));
        }
        br.close();
    }

    public void saveAnimals() throws IOException {

        FileWriter writer = new FileWriter(
                "C:\\Users\\burof\\Desktop\\final_control_homework_geekbrains\\3_Java\\Animals.txt",
                false);

        for (Animals animal : register) {
            writer.append(animal.toString() + "\n");
        }


        writer.flush();
        writer.close();
    }

    public ArrayList<Animals> getRegister() {
        return register;
    }

    public void addAnimal(Animals animal) {
        register.add(animal);
    }
}