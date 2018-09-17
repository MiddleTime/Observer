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
public class Task implements Observer{
    private String name;

    public Task(String name) {
        this.name = name;
    }
    
    @Override
    public void handleEvent() {
        System.out.println("Event handled by task: " + name);
    }
    
}
