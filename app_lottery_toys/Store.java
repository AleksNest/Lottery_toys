package app_lottery_toys;

import java.util.ArrayList;

public class Store {
    private ArrayList<Toy> toys;                // список игрушек в магазине

    public Store() {
        toys = new ArrayList<Toy>();
    }


    public void addToy(Toy toy) {
        toys.add(toy);

    }

    public ArrayList<Toy> getToys() {
        return toys;
    }


    public boolean changeToyFrequency(int toyId, double newFrequency) {
        int i = 0;
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
                i ++;
            }
        }
        if (i == 0){
            return false;
        } else {
            return true;
        }
    }

    public  ArrayList<Toy> deleteToyFromStore(ArrayList<Toy> toys, String name) {
        int i = 0;
        for (Toy t : toys){
            if (t.getName().contains(name)){
                toys.remove(i);
                i++;
            }
        }
        if (i > 0){
            System.out.println("the toy  " + name + "  was successfully removed ");
        } else {
            System.out.println("the toy  " + name + "  does not exist");
        }
        return toys;
    }

    public boolean changeToy(String name, int quantity, double frequency) {
        boolean flag = false;
        for (Toy t : toys) {
            if (t.getName().contains(name)){
                t.setName(name);
                t.setQuantity(quantity);
                t.setFrequency(frequency);
                flag = true;
            }
        }
        return flag;
    }

}

  


