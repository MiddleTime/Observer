package Example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inbox_bv8awe9
 */
public interface Observable {
    void notifyObservers();
    
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    
}
