package javatar.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@Singleton
@Startup
@Lock(LockType.READ)
public class BrandsJsonCache {

    final Collection<CarsBrands> brandsData = new ArrayList<>();

    @PostConstruct
    public void initialize() {

        try (FileReader reader = new FileReader("z")) {
            Gson gson = new GsonBuilder().create();

            DataCarsBrands brands = gson.fromJson(reader, DataCarsBrands.class);

            System.out.println("brands.getData().size() = " + brands.getData().size());
            brandsData.addAll(brands.getData());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Collection<CarsBrands> returnBrandsCollection(){
        return brandsData;
    }

}
