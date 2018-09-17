/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer(3);
        timer.addObserver(new Task ("Mail 1"));
        timer.addObserver(new Task ("Mail 2"));
        timer.addObserver(new Observer() {
            @Override
            public void handleEvent() {
                System.out.println("Это анонимный внутренний наблюдатель");
            }
        });
        timer.addObserver(() -> {
            System.out.println("Это тоже анонимный внутренний наблюдатель, но через Лямбда");
        });
        timer.start(); 
    }
}
