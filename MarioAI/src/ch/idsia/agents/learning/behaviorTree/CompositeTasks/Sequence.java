/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.CompositeTasks;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Alexsh
 */
public class Sequence extends CompositeTask {
    
   
    
    
    public Sequence(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, _tasks);
    }

    @Override
    public boolean run() {
        if(this._currentTask!=null){
            //if(this._currentTask.hasNext()){   
                
                //if the current task the last task in the list; we are done
                //if(_current == myTasks.get(myTasks.size()-1)){
                if(!this._currentTask.hasNext()){  
                    //System.out.println("LAST TASK:" + _current.getClass().getSimpleName());
                    return true;
                }

               // if the current task's run return true, go to the next task
                if(_current.run()){
                    System.out.println("Running:" + _current.getClass().getSimpleName());
                    _current = this._currentTask.next();
                    return true; //if the current task's run doesnt run, we are done
                }else{
                    return false;  
                }
            }
           // System.out.println("Current Tasks Does not have next: " + _current.getClass().getSimpleName());
           // return false;
        //}
        System.out.println("Repeating: ");
        return false;
    }
}
