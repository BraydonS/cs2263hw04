package cs2263hw04;

import com.google.common.graph.*;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


// Uses writeGraph and readGraph to save and load a graph from the NetworkData.json file
public class NetworkGraphIO {


    public NetworkGraphIO(){

    }

    public void writeGraph(Network g) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("NetworkData.json");
        gson.toJson(g, writer);
        writer.close();
    }

    public Network readGraph() throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonReader reader = new JsonReader(new FileReader("NetworkData.json"));
        NetworkBuilder graphBuild = gson.fromJson(reader,NetworkBuilder.class);
        Network g = graphBuild.build();
        return g;
    }
}
