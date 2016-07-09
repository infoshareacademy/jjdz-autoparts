package javatar.service.APIallegro;

import allegroApi.AllegroWebApiPortType;
import allegroApi.AllegroWebApiService;
import allegroApi.AllegroWebApiServiceLocator;
import allegroApi.CatInfoType;
import allegroApi.holders.ArrayOfCatsHolder;
import javatar.model.AllegroCategories;
import javatar.model.AllegroCategoriesBuilder;

import javax.ejb.Stateless;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class APIallegro {

    public List<AllegroCategories> getAllegroCategoriesList() {

        List<AllegroCategories> allegroCategoriesList = new ArrayList<>();

        AllegroWebApiService allegroWebApiService = new AllegroWebApiServiceLocator();

        try {
            AllegroWebApiPortType allegro = allegroWebApiService.getAllegroWebApiPort();
            int countryCode = 1;
            String webapiKey = "73091f43"; //klucz webapi
            ArrayOfCatsHolder arrayOfCatsHolder = new ArrayOfCatsHolder();
            LongHolder verKey = new LongHolder();
            StringHolder stringHolder = new StringHolder();

            allegro.doGetCatsData(countryCode, 1l, webapiKey, arrayOfCatsHolder, verKey, stringHolder);

            CatInfoType[] catInfoTypes = arrayOfCatsHolder.value;

            for (CatInfoType catType :
                    catInfoTypes) {
                AllegroCategories allegroCategory = new AllegroCategoriesBuilder()
                        .setCatId(catType.getCatId())
                        .setCatName(catType.getCatName())
                        .setCatParent(catType.getCatParent())
                        .setCatIsProductCatalogueEnabled(catType.getCatIsProductCatalogueEnabled())
                        .setCatPosition(catType.getCatPosition())
                        .build();
                allegroCategoriesList.add(allegroCategory);

            }

        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return allegroCategoriesList;
    }
}



