package lab4;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJava {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws IOException {
        List<Cleaner> cleaners = new ArrayList<>();
        List<Driver> drivers = new ArrayList<>();
        List<Engineer> engineers = new ArrayList<>();
        List<Programmer> programmers = new ArrayList<>();
        List<Tester> testers = new ArrayList<>();

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("jsonEx"));
        Result result=gson.fromJson(br,Result.class);
        if(result!=null){
            for(SkyScannner s: result.getSkyScannner()){
                switch (s.getPosition()){
                    case "cleaner": cleaners.add(new Cleaner(s.getId(),s.getName(),160,s.getBase()));
                }
            }
        }
        System.out.println(cleaners);

        //        System.out.println(teamLeaders.size());

//        System.out.println(teamLeaders.size());
//        System.out.println(teamLeaders);

    }
}
