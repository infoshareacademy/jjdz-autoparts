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
    final String url = "http://infoshareacademycom.2find.ru/api/v2?lang=polish";

    @PostConstruct
    public void initialize() {

        HtmlReader reader = new HtmlReader();

        try {
            String readString = reader.getText(url);
            Gson gson = new GsonBuilder().create();

            DataCarsBrands brands = gson.fromJson(readString, DataCarsBrands.class);

            System.out.println("brands.getData().size() = " + brands.getData().size());
            brandsData.addAll(brands.getData());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Collection<CarsBrands> returnBrandsCollection() {
        return brandsData;
    }

}