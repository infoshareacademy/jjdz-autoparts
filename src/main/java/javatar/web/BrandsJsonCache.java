package javatar.web;

import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;
import javatar.service.JsonParserAll;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.Collection;

@Singleton
@Startup
@Lock(LockType.READ)
public class BrandsJsonCache {

    final Collection<CarsBrands> brandsData = new ArrayList<>();
    DataCarsBrands brands = null;
    JsonParserAll jsonParserAll = new JsonParserAll();

    @PostConstruct
    public void initialize() {

        brands = jsonParserAll.parseCarFile();

        System.out.println("brands.getData().size() = " + brands.getData().size());
        brandsData.addAll(brands.getData());

    }

    public Collection<CarsBrands> returnBrandsCollection() {
        return brandsData;
    }

}