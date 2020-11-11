
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private String ingredients;
    private ArrayList<String> list;

    public Recipe() {
        this.list = new ArrayList<>();
    }

    public void addList(String str) {
        this.list.add(str);
    }

    public void listDo() {
        this.name = list.get(0);
        this.time = Integer.valueOf(this.list.get(1));
        for (int i = 2; i < this.list.size(); i++) {

            this.ingredients = this.ingredients + " " + this.list.get(i);
        }

    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public String[] getIngredients() {
        String[] ingredientsArray = ingredients.split(" ");
        return ingredientsArray;
    }

    public ArrayList<String> getList() {
        return this.list;
    }

}
