package javatar.model;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class FormPartCategories implements Serializable{

    private List<String> partCategories;

    public List<String> getPartCategories() {
        return partCategories;
    }

    public void setPartCategories(List<String> partCategories) {
        this.partCategories = partCategories;
    }

    public void addPartCategory(String categoryName)
    {
        if(this.partCategories == null)
        {
            this.partCategories = new ArrayList<>();
        }
        this.partCategories.add(categoryName);
    }
}
