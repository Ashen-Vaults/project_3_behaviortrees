/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.Decorators;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;


/**
 *
 * @author Alexsh
 */
public class Repeat extends Decorator {
    

    private int _numberOfRepeats;
    
    public Repeat(BasicMarioAIAgent _agent, Task _task, int _times) {
        super(_agent, _task);
        this._numberOfRepeats = _times;
    }
    
    @Override
    public boolean run(){
        int _current = 1;
        while(_current <= this._numberOfRepeats){
            System.out.println("Repeating: " + _current + " " + this._childTask.getClass().getSimpleName());
            if(this._childTask.run())
                _current++;
            else{
                this._childTask.run();
            }
        }
        return true;
    }
}
