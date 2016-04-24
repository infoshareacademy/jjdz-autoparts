package javatar.service;

import javax.annotation.PostConstruct;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.FileNotFoundException;

@Singleton
@Startup
@Lock(LockType.READ)
public class BrandsJsonCache {

    @PostConstruct
    public void initialize() throws FileNotFoundException {
        JsonParserBrandsStateless jsonInitial = new JsonParserBrandsStateless();
        System.out.println(jsonInitial.toString());


    }
}
