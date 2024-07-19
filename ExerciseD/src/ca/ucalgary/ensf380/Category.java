package ca.ucalgary.ensf380;

public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;

    public String sort() {
        return "Method sort called from Category";
    }

    public Category getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(Category sub) {
        this.subCategory = sub;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCat) {
        this.superCategory = superCat;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String cat) {
        this.category = cat;
    }
}
