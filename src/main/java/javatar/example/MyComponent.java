package javatar.example;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MyComponent {

    public DataModel doSomeLogic(String userName, Integer option) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < option; i++) {
            builder.append(userName);
            builder.append(" ");
        }

        DataModel model = new DataModel();
        model.setName(userName);
        model.setResult(builder.toString().trim());

        return model;
    }


}
