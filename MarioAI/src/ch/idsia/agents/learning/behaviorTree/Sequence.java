/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;
import java.util.Iterator;

/**
 * 
 * @author Alexsh
 */
public class Sequence extends CompositeTask {
    
    protected Iterator<Task> _currentTask = myTasks.iterator();
    
    
    public Sequence(Agent _agent) {
        super(_agent);
    }

    @Override
    public boolean run() {
        //if the current task the last task in the list; we are done
        if(this._currentTask == myTasks.get(myTasks.size())) return false;
        
        //if the current task's run return true, go to the next task
        if(this._currentTask.next().run()){
            this._currentTask.next();
            return true;
            
        }else{
            return false; //if the current task's run doesnt run, we are done
        }
    }
    
 
    
}
