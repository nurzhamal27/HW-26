package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("data/dictionaries.json");

    public static Dictionary[] getInfo() {
        String json = "";
        try {
            json = Files.readString(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(json, Dictionary[].class);

    }

    public static void writeFile(Dictionary[] dictionaries) {
        String str = GSON.toJson(dictionaries);
        try {
            Files.write(PATH, str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
