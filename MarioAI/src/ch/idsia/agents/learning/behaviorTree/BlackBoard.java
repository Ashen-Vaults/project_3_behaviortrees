/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores information for an agent,
 * current target:
 * last safe position
 * 
 * It's a global structure where we can store
 * and read data by name
 * @author Alexsh
 */
public class BlackBoard {
    
    protected HashMap<String, Object> _store;

    public BlackBoard() {
        this._store = new HashMap<>();
    }
    
    public void put(String _key, Object _value){
        this._store.put(_key, _value);
    }
    
    public Object get(String _key){
        return this._store.get(_key);
    }
    
    
}
