/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MisplacingBox extends Box {

    private Item item;
    
    public MisplacingBox() {
    }
    
    
    
    @Override
    public void add(Item item) {
        Item Item;
        if(this.isInBox(item)){
            this.item =item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
