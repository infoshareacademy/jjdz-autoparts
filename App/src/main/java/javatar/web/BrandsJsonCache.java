package javatar.web;

import javatar.model.CarsBrands;
import javatar.model.DataCarsBrands;
import javatar.service.JsonParserAll;
import org.slf4j.LoggerFactory;

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

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BrandsJsonCache.class);
    final Collection<CarsBrands> brandsData = new ArrayList<>();
    DataCarsBrands brands = null;
    JsonParserAll jsonParserAll = new JsonParserAll();

    @PostConstruct
    public void initialize() {

        brands = jsonParserAll.parseCarFile();

        brandsData.addAll(brands.getData());
        LOGGER.info("brands.getData().size(): {}", brands.getData().size());

    }

    public Collection<CarsBrands> returnBrandsCollection() {
        return brandsData;
    }

}